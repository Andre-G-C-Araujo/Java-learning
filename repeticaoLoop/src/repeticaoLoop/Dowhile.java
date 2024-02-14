package repeticaoLoop;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		Scanner read = new Scanner(System.in);

		int n  , result = 0;
		

		do  {
			System.out.println("Digite um numero");
			n = read.nextInt();
			
			if(n > 0) {
				result += n;
			} 
		
		} while (n != 0);

		System.out.println("A soma dos numeros positivos é : " + result );
		

		
		
		
	}

}
