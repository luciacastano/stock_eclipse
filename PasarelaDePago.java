package PracticaTema4;

import java.text.DecimalFormat;
import java.util.Date;

public class PasarelaDePago {

	/**
	 * Atributos
	 * 
	 * importe --> max 2 decimales
	 * codigoPago --> codigo que se genera cuando se realiza el pago. Se genera
	 * 				  mediante la clase Date y el método getTime()
	 */
	Double importe;
	String codigoPago;
	
	
	/**
	 * Funcionamiento de esta clase
	 * 
	 * Existen 3 metodos, cada uno de los cuales sirve para realizar un tipo pago.
	 * Si el pago se realiza correctamente el importe se pone a cero y genera un
	 * codigo de pago. Los metodos de pago son: o Efectivo() o Tarjeta(String
	 * numeroTarjeta) -> Se le pasa como parametro el numero de tarjeta. o
	 * Cuenta(String cuenta) -> Se le pasa como parametro el numero de cuenta.
	 */



	/**
	 * Metodo
	 * 
	 * @param importe
	 */
	public void Pagar(Double importe) {
		this.importe = importe;
	}


	/**
	 * Primer metodo de pago: efectivo
	 */
	public void efectivo() {
		if (importe > 0) {
			this.codigoPago = new Date().getTime() + "";
			this.importe = (double) 0; // Paso de int a double
			System.out.println("Pago realizado. Codigo de pago: " + this.codigoPago);
		} else {
			System.out.println("El importe a pagar es 0, no se puede realizar un pago");
		}
	}


	/**
	 * Segundo metodo de pago: tarjeta
	 * 
	 * @param numeroTarjeta
	 */
	public void realizarTarjeta(String numeroTarjeta) {
		// Validar tarjeta
		if (numeroTarjeta.length() != 16) {
			System.out.println("Numero de tarjeta invalido.");
			return;
		}
		this.codigoPago = String.valueOf(new Date().getTime());
		this.importe = (double) 0; // Paso de int a double
		System.out.println("Pago realizado. Codigo de pago: " + this.codigoPago);
	}


	/**
	 * Tercer metodo de pago: cuenta
	 * 
	 * @param cuenta
	 */
	public void cuenta(String cuenta) {
		if (importe > 0) {
			this.codigoPago = new Date().getTime() + "";
			this.importe = (double) 0; // Paso de int a double
			System.out.println("Pago realizado con la cuenta " + cuenta + ". Codigo de pago: " + this.codigoPago);
		} else {
			System.out.println("El importe a pagar es 0, no se puede realizar un pago");
		}
	}




	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public Double getImporte() {
		// que solo tenga dos decimales
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format(importe));
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getCodigoPago() {
		return codigoPago;
	}

	public void setCodigoPago(String codigoPago) {
		this.codigoPago = codigoPago;
	}
}
