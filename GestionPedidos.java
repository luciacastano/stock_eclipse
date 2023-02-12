package PracticaTema4;

import java.sql.Date;
import java.util.Scanner;

public class GestionPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

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
		 * variable para todos los double
		 */
		double p = 0; // por precio
		
		


		/**
		 * explicacion --> vamos a hacer el menu_inicial dos veces solo que la primera
		 * va a estar inicializado a 1 y la segunda vez inicializado a 2; ambos switch
		 * con la misma informacion pero de esa manera nos aseguramos de que sea cual
		 * sea la opcion que se elija se van a hacer ambas
		 */

		/**
		 * MENU INICIAL
		 */
		int menu_inicial = 1;

		System.out.println("#####MENU INICIAL#####" + "\n1. Crear clientes" + "\n2. Crear productos");
		menu_inicial = sc.nextInt();

		switch (menu_inicial) {
		case 1:
			System.out.println("ADVERTENCIA: no pueden haber dos clientes con el mismo numero de telefono");		
			
			/**
			 * datos primer cliente
			 */
			System.out.println("##Primer cliente##");
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
		    /*System.out.println("Historial:");
		    s = sc.next();
		    cliente1.setHistorial(s);*/
		    
		    
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
		    s = sc.next();
		    cliente2.setHistorial(s);*/
		    
		    
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
		    s = sc.next();
		    cliente3.setHistorial(s);*/
		    
		    System.out.println("\nClientes creados correctamente");
			break;
			
		case 2:
			System.out.println("ADVERTENCIA: no pueden haber dos productos con el mismo nombre");
			
			/**
			 * datos producto1
			 */
			System.out.println("##Primer producto##");
		    System.out.println("Nombre: ");
		    s = sc.next();
		    producto1.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
		    producto1.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto1.setCantidad(i);
			 */
			
			
			/**
			 * datos producto2
			 */
			System.out.println("\n##Segundo producto##");
		    System.out.println("Nombre: ");
		    s = sc.next();
		    producto2.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
		    producto2.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto2.setCantidad(i);
			 */
			
			/**
			 * datos producto3
			 */
			System.out.println("\n##Tercer producto##");
		    System.out.println("Nombre: ");
		    s = sc.next();
		    producto3.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
		    producto3.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto3.setCantidad(i);
			 */
			
			/**
			 * datos producto4
			 */
			System.out.println("\n##Cuarto producto##");
		    System.out.println("Nombre: ");
		    s = sc.next();
		    producto4.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
		    producto4.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto4.setCantidad(i);
			 */
			
			/**
			 * datos producto5
			 */
			System.out.println("\n##Quinto producto##");
		    System.out.println("Nombre: ");
		    s = sc.next();
		    producto5.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
		    producto5.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto5.setCantidad(i);
			 */
		    
			System.out.println("Productos creados correctamente");
			break;

		default:
			System.out.println("Valor incorrecto");
			break;
		}




		// Segundo menu_inicial
		menu_inicial = 2;

		System.out.println("\n#####OPCION CONTRARIA#####" + "\n1. Crear clientes" + "\n2. Crear productos");
		menu_inicial = sc.nextInt();

		switch (menu_inicial) {
		case 1:
			System.out.println("ADVERTENCIA: no pueden haber dos clientes con el mismo numero de telefono");

			/**
			 * datos primer cliente
			 */
			System.out.println("##Primer cliente##");
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
			/*System.out.println("Historial:");
			s = sc.next();
			cliente1.setHistorial(s);*/

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
			System.out.println("Fecha de alta (tres lineas correspondientes a dia, mes y anyo)");
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
			s = sc.next();
			cliente2.setHistorial(s);*/

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
			s = sc.next();
			cliente3.setHistorial(s);*/

			System.out.println("\nClientes creados correctamente");
			break;

		case 2:
			System.out.println("ADVERTENCIA: no pueden haber dos productos con el mismo nombre");

			/**
			 * datos producto1
			 */
			System.out.println("##Primer producto##");
			System.out.println("Nombre: ");
			s = sc.next();
			producto1.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
			producto1.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto1.setCantidad(i);
			 */

			/**
			 * datos producto2
			 */
			System.out.println("\n##Segundo producto##");
			System.out.println("Nombre: ");
			s = sc.next();
			producto2.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
			producto2.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto2.setCantidad(i);
			 */

			/**
			 * datos producto3
			 */
			System.out.println("\n##Tercer producto##");
			System.out.println("Nombre: ");
			s = sc.next();
			producto3.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
			producto3.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto3.setCantidad(i);
			 */

			/**
			 * datos producto4
			 */
			System.out.println("\n##Cuarto producto##");
			System.out.println("Nombre: ");
			s = sc.next();
			producto4.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
			producto4.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto4.setCantidad(i);
			 */

			/**
			 * datos producto5
			 */
			System.out.println("\n##Quinto producto##");
			System.out.println("Nombre: ");
			s = sc.next();
			producto5.setNombre(s);
			System.out.println("Precio (tomado en euros, si es decimal usar la coma):");
			p = sc.nextDouble();
			producto5.setPrecio(p);
			/*
			 * System.out.println("Cantidad:"); 
			 * i = sc.nextInt(); 
			 * producto5.setCantidad(i);
			 */

			System.out.println("\nProductos creados correctamente");
			break;

		default:
			System.out.println("Valor incorrecto");
			break;
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
			System.out.println("\n###Seleccione el producto que desea (se pueden pedir hasta dos productos):");
		System.out.println(
					"1. Producto 1 -> " + producto1.getNombre()
				+ "\n2. Producto 2 -> " + producto2.getNombre()
				+ "\n3. Producto 3 -> " + producto3.getNombre()
				+ "\n4. Producto 4 -> " + producto4.getNombre()
				+ "\n5. Producto 5 -> " + producto5.getNombre()
		);
		sc.nextInt();
		System.out.println("Cantidad del producto");
		i = sc.nextInt();

			
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
			sc.nextInt();
			System.out.println("Cantidad del producto");
			i = sc.nextInt();
		} else {
			System.out.println("No quiere otro producto. Continuamos");
		}
		
		
		
		
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
		System.out.println("\n###Pago de los productos");
		
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
		System.out.println("Codigo de pago: " + pago.getCodigoPago());
		
		


		/**
		 * anyadimos el codigo del pedido al historial
		 */
		System.out.println("Se ha anyadido su pedido al historial");
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
