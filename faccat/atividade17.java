package faccat;
import java.util.Scanner;

public class atividade17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do aluno");
		float nota2 = sc.nextFloat();
		float media = (nota1 + nota2) / 2;
		if (media < 6) {
			System.out.println("A média do aluno foi: " + media + "O aluno está retido! ");
		} else {
			System.out.println("A média do aluno foi: " + media + "O aluno está aprovado! ");
		}
		sc.close();
	}
}
