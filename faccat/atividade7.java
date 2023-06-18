package faccat;
import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		int anos = sc.nextInt();
		System.out.println("Quantos meses fazem desde o dia do seu último mêsversário: ");
		int meses = sc.nextInt();
		System.out.println("Dia do mês de hoje: ");
		int dias = sc.nextInt();
		int resultadoanos = anos * 365;
		int resultadomes = meses * 30;
		int resultadodias = resultadoanos + resultadomes + dias;
		System.out.println("Você tem: " + resultadodias + " dias de vida");
		sc.close();
	}
}
