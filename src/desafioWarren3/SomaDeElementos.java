package desafioWarren3;

import java.util.Arrays;
import java.util.Scanner;

public class SomaDeElementos {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
	
		int elemento,soma=0, menor_elemento;
		
		System.out.println("Digite o elemento");
		elemento = n.nextInt();
		System.out.println("Elemento  "  + elemento);
		
		int[] vet = new int[6];
		int[] vetsoma = new int[6];
		
		System.out.println("Informe os numeros do vetor");
		for(int i = 0; i < 6; i++) {
			vet[i] = n.nextInt();
		}
	
		Arrays.sort(vet);
		
		for(int i =0; i < 6; i++) {
			if( vet[0] + vet[1] + vet[2] == elemento || vet[3] + vet[4] + vet[5] == elemento) {
				System.out.println( vet[0] + " " + vet[1] + " " + vet[2] + vet[3] + " " + vet[4] + " " + vet[5]);
				
			}
		}
	}
}


