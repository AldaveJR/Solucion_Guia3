package com.senati.eti;

import java.util.Scanner;

public class caso7 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		
		System.out.println("Nombre....: ");
		String nombre = y.nextLine();
		
		// para x = 1 hasta 10 hacer
		// for ascendente de 1 a 10 (aumenta de 1 en 1 )
		System.out.println(" FOR ASCENDENTE");
		System.out.println("---------------");
		
		for (int x = 1; x <= 10; x++)//como varia ..x+=1 o x+=2
			System.out.println( x + " .-Bienvenido "+ nombre + " al curso");
		
		//para x =10 hasta 0 hacer con paso -2
		//for descendente de 10 a 1(disminuye de 2 en 2
		System.out.println(" FOR DESCENDENTE");
		System.out.println("---------------");
		for (int i =10; i >0; i-=1)
			System.out.println(i);
		

	}

}
