package PracticaTema4;

public class Pedido {

	/**
	 * Atributos
	 * 
	 * cliente --> 
	 * producto_1 --> pedido puede tener 1/2 productos, en caso de tener el 1, usaremos el 2
	 * producto_2 --> usar si producto_1 ya está rellenado
	 * importe_total --> se calcula conforme se agregan productos, max 2 decimales
	 * pago --> 
	 * estado --> en este orden: PAGADO, PREPARANDO, LISTO, SERVIDO
	 * 			  No se puede empezar a preparar un peedido si no esta pagado, y para que este
	 * 			  pagado debe haberse generado un codigo de pago
	 * pagado --> 
	 * codigo --> 
	 */
	Cliente cliente;
	Pedido producto_1; 
	Pedido producto_2; 
	Double importe_total;
	PasarelaDePago pago;
	String estado;
	boolean pagado; // PasarelaDePago metodoDePago;
	String codigo;


	/**
	 * Metodo
	 * 
	 * @param pago --> metodo creado para que nos salga un warning
	 */
	public void Pagar(PasarelaDePago pago) {
		// Mirado por internet
		if (!this.pagado) {
			this.pago = pago; /* parametro creado */
			this.pagado = true;
		} else {
			throw new IllegalStateException("Pedido ya pagado");
		}
	}

	/*
	 * una vez creado todo nos debe permitir dado un cliente seleccionado relizar un
	 * pedido eligiendo los productos. Esto implica que en Cliente tendremos un
	 * método "realizarPedido" que permite crear un pedido e iniciarlo. Una vez
	 * finalizado el pedido y pagado se añadirá al String del historial.
	 */


	/**
	 * metodo agregarCliente
	 * 
	 * @param cliente
	 */
	public void agregarCliente(Cliente cliente) {
		// Cliente cliente
		this.cliente = cliente;
	}

	
	/**
	 * metodo agregarProducto1
	 * 
	 * @param producto
	 * @param producto_1
	 */
	public void agregarProducto1(Producto producto /* crear parametro para que no salga amarillo */,
			Pedido producto_1) {
		// Producto producto
		this.producto_1 = producto_1; // ya no sale amarillo
		this.importe_total += producto.getPrecio() * producto.getCantidad();
	}


	/**
	 * metodo agregarProducto2
	 * 
	 * @param producto
	 * @param producto_2
	 */
	public void agregarProducto2(Producto producto, Pedido producto_2 /* parametro creado */) {
		// Producto producto
		if (this.producto_1 == null) {
			System.out.println("Debe agregar el producto 1 antes de agregar el producto 2.");
			return;
		}

		this.producto_2 = producto_2 /* parametro */; // hacemos lo mismo que con producto_1, crear parametro
		this.importe_total += producto.getPrecio() * producto.getCantidad();
	}


	/**
	 * metodo eliminarProducto
	 * 
	 * @param producto
	 */
	public void eliminarProducto(Producto producto) {
		// Producto producto
		if (producto.equals(producto_1)) {
			this.importe_total -= producto_1.getPrecio() * producto_1.getCantidad();
			this.producto_1 = null;
		} else if (producto.equals(producto_2)) {
			this.importe_total -= producto_2.getPrecio() * producto_2.getCantidad();
			this.producto_2 = null;
		} else {
			System.out.println("El producto no esta en el pedido");
		}
	}


	/**
	 * Método toString --> se ha puesto en GestionPedido
	 */
	// Encontrado por internet, ni idea de cómo se hacía
	/*
	 * @Override 
	 * public String toString() { 
	 * 
	 * 		StringBuilder sb = new StringBuilder();
	 * 
	 * 		sb.append(String.format("%-10s %-20s %-20s %-20s\n", "CANT.", "PRODUCTO", "PRECIO UD.", "TOTAL")); 
	 * 		sb.append(String.format("%-10s %-20s %-20s %-20s\n", "=====", "========", "=========", "=====")); 
	 * 
	 * 		if (producto_1 != null) {
	 * 			sb.append(String.format("%-10d %-20s %-20s %-20s\n", producto_1.getCantidad(), producto_1.getNombre(), 
	 * 			producto_1.getPrecio(), producto_1.getPrecio() * producto_1.getCantidad())); 
	 * 		} 
	 * 
	 * 		if (producto_2 != null) { 
	 * 				sb.append(String.format("%-10d %-20s %-20s %-20s\n",
	 *				producto_2.getCantidad(), producto_2.getNombre(), producto_2.getPrecio(),
	 * 				producto_2.getPrecio() * producto_2.getCantidad())); 
	 * 		} 
	 * 
	 * 		sb.append(String.format("TOTAL --------------------------------------------> %-20s\n", importe_total)); 
	 * 		return sb.toString(); 
	 * }
	 */


	/**
	 * Metodo creado automaticamente para que no 
	 * nos de error en el apartado eliminarProducto
	 * 
	 * @return
	 */
	private int getCantidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Metodo creado automaticamente para que no 
	 * nos de error en el apartado eliminarProducto
	 * 
	 * @return
	 */
	private int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}




	/**
	 * Getters and Setters
	 * 
	 * @param codigo
	 */
	public Pedido(String codigo) {
		this.codigo = codigo;
		this.pagado = false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getProducto_1(Pedido producto_1) {
		return producto_1;
	}

	public void setProducto_1(Pedido producto_1) {
		this.producto_1 = producto_1;
	}

	public Pedido getProducto_2(Pedido producto_2) {
		return producto_2;
	}

	public void setProducto_2(Pedido producto_2) {
		this.producto_2 = producto_2;
	}

	public Double getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(Double importe_total) {
		this.importe_total = importe_total;
	}

	public PasarelaDePago getPago() {
		return pago;
	}

	public void setPago(PasarelaDePago pago) {
		this.pago = pago;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * metodos creados para que nos de error en el apartado agregarPedido de la
	 * clase cliente
	 * 
	 * @return
	 */
	public static String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean Pago() {
		// TODO Auto-generated method stub
		return false;
	}

}
