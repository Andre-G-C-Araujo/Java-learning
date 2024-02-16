package filasEplhas;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filassss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner read = new Scanner(System.in);
		Queue<String> filazera = new LinkedList<String>();
		
		while(true) {
			System.out.println(":: Recepciones ::");
			System.out.println("Opção ichi (1) - Adicionar uma pessoa");
			System.out.println("Opçao ni (2) - Mostar pessoas");
			System.out.println("Opçao san (3) - Remove person");
			System.out.println("Opçao zero (0) - Exit");
			
			
			
			System.out.println("- > Chose a option < -");
			
			int option = read.nextInt();
			
			switch(option) {
			case 1: 
				System.out.println("Digite o nome da pessoa para add");
				read.nextLine();
				String name = read.nextLine();
				filazera.offer(name);
				System.out.println(name + " foi adicionado a fila");
			break;
			
			case 2:
				System.out.println("Pessoas na fila de espera");
				System.out.println(filazera);
				
				break;
			case 3: 
				if(!filazera.isEmpty()) {
				String deletePerson = filazera.poll();
					System.out.println("Pessoa atendida : " + deletePerson);
				} else {
				
				System.out.println("A fila está vazia");
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
