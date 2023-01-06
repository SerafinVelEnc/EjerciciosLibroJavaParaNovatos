package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema1;

/*Crea un archivo TestVariable.java
 * Denominacion de Variable:
 * -Consta de caracteres, guiones bajos, numeros y simbolo de $ (no recomendado).
 * -La primera letra debe ser un caracter, _ o $, no puede ser un numero.
 * Cup = Taza, Mineral water = Agua mineral, null = vacio.
 */

public class Ejercicio4_TestVariable {

	public static void main(String[]args) {
		String $cup="mineral water";
		String _cup="Limonada";
		
		//Imprime los datos de $cup en la consola.
		System.out.println($cup);
		
		//Modificar el valor de la variable $cup.
		$cup="coca cola";
		System.out.println($cup);
		
		//Cambiar el contenido $cup, por el de _cup.
		$cup=_cup;
		System.out.println($cup);
		
		//Vaciar la variable, vaciar los datos de la memoria $cup.
		$cup="";
		System.out.println($cup);
		
		//Asignar un valor vacio para eliminar la variable $cup
		$cup=null;
		System.out.println($cup);
		
	}
}
