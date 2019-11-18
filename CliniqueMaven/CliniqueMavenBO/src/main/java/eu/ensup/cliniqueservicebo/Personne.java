package eu.ensup.cliniqueservicebo;

/**
 * @author benja
 *
 *         Class metier Personne
 */
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private Boolean sexe;
	private String email;

	/**
	 *
	 */
	public Personne() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param sexe
	 * @param email
	 */
	public Personne(int id, String nom, String prenom, String adresse, Boolean sexe, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.sexe = sexe;
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Boolean getSexe() {
		return sexe;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", sexe=" + sexe
				+ ", email=" + email + "]";
	}

}
