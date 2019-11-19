package eu.ensup.cliniquemavendao.test;



import eu.ensup.cliniquemavendao.IPatientDao;
import eu.ensup.cliniquemavenservice.PatientService;
import eu.ensup.cliniqueservicebo.Patient;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

//@InjectMock
public class PatientDaoTest extends TestCase {
	// 1- Mocker l'interface du dao
	@Mock
	IPatientDao dao;

	// 2- Injecte le service
	@InjectMocks
	PatientService service;

	@Test
	public void testLectureInfoPatient() {
		// Permet d'initialiser l'objet mock
		MockitoAnnotations.initMocks(this);
		/**
		 * Sénario de test : La demande de lecture de l'information d'un médecin à
		 * partir de son identifiant nous ramène la totalité des informations de ses
		 * caractéristiques
		 */

		// 3- Imposer un comportement au mock(stubber)
		// @Spy
		Patient spiedMedecin = new Patient();
		Mockito.when(this.dao.getPatientById(1)).thenReturn(spiedMedecin);

		// 4- Appeler une méthode du service
		Patient patient = service.lireUnPatient(1);

		// 5- Comparer le résultat réel avec le résultat attendu
		Assertions.assertEquals(patient.getId(), 1);

		// verifier l'appel et le nombre de fois
		Mockito.verify(dao, Mockito.times(1)).getPatientById(1);
	}
}
