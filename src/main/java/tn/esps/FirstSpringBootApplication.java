package tn.esps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FirstSpringBootApplication implements CommandLineRunner{
	
	@Autowired // please inject une référence dans la variable helloBean
	//injection de dépandance // résultat du DP Inversion Of Controle (Ioc)
	private HelloBean helloBean;

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello SringBoot");
		System.out.println("----------------");
		helloBean.sayHello();
		helloBean.chaabane();
		
	}

}
