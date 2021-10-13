import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio51 {

    public static void main(String[] args) {
        List<Integer> horasTrab = new ArrayList<>();
        List<Integer> valorHora = new ArrayList<>();

        cargado(horasTrab);
        cargar(valorHora);

        ArrayList<Integer> total = new ArrayList<>();

        System.out.println(horasTrab);
        System.out.println(valorHora);

        for (int i =0; i<horasTrab.size(); i++) {
            int val = horasTrab.get(i) * valorHora.get(i);
            total.add(val);
        }
        System.out.println(total);

        int TotalFinal = 0;
        for (Integer preciofinal: total) {
            TotalFinal += preciofinal;
        }
        System.out.println("Total Final: " + TotalFinal);
    }

    public static void cargado(List<Integer> horasTrab) {
        for (int i = 1; i<=5; i++) {
            System.out.print("Ingrese las horas trabajadas del dia " + i + ": ");
            Scanner horas = new Scanner(System.in);
            Integer hs = horas.nextInt();
            horasTrab.add(hs);
        }
    }

    public static void cargar(List<Integer> valorHora) {
        for (int j = 1; j<=5; j++) {
            System.out.print("Ingrese el valor por hora del dia " + j + ": ");
            Scanner precio = new Scanner(System.in);
            Integer valor = precio.nextInt();
            valorHora.add(valor);
        }
    }
}
