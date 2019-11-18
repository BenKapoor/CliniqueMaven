package eu.ensup.cliniquemavendao;

import java.util.ArrayList;

import eu.ensup.cliniqueservicebo.Medecin;

public interface IMedecinDao {

	public ArrayList<Medecin> getById(int id);

	public Medecin getMedecinById(int id);

}
