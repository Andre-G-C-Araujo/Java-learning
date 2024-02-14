package repeticaoLoop;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		int numA, numB, numC;

		System.out.println("Insira o primeiro numero : ");
		numA = read.nextInt();
		System.out.println("Insira o segundo numero : ");
		numB = read.nextInt();

		if (numA >= numB) {
			System.out.println("Intervalo inválido");
			return;
		} else {

			for (int i = numA; i <= numB; i++) {
		if(i % 3 == 0 && i % 5 == 0) { 
			System.out.print(i + " é multiplo de 3 e 5 \n");
			
		}
		
				
			
				
				
				
	
			

			}
		}

	}

}
