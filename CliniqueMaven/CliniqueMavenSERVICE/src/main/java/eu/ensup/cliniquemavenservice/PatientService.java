package eu.ensup.cliniquemavenservice;

import java.util.ArrayList;

import eu.ensup.cliniquemavendao.IPatientDao;
import eu.ensup.cliniqueservicebo.Medecin;
import eu.ensup.cliniqueservicebo.Patient;

public class PatientService {

	IPatientDao dao;

	public ArrayList<Patient> lirePatient() {
		ArrayList<Patient> ArrayUnPatient = new ArrayList<>();
		ArrayUnPatient = this.dao.getList();

		return ArrayUnPatient;
	}

	public Patient lireUnPatient(int id) {
		Patient patient = new Patient();
		patient = this.dao.getPatientById(id);
		return patient;
	}
}
