package org.touchard.service;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.touchard.dao.PersonneDao;
import org.touchard.domaine.Personne;

public class TestService extends TestCase {

	@Mock
	IPersonneService dao; // remplace le IMedecinDao dao=
						// Mockito.mock(IMedecinDao.class);
	@Spy
	PersonneDao personneDao;

	@Spy
	List<String> spiedList = new ArrayList<String>();

	@InjectMocks
	private PersonneService service;

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testGetPersonne(){
		Personne personne = new Personne(0, "TOUCHARD", "David", "login", "pwd", "03/06/1997", null);
		//personneDao.creerPersonne(personne);
		personneDao.getPersonne(1);
		Personne test = Mockito.verify(personneDao, Mockito.times(1)).getPersonne(1);
		
		Mockito.when(personneDao.getPersonne(1)).thenReturn(test);
	}
}

