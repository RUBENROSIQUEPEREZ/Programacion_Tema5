import java.util.Scanner;

/*
Crear la clase Numero, con atributo numero, con contructor con defecto, y con parámetro. Así como los siguientes métodos.

int getNumero() --> devuelve el valor de número

void setNumero(int numero)--> introduce valor al atributo número

void suma(int mas)--> suma a numero el valor "mas"

void resta(int menos)--> resta a numero el valor "menos"

Crea una clase principal donde crees un objeto Numero, llamando al contructor con parámetros, e introduciendo en dicho atributo el valor que el usuario te pase por teclado.

A continuación mostraremos el doble, el triple y añadirle 15 a dicho numero

int getDoble()--> devuelve el doble del número actual

int getTriple()--> devuelve el triple del numero actual
 */
public class Ejercicios_Pregunta4 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        Numero numero1 = new Numero(numero);
        numero1.mostarInformacion();
    }
}
class Numero{
    //Atributos
    private int numero;

    //Constuctor
    public Numero (int numero){
        this.numero = numero;
    }

    int getNumero (){return numero;}
    int getDoble (){return numero*2;}
    int getTriple (){return numero*3;}
    int getSuma (){return numero+15;}

    public void mostarInformacion (){
        System.out.println("El doble es: " + getDoble());
        System.out.println("El triple es: " + getTriple());
        System.out.println("Y le sumo 15, son:"+getSuma());
    }

}
