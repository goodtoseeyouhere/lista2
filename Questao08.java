package listaExercicio2;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double numero;		
		
		System.out.printf("Digite um numero real positivo: ");
		numero = ler.nextDouble();
		
		while(numero < 0 ) {
			System.out.printf("Digite um numero real positivo: ");
			numero = ler.nextDouble();
		}
		
		System.out.printf("O numero digitado é positivo!");
		
		ler.close();
		
		
	}

}
