package club.javacloud.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class HelloWorldApplication {
	public static HashSet<String> iAmMemoryLeak = new HashSet<>();

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
