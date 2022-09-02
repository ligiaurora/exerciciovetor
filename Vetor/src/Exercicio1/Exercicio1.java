package Exercicio1;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] inteiro;
		inteiro= new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o valor de um número inteiro: ");
			inteiro[i] = entrada.nextInt();
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(inteiro[i]);	
		}
		entrada.close();
	}
}
