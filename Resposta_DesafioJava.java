package exercicios_m�todo;

import java.util.Scanner;

public class Resposta_DesafioJava {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Bem Vindo ao simulador de Xadrez Java!!!!");
		System.out.println();
		System.out.println("Simule quantas casas poder� andar com uma torre!");
		System.out.println();
		System.out.println("A torre � uma pe�a que fica nas extremidades do tabuleiro e s� anda para frente, atr�s e os lados.");
		System.out.println("Cada jogador tem 2 torres no seu tabuleiro.");
		System.out.println();
		System.out.println("Veja as poss�veis casas que a torre poderia estar.");
		System.out.println();
	
			String topo;
	        String conteudo;
	        int opc = 0;
		
	        String t = "-";
	        int num = 0;
	        int num2 = 0;
	        System.out.print("Linha:");
	        num =leitor.nextInt();
	        System.out.print("Coluna:");
	        num2 =leitor.nextInt();
	        
	         System.out.print("*  ");
	        for(int lin = 1; lin <= 8; lin++){
	            System.out.print(lin+"  ");
	             
	             for(int x = 1; x <= 7; x++){
	                 if(x == 7 ){
	                   
	                
	          System.out.println("");
	       for(int col = 1; col <= 8; col++){
	          System.out.print(col+"|");
	       for(int j=1 ; j<= 7 ; j++){
	                
	                      System.out.print(" "+ t+" ");
	       if(num == j ){
	    	               System.out.print(" "+ "x ");
	                }
	       if(j == 7 ){
	                
	                    
	                        System.out.println("");
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
	       }
	                 }
	             }
	        }
	}}
