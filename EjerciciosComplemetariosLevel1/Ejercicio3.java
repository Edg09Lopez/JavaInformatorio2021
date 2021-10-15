import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter number: ");
        Integer firstNumber = num.nextInt();

        for (int i=1; i<=firstNumber; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
