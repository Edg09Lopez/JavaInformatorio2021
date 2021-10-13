import java.util.*;

public class Ejercicio61 {
    public static void main(String[] args) {
        Set<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();

        empleado.add(new Empleado("Andrea", 32567876, 40, 200));
        empleado.add(new Empleado("Sergio", 32345321, 50, 320));
        empleado.add(new Empleado("Gaston", 31654764, 45, 280));
        empleado.add(new Empleado("Alicia", 34875345, 50, 340));

        for (Empleado list: empleado) {
            System.out.println("Nombre " + list.nombre + 
            " -DNI " + list.dni + " -Horas Trabajadas " 
            + list.horasTrabajadas + " -Valor por Hora " + list.valorHora);
        }

        for (Empleado tabla: empleado) {
            sueldo.put(tabla.clave(), tabla.valor());
        }

        System.out.println("\nLiquidacion de sueldo\n");
        sueldo.forEach((dni, valor) -> System.out.println("DNI: " + dni + " -Sueldo: " + valor));
    }
}

class Empleado {

    String nombre;
    int dni;
    int horasTrabajadas;
    float valorHora;

    public Empleado (String nombre, int dni, int horasTrabajadas, float valorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int clave() {
        return this.dni;
    }

    public float valor() {
        return this.horasTrabajadas * this.valorHora;
    }
}
