package jogoDaAdvinhacao;

import java.util.Random;
import java.util.Scanner;

public class randomGame {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Random randomize = new Random();

		int chosen, one = 1, two = 2;

		int selectNumber, randomNumber, tentativasJogadorA = 0, tentativasJogadorB = 0, tentativas = 0;
		randomNumber = randomize.nextInt(100);

		boolean saiuDoJogo = false, saiuDoJogoB = false;

		System.out.println("Quantos players? Selecione 1 ou 2");
		chosen = read.nextInt();

		if (chosen == two) {

			do {

				// System.out.print("The hidden number is : " +randomNumber + "\n");

				if (tentativasJogadorA <= tentativasJogadorB) {
					System.out.println("Guess the number or insert -1 to leave, Jogador A");
					selectNumber = read.nextInt();

					if (saiuDoJogo == true) {
						break;
					}

					if (selectNumber < 0) {
						System.out.println("\n Jogador A saiu! Desistencia \n");
						saiuDoJogo = true;

					}
					if (selectNumber > randomNumber) {
						System.out.println(" Hidden number is lower \n");
					}
					if (selectNumber < randomNumber) {
						System.out.println(" Hidden number is higher \n");
					}
					tentativasJogadorA++;

					if (selectNumber == randomNumber) {
						System.out.print("Parabens voce acertou! em :" + "\n" + tentativasJogadorA + "\tTentativas \n"
								+ " Vencedor jogador A");

					}

				} else {
					System.out.println("Guess the number or insert -1 to leave" + "\n" +  "Jogador B");


					selectNumber = read.nextInt();

					if (saiuDoJogo == true) {
					return;
					} else {
						
						

					if (selectNumber < 0) {
						System.out.println("\n Jogador B saiu! Desistencia \n");
						saiuDoJogoB = true;
						
						System.out.println("----------" + saiuDoJogoB + "aquiiii");
					}

					if (selectNumber > randomNumber) {
						System.out.println("\n Hidden number is lower");
					}
					if (selectNumber < randomNumber) {
						System.out.println("\n Hidden number is higher");
					}
					tentativasJogadorB++;

					if (selectNumber == randomNumber) {
						System.out.print("Parabens voce acertou! em :" + "\n" + tentativasJogadorB + "\tTentativas \n"
								+ " Vencedor jogador B");

					}

				}

				System.out.print("\n Numero escondido é !: \n" + randomNumber + "\n");
				}

			} while (selectNumber != randomNumber);

		} else {
			do {
				System.out.println("Guess the number or insert -1 to leave---SINGLE PLAYER---");
				selectNumber = read.nextInt();

				if (selectNumber < 0) {
					System.out.println("\n Jogador Desistiu \n");
					return;
				}
				if (selectNumber > randomNumber) {
					System.out.println(" Hidden number is lower \n");
				}
				if (selectNumber < randomNumber) {
					System.out.println(" Hidden number is higher \n");
				}
				tentativas++;

				if (selectNumber == randomNumber) {
					System.out.print("Parabens voce acertou! em :" + "\n" + tentativas + "\tTentativas \n");

				}

				System.out.print("-------" + randomNumber + "------- \n");
			} while (selectNumber != randomNumber);

		}
	}
}

