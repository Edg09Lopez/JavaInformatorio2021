import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        Integer number = Obj.nextInt();
        System.out.println("El factorial de " + number + " es " + factorial(number));
    }

    public static Integer factorial(Integer number) {
        int mult = 1;
        for (Integer i = 1; i<=number; i++) {
            mult = mult * i;
        }
        return mult;
    }
}
