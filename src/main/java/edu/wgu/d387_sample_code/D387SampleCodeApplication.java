package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translation.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
		WelcomeMessage welcomeEnglish = new WelcomeMessage(Locale.US);
		WelcomeMessage welcomeFrench = new WelcomeMessage(Locale.CANADA_FRENCH);

		Thread englishThread = new Thread(welcomeEnglish);
		Thread frenchThread = new Thread(welcomeFrench);

		englishThread.start();
		frenchThread.start();
	}

}
