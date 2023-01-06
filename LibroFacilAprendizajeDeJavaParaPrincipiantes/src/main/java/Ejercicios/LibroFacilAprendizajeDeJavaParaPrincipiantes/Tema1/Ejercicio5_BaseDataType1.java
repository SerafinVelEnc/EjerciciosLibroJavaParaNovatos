package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema1;

/*Crear un archivo BaseDataType.java
 * Java tiene 8 tipos de datos basicos en este primer ejercicio vamos a usar los 4 primeros.
 * byte, short, int y long.
 */

public class Ejercicio5_BaseDataType1 {

	public static void main(String[]args) {
		
		byte a1 = 1; //1 byte = 8 bits -2^7 hasta 2^7-1(-128 hasta 127).
		short a2 = 10; //2 bytes = 16 bits -2^15 hasta 2^15-1.
		int a3 = 100;  //4 bytes = 32 bits -2^31 hasta 2^31-1.
		long a4 = 1000;  //8 bytes = 64 bits -2^63 hasta 2^63-1.
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
