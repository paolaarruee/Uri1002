package exercicio01;

import java.util.Scanner;
import org.joda.time.LocalTime;
public class Uri1002{

public static void main(String[] args) {
	LocalTime currentTime = new LocalTime();
    	System.out.println("The current local time is: " + currentTime);
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        circulo.setRaio(sc.nextDouble());
        System.out.println(circulo.calculoAreaCirculo());
        sc.close();
    }
}