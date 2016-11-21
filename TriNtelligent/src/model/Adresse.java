package model;

public class Adresse {
	
	private int idAdresse;
	private int numAdresse;
	private String typeVoie;
	private String adresse;
	private String codePostal;
	private String Ville;
	
	/**
	 *  Créations des constructeurs
	 */
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param idAdresse
	 * @param numAdresse
	 * @param typeVoie
	 * @param adresse
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(int idAdresse, int numAdresse, String typeVoie, String adresse, String codePostal, String ville) {
		super();
		this.idAdresse = idAdresse;
		this.numAdresse = numAdresse;
		this.typeVoie = typeVoie;
		this.adresse = adresse;
		this.codePostal = codePostal;
		Ville = ville;
		
		
		// Création des accesseurs
	}
	/**
	 * @return the idAdresse
	 */
	public int getIdAdresse() {
		return idAdresse;
	}
	/**
	 * @param idAdresse the idAdresse to set
	 */
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	/**
	 * @return the numAdresse
	 */
	public int getNumAdresse() {
		return numAdresse;
	}
	/**
	 * @param numAdresse the numAdresse to set
	 */
	public void setNumAdresse(int numAdresse) {
		this.numAdresse = numAdresse;
	}
	/**
	 * @return the typeVoie
	 */
	public String getTypeVoie() {
		return typeVoie;
	}
	/**
	 * @param typeVoie the typeVoie to set
	 */
	public void setTypeVoie(String typeVoie) {
		this.typeVoie = typeVoie;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}
	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	/**
	 * @return the ville
	 */
	public String getVille() {
		return Ville;
	}
	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		Ville = ville;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numAdresse=" + numAdresse + ", typeVoie=" + typeVoie
				+ ", adresse=" + adresse + ", codePostal=" + codePostal + ", Ville=" + Ville + "]";
	} 

}
