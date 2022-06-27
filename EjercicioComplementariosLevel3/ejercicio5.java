import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ejercicio5 {
    public static void main(String[] args) {
        Map<String, Integer> finalD = new HashMap<String, Integer>();

        List<alumno> alumnos = new ArrayList<alumno>();
        alumnos.add(new alumno("Lopez", "Edgar", "12/10/1990"));
        alumnos.add(new alumno("Galarza", "Vanesa", "26/03/1992"));
        alumnos.add(new alumno("Escalante", "Alicia", "06/08/1989"));
        alumnos.add(new alumno("Peralta", "Mirta", "11/12/1985"));
        alumnos.add(new alumno("Perez", "Mario", "17/05/1971"));

        
        for (int i=0;i<alumnos.size();i++){
            alumno e = alumnos.get(i);
            String cla = e.getApellido()+" "+e.getNombre();
            int valor = e.calculoEdad();
            finalD.put(cla, valor);   
        }

        Map<String, Integer> result = finalD.entrySet() 
          .stream()  
          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));  
  
        System.out.println("Result: " + result);
    } 

    public static class alumno {
        private String apellido;
        private String nombre;
        private String fechaNacimiento;

        public alumno(){
        }
    
        public alumno(String ape, String nom, String nacim){
            this.apellido = ape;
            this.nombre = nom;
            this.fechaNacimiento = nacim;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getApellido() {
            return apellido;
        }
    
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
        public String getFechaNacimiento() {
            return fechaNacimiento;
        }
    
        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public int calculoEdad(){
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate hoy = LocalDate.now();
            LocalDate fechanac = LocalDate.parse(getFechaNacimiento(), fmt);
            Period ed = Period.between(fechanac, hoy);
            return ed.getYears();
        }
    }
    
}
