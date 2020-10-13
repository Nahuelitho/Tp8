import java.util.HashSet;

public class Alumno {
    private HashSet<Materia>materias=new HashSet<>();
    private int legajo;

    private String apellido;

    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void agregarMateria(Materia m) {
    if(materias.add(m)){
        System.out.println("Materia agregada "+m.getNombre());}
                else{System.out.println("No se pudo agregar la materia "+m.getNombre()+" por que ya se encuentra agregada");}
    }

    
    
   
   
    //arreglar
    
       
        
        
               
//       for(int i = 0 ; i<lista.size();i++){ 
//           System.out.println(lista.contains(i));
//               }
    
}
