package Condições;

import java.util.Scanner;

public class ifElse2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
			
		int numberIn;
		System.out.printf("Insira o numero negativo ou positivo : ");
		numberIn = read.nextInt();
		
		boolean positivoNegativo = (numberIn > 0 ? true : false);
		String parImpar = (numberIn % 2 == 0 ? "Numero é par" : "Numero não é par");
		
		 				
		String result = (positivoNegativo && parImpar == "Numero é par" ? "Numero é par e positivo" : positivoNegativo ?
				"O numero é positivo e impar" : parImpar != "Numero é par" ? "O numero é impar e negativo"  :" O numero é negativo e par");
		

		System.out.println(result);
	}

}
