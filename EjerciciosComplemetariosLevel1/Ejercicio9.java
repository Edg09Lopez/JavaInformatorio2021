import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner cad = new Scanner(System.in);

        System.out.println("Enter an Text: ");
        String text = cad.nextLine();

        System.out.println("Enter an letter: ");
        String letter1 = cad.next();

        int veces = 0;
        char d = letter1.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == d) {
                veces++;
            }
        }
        if (veces >0) {
            System.out.println("La letra " + letter1 + " se ha encontrado " + veces + " veces en el texto");
        } else {
            System.out.println("No se entro la letra " + letter1 + " en el texto");
        }
    }
}
