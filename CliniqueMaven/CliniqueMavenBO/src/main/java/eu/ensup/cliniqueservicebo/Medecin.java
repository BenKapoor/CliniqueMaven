package eu.ensup.cliniqueservicebo;

/**
 * @author benja
 *
 *         Class metier de Patient associ� � celle de Medecin
 *
 *         H�rite de la classe Personne
 */
public class Medecin extends Personne {

	private String disponibilite;
	private String specialite;
	private Patient patient;

	public Medecin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param sexe
	 * @param email
	 */
	public Medecin(int id, String nom, String prenom, String adresse, Boolean sexe, String email) {
		super(id, nom, prenom, adresse, sexe, email);
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param sexe
	 * @param email
	 * @param disponibilite
	 * @param specialite
	 * @param patient
	 */
	public Medecin(int id, String nom, String prenom, String adresse, Boolean sexe, String email, String disponibilite,
			String specialite, Patient patient) {
		super(id, nom, prenom, adresse, sexe, email);
		this.disponibilite = disponibilite;
		this.specialite = specialite;
		this.patient = patient;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public Patient getPatient() {
		return patient;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Medecin [disponibilite=" + disponibilite + ", specialite=" + specialite + ", patient=" + patient + "]";
	}

}
