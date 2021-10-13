import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner nameUser = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String Name = nameUser.next();

        System.out.println("Hola " + Name);
    }
}