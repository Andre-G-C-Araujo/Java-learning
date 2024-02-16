package vetoresMatriz;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);

		int[] arrayZera = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numberToFind;

		System.out.println("Digite o numero que voce quer encontrar : ");
		numberToFind = read.nextInt();

		if(numberToFind > 10) {
			System.out.println("Numero fora de intervalo!");
			return;
		}
		
		for (int i = 0; i < 10; i++) {
		
			if (numberToFind == arrayZera[i]) {
				System.out.print("O numero se encontra no index(posição): " + i);
			}

		}

	}

}
