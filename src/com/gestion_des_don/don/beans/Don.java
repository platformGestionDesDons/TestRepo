package com.gestion_des_don.don.beans;
import java.util.Date;

public class Don {
	
	private int numero_don;
	private Date date_planifi�e;
	private Date date_reglement;
	private double montant;
	private String mode_reglement;
	private int quantite;
	private boolean estAccepte;
	private boolean estSupprime;
	private String visibilit�;
	private boolean vu;
	
	
	public Don(double montant, String mode_reglement, int quantite) {
		this.montant = montant;
		this.mode_reglement = mode_reglement;
		this.quantite = quantite;
	}
	public Don(int numero_don, double montant, String mode_reglement, int quantite) {
		super();
		this.numero_don = numero_don;
		this.montant = montant;
		this.mode_reglement = mode_reglement;
		this.quantite = quantite;
	}
	public Don() {
		
	}
	@Override
	public String toString() {
		return "Don [numero_don=" + numero_don + ", date_planifi�e=" + date_planifi�e + ", montant=" + montant
				+ ", mode_reglement=" + mode_reglement + ", quantite=" + quantite + ", estAccepte=" + estAccepte
				+ ", estSupprime=" + estSupprime + ", visibilit�=" + visibilit� + ", vu=" + vu + "]";
	}
	
	public int getNumero_don() {
		return numero_don;
	}
	public void setNumero_don(int numero_don) {
		this.numero_don = numero_don;
	}
	public Date getDate_planifi�e() {
		return date_planifi�e;
	}
	public void setDate_planifi�e(Date date_planifi�e) {
		this.date_planifi�e = date_planifi�e;
	}
	public Date getDate_reglement() {
		return date_reglement;
	}
	public void setDate_reglement(Date date_reglement) {
		this.date_reglement = date_reglement;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getMode_reglement() {
		return mode_reglement;
	}
	public void setMode_reglement(String mode_reglement) {
		this.mode_reglement = mode_reglement;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isEstAccepte() {
		return estAccepte;
	}
	public void setEstAccepte(boolean estAccepte) {
		this.estAccepte = estAccepte;
	}
	public boolean isEstSupprime() {
		return estSupprime;
	}
	public void setEstSupprime(boolean estSupprime) {
		this.estSupprime = estSupprime;
	}
	public String getVisibilit�() {
		return visibilit�;
	}
	public void setVisibilit�(String visibilit�) {
		this.visibilit� = visibilit�;
	}
	public boolean isVu() {
		return vu;
	}
	public void setVu(boolean vu) {
		this.vu = vu;
	}
}
