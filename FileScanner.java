package PracticaTema4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		String ruta = "C:/Users/Lucía Castaño/Desktop/TratamientoFicheros/Clientes.txt";
		// en el proyecto, poner las rutas fuera del método, es decir, ponerlas como
		// atributo global
		File f = new File(ruta);
		System.out.println("La ruta del fichero es: " + f.getAbsolutePath());
		Scanner s;
		try {
			s = new Scanner(f);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				Scanner sl = new Scanner(linea);
				sl.useDelimiter("\\s*,\\s*");
				System.out.println(sl.next());
				System.out.println(sl.next());
				System.out.println(sl.next());
				System.out.println(sl.next());
				System.out.println(sl.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// PrintWriter pw = null;
			e.printStackTrace();
			// e.printStackTrace(pw);

		}
	}
}
