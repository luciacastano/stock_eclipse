package PracticaTema4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

public class GestionPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/**
		 * ruta de los archivos para el tratamiento de ficheros
		 */
		File ruta = new File("C:/Users/Lucía Castaño/Desktop/TratamientoFicheros/Productos.txt");
		System.out.println(ruta.getAbsolutePath());
		System.out.println(ruta.exists()); // comprobación de la existencia de nuestra ruta (sale true si está, false si no)




		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();


		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();
		Producto producto4 = new Producto();
		Producto producto5 = new Producto();


		/**
		 * crear de variables para poder tomarlas al crear los clientes (con .set)
		 */
		
		/**
		 * variable para todos los string
		 */
		String s;
		
		/**
		 * variable para todos los int
		 */
		int i;
		
		/**
		 * dia, mes y año --> para la fecha
		 * y los pasamos de int a string
		 */
		int d = 0;
		String dStr = Integer.toString(d);
		int m = 0;
		String mStr = Integer.toString(m);
		int a = 0;
		String aStr = Integer.toString(a);
			
		/** 
		 * convertir int a date
		 */
		Date f = null;
		

		

		/**
		 * menu para crear los clientes y guardarlos en un .txt y seguido mostramos los
		 * productos haciendo uso del tratamiento de fichero correspondiente
		 */
		System.out.println("\n#####MENU INICIAL#####" + "\nCreacion de nuestros clientes");

		System.out.println("\nADVERTENCIA: no pueden haber dos clientes con el mismo numero de telefono");
			
		/**
		 * datos primer cliente
		 */
		System.out.println("\n##Primer cliente##");
		System.out.println("Nombre: ");
		s = sc.next();
		cliente1.setNombre(s);
		System.out.println("Apellidos: ");
		s = sc.next();
		cliente1.setApellidos(s);
		System.out.println("Fecha de alta (tres lineas correspondientes a dia, mes y anyo):");
		d = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		cliente1.setFechaDeAlta(f);
		System.out.println("Telefono:");
		i = sc.nextInt();
		cliente1.setTelefono(i);
		System.out.println("Direccion:");
		s = sc.next();
		cliente1.setDireccion(s);
		/* System.out.println("Historial:");
		 * s = sc.next();
		 * cliente1.setHistorial(s);
		 */
		    
		    
		/**
		 * datos segundo cliente
		 */
		System.out.println("\n##Segundo cliente##");
		System.out.println("Nombre:");
		s = sc.next();
		cliente2.setNombre(s);
		System.out.println("Apellidos:");
		s = sc.next();
		cliente2.setApellidos(s);
		System.out.println("Fecha de alta (tres lineas correspondientes a dia, mes y anyo):");
		d = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		cliente1.setFechaDeAlta(f);
		System.out.println("Telefono:");
		i = sc.nextInt();
		cliente2.setTelefono(i);
		System.out.println("Direccion:");
		s = sc.next();
		cliente2.setDireccion(s);
		/*System.out.println("Historial:");
		 * s = sc.next();
		 * cliente2.setHistorial(s);
		 */
		    
		    
		/**
		  * datos tercer cliente
		  */
		System.out.println("\n##Tercer cliente##");
		System.out.println("Nombre: ");
		s = sc.next();
		cliente3.setNombre(s);
		System.out.println("Apellidos:");
		s = sc.next();
		cliente3.setApellidos(s);
		System.out.println("Fecha de alta (tres lineas correspondientes a dia, mes y anyo):");
		d = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		cliente1.setFechaDeAlta(f);
		System.out.println("Telefono:");
		i = sc.nextInt();
		cliente3.setTelefono(i);
		System.out.println("Direccion:");
		s = sc.next();
		cliente3.setDireccion(s);
		/*System.out.println("Historial:");
		 * s = sc.next();
		 * cliente3.setHistorial(s);
		 */
		    
		System.out.println("\nClientes creados correctamente. Para su comprobación, acceda al documento de texto llamado Clientes.txt");
		EscribeFichero.main(args);



		/**
		 * mostramos los productos creados en un archico txt
		 */
		String archivo = "C:/Users/Lucía Castaño/Desktop/TratamientoFicheros/Productos.txt";
		System.out.println("\nLectura de los productos ya creados y su precio");
		try {
			LeerFichero.muestraContenido(archivo);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		/**
		 * MENU PEDIDOS
		 */
		int num_cliente;

		System.out.println("\n#####MENU PEDIDOS#####" + "\n1. Realizar pedidos");

		System.out.println("Identificador del cliente --> 1, 2 o 3");
		num_cliente = sc.nextInt();

		/**
		 * telefono del cliente1
		 */
		if (num_cliente == 1) {
			System.out.println("El telefono correspondiente a cliente1 es: " + cliente1.getTelefono());

		}
		    
		 	/**
			 * telefono del cliente2
			 */
		 if (num_cliente == 2) {
			System.out.println("El telefono correspondiente a cliente2 es: " + cliente2.getTelefono());
		}
		    
		 	/**
			 * telefono del cliente3
			 */
		 if (num_cliente == 3) {
				System.out.println("El telefono correspondiente a cliente3 es: " + cliente3.getTelefono());
		}




		/**
		* seleccion de productos
		*/
		System.out.println("\n###Seleccione el producto que desea (se pueden pedir hasta dos productos)");
		System.out.println(
					"1. Producto 1 -> " + producto1.getNombre()
				+ "\n2. Producto 2 -> " + producto2.getNombre()
				+ "\n3. Producto 3 -> " + producto3.getNombre()
				+ "\n4. Producto 4 -> " + producto4.getNombre()
				+ "\n5. Producto 5 -> " + producto5.getNombre()
		);
		
		/**
		 * main del stock
		 */
		System.out.print("\nNumero del producto que deseas: ");
		int producto = sc.nextInt();
		System.out.print("Cantidad del mismo: ");
		int cantidad = sc.nextInt();


		/**
		 * volver a pedir el menu
		 */
		System.out.println("\nDesea otro producto?(recuerde, solo le queda 1)");
		System.out.println("1. Yes" + "\n2. No");
		int deseo = sc.nextInt();

		if (deseo == 1) {
			System.out.println("###Seleccione el siguiente producto que desea:");
			System.out.println(
					"1. Producto 1 -> " + producto1.getNombre()
					+ "\n2. Producto 2 -> " + producto2.getNombre()
					+ "\n3. Producto 3 -> " + producto3.getNombre()
					+ "\n4. Producto 4 -> " + producto4.getNombre()
					+ "\n5. Producto 5 -> " + producto5.getNombre()
					);
			System.out.print("\nNumero del producto que deseas: ");
			sc.nextInt();
			System.out.print("Cantidad del mismo: ");
			sc.nextInt();

		} else {
			System.out.println("No quiere otro producto. Continuamos");
		}

		producto1.realizarPedido(producto, cantidad);
		producto1.comprobarStock();

		producto2.realizarPedido(producto, cantidad);
		producto2.comprobarStock();

		producto3.realizarPedido(producto, cantidad);
		producto3.comprobarStock();

		producto4.realizarPedido(producto, cantidad);
		producto4.comprobarStock();

		producto5.realizarPedido(producto, cantidad);
		producto5.comprobarStock();
		
		
		
		
		/**
		 * esquema de productos y precio
		 */
		/*System.out.println(
				"CANT. \t\tPRODUCTO \t\tPRECIO UD. \t\tTOTAL"
				+ "\n===== \t\t========= \t\t========= \t\t====="
				+ "\n1" + 
				+ "\n2" +
				+ "TOTAL ---------------------------------> "
		);*/

		/**
		 * se realiza el pago
		 */
		/*System.out.println("\n###Pago de los productos");
		
		PasarelaDePago pago = new PasarelaDePago();
		
		System.out.println("Elija la forma de pago"
					+ "\n1. Efectivo"
					+ "\n2. Tarjeta"
					+ "\n3. Cuenta"
				);
		sc.next();

		

		System.out.println("Importe antes del pago: " + pago.getImporte());
		pago.efectivo();
		System.out.println("Importe despues del pago en efectivo: " + pago.getImporte());
		System.out.println("Codigo de pago: " + pago.getCodigoPago());

		System.out.println("Importe antes del pago: " + pago.getImporte());
		pago.realizarTarjeta("1234-5678-9012-3456");
		System.out.println("Importe despues del pago con tarjeta: " + pago.getImporte());
		System.out.println("Codigo de pago: " + pago.getCodigoPago());

		System.out.println("Importe antes del pago: " + pago.getImporte());
		pago.cuenta("123456");
		System.out.println("Importe despues del pago desde cuenta: " + pago.getImporte());
		System.out.println("Codigo de pago: " + pago.getCodigoPago());*/
		
		


		/**
		 * anyadimos el codigo del pedido al historial
		 */
		/*System.out.println("Se ha anyadido su pedido al historial");*/
		/**
		 * Metodo agregarPedido(Pedido pedido)
		 */
		/*if (Pedido.Pago()) {
			// Anyadirlo al historial (+=)
			String historial = Pedido.getCodigo() + ",";
		} else {
			throw new IllegalArgumentException("Solo se pueden agregar pedidos pagados al historial");
		}*/
	}
}
