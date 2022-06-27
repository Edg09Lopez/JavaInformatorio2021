import java.util.List;
import java.util.stream.Collectors;

public class ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
                                        "Wonder Woman", "brainiac");

        List<String> finalD = palabras.stream().filter(n -> n.toLowerCase().startsWith("b")).collect(Collectors.toList());
        System.out.println(finalD);
    }
}
