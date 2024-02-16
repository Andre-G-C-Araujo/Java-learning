package collectionLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class collectionSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		Set<Integer> setNumber = new HashSet<Integer>();

		System.out.println("Digite uma coleção de 10 numeros não repetidos");
		for (int i = 0; i < 10; i++) {
			setNumber.add(read.nextInt());

		}

		System.out.println("\nDados da Collection: " + setNumber);
		System.out.println("============================");

		System.out.println("Listar com iterator");

		Iterator<Integer> iSetNumber = setNumber.iterator();

		while (iSetNumber.hasNext()) {
			System.out.println(iSetNumber.next());
		}

	}

}
