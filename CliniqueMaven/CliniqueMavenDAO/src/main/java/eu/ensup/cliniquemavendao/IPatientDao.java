package eu.ensup.cliniquemavendao;

import java.util.ArrayList;

import eu.ensup.cliniqueservicebo.Patient;

public interface IPatientDao {

	public ArrayList<Patient> getList();

	public Patient getPatientById(int id);

}
