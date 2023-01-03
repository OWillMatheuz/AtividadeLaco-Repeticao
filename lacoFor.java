package AtividadeRepeticao;

import java.util.Scanner;

public class lacoFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int somaPar=0, somaImpar=0, x, num;
		
		for(x=1;x<=10;x++) {
			System.out.println("Escreva o número: ");
			num = ler.nextInt();
			if(num % 2 == 0) {
				somaPar++;
			}
			else {
				somaImpar++;
			}
		}
		System.out.println("\nTotal de números pares: "+somaPar);
		System.out.println("\nTotal de números ímpares: "+somaImpar);
	}

}


