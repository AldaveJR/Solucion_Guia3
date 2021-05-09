package com.senati.eti;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String nombre= "", rpta= "s", estado = "";
		int edad = 0, num_reg = 0, n_aptos=0, n_noap=0;
		while (rpta.equals("s") || rpta.equals("s")) {
			num_reg++;
			System.out.println("--------------");
			System.out.println("REGISTRO " + num_reg + ":");
			System.out.println("--------------");
			
			System.out.print("Nombre......: ");
			nombre = x.nextLine();
			System.out.print("Edad......: ");
			edad = x.nextInt();
			if (edad>= 18) {
				estado = "Apto para votar";
				n_aptos++;	
			}
			else
				estado = "Menor de edad";
			
			if (edad<= 18)
			n_noap++;
			
			System.out.println("Estado.....: "+ estado);
			
			x.nextLine();//Limpieza de buffer
			
			System.out.println("¿Desea registrar otro participante? <S/N> :");
			rpta = x.nextLine();	
		//lectura de datos
		//1.texto
		// 2.numero entero o decimal
		
		//1.texto
		//2.texto
		//3.texto
		//4.numero entero o decimal
		
		//incovenientes
		// 1.numero entero o decimal
		//reiniciar la lectura (buffer)del texto ( reinicio de la lectura)
		//sc.nextLine()
		//2.texto
		
		//texto
		//numero entero o decimal
		//reinicar la lectura(buffer) del texto
		//sc.nextLine
		//texto

		}
		//mostrar el resumen
		System.out.println("--------------");
		System.out.println(" R E S U M E N");
		System.out.println("-------------");
		System.out.println("Participantes registrados...: " + num_reg);
		System.out.println("Aptos para votar............: " + n_aptos);
		System.out.println("Aptos para no votar............: " + n_noap);

	}

}
