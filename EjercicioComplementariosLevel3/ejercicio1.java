import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        
        List<String> pari = palabras.stream().filter(f -> f!=null && f!="").collect(Collectors.toList());
        System.out.println(pari);
    }
}
