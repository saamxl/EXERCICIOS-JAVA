package faccat;
import java.util.Scanner;

public class atividade15 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("N�mero Negativo");
		}
		else {
			System.out.println("N�mero Positivo");
		}
		sc.close();
	}
}
