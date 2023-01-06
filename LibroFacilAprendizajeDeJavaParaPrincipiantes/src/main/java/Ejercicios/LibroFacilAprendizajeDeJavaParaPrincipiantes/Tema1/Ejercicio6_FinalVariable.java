package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema1;

/*Crea un archivo FinalVariable.java
 * Constante (Constant): el valor no se puede cambiar.
 * se pone al inicio de la linea la palabra final.
 * El nombre de la constante se escribe con todas las letras en mayusculas y si esta formado por varias palabra, estas se separan por un guion bajo (_).
 */

public class Ejercicio6_FinalVariable {

	public static void main(String[]args) {
		
		// Costante entera (Integer constante).
		final int UP = 0;
		final int DOWN = 1;
		System.out.println(UP);
		System.out.println(DOWN);
		
		//Constante decimal (floating constante).
		final float PI = 3.14f;
		final float NUM_M = 66.54f;
		System.out.println(PI);
		System.out.println(NUM_M);
		
		//Constante booleana (boolean constante).
		final boolean RUN = true;
		System.out.println(RUN);
		
		//Constante de caracter (char constante).
		final char A = 'B';
		System.out.println(A);
		
		//Constante de cadena de letras (string constante).
		final String CONST_U = "Love for forever:";
		System.out.println(CONST_U);
			
	}
}
