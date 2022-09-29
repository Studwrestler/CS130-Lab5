package lab5;
import java.text.NumberFormat;
public class NumberFormat_Lab {

	public static void main(String[] args) {
		NumberFormat c = NumberFormat.getCurrencyInstance();
		double n1 = 2.99;
		System.out.println("Oil price of Kentucky is: "+ c.format(n1));
		NumberFormat p = NumberFormat.getPercentInstance();
		double n2 = .1;
		System.out.println("The oil price increased by "+p.format(n2)+" than last year.");
	}

}
