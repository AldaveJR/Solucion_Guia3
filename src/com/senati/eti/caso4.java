package com.senati.eti;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		int x = 1, n=0, num_mayor = 0, aux = 0, c =1;
		while (x<= 4) {
			
			System.out.print("Ingrese numero " + x + ": ");
			n = y.nextInt();
			if (x ==1)
				aux= n;
			else
				if (aux ==n)
					c++;
			
	
			if (n > num_mayor)
				num_mayor = n;
			x++;
	
		}

		System.out.println("\nResultado");
		System.out.println(".............. ");
		System.out.println("Numero mayor..............: "+ num_mayor);
		
		if ( c ==4)
			System.out.println("Numeros iguales");

	}

}
