package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema2;

/* Crea un archivo Method.java
 * Usar un metodo para hacer la suma de dos numeros y mostrar su resultado por consola.
 * da lo mismo poner el metodo sumar, delante o detras del metodo main, funciona igual.
 */

public class Ejercicio1_Method {

	//Metodo para sumar dos numeros
	public static int add(int a, int b) {
		return a+b;
	}
	
	//Metodo main
	public static void main(String[]args) {
		int resul=add(4,2); //llamar al metodo sumar (add)
		System.out.println(resul);
		
		resul=add(5,3);
		System.out.println(resul);
	}
}
