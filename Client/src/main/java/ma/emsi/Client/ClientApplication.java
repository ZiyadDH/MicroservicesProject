package ma.emsi.Client;

import ma.emsi.Client.model.Client;
import ma.emsi.Client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	@Bean
	CommandLineRunner initialiserBaseH2 (ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"), "ZIYAD", "DARIHEM", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"), "MOHAMED", "EL FADIL", Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("3"), "ABDELHAMID", "FADEL", Float.parseFloat("23")));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
