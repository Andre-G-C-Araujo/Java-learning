package operators;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner read = new Scanner(System.in);
		
		double salario;
		double abono;
		double novoSalario;
		
		
		System.out.printf("Informe o salario:\n");
		salario = read.nextDouble();
		System.out.printf("Agora Informe o abono:\n");
		abono = read.nextDouble();
		System.out.printf("Processando :\n");
		novoSalario = abono + salario;
		System.out.printf("Seu 'novo salario ' é: \n" + novoSalario);
		
		
		System.out.printf("\n --------------------------- \n");
		
		
		float nota1 = 10.0f;
		float nota2 = 8.0f;
		float nota3 = 7.0f;
		float nota4 = 7.5f;
		float numeroTotalDeNotas = 4f;
		
		float result = (nota4 + nota3 + nota2 + nota1) / numeroTotalDeNotas;
		
		System.out.println("Resultado da nota : " + result);
		System.out.printf("\n --------------------------- \n");
		
		float salarioBruto = 2000.00f;
		float adicionalNoturno = 500.00f;
		float horasExtras = 100.00f;
		float descontos = 200.00f;
		float totalDeHorasExtras = 5f;

		
		float somaDosResultados=((salarioBruto + adicionalNoturno + (horasExtras * totalDeHorasExtras))- descontos);
		float salarioLiquido = 2800.00f;
		
		System.out.println("A resposta é certa: " + (somaDosResultados));
		System.out.println("A resposta é : " + (salarioLiquido == somaDosResultados));
		
		
		System.out.printf("\n --------------------------- \n");
		
		int n1 = 5;
		int n2 = 6;
		int n3 = 7;
		int n4 = 8;
		
		System.out.println((n1 * n2) - (n3 * n4));
		
		int p1 = 5;
		int p2 = 6;
		int p3 = -7;
		int p4 = 8;
		
		
		System.out.printf("\n --------------------------- \n");
		System.out.println((p1 * p2) - (p3 * p4));
		

	}

}
