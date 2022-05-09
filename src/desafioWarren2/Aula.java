package desafioWarren2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		Scanner pega_qtd_alunos = new Scanner(System.in);
		Scanner lista_tempo = new Scanner(System.in);
		
		int x,alunos_presentes;
		Integer[] tempo_de_chegada = new Integer[3];
		System.out.println("Informe o numero de alunos");
		System.out.println("");
		alunos_presentes = pega_qtd_alunos.nextInt();
		
		System.out.println("Informe o tempo de chegada dos alunos");
		
		
		String aula = null;
		for(x = 0; x < 3; x++) {
			
			tempo_de_chegada[x] = lista_tempo.nextInt();	
	
			if(tempo_de_chegada[x] <= 0 && alunos_presentes == 3 ) {
				aula = "Aula Normal";
				
			}else {
				aula = "Aula Cancelada";
			}
			
		}
		
		System.out.println(aula);
		
			
			
		
		
		

	}

}
