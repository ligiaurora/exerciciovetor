package Exercicio7;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numero = new int[5];
		int soma = 0;
		int multiplicacao = 1;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Escreva um número: ");
			numero[i] = entrada.nextInt();
		}
		System.out.print("Números: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(numero[i]+", ");
		}
		for (int i = 0; i < 5; i++) {
			soma = soma + numero[i];
		}
		System.out.println("\nSoma: "+soma);
		for (int i = 0; i < 5; i++) {
			multiplicacao = multiplicacao * numero[i];
		}
		System.out.println("Multiplicação: "+multiplicacao);	
		entrada.close();
	}

}
