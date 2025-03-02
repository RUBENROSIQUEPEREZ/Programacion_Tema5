import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicios_Pregunta3 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        String numSS = entrada.nextLine();
        String name = entrada.nextLine();
        String years = entrada.nextLine();
        String direccion = entrada.nextLine();

        Paciente paciente1 = new Paciente(numSS, name, years, direccion);
        paciente1.mostrarInformacion();
    }
}
class Paciente{
    //Atributos
    private String numeroSeguridadSocial;
    private String nombre;
    private String edad;
    private String direccion;

    //Constructor
    public Paciente (String numeroSeguridadSocial, String nombre, String edad, String direccion){
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion=direccion;
    }

    //Metodos
    public void mostrarInformacion (){
        if (!numSegSocValido(numeroSeguridadSocial)){
            System.out.println("NSS no valido");
            System.out.println("NSS: "+
                    ", nombre: "+nombre+
                    ", edad: " + edad +
                    " dirección: " + direccion);
        }else{
            System.out.println(
                    "NSS: "+numeroSeguridadSocial+
                            ", nombre: "+nombre+
                            ", edad: "+edad +
                            " dirección: " + direccion
            );
        }

    }

    private boolean numSegSocValido (String numeroSeguridadSocial){
        Pattern pattern = Pattern.compile("^[a-z]{4}[0-9]{12}$");
        Matcher matcher = pattern.matcher(numeroSeguridadSocial);
        return matcher.matches();
    }


}