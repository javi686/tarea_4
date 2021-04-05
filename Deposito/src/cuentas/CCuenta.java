package cuentas;
/** Esta clase pertenece al proyecto deposito y vamos a hacer una prueba
*con estos comentarios,
*a estos comentarios los llamaremos comemtarios
*Javadoc y vamos a crear un archivo donde aparezcan
*los comentarios de nuestro programa, esta operación se 
*llamara documentación javadoc.
 * @author Javier López Martínez
 * @version 1.0
 * @since 12/03/2021*/



public class CCuenta {
	//Estas son los atributos de la clase
	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInteres;
	    /**
		 * Constructor que inicializa los parametros de la clase CCuenta 
		 * @param nom nombre del clientge
		 * @param cue numero de cuenta
		 * @param sal es el saldo
		 * @param tipo es el tipo de interes al que se pagan los ahorros
		 */
	    public CCuenta()
	    {
	    }

	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        setNombre(nom);
	        cuenta=cue;
	        saldo=sal;
	    }
	    
	    private String getNombre() {
			return nombre;
		}

		private void setNombre(String nombre) {
			this.nombre = nombre;
		}
	    
	    public String getCuenta() {
			return cuenta;
		}

		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getTipoInteres() {
			return tipoInteres;
		}

		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}

		

	    public double estado()
	    {
	        return saldo;
	    }

	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }

	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }

		
	}



