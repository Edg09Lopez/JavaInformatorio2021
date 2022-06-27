import java.util.List;
import java.util.stream.Collectors;

public class ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        
        List<Integer> duplicado = numeros.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        System.out.println(duplicado);
    }
}
