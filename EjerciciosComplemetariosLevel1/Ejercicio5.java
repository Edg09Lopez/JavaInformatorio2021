import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number: ");
        Integer firstNumber = myObj.nextInt();

        System.out.println("Enter another number: ");
        Integer seconNumber = myObj.nextInt();
        System.out.println(firstNumber + " x " + seconNumber + " = " + sumasuc(firstNumber, seconNumber));
    }
    public static Integer sumasuc(Integer firstNumber, Integer seconNumber) {
        int suma = 0;
        for (int i = 1; i<=seconNumber; i++) {
            suma = suma + firstNumber;
        }
        return suma;
    }
}
