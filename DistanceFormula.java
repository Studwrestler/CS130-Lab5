package lab5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DistanceFormula {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enther the first x coordinate:");
		int x1 = scan.nextInt();
		System.out.println("Enther the second x coordinate:");
		int x2 = scan.nextInt();
		System.out.println("Enther the first y coordinate:");
		int y1 = scan.nextInt();
		System.out.println("Enther the second y coordinate:");
		int y2 = scan.nextInt();
		double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		DecimalFormat f1 = new DecimalFormat("0.##");
		System.out.println("The distance between points [12.0,24.0] and [67.0,89.0] is "+ f1.format(distance));
	}

}
