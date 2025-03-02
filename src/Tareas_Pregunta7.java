import java.util.Scanner;
/*
Crea un objeto r1 de la clase Rueda. Para ello llama a su constructor con los valores de 50 altura, 50 perfil y 50 diámetro.

Crea el objeto r2 de tipo Rueda y asignale r1. (Rueda r2 = r1;)

Modifico la anchura de la rueda r1 a 88. (Aliasing)

Muestra el contenido del método toString tanto para r1 como r2
 */
public class Tareas_Pregunta7 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        Rueda r1 = new Rueda(50,50,50);
        r1.setAnchura(88);
        Rueda r2 = new Rueda(r1);

        System.out.println("R1"+r1);
        System.out.print("R2"+r2);
    }
}
class Rueda
{

    private int anchura;
    private int perfil;
    private int diametroLlanta;

    public Rueda() {}

    public Rueda(int anchura, int perfil, int diametroLlanta) {
        this.anchura = anchura;
        this.perfil = perfil;
        this.diametroLlanta = diametroLlanta;
    }

    public Rueda (Rueda r){
        this.anchura=r.getAnchura();
        this.diametroLlanta=r.getDiametroLlanta();
        this.perfil= r.getPerfil();
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public void setDiametroLlanta(int diametroLlanta) {
        this.diametroLlanta = diametroLlanta;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getPerfil() {
        return perfil;
    }

    public int getDiametroLlanta() {
        return diametroLlanta;
    }

    @Override
    public String toString() {
        return "Rueda{" + "anchura=" + anchura + ", perfil=" + perfil + ", diametroLlanta=" + diametroLlanta + '}';
    }

}
