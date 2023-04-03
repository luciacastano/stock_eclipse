package PracticaTema4;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * Aquí contemplamos una de las opciones a la hora de capturar excepciones
 * En esta parte lo hacemos con la estructura try + catch y añadimos la opción de ejecución
 * obligatoria con la sentencia finally.
 */
public class EscribeFichero {

	public static void main(String[] args) {
		String ruta = "C:/Users/Lucía Castaño/Desktop/TratamientoFicheros/Clientes.txt";
		// en el proyecto, poner las rutas fuera del método, es decir, ponerlas como
		// atributo global
		FileWriter fichero = null;
		PrintWriter pw = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // añadido por mí, apra tratar de
																					// solucionar un problema

		try {
			// Añadir flag a true para no machacar contenido del fichero de escritura
			fichero = new FileWriter(ruta, true);
			pw = new PrintWriter(fichero);

			// Prueba de bucles anidados para la insercción de datos
			int numLineas = 0;
            String linea;
            System.out.println("Introduce los datos a escribir en el archivo (nombre, apellidos, fecha de alta, telefono y direccion):");

            while (numLineas < 3) {
				for (int i = 0; i < 5; i++) {
                    linea = br.readLine();
                    pw.println(linea);
                    System.out.println("Dato introducido: " + linea);
                }
                numLineas++;
            }
            
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero) {
					fichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
