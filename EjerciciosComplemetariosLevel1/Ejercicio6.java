import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number: ");
        Integer firstNumber = obj.nextInt();

        System.out.println("Enter another number: ");
        Integer seconNumber = obj.nextInt();
        System.out.println(firstNumber + " elvevado a " + seconNumber + " = " + potencia(firstNumber, seconNumber));
    }
    public static Integer potencia(Integer firstNumber, Integer seconNumber) {
        int i = 0;
        int mult = 1;
        while (i<seconNumber) {
            mult = mult * firstNumber;
            i++;
        }
        return mult;
    }
}
