package repeticaoLoop;

import java.util.Scanner;

public class repeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		int age = 0;
		int numberOfPeoplesLessThan21 = 0;
		int numberOfPeoplesHigherThan50 = 0;

		while (age >= 0) {
			System.out.println("Digite uma idade");
			age = read.nextInt();

			if (age > 50) {
				numberOfPeoplesHigherThan50++;
			}
			if (age < 21 && age > 0) {
				numberOfPeoplesLessThan21++;
			}

		}

		System.out.println("Total de pessoas menores de 21 anos : " + numberOfPeoplesLessThan21 + "\n"
				+ "Total de pessoas maiores de 50 anos : " + numberOfPeoplesHigherThan50

		);

	}

}
