import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio22 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
		Scanner ingre = new Scanner(System.in);
		
		int i = 0;
		while (i<5) {
            System.out.println("Enter whole number: ");
			Integer valor = ingre.nextInt();
			num.add(valor);
			i++;
		}
		System.out.println(num);
        System.out.println("Tamaño en la Lista : " +num.size()+"\n");    

		System.out.println("Enter number in last position: ");
		int ultim = ingre.nextInt();
		num.add(ultim);
        System.out.println(num);    
    	System.out.println("Tamaño en la Lista : " +num.size()+"\n");    
		
		System.out.println("Enter number in first position: ");
		int prim = ingre.nextInt();
        num.add(0, prim);
		
        System.out.println(num);    
    	System.out.println("Tamaño en la Lista : " +num.size()+"\n");
    }
}
