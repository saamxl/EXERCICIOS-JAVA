package faccat;
import java.util.Scanner;

public class atividade13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Sua a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Sua a segunda nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Sua a terceira nota: ");
		float nota3 = sc.nextFloat();
		float media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("Olá " + nome + ", sua média é de %.2f ", media);
		sc.close();
	}
}
