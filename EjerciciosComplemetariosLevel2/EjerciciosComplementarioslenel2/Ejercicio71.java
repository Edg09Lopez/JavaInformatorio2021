import java.util.ArrayList;

public class Ejercicio71 {
    public static void main(String[] args) {
        
        frizzBuzzFuncion(1, 6);
        frizzBuzzFuncion(1, 9);
    }
        
    static void frizzBuzzFuncion(int a, int b) {
        ArrayList<String> carac = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> metodo = new ArrayList<>();

        for (int i = a; i<=(b-1); i++) {
            int mul2 = i%2;
            int mul3 = i%3; 
            if (mul2 == 0 && mul3 == 0) {
                carac.add("FizzBizz");
            } else if (mul2 == 0 || mul3 == 0) {
                if (mul2 == 0) {
                    carac.add("Fizz");
                } else {
                    carac.add("Bizz");
                }
            } else {
                num.add(i);
            }
        }

        System.out.println(carac);
        System.out.println(num);

        metodo.addAll(carac);
        System.out.println("resultado: " + metodo);

        for (int i=0; i<=num.size(); i++) {
            if (i == num.get(i)) {
                int c = num.get(i);
                String st = String.valueOf(c);
                metodo.add(i-1, st);
            }
        }
    }
}
