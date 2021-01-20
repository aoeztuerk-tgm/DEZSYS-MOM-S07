package windpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class MOMApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MOMApplication.class, args);
	}


	public void run(String... args) throws Exception {

		String flag = new String("receiver");
		for (String arg : args) {
			flag = arg;
		}

		if (flag.toLowerCase().equals("sender"))
			new MOMSender();
		else
			new MOMReceiver();
	}

}
