package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema2;

/* Crear un archivo Method2.java
 * en el cual añadiremos al metodo suma del anterior los metodos resta multiplicacion y division.
 * y hemos cambiado los metodos primero el main y despues los demas, para ver que fundiona igual.
 */

public class Ejercicio2_Method2 {

	public static void main(String[]args) {
		
		int resul=add(4,2); //llamar al metodo add
		System.out.println(resul);
		
		resul=sub(4,2); //llamar al metodo sub
		System.out.println(resul);
		
		resul=multiply(4,2); //llamar al metodo multiply
		System.out.println(resul);
		
		resul=divide(4,2); //llamar al metodo divide
		System.out.println(resul);
		
	}
	
	//Metodo add (suma):
	public static int add(int a, int b) {
		return a+b;
	}
	
	//Metodo sub (resta):
	public static int sub(int a, int b) {
		return a-b;
	}
		
	//Metodo multiply (multiplicacion):
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	//Metodo divide (division):
		public static int divide(int a, int b) {
			return a/b;
		}
}
