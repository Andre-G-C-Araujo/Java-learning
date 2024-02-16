import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class filass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner read = new Scanner(System.in);
		
		Queue<Integer> filazera = new LinkedList<Integer>();
		
	
		while(true) {
			System.out.println("--- Recepciones ---");
			System.out.println("Option : ichi (1) : Add a person");
			System.out.println("Option : ni (2) : Show people");
			System.out.println("Option : san (3) : Remove person");
			System.out.println("Option : zero (0) : Exit ");
			
			System.out.println(" - > Chose a option < -");
			int option = read.nextInt();
			
			
			switch(option) {
			case 1: 
				System.out.println("Write person name to add");
				read.nextLine();
				String name = read.nextLine();
				filazera.offer(name);
				System.out.println(name + "was add to the queue");
				break;
			}

		}
		
		
	}

}
