package Exercicio9;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um texto:");
		String palavra = entrada.nextLine();
		
		int x = palavra.length();
		
		String[] chare = new String[x];
		int z = 1;
		for(int i = 0; i < x; i++) {
			String letra = palavra.substring(i, z++);
			chare[i] = letra;			
		}
		
		for(int i = 0; i < x; i++) {
			System.out.println(chare[i]);
		}
		
		entrada.close();
	}


}
