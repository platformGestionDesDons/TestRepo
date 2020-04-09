package com.gestion_des_don.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestion_des_don.don.beans.*;
import com.gestion_des_don.utils.DBUtils;
import com.gestion_des_don.utils.MyUtils;

@WebServlet(urlPatterns = { "/create_don" })
public class CreateDonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CreateDonServlet() {
		super();
	}

	// Show product creation page.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/createDonView.jsp");
		dispatcher.forward(request, response);
	}

	// When the user enters the product information, and click Submit.
	// This method will be called.
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection conn = MyUtils.getStoredConnection(request);

		String mode_reglement = (String) request.getParameter("mode_reglement");
		String montant_ = (String) request.getParameter("montant");
		String quantite_ = (String) request.getParameter("quantite");
		int quantite = 0;
		double montant = 0;
		try {
			montant = Double.parseDouble(montant_);
			quantite = Integer.parseInt(quantite_);
		} catch (Exception e) {
		}
		Don don = new Don(montant, mode_reglement, quantite);
		String errorString = null;

		if (mode_reglement == null || montant_ == null || quantite_ == null) {
			errorString = "Remplir tous les champs !";
		}

		if (errorString == null) {
			try {
				DBUtils.insertDon(conn, don);
			} catch (SQLException e) {
				e.printStackTrace();
				errorString = e.getMessage();
			}
		}

		// Store infomation to request attribute, before forward to views.
		request.setAttribute("errorString", errorString);
		request.setAttribute("don", don);

		// If error, forward to Edit page.
		if (errorString != null) {
			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher("/createDonView.jsp");
			dispatcher.forward(request, response);
		}
		// If everything nice.
		// Redirect to the product listing page.
		else {
			response.sendRedirect(request.getContextPath() + "/donList");
		}

	}

}