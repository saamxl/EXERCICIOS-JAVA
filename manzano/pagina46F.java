package manzano;

public class pagina46F {
	  public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite uma base: ");
	        double base = scanner.nextInt();

	        System.out.println("Digite um expoente: ");
	        double expo = scanner.nextInt();

	        double contador = 0;

	        while(contador <= expo){
	            System.out.println(Math.pow(base, contador));
	            contador += 1;
	        }


	        scanner.close();
	    }
}
