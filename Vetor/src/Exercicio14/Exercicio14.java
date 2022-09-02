package Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			int idade[] = new int[30];
			float altura[] = new float[30];
			float somaa = 0;
			
			for(int i = 0; i < 30; i++) {
				System.out.print("Digite idade:");
				idade[i] = entrada.nextInt();
				
				System.out.print("Digite altura:");
				altura[i] = entrada.nextFloat();
				somaa = somaa + altura[i];
			}
				float media = somaa/30;
				int alunos = 0;
			for(int i = 0; i < 30; i++) {
				if (idade[i] > 13 && altura[i] < media) {
					alunos++;
				}
			}
			System.out.println("Existem "+alunos+" alunos(as) com alura inferior a média");
		entrada.close();
	}
}
