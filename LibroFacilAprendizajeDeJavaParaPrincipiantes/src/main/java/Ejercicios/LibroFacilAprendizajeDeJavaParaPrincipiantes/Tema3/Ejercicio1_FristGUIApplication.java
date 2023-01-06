package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema3;

import javax.swing.JFrame;

/* Crea un archivo FristGUIApplication.java
 * Java ofrece Swing para desarrollar GUI (Grafical User Interface). El Swing es el mas 
 * utilizado. Es una interfaz estandar de java para el kit de herramientas GUI, es la 
 * forma mas rapida y sencilla de crear aplicaciones GUI.
 * -JFrame: clase es un tipo de contenedor que puede crear una ventana.
 * -JFrame.setSize(int width, int height): establece el tamaño del marco.
 * -JFrame.setVisible(true): establece el marco visible al abrir una ventana.
 * -import javax.swing.*: proporciona clases para la API de GUI de jaca swing.
 */

public class Ejercicio1_FristGUIApplication {

	public static void main(String[]args) {
		JFrame frame=new JFrame("Java GUI Application");
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
