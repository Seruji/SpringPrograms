package itration.itration3;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // You need to manage the object for Mario game
@Primary
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("MarioGame jump");
	}

	@Override
	public void down() {
		System.out.println("go into a hole");
	}
	
	@Override
	public void left() {
		System.out.println("stop");
	}
	
	@Override
	public void right() {
		System.out.println("go faster");
	}
	
}