package PracticaTema4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * En este método contemplamos otra opción de captura de excepciones con la llamada en la definición
 * de un procedimmiento definido como estático con la palabra reservada Throws seguida
 * de las excepciones a capturar
 * 
 */
public class LeerFichero {

	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			System.out.println(cadena);
		}
		b.close();
	}


	public static void main(String[] args) throws IOException {
		String ruta = "C:/Users/Lucía Castaño/Desktop/TratamientoFicheros/Productos.txt";
		String[] datos = { "Nombre", "Precio" }; // datos a escribir en el archivo
		muestraContenido(ruta);

		/* escribirArchivo(ruta, datos); */
	}
}
