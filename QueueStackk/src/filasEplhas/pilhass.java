package filasEplhas;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;


public class pilhass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		Stack<String> livros = new Stack<String>();
		
		
		while(true) {
			System.out.println(":: Menu ::");
			System.out.println("Opção ichi (1) - Adicionar um livro");
			System.out.println("Opçao ni (2) - Mostrar livros");
			System.out.println("Opçao san (3) - Remove book");
			System.out.println("Opçao zero (0) - Exit");
			
System.out.println("- > Chose a option < -");
			
			int option = read.nextInt();
			
			
			
			switch(option) {
			case 1: 
				System.out.println("Digite o nome do livro para add");
				read.nextLine();
				String booksName = read.nextLine();
				livros.push(booksName);
				System.out.println(booksName + " foi adicionado a pilha");
			break;
			
			case 2:
				System.out.println("Livros na pilha");
				System.out.println(livros);
		
				break;
			case 3: 
				if(!livros.isEmpty()) {
				String deleteBook = livros.pop();
					System.out.println("livro retirado : " + deleteBook);
				} else {
				
				System.out.println("A pilha está vazia");
				}
				break;
				
			case 0: 
				System.out.println("Voce saiu da aplicaçao. Tenha um bom dia!");
				break;
			default: 
				System.out.println("Opçao invalida- ");
				break;
			}
			
		}
		
		
		
		
		
	
	}

}
