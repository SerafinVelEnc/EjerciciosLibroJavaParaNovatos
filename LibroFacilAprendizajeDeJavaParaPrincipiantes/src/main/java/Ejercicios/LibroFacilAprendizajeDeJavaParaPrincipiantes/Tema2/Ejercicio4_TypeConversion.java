package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema2;

/* Crea un archivo TypeConversion.java
 * Integer.parseInt(): Este es un metodo predeterminado de java que puede convertir una cadena en un entero.
 */

public class Ejercicio4_TypeConversion {

	public static void main(String[]args) {
		String a="1";
		String b="2";
		
		String result=a+b; //+concatenar dos cadenas
		System.out.println(result); //12
		
		int total=Integer.parseInt(a)+Integer.parseInt(b); // convierte la cadena en entero y los suma
		System.out.println(total); //3
	}
}
