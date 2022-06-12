import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);

        System.out.println("Enter number: ");
        Integer firstNumber = numb.nextInt();

        System.out.println("Enter another number: ");
        Integer seconNumber = numb.nextInt();

        System.out.println(firstNumber + " + " + seconNumber + " = " + (firstNumber+seconNumber));
        System.out.println(firstNumber + " - " + seconNumber + " = " + (firstNumber-seconNumber));
        System.out.println(firstNumber + " * " + seconNumber + " = " + (firstNumber*seconNumber));
        System.out.println(firstNumber + " / " + seconNumber + " = " + (firstNumber/seconNumber));
        System.out.println(firstNumber + " % " + seconNumber + " = " + (firstNumber%seconNumber));

    }
}
