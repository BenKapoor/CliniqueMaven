package eu.ensup.cliniquemavendao;

import java.sql.ResultSet;
import java.util.ArrayList;

import eu.ensup.cliniqueservicebo.Patient;

public class PatientDao implements IPatientDao {

	ConnectionDao conn = new ConnectionDao();

	/**
	 * @param m1
	 */
	/*
	 * @Override public void creerMedecin(Medecin m1) { try {
	 * ConnectionDao.getConnection()
	 * .executeUpdate("INSERT INTO medecin(nom, prenom, adresse, disponibilite) values"
	 * + "('" + m1.getNom() + "','" + m1.getPrenom() + "','" + m1.getAdresse() +
	 * "','" + m1.getDisponibilite() + "');");
	 *
	 * } catch (Exception e) { System.out.println(e); } }
	 */
	/**
	 * @param m1
	 * @param id
	 * @return
	 */
	@Override
	public ArrayList<Patient> getList() {
		ArrayList<Patient> ArrayListPatient = new ArrayList<>();
		try {

			ResultSet res = ConnectionDao.getConnection()
					.executeQuery("SELECT nom, prenom, adresse, sexe, email, password " + "FROM medecin ;");

			while (res.next()) {
				Patient PatientList = new Patient();
				PatientList.setNom(res.getString("nom"));
				PatientList.setPrenom(res.getString("prenom"));
				PatientList.setAdresse(res.getString("adresse"));
				PatientList.setSexe(res.getBoolean("sexe"));
				PatientList.setEmail(res.getString("email"));
				PatientList.setPassword(res.getString("password"));

				ArrayListPatient.add(PatientList);
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return ArrayListPatient;
	}

	@Override
	public Patient getPatientById(int id) {
		Patient patient = new Patient();
		try {

			ResultSet res = ConnectionDao.getConnection()
					.executeQuery("SELECT nom, prenom, adresse, sexe, email, password FROM medecin WHERE id=" + id);

			while (res.next()) {

				patient.setId(res.getInt("id"));
				patient.setNom(res.getString("nom"));
				patient.setPrenom(res.getString("prenom"));
				patient.setAdresse(res.getString("adresse"));
				patient.setSexe(res.getBoolean("sexe"));
				patient.setEmail(res.getString("email"));
				patient.setPassword(res.getString("password"));

			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return patient;
	}
}
