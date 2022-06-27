import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        List<Integer> resultado = new ArrayList<Integer>();
        for(int i=0; i<numeros.size();i++){
            Integer a = factorial(numeros.get(i));
            resultado.add(a);
        }

        List<Integer> distinto = resultado.stream().distinct().collect(Collectors.toList());
        System.out.println(distinto);
    }
    public static Integer factorial(Integer num) {
        if (num>=0) {
            if (num == 1 || num == 0) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }  
        } else {
            return 0;
        }
    }
}
