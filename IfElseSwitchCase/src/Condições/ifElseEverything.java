package Condições;

public class ifElseEverything {
	
	public static void main(String[] args) {
	int n1 = 2;
	int n2 = 4;
	int n3 = 8;
	
	
	if((n1 + n2) > n3) {
		System.out.printf("Aqui deu true(verdade)");
	} else {
		System.out.printf("Aqui deu false(falso)");
	}
	
	// Operação ternaria
	
	 //boolean verifyNumberHigher = (n1 + n2) > n3 ? true : false;
	
	//System.out.println(verifyNumberHigher ? "A soma de A + B é Maior que C" : "A Soma é de A + B é menor que C \n" );
	
	/*
	System.out.println("-------------------------------- \n");
	
	int n4 = 2;
	int n5 = 2;
	int n6 = 5;
	
	 boolean verifyNumberHigher2 = (n4 + n5) > n6 ? true : false;
	
	System.out.println(verifyNumberHigher2 ? "A soma de A + B é Maior que C" : "A Soma é de A + B é menor que C" );
	
	System.out.println("-------------------------------- \n");
	
	int n7 = 2;
	int n8 = 2;
	int n9 = 4;
	
	 boolean verifyNumberHigher3 = (n7 + n8) > n9 ? true : false;
	
	System.out.println(verifyNumberHigher3 ? "A soma de A + B é Maior que C" : verifyNumberHigher3 ? "A Soma é de A + B é menor que C" : "Os numero são iguais" );
	
	System.out.println("-------------------------------- \n");
	
	} */
}
}