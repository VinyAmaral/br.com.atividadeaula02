package br.com.atividadeaula02;

import java.util.Scanner;

public class ativ1 {
		
	public static void main(String args[]) {

		int n, div, resto;
		
		for(n = 1000; n <= 1999; n++) {
			div = n / 11;
			resto = n % 11;
			
			if(resto == 5) {
				System.out.println("O número dividido por 11 que o resto é 5 é: " + n);
			}
			
		}
	}
	}

	
