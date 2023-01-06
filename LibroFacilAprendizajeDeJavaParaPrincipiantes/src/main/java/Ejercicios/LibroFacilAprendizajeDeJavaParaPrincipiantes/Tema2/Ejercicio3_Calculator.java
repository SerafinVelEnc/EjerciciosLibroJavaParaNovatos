package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema2;

/*Crear un archivo Calculator.java
 * Clase (class): es un modelo o prototipo definido por el usuario a partir del cual se crean los objetos.
 */

public class Ejercicio3_Calculator {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}	

	public class ArithmeticOperador{
		
		public static void main(String[]args) {
			
			Ejercicio3_Calculator cal=new Ejercicio3_Calculator();
		
			int result=cal.add(4,2); //llamar al metodo add
			System.out.println(result);
		
			result=cal.sub(4,2); //llamar al metodo sub
			System.out.println(result);
		
			result=cal.multiply(4,2); //llamar al metodo multiply
			System.out.println(result);
		
			result=cal.divide(4,2); //llamar al metodo divide
			System.out.println(result);
		}
	}
}