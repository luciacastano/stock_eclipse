package PracticaTema4;

import java.text.DecimalFormat;

public class Producto {

	/**
	 * Atributos
	 * 
	 * nombre --> pide nombre del producto a crear
	 * precio --> contiene, como máximo, dos decimales y pide precio del producto a crear
	 * cantidad --> pide cantidad deseada del producto a crear
	 * 
	 */
	String nombre;
	Double precio;
	int cantidad;


	/**
	 * Constructor con parametros, los instanciamos
	 * 
	 * @param nombre   --> se guardara en mayusculas
	 * @param precio
	 * @param cantidad
	 */
	public Producto(String nombre, Double precio, int cantidad) {
		this.nombre = nombre.toUpperCase();
		this.precio = precio;
		this.cantidad = cantidad;
	}


	/**
	 * Constructor vacio
	 * 
	 * this.nombre = ""; las comillas son para poder meter texto al haber estados declarado como String
	 * this.precio = 0.0; nos permite insertar un valor decimal
	 * this.cantidad = 0; nos permite insertar un valor entero
	 */
	public Producto() {
		this.nombre = "";
		this.precio = 0.0;
		this.cantidad = 0;
	}




	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public Double getPrecio() {
		// que solo tenga dos decimales
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format(precio));
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
