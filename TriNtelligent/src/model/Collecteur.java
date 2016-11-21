package model;
import model.Adresse;

public class Collecteur {
	
	private String refCollecteur;
	private Adresse idAdresse;
	private String typeCollecteur;
	/**
	 * 
	 */
	public Collecteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param refCollecteur
	 * @param idAdresse
	 * @param typeCollecteur
	 */
	public Collecteur(String refCollecteur, Adresse idAdresse, String typeCollecteur) {
		super();
		this.refCollecteur = refCollecteur;
		this.idAdresse = idAdresse;
		this.typeCollecteur = typeCollecteur;
	}
	/**
	 * @return the refCollecteur
	 */
	public String getRefCollecteur() {
		return refCollecteur;
	}
	/**
	 * @param refCollecteur the refCollecteur to set
	 */
	public void setRefCollecteur(String refCollecteur) {
		this.refCollecteur = refCollecteur;
	}
	/**
	 * @return the idAdresse
	 */
	public Adresse getIdAdresse() {
		return idAdresse;
	}
	/**
	 * @param idAdresse the idAdresse to set
	 */
	public void setIdAdresse(Adresse idAdresse) {
		this.idAdresse = idAdresse;
	}
	/**
	 * @return the typeCollecteur
	 */
	public String getTypeCollecteur() {
		return typeCollecteur;
	}
	/**
	 * @param typeCollecteur the typeCollecteur to set
	 */
	public void setTypeCollecteur(String typeCollecteur) {
		this.typeCollecteur = typeCollecteur;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Collecteur [refCollecteur=" + refCollecteur + ", idAdresse=" + idAdresse + ", typeCollecteur="
				+ typeCollecteur + "]";
	}
	
	

}
