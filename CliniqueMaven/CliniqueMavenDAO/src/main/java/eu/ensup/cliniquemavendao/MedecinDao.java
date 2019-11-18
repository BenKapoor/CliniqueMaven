package eu.ensup.cliniquemavendao;

import java.sql.ResultSet;
import java.util.ArrayList;

import eu.ensup.cliniqueservicebo.Medecin;

public class MedecinDao implements IMedecinDao {

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
	public ArrayList<Medecin> getById(int id) {
		ArrayList<Medecin> ArrayListMedecin = new ArrayList<>();
		try {

			ResultSet res = ConnectionDao.getConnection().executeQuery(
					"SELECT nom, prenom, adresse, sexe, email, specialite " + "FROM medecin WHERE `id`='" + id + "';");

			while (res.next()) {
				Medecin MedecinList = new Medecin();
				MedecinList.setNom(res.getString("nom"));
				MedecinList.setPrenom(res.getString("prenom"));
				MedecinList.setAdresse(res.getString("adresse"));
				MedecinList.setSexe(res.getBoolean("sexe"));
				MedecinList.setEmail(res.getString("email"));
				MedecinList.setSpecialite(res.getString("specialite"));

				ArrayListMedecin.add(MedecinList);
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return ArrayListMedecin;
	}

	@Override
	public Medecin getMedecinById(int id) {
		Medecin medecin = new Medecin();
		try {

			ResultSet res = ConnectionDao.getConnection()
					.executeQuery("SELECT nom, prenom, adresse, sexe, email, specialite FROM medecin WHERE id=" + id);

			while (res.next()) {

				medecin.setId(res.getInt("id"));
				medecin.setNom(res.getString("nom"));
				medecin.setPrenom(res.getString("prenom"));
				medecin.setAdresse(res.getString("adresse"));
				medecin.setSexe(res.getBoolean("sexe"));
				medecin.setEmail(res.getString("email"));
				medecin.setSpecialite(res.getString("specialite"));

			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

		return medecin;
	}
}
