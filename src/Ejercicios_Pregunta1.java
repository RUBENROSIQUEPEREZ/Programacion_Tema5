import java.util.Scanner;
/*
Crea la clase Perro con los atributos

Color. (char) Inicial (b=blanco y n= negro)
Edad
 */
public class Ejercicios_Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro perro = new Perro(scanner.next().charAt(0), scanner.nextInt());
        System.out.println(perro);
    }
}
class Perro {
    private char color;
    private int edad;

    Perro(char color, int edad) {
        this.color = color;
        this.edad = edad;
    }

    public String queColor(char color){
        switch (color){
            case 'b': return "Blanco";
            case 'n': return "Negro";
            default: return "Color no establecido";
        }
    }

    @Override
    public String toString() {
        return "Perro{color=" + queColor(color) + ", edad="+edad+"}";
    }
}