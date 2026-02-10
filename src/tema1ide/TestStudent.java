/*
*2026 ITESS.TICS
*Periodo: Enero-Junio
*Asignatura: Programacion Orientada a Objetos 
*Docente: Francisco Javier Montecillo Puente
*Descripcion: Tema1. Entorno de desarrollo 
                     1.2´proceso dd desarrollo de aplicaciones 
*Programador: ADEZ
*Fecha: o9 febrero 2026
*/
package tema1ide;


public class TestStudent {
    public static void main (String[] args) {

        Student student1 = new Student(
            "20231234",
            "Marta Gonzalez",
            "Ingenieria en Sistemas",
            "Femenino"
        );
        Student student2 = new Student(
             "1011345",
             "Jose Rodriguez",
             "Agronomia",
             "Maculino"
             );
             
        System.out.println(student1);
        System.out.println(student2);
    }
}


    

