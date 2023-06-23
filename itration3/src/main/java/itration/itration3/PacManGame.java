package itration.itration3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("pacManGame")
//@Qualifier
public class PacManGame implements GamingConsole {

	public void up() {
		System.out.println("PacManGame up");
	}

	public void down() {
		System.out.println("down");
	}

	public void left() {
		System.out.println("left");
	}

	public void right() {
		System.out.println("right");
	}

}