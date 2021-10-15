
package exercicio01;


public class Circulo {
    private double  pi = 3.14159;
    private double raio;
    private double area;

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double calculoAreaCirculo(){
        
        return   pi * Math.pow(raio, 2);
    }
    
}
