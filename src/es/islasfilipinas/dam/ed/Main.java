package es.islasfilipinas.dam.ed;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Inicialización de variables (número a introducir del usuario y el objeto Scanner)
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Ayuda en consola (instrucciones para que el usuario haga un buen uso del programa)
		System.out.println("Programa para saber el factorial de un número\n");
		System.out.println("Introduzca el número del cual quieres su factorial:");
		
		//Le pido al usuario el número del cual quiere saber su factorial
		num = entrada.nextInt();
		
		//Igualo una variable al número introducido por el usuario para así guardarla y sacarla luego en pantalla
		int numeroInicial = num;
		
		
		//Mediante un if guardo las 3 posibilidades que puede introducir el usuario (obviando que hay un número entero límite que se sale de
		//los parámetros de int)
		
		//CASO 1-->número mayor que 0
		if (num>0) {
			
			//Bucle para realizar la operación del factorial de un número
			for (int i=num-1; i>1; i--) {
				num = num*i;
			}
			//Imprimo el resultado en pantalla
			System.out.println("El factorial de "+numeroInicial+" es: "+num);
			
		}
		
		else {
			//CASO 2-->número negativo
			if (num<0)
			System.out.println("El factorial de un numero se refiere solo a los números enteros naturales, por lo tanto por definición,"
					+ " no es correcto calcular el factorial de un numero negativo");
			//CASO 3-->el número introducido es 0
			else
				System.out.println("El factorial de 0 es: 1");
		}
			
	}

}