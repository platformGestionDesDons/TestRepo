package com.gestion_des_don.utils;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestion_des_don.don.beans.Don;
import com.gestion_des_don.user.beans.UserAccount;
 
public class DBUtils {
 
    public static UserAccount findUser(Connection conn, //
            String userName, String password) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a " //
                + " where a.User_Name = ? and a.password= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
        pstm.setString(2, password);
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
 
    public static UserAccount findUser(Connection conn, String userName) throws SQLException {
 
        String sql = "Select a.User_Name, a.Password, a.Gender from User_Account a "//
                + " where a.User_Name = ? ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, userName);
 
        ResultSet rs = pstm.executeQuery();
 
        if (rs.next()) {
            String password = rs.getString("Password");
            String gender = rs.getString("Gender");
            UserAccount user = new UserAccount();
            user.setUserName(userName);
            user.setPassword(password);
            user.setGender(gender);
            return user;
        }
        return null;
    }
 
    public static List<Don> queryDon(Connection conn) throws SQLException {
        String sql = "Select a.numero_don, a.mode_reglement, a.quantite, a.montant from Don a ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        ResultSet rs = pstm.executeQuery();
        List<Don> list = new ArrayList<Don>();
        while (rs.next()) {
            int numero_don = rs.getInt("Numero_don");
            String mode_reglement = rs.getString("Mode_reglement");
            int quantite = rs.getInt("Quantite");
            double montant = rs.getDouble("montant");
            Don don = new Don();
            don.setNumero_don(numero_don);
            don.setMode_reglement(mode_reglement);
            don.setQuantite(quantite);
            don.setMontant(montant);
            list.add(don);
        }
        return list;
    }
 
    public static Don findDon(Connection conn, int numero_don) throws SQLException {
        String sql = "Select a.numero_don, a.mode_reglement, a.quantite, a.montant from Don a where a.numero_don=?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, numero_don);
 
        ResultSet rs = pstm.executeQuery();
 
        while (rs.next()) {
        	String mode_reglement = rs.getString("Mode_reglement");
            int quantite = rs.getInt("Quantite");
            double montant = rs.getDouble("montant");
            Don don = new Don(numero_don, montant, mode_reglement, quantite);	
            return don;
        }
        return null;
    }
 
    public static void updateDon(Connection conn, Don don) throws SQLException {
        String sql = "Update don set quantite =?, mode_reglement =?, montant=? where numero_don=? ";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setInt(1, don.getQuantite());
        pstm.setString(2, don.getMode_reglement());
        pstm.setDouble(3, don.getMontant());
        pstm.setInt(4, don.getNumero_don());
        pstm.executeUpdate();
    }
 
    public static void insertDon(Connection conn, Don don) throws SQLException {
        String sql = "Insert into don(quantite, mode_reglement,montant) values (?,?,?)";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setInt(1, don.getQuantite());
        pstm.setString(2, don.getMode_reglement());
        pstm.setDouble(3, don.getMontant());
 
        pstm.executeUpdate();
    }
 
    public static void deleteDon(Connection conn, int numero_don) throws SQLException {
        String sql = "Delete From don where numero_don= ?";
 
        PreparedStatement pstm = conn.prepareStatement(sql);
 
        pstm.setInt(1, numero_don);
 
        pstm.executeUpdate();
    }
 
}