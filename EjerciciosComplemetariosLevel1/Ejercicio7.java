import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner cadText = new Scanner(System.in);

        System.out.println("Enter string in small letter: ");
        String Text = cadText.next();

        ArrayList<Character> cadMay = new ArrayList<>();
        ArrayList<Character> cadMinus = new ArrayList<>();
        //guarda las letras del abecedario en mayuscula en ArrayList, llamado "cadMay"
        for (char letter='A'; letter <= 'Z'; letter++) {
            cadMay.add(letter);
        }
        //guarda las letras del abecedario en minuscula en otra ArrayList, llamado "cadminus"
        for (char letter='a'; letter <= 'z'; letter++) {
            cadMinus.add(letter);
        }
        //convierto la pababra ingresada en char
        char[] c_arr = Text.toCharArray();

        ArrayList<Character> ultim = new ArrayList<>();
        
        //recorro tanto el char en una posicion especifica y lo comparo con ArrayList cadMinus para encontrar en la posicion que coinciden
        for (char letter=0; letter<c_arr.length; letter++) {
            for (int c=0; c<cadMinus.size(); c++) {
                char e = c_arr[letter];//guardo cada letra en una posicion que ingresan al if cuando sean iguales
                char d = cadMinus.get(c);
                if (e==d) {
                    int f = cadMinus.indexOf(d);//guardo cada indice que se encuenta en cadMinus
                    ultim.add(cadMay.get(f));//agrego la letra en ArrayList que se encuentra en la misma posicion que el anterior  
                }
            }
        }

        //recorro con un for para imprimir el resultado con letras Mayusculas
        for(char z: ultim) {
            System.out.print(z);
        }
        System.out.println("");
    }
}
