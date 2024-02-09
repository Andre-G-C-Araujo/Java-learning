package Condições;

import java.util.Scanner;

public class switchCase {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

        String[] product = {
                "Cachorro Quente",
                "X-Salada",
                "X-Bacon",
                "Bauru",
                "Refrigerante",
                "Suco de laranja"
        };

        double[] price = {10.00, 15.00, 18.00, 12.00, 8.00, 13.00};


        System.out.println("Products");
        for (int i = 0; i < product.length; i++) {
            System.out.println((i + 1) + " - " + product[i]);
        }


        System.out.print("Product Number: ");
        int index = read.nextInt();

        	
        switch(index) {
        case 1: 
        	 System.out.print("Qtnd: ");
        	int qty = read.nextInt();
        	double total = price[index - 1] * qty;
        	
        	 System.out.print(
        			 "Product : " + product[index - 1]  + " \n" +  
        	 "Each price: R$ " + price[index - 1] + "\n" +
        					 "Qtd: " + qty + "\n" + 
        					 "Total: R$ " + total
        					 );
        	 break;
        case 2: 
       	 System.out.print("Qtnd: ");
       	int qty2 = read.nextInt();
       	double total2 = price[index - 1] * qty2;
       	
       	 System.out.print(
       			 "Product : " + product[index - 1]  + " \n" +  
       	 "Each price: R$ " + price[index - 1] + "\n" +
       					 "Qtd: " + qty2 + "\n" + 
       					 "Total: R$ " + total2
       					 );
       	 break;
        case 3: 
       	 System.out.print("Qtnd: ");
       	int qty3 = read.nextInt();
       	double total3 = price[index - 1] * qty3;
       	
       	 System.out.print(
       			 "Product : " + product[index - 1]  + " \n" +  
       	 "Each price: R$ " + price[index - 1] + "\n" +
       					 "Qtd: " + qty3 + "\n" + 
       					 "Total: R$ " + total3
       					 );
       	 break;
        case 4: 
       	 System.out.print("Qtnd: ");
       	int qty4 = read.nextInt();
       	double total4 = price[index - 1] * qty4;
       	
       	 System.out.print(
       			 "Product : " + product[index - 1]  + " \n" +  
       	 "Each price: R$ " + price[index - 1] + "\n" +
       					 "Qtd: " + qty4 + "\n" + 
       					 "Total: R$ " + total4
       					 );
       	 break;
        case 5: 
       	 System.out.print("Qtnd: ");
       	int qty5 = read.nextInt();
       	double total5 = price[index - 1] * qty5;
       	
       	 System.out.print(
       			 "Product : " + product[index - 1]  + " \n" +  
       	 "Each price: R$ " + price[index - 1] + "\n" +
       					 "Qtd: " + qty5 + "\n" + 
       					 "Total: R$ " + total5
       					 );
       	 break;
        case 6: 
       	 System.out.print("Qtnd: ");
       	int qty6 = read.nextInt();
       	double total6 = price[index - 1] * qty6;
       	
       	 System.out.print(
       			 "Product : " + product[index - 1]  + " \n" +  
       	 "Each price: R$ " + price[index - 1] + "\n" +
       					 "Qtd: " + qty6 + "\n" + 
       					 "Total: R$ " + total6
       					 );
       	 break;
       	 
       	 default: 
       		 System.out.println("Selecione um opção valída");
       		 
      
       	 
       	 
       	 
       	 
        }
        
        
        
        
        
     
       // if (index < 1 || index > 6) {
        //    System.out.println("Try Again.");
          //  return;
        //}

       
     
    
	}
	
}
