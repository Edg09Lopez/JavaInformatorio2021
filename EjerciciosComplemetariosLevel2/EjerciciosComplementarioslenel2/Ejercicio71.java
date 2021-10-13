import java.util.ArrayList;

public class Ejercicio71 {
    public static void main(String[] args) {
        ArrayList<String> metodo = new ArrayList<>();
        
        frizzBuzzFuncion(1, 6);
        frizzBuzzFuncion(1, 9);
    }

    static void frizzBuzzFuncion(int a, int b) {
        ArrayList<String> tab = new ArrayList<>();
        ArrayList<Integer> tab2 = new ArrayList<>();

        for (int i = a; i<=(b-1); i++) {
            int mul2 = i%2;
            int mul3 = i%3; 
            if (mul2 == 0 && mul3 == 0) {
                tab.add("FizzBizz");
            } else if (mul2 == 0 || mul3 == 0) {
                if (mul2 == 0) {
                    tab.add("Fizz");
                } else {
                    tab.add("Bizz");
                }
            } else {
                tab2.add(i);
            }
        }

        System.out.println(tab);
        System.out.println(tab2);
    }
}
