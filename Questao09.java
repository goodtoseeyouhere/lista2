package listaExercicio2;
import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double numero1, numero2;
		double totalPotencia = 1; 
		int opcao;
		
		
		do {
			System.out.printf("Digite o primeiro numero: ");
			numero1 = ler.nextDouble();
			
			System.out.printf("Digite o segundo numero: ");
			numero2 = ler.nextDouble();
			
			if(numero1 == 0 && numero2 == 0) {
				System.out.printf("Programa encerrado");
				break;
			}
			
			System.out.printf("\nDigite 1 para somar");
			System.out.printf("\nDigite 2 para multiplicar");
			System.out.printf("\nDigite 3 para dividir");
			System.out.printf("\nDigite 4 para potencializar");
			System.out.printf("\nOpcao escolhida: ");
			
			opcao = ler.nextInt();
			
			switch(opcao) {
			case 1: System.out.printf("%f + %f = %f", numero1, numero2, numero1 + numero2);
			break;
			
			case 2: System.out.printf("%f * %f = %f", numero1, numero2, numero1 * numero2);
			break;
			
			case 3: 
				if(numero2 == 0) {
					System.out.printf("Impossivel dividir por zero.");
				}
				else {
					System.out.printf("%f / %f = %f", numero1, numero2, numero1 / numero2);
				}
			break;
			case 4: 
				for(int i = 1 i<= numero2; i++) { 
					totalPotencia = totalPotencia * numero1;
				}
				System.out.printf("%f ^ %f = %f", numero1, numero2, totalPotencia);
			}
			
			
			System.out.println();		
			
			
		}
		while(true);
		
		ler.close();
		

			
	}
		
		
}


