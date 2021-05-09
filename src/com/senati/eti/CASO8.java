package com.senati.eti;

import java.util.Scanner;

public class CASO8 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		
		// correcto....: entrre 1 y 30 -> n >=1 && n <=3
		// incorrecto..: No se ecuentra entre 1 y 30-> n <1 || n>30
		int n = 0 ;
		while (n <1 || n>30) {
			System.out.println("\nIngrese npumero [1-30]...:");
			n = y.nextInt();
			if (n <1 || n>30) 
				System.out.println("Número fuera de rango \n solo ingrese [1-30]");
		}
			
			System.out.println("\nTabla de multiplicar del "+ n);
			System.out.println("-----------------------------");
			
			for (int i = 1; i <= 15; i++)
				System.out.println(n + " x " + i + " = "+ (n *i));
					
			
			System.out.println("-----------------------------");
			
		
		
		

	}

}
