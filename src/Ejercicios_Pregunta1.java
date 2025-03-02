import java.util.Scanner;

public class Ejercicios_Pregunta1 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        String letra = entrada.next();
        char letraInicialColor = letra.charAt(0);
        int edad = entrada.nextInt();

        Animal perro = new Animal(letraInicialColor, edad);
        System.out.println(perro.informacionAnimal());
    }
}
class Animal {

    //Atributos
    private char letra;
    private int edad;

    //Constructor
    public Animal (char color, int old){
        this.edad = old;
        this.letra = color;
    }

    public String queColor (char letraColor){
        switch (letraColor){
            case 'b': return "Blanco";
            case 'n': return "Negro";
            default: return "Color no establecido";
        }
    }

    public String informacionAnimal(){
        return "Perro{color="+queColor(letra)+", edad="+edad+"}";
    }
}
