package com.senati.eti;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		int n = y.nextInt();
		
		//sumatoria
		// r = 1 + 2+3+.....+n
		int x = 1; // contador
		int suma = 0; //acumulador
		while(x <=n) {
			
			suma +=x;
			
			if (x < n)
				System.out.print(x +"+");
				else
					System.out.print(x + " = "+ suma);
			
			x++;	
		}
		
		
		/*
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Sumatoria...: " + suma);*/

	}

}
