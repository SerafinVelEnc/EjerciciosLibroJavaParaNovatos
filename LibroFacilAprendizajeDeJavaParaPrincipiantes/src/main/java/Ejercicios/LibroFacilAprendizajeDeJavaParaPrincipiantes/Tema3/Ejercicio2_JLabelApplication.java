package Ejercicios.LibroFacilAprendizajeDeJavaParaPrincipiantes.Tema3;

import javax.swing.*;

/* Crea un archivo JlabelApplication.java
 * Jlabel: es un widget de swing estandar que se utiliza para mostrar un texto o una imagen en ventana.
 */
public class Ejercicio2_JLabelApplication {

	public static void main(String[]args) {
		
		JFrame frame=new JFrame("Java GUI Application");
		
		JLabel label=new JLabel(" I loving Java Application:");
		frame.add(label); //agregar JLabel al frame
		
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
