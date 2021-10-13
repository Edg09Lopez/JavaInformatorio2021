import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner cadena = new Scanner(System.in);

        System.out.println("Apellido y Nombre: ");
        String apellNombre = cadena.nextLine();

        System.out.println("Edad: ");
        String edad = cadena.nextLine();

        System.out.println("Direccion: ");
        String direccion = cadena.nextLine();

        System.out.println("Ciudad: ");
        String ciudad = cadena.nextLine();

        System.out.println(apellNombre);
        System.out.println(edad);
        System.out.println(direccion);
        System.out.println(ciudad);
    }
}
