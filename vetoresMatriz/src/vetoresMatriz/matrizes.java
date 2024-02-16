package vetoresMatriz;

public class matrizes {

	public static void main(String[] args) {

		int [][] listaDeListas = new int [3][3];		
	
		int c =+ 1;
		
		for(int i = 0; i < listaDeListas.length; i++) {
			
			for (int j = 0; j < listaDeListas.length; j++) { 
				System.out.print(listaDeListas[i][j] = c++);
				
			}
			
			System.out.println();
		}
		System.out.print("Diagonal Principal : " + listaDeListas[0][0] + listaDeListas[1][1] + listaDeListas[2][2]);
		System.out.println();
		System.out.print("Diagonal Secundaria : " + listaDeListas[0][2] + listaDeListas[1][1] + listaDeListas[2][0]);
		System.out.println();
		System.out.print("Diagonal Principal : " + (listaDeListas[0][0] + listaDeListas[1][1] + listaDeListas[2][2]));
		System.out.println();
		System.out.print("Soma Secundaria : " + (listaDeListas[0][2] + listaDeListas[1][1] + listaDeListas[2][0]));
	} 


}
