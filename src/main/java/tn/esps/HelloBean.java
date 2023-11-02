package tn.esps;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	public void sayHello() {
		System.out.println("First string bean's");
	}
	
	/*@Scheduled(cron = "0/10 * * ? * *" )*/
	public void chaabane () {
		System.out.println("Hello Kerkenah");
	}
}
