import java.util.Scanner;

public class AA_17_input_double {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = a+b;
		System.out.printf("%.1f",c);
		sc.close();
	}

}
