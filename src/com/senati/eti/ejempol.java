package com.senati.eti;
import java.util.Scanner;



import java.text.DecimalFormat;


public class ejempol {

	public static void main(String[] args) {
Scanner x = new Scanner(System.in);
		
		String[] arrcodigo = {"111", "222", "333", "444", "555", "666", "777", "888"};
		String[] arrclave = {"111", "222", "333", "444", "555", "666", "777", "888"};
		
		String[] arrnombre = {"Juan Gomez", "Sergio Cardenas", "Juana Gomez","Felipe Ramos",
	              "Pedro Lopez", "Felipe Torres", "Juan Lopez", "Luis Quinua"};
		int [] arrnota= {1300, 800, 1800, 1000, 1500, 400, 1005, 756};

		int t =0;

		
		String codigo ="";
		String clave ="";
		System.out.println("\n------------------------------------");
		System.out.println("-------------BANCO------------------");
		System.out.println("------------------------------------");
		
		System.out.print("\nIngrese tarjeta: ");
		
		codigo = x.nextLine();
		
		
		int posicion = -1;
		for (int i=0; i< arrcodigo.length; i++) {   
			if(arrcodigo [i].equals(codigo)) {
				posicion = i;
				break;
			
				}
			}
		
		if (posicion == -1) {
			System.out.println("==================");
			System.out.println("Tarjeta no valida");
			System.out.println("==================");
			return;
		}

		System.out.print("Ingrese Clave: ");
		clave = x.nextLine();
		int posicion1 = -1;
		int posicion2 = -1;
		int posicion3 = -1;
		for (int i=0; i< arrclave.length; i++) {
		if(arrclave [i].equals(clave)) {
			posicion1 = i;
			break;
			}
		}
		
		
		if (posicion1 == -1) {
			System.out.println("\n======================================");
			System.out.println("Clave incorrecta, te quedan 2 intentos");
			System.out.println("======================================");
			
			System.out.print("\nIngrese Clave: ");
			clave = x.nextLine();
			
			for (int i=0; i< arrclave.length; i++) {
			if(arrclave [i].equals(clave)) {
				posicion2 = i;
				break;
				}
			}
		
			if (posicion2 == -1) {
				System.out.println("\n======================================");
				System.out.println("Clave incorrecta, te quedan 1 intentos");
				System.out.println("======================================");
				
				System.out.print("\nIngrese Clave: ");
				clave = x.nextLine();
				
				for (int i=0; i< arrclave.length; i++) {
				if(arrclave [i].equals(clave)) {
					posicion3 = i;
					break;
					}
				}
				
				if (posicion3 == -1) {
					System.out.println("\n===================================================");
					System.out.println("Clave incorrecta, << TU TARJETA A SIDO BLOQUEADA >>");
					System.out.println("===================================================");
					return;
				}
				
			}
			
		}
		
		String rp = "S", nombre = "";
		int nr = 0, edad = 0;

		
		while (rp.equals("S") || rp.equals("s")) {
			
			
			System.out.println("\n************");
			System.out.println("Bienvenido : "+arrnombre[posicion]);
			System.out.println("1. Depositar ");
			System.out.println("2. Retirar ");
			System.out.println("3. Ver Saldo ");
			System.out.println("************");
			System.out.print("Elija una opcion: ");
			
			t = x.nextInt();
			
			
			switch(t)
			{
			case 1:
			{
				System.out.println("==================");
				System.out.print("Ingrese cantidad a depositar : S/");
				   float nota = x.nextFloat();
				   System.out.println("==================");
				if (posicion1 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion1]  );
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion1]+ nota) );
					System.out.println("------------------------------------");
					}
				if (posicion2 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion2]  );
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion2]+ nota) );
					System.out.println("------------------------------------");
					}
				if (posicion3 != -1) {
					System.out.println("Dinero Anterior: S/"+arrnota[posicion3]  );
					System.out.println("Dinero Disponible : S/"+(arrnota[posicion3]+ nota) );
					System.out.println("------------------------------------");
					}
				break;
			}
			case 2:
			{
				System.out.println("==================");
				System.out.print("Ingrese cantidad a retirar : S/");
				   float nota = x.nextFloat();
				   System.out.println("==================");
				if (posicion1 != -1) {
					if(nota<=arrnota[posicion1]) {
						System.out.println("Dinero Anterior : S/"+arrnota[posicion1] );
						System.out.println("Nuevo Saldo : S/"+(arrnota[posicion1]- nota) );
						System.out.println("------------------------------------");
						   }
					if(nota>=arrnota[posicion1]) {
						System.out.println("El monto a retirar es mayor al monto disponible");
					
					}
					if(nota>1000) {
						System.out.println("El monto máximo a retirar es S/1000 ");
					}
				}
				if (posicion2 != -1) {
					if(nota<=arrnota[posicion2]) {
						System.out.println("Dinero Anterior : S/"+arrnota[posicion2] );
						System.out.println("Nuevo Saldo : S/"+(arrnota[posicion2]- nota) );
						System.out.println("------------------------------------");
						   }
					if(nota>=arrnota[posicion2]) {
						System.out.println("El monto a retirar es mayor al monto disponible");
					
					}
					if(nota>1000) {
						System.out.println("El monto máximo a retirar es S/1000 ");
					}
				}
				if (posicion3 != -1) {
					if(nota<=arrnota[posicion3]) {
						System.out.println("Dinero Anterior : S/"+arrnota[posicion3] );
						System.out.println("Nuevo Saldo : S/"+(arrnota[posicion3]- nota) );
						System.out.println("------------------------------------");
						   }
					if(nota>=arrnota[posicion3]) {
						System.out.println("El monto a retirar es mayor al monto disponible");
					
					}
					if(nota>1000) {
						System.out.println("El monto máximo a retirar es S/1000 ");
					}
				}
				
				break;
			}
			case 3:
			{
				if (posicion1 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion1] );
					}
				if (posicion2 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion2] );
					}
				if (posicion3 != -1) {
					System.out.println("===========================");
					System.out.println("Dinero Disponible: S/"+ arrnota[posicion3] );
					}
				break;
				
			}
				
			default:
			{
				System.out.println("Opcion no disponible");
			}
			
			}
			
			x.nextLine();
	        
			System.out.print("¿Continua? [S][N]");
			rp = x.nextLine();	
			
			if (rp.equals("N") || rp.equals("n")) {
				System.out.println("\n<< GRACIAS POR SU TIEMPO >> ");
				
			}
			
			
		}
		
	}

}

	
		

	
		
		

	
		

	
		
			

	
		



	
		

	
