package Exercicio2;
import java.util.Scanner;

public class Exercicio2 {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] numreais;
		numreais= new float[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número:");
			numreais[i] = entrada.nextFloat();	
		}
		
		for (int i = 9; 0 <= i; i--) {
			System.out.println(numreais[i]);	
		}
		entrada.close();
	}
}
