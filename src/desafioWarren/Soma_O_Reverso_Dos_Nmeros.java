package desafioWarren;


public class Soma_O_Reverso_Dos_Nmeros {

	public static void main(String[] args) {
				
		int num = 0, reverso = 0, soma = 0,contaImpar = 0;
		
		num = 100;
		int cont =0;
		
		
		for (int i = 1; i <= 1000000; i++) {
			
			while( cont < i) {
				
				reverso = reverso * 10;
				reverso = reverso + (i % 10);
				i = i / 10;
				
				if(cont + reverso % 2 == 1) {
					contaImpar++;
					soma = cont + reverso;
					
					System.out.println(" Numeros impar: " + soma);
					
				}
				
			}
			
		}
		System.out.println(" Qtd IMPAR: " + contaImpar);
		
		System.out.println("Numero reverso  " + reverso);		
	}
}

