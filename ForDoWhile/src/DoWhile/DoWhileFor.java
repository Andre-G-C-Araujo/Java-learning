package DoWhile;

import java.util.*;

public class DoWhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		
		for(int i = 0; i <= 9; i++ ) {
			System.out.print("Digite o " + (i + 1)+ "°" +  " Numero");
			 int n1 = read.nextInt(); 
			 
			 boolean verify = n1 % 2 == 0;
			
			
		if(verify) {
				par++;
			} else {
				impar++;
			}
			
		}
		System.out.println("Total de numeros pares: " + par + "\n" + "Total de numeros impares: " + impar);
	

	}

}