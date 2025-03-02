import java.util.Scanner;

public class Tarea_Pregunta3 {
    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        double gradosOrigen;
        double gradosDestino;
        char c;

        c = teclado.nextLine().charAt(0);
        gradosOrigen = teclado.nextDouble();
/*
        if (c == 'F')
            System.out.printf("%.1f\n", Temperatura.farenheitToCelsius(gradosOrigen));
        else
            System.out.println(Temperatura.celsiusToFarenheit(gradosOrigen));
*/
    }
}

class Temperatura {
    static double diferencia = 32;
    static double division = 1.8;
    char unidad;

    public Temperatura(){



    }
}