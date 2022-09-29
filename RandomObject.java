package lab5;
import java.util.Random;
public class RandomObject {

	public static void main(String[] args) {
		Random generator = new Random();
		int randNum = generator.nextInt(16)+5;
		System.out.println("The random number between 5-20 is: "+ randNum);
	}

}
