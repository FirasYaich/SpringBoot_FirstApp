package tn.esps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import tn.esps.entity.Compte;
import tn.esps.repository.CompteRepository;

@SpringBootApplication
@EnableScheduling
public class FirstSpringBootApplication implements CommandLineRunner{
	
	@Autowired // please inject une référence dans la variable helloBean
	//injection de dépandance // résultat du DP Inversion Of Controle (Ioc)
	private HelloBean helloBean;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	/*
	@Override
		public void run(String... args) throws Exception {
		System.out.println("Hello SringBoot");
		System.out.println("----------------");
		helloBean.sayHello();
		helloBean.chaabane();
		
	}
	*/
	/*
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional // auto-commit
	@Override
	public void run(String... args) throws Exception {
		// findAll
		// !SQL , c'est plutot JP-QL ou H-QL ou EJB-QL ~= SQL orienté Objet
		List<Compte> comptes = entityManager.createQuery("select c from Compte c", Compte.class).getResultList();
		System.out.println(comptes);*/
		// delete
		/*Compte compte = entityManager.find(Compte.class, 3);
		entityManager.remove(compte);*/
		// update
		/*
		 * Compte compte = entityManager.find(Compte.class, 1);
		 * System.out.println(compte); compte.setSolde(compte.getSolde()+50);
		 * entityManager.merge(compte);
		 */

		// recherche par PK
		/*
		 * Compte compte = entityManager.find(Compte.class, 1);
		 * System.out.println(compte);
		 */

		// save
		/*
		 * Compte compte1 = new Compte(100, "Ismail"); entityManager.persist(compte1);
		 * Compte compte2 = new Compte(200, "Firas"); entityManager.persist(compte2);
		 * Compte compte3 = new Compte(100, "Bilel"); entityManager.persist(compte3);
		 */
//	}

	@Autowired
	private CompteRepository compteRepository;
	@Override
	public void run(String... args) throws Exception {
		Compte compte = new Compte(500, "Mahdi");
		compteRepository.save(compte);
		System.out.println(compteRepository.findAll());

	}
	
}
