package itration.itration3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import itration.itration3.GameRunner;
import itration.itration3.Itration3Application;

@SpringBootApplication
public class Itration3Application {

public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Itration3Application.class, args);

		// SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();

		GameRunner runner = context.getBean(GameRunner.class);

		// MarioGame game = new MarioGame();
		// GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}
	
