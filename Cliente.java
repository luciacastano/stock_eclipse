package PracticaTema4;

import java.sql.Date;

public class Cliente {

	/**
	 * Atributos
	 * 
	 * nombre --> pide nombre del cliente a crear
	 * apellidos --> pide apellidos del cliente a crear
	 * FechaDeAlta --> pide la fecha en la que se a dado de alta
	 * telefono --> numero de telefono. Primer digito. 6/7 en caso de ser movil; 8/9 en caso de ser telefono fijo 
	 * direccion --> pide la direccion del cliente
	 * historial --> cada vez que un cliente pague un pedido se añadira el codigo
	 * 				 del pedido al String. No puede agregarse al historial ningún pedido que no este pagado 
	 */
	String nombre;
	String apellidos;
	Date FechaDeAlta;
	int telefono;
	String direccion;
	String historial;


	/**
	 * Constructor con parametros
	 * 
	 * @param nombre --> se guarda en minusculas
	 * @param apellidos --> se guarda en mayusculas
	 * @param FechaDeAlta
	 * @param telefono
	 * @param direccion
	 * @param historial
	 */
	public Cliente(String nombre, String apellidos, Date FechaDeAlta, int telefono, String direccion, String historial) {
		this.nombre = nombre.toLowerCase();
		this.apellidos = apellidos.toUpperCase();
		this.FechaDeAlta = new Date(0); // Si no se pone un 0 da error
		this.telefono = telefono;
		this.direccion = direccion;

		this.historial = historial;
	}

	/**
	 * Validacion del numero de telefono a insertar
	 * 
	 * @param telef
	 * @return
	 */
	public void ValidarTelef(int telefono) {
		while (!(telefono > 555555555 && telefono < 1000000000)) {
			this.telefono = telefono;
		}

		if (telefono < 555555555 || telefono > 1000000000) {
			System.out.println("Formato del numero no valido");

		}
	}


	/**
	 * Constructor utilizado para inicializar con la fecha actual
	 */
	public Cliente() {
		// Si no se pone un 0 da error
		this.FechaDeAlta = new Date(0);
	}




	/**
	 * Metodo agregarPedido(Pedido pedido)
	 */
	public void agregarPedido(Pedido pedido) {
		/**
		 * se han creado dos metodos en el apartado Pedido para que nos acepte Pago y
		 * getCodigo
		 */
		if (Pedido.Pago()) {
			// Añadirlo al historial (+=)
			this.historial += Pedido.getCodigo() + ",";
		} else {
			throw new IllegalArgumentException("Solo se pueden agregar pedidos pagados al historial");
		}
	}

	
	
	
	/**
	 * Metodo realizarPedido
	 */
	





	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaDeAlta() {
		return FechaDeAlta;
	}

	public void setFechaDeAlta(Date FechaDeAlta) {
		this.FechaDeAlta = FechaDeAlta;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getHistorial() {
		return historial;
	}

	public void setHistorial(String historial) {
		this.historial = historial;
	}

}
