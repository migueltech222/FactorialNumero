package es.islasfilipinas.dam.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Inicializaci�n de variables (n�mero a introducir del usuario y el objeto Scanner)
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Ayuda en consola (instrucciones para que el usuario haga un buen uso del programa)
		System.out.println("Programa para saber el factorial de un n�mero\n");
		System.out.println("Introduzca el n�mero del cual quieres su factorial:");
		
		//Le pido al usuario el n�mero del cual quiere saber su factorial
		num = entrada.nextInt();
		
		//Igualo una variable al n�mero introducido por el usuario para as� guardarla y sacarla luego en pantalla
		int numeroInicial = num;
		
		
		//Mediante un if guardo las 3 posibilidades que puede introducir el usuario (obviando que hay un n�mero entero l�mite que se sale de
		//los par�metros de int)
		
		//CASO 1-->n�mero mayor que 0
		if (num>0) {
			
			//Bucle para realizar la operaci�n del factorial de un n�mero
			for (int i=num-1; i>1; i--) {
				num = num*i;
			}
			//Imprimo el resultado en pantalla
			System.out.println("El factorial de "+numeroInicial+" es: "+num);
			
		}
		
		else {
			//CASO 2-->n�mero negativo
			if (num<0)
			System.out.println("El factorial de un numero se refiere solo a los n�meros enteros naturales, por lo tanto por definici�n,"
					+ " no es correcto calcular el factorial de un numero negativo");
			//CASO 3-->el n�mero introducido es 0
			else
				System.out.println("El factorial de 0 es: 1");
		}
			
	}

}