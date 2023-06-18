package faccat;
import java.util.Scanner;

public class atividade12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Graus em Fahrenheit: ");
		float fahrenheit = sc.nextFloat();
		float celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Graus em Celsius é de: " + celsius);
		sc.close();
	}
}
