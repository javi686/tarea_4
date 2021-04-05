package cuentas;
/** 
 * @since 12/03/2021
*@author por Javier L�pez Mart�nez
*@version 1.0
*/

public class Main {

	public static void main(String[] args) {
		  
		operativa_cuenta(0);	

	}

	/**
	 * @deprecated Utilizar {@link #operativa_cuenta(double)} en su lugar
	 */
	private static void operativa_cuenta() {
		operativa_cuenta(0);
	}

	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		 
	        double saldoActual;

	        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",2500,0);
	        saldoActual = cuenta1.estado();
	        System.out.println("El saldo actual es"+ saldoActual );

	        try {
	            cuenta1.retirar(2300);
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
	}

}
