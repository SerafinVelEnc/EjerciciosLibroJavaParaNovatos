package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema1;

/*Crea un archivo: BaseDataType.java
 * condtinuamos con los 4 ultimos tipos, de datos basicos:
 * float, double, char y boolean.
 */

public class Ejercicio5_BaseDataType2 {
	
	public static void main(String[]args) {
		
	//double y float son numeros naturales tiene decimales el decimal se escribe con un punto.
	double b1 = 10.1; //8 bytes = 64 bits = 
	float b2 = 12.2f; //4 bytes = 32 bits =
	System.out.println(b1);
	System.out.println(b2);
	
	//char es un solo caracter con comillas simples.
	char c1 = 'a'; // 2 bytes = 16 bits.
	System.out.println(c1);
	
	//boolean tiene solo dos valores true o false.
	boolean d1 = true; //1 byte = 8 bits.
	boolean d2 = false; //1 byte = 8 bits.
	System.out.println(d1);
	System.out.println(d2);
	}	

}
