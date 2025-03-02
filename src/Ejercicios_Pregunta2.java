import java.util.Scanner;

import static java.lang.Math.round;

public class Ejercicios_Pregunta2 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        double entrada1 = entrada.nextDouble();
        double entrada2 = entrada.nextDouble();

        Rebajas rebajas = new Rebajas(entrada1, entrada2);

        System.out.println(rebajas.descubrePorcentaje());
        System.out.println(rebajas.precios());

    }
}
class Rebajas {

    //Atributos
    private double precio;
    private double precioRebajajado;

    //Constructor
    public Rebajas (double precio, double precioRebajajado){
        this.precio = precio;
        this.precioRebajajado = precioRebajajado;
    }

    String precios (){
        return "Rebajas{precio="+precio+", precioRebajado="+precioRebajajado+"}";
    }

    private double porcentaje (){
        double porcentaje = ((precio-precioRebajajado)/precio)*100 ;
        return (double) Math.round(porcentaje * 100) /100;
    }

    public String descubrePorcentaje (){
        return String.format("El porcentaje aplicado al producto es: %.2f%%", porcentaje());

    }
}
