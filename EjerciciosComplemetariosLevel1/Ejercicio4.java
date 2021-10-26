import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Obj.nextInt();

        Obj.close();
        System.out.println("El factorial de " + number + " es " + factorial(number));
    }

    public static int factorial(int number) {
        if (number>=0) {
            if (number == 1 || number == 0) {
                return 1;
            } else {
                return number * factorial(number - 1);
            }  
        } else {
            System.out.println("No existe el factorial del numero ingresado");
            return 0;
        }      
    }
}
