package listaExercicio2;
import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int base, expoente, total = 1;
		
		System.out.printf("Digite a base: ");
		base = ler.nextInt();
		System.out.printf("Digite o expoente: ");
		expoente = ler.nextInt();
		
		for(int i = 1; i<= expoente; i++) {
			total = total * base;
		}
		
		System.out.printf("%d elevado a %d é igual a %d", base, expoente, total);
		
		ler.close();
	}

}
