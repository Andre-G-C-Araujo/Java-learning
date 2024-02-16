package collectionLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		ArrayList<String> colors = new ArrayList<String>();

		System.out.println("Digite 5 cores");
		for (int i = 0; i < 5; i++) {
			colors.add(read.next());
		}

		System.out.println("Cores Cadastradas : " + colors);

		Collections.sort(colors);

		System.out.println("Cores Ordenadas" + colors);

	}

}
