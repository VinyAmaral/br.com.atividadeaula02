
package br.com.atividadeaula02;

import java.util.Scanner;

public class ativ2 {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			int n,resto, divisao;
			
			for(n=0;n<=10;n++ )
			{
				System.out.println ("Digite um numero: ");
				n = entrada.nextInt();
				divisao=n/2;
				resto=n%2;
			
			if (resto==0) 
			{
				System.out.println("Este numero é par");
			}
				
			else
			{
				System.out.println("Este numero é impar");
			}
			
		}
						
			
			
		}

	}
	

