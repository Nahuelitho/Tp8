public class Colegio {
    public static void main(String[] args) {
        //conceptual 2 elementos iguales y fisicamente 2 distintos
        //Materia mateCopy=new Materia(1,"Matematica I",1);
        Materia Ingles1 = new Materia(123, "Ingles I", 1);
        Materia Matematica1 = new Materia(1234, "Matematica I", 1);
        Materia Laboratorio1 = new Materia(12345,"Laboratorio I",1);
        
        Alumno Martin = new Alumno(1001,"López","Martin");
        Alumno Brenda = new Alumno(1002,"Martínez","Brenda");
        
        Martin.agregarMateria(Ingles1);
        Martin.agregarMateria(Matematica1);
        Martin.agregarMateria(Laboratorio1);
        
        Brenda.agregarMateria(Ingles1);
        Brenda.agregarMateria(Matematica1);
        Brenda.agregarMateria(Laboratorio1);
        Brenda.agregarMateria(Laboratorio1);
        
        
    }
}
