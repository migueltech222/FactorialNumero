package es.islasfilipinas.dam.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa para saber el factorial de un n�mero\n");
		System.out.println("Introduzca el n�mero del cual quieres su factorial: ");
		num = entrada.nextInt();
		
		for (int i=num-1; i>1; i--) {
			num = num*i;
		}
		
		System.out.println("El factorial del n�mero introducido es: "+num);
		
	}

}