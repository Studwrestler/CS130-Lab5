package lab5;
import java.util.Scanner;
import java.text.DecimalFormat;
public class HeronsFormula {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side A (integer):");
		int a = scan.nextInt();
		System.out.println("Enter the length of side B (integer):");
		int b = scan.nextInt();
		System.out.println("Enter the length of side C (integer):");
		int c = scan.nextInt();
		int s =(a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		DecimalFormat f = new DecimalFormat("0.##");
		System.out.println("The area is "+f.format(area));

	}

}
