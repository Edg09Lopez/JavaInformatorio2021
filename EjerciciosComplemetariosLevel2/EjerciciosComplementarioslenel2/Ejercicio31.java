import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio31 {
    public static void main(String[] args) {
        List<Integer> baraja = new ArrayList<>();

        cargar(baraja);
        System.out.println("Cargado de cartas en orden numerico: "+ baraja);

        //orden inverso de la lista usando la coleccion sort
        Collections.sort(baraja);
        System.out.println("Lista con el orden inverso: "+ baraja);

        //desordeno la lista usando la coleccion shufle 
        Collections.shuffle(baraja);
        System.out.println("lista desordenada: "+ baraja);        
    }

    public static void cargar(List<Integer> baraja) {
        //ingreso los numeros de baraja francesa usando un for 
        for (int i = 12; i>=1; i--) {
            baraja.add(i);
        }
    }
}
