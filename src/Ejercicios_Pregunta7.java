import java.util.Scanner;


public class Ejercicios_Pregunta7 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int dividendo1 = scanner.nextInt();
        int divisor1 = scanner.nextInt();
        Fraccion fraccion1 = new Fraccion(dividendo1, divisor1);

        int dividendo2 = scanner.nextInt();
        int divisor2 = scanner.nextInt();
        Fraccion fraccion2 = new Fraccion(dividendo2, divisor2);

        System.out.println("División " + fraccion1.dividir(fraccion2));
        System.out.println("Suma " + fraccion1.sumar(fraccion2));
        System.out.println("Resta " + fraccion1.restar(fraccion2));
        System.out.println("Multiplicación " + fraccion1.multiplicar(fraccion2));

    }
}
class Fraccion{
    int numerador;
    int denominador;

    public Fraccion (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion f){
        return new Fraccion(numerador * f.denominador + denominador * f.numerador, denominador * f.denominador );
    }
    public Fraccion restar(Fraccion f) {
        return new Fraccion(numerador * f.denominador - denominador * f.numerador, denominador * f.denominador);
    }

    public Fraccion multiplicar(Fraccion f) {
        return new Fraccion(numerador * f.numerador, denominador * f.denominador);
    }

    public Fraccion dividir(Fraccion f) {
        return new Fraccion(numerador * f.denominador, denominador * f.numerador);
    }


    @Override //Sin esto, se imprimiria mal en consola
    public String toString(){
        return numerador + "/" + denominador;
    }

}



