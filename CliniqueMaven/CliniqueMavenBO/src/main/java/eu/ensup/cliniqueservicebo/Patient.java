package eu.ensup.cliniqueservicebo;

/**
 * @author benja Class m�tier M�decin
 *
 *         H�rite la classe Personne
 */
public class Patient extends Personne {

	private String symptome;
	private Medecin medecin;

	/**
	 *
	 */
	public Patient() {
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
	public Patient(int id, String nom, String prenom, String adresse, Boolean sexe, String email) {
		super(id, nom, prenom, adresse, sexe, email);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param symptome
	 * @param medecin
	 */
	public Patient(String symptome, Medecin medecin) {
		super();
		this.symptome = symptome;
		this.medecin = medecin;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public String getSymptome() {
		return symptome;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

}
