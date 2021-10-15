import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio21 {
    public static void main(String[] args) {
        ArrayList<String> lugares = new ArrayList<String>();

        Scanner dato = new Scanner(System.in);

        int i = 0;
		while (i<3) {
            System.out.println("Ingrese una de las tres ciudades mas favoritas de Argentina: ");
			String ciudad = dato.nextLine();

            lugares.add(ciudad);
            i++;
		}

		System.out.println("Ranking de las ciudades argentinas mas favoritas\n");
		for (int j = 0; j<i; j++) {
			System.out.println("#" + (j+1) + " - " + lugares.get(j));
		}
    }
}