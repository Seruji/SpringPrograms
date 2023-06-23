package itration.itration3;

import org.springframework.stereotype.Component;

@Component("SuperContraGame")
public class SuperContraGame implements GamingConsole {

	public void up() {
		System.out.println("SuperContraGame up");
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