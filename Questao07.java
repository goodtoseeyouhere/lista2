package listaExercicio2;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		int quantidadePares = 0;
		int numero;
		double media;
		
		System.out.printf("Digite um numero inteiro ou 0 para sair\n");
		numero = ler.nextInt();
		
		while(numero!= 0) {			
			if(numero % 2 == 0) {
				soma = soma + numero;
				quantidadePares++;				
			}				
			numero = ler.nextInt(); 			
		}
		if(quantidadePares > 0 ) {
			media = (double) soma / quantidadePares;
			System.out.printf("A media aritmetica dos numeros pares é igual a %f", media);
		}
		else {
			System.out.printf("Nenhum numero par foi digitado");
		}

	ler.close();	
	}

}
