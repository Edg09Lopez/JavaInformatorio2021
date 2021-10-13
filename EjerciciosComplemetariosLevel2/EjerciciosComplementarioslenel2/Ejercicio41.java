import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio41 {
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<>();

        carga(alumnos);

        //ordenar la lista de nombres de los alumnos
        Collections.sort(alumnos);
        System.out.println(alumnos);

        List<String> curso1 = alumnos.subList(0,4);
        List<String> curso2 = alumnos.subList(4,8);
        List<String> curso3 = alumnos.subList(8, 12);

        System.out.println("Curso 1: " + curso1);
        System.out.println("Curso 2: " + curso2);
        System.out.println("Curso 3: " + curso3);
    }

    public static void carga(ArrayList<String> alumnos) {
        alumnos.add("Pedro");
        alumnos.add("Juan");
        alumnos.add("Edgar");
        alumnos.add("Gaston");
        alumnos.add("Maria");
        alumnos.add("Andrea");
        alumnos.add("Gisela");
        alumnos.add("Bruno");
        alumnos.add("Vanesa");
        alumnos.add("Alicia");
        alumnos.add("Benicio");
        alumnos.add("Mercedes");
    }    
}
