package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema1;

/*Crea un archivo TypeConvert.java.
 * Donde vamos a hacer conversiones de unos tipos de datos a otros.
 * -De forma implicita: lo hace el compilador de forma automatica.
 * -De forma explicita: tenemos que decirle nosotros a que tipo queremos cambiar.
 */

public class Ejercicio7_TypeConvert {

	public static void main(String[]args) {
		byte varByte = 1;
		int varInt = 2;
		//Byte se convierte automaticamente en int.
		varInt = varByte;
		System.out.println(varInt);
		
		byte varByte2 = 3;
		int varInt2 = 4;
		//Int se convierte de forma manual a byte con cast.
		varByte2 = (byte) varInt2;
		System.out.println(varByte2);
		
		char f1 = 'a';
		int f2 = 98;
		//Int se puede convertir en un tipo de dato char.
		f1 = (char) f2;
		System.out.println(f1);
		
		char f3 = 'c';
		int f4 = 96;
		//Char se puede convertir en un tipo de dato int.
		f4 = f3;
		System.out.println(f4);
		
		
	}
}
