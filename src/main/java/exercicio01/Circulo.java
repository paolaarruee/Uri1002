
package exercicio01;

public class Circulo {
	private double raio;
	private static final double pi = 3.14159;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea(){
	       return pi * Math.pow(raio,2.0);
	   }
}