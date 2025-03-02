import java.util.Scanner;

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
    /*SETTER
    void setNumero (int numero){
        this.numero = numero;
    }*/

    /*GETTER*/
    int getNumero (){
        return numero;
    }

    int getDoble (){
        return numero*2;
    }

    int getTriple (){
        return numero*3;
    }
    int getSuma (){
        return numero+15;
    }

    public void mostarInformacion (){
        System.out.println("El doble es: " + getDoble());
        System.out.println("El triple es: " + getTriple());
        System.out.println("Y le sumo 15, son:"+getSuma());
    }

}
