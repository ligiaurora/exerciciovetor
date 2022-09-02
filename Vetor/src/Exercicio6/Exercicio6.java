package Exercicio6;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		float[] inteiro = new float[10];
		float[] media = new float[10];
		
		for (int x = 1; x <= 10; x++) {
			float soma = 0;
			for (int i = 0; i < 4; i++) {
				System.out.print("Nota Aluno: "+x+": ");
				inteiro[i] = entrada.nextFloat();
				soma = soma + inteiro[i];
			}
				media[x-1] = soma/4;
		}
		int n = 0;
		for (int i = 0; i < 10; i++) {
			if (media[i] >= 7) {
				n++;
			}
		}
		System.out.println(n+" Alunos conseguiram maior ou igual a 7 de média");
		entrada.close();
	}

}
