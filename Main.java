import entidades.*;

public class Main {

    public static void main(String[] args) {
     

      Docente decano = new Docente();
      decano.setNombre("Rafa");
      decano.setEdad(40);
      decano.setSalario(41212.50);
      decano.setHorario(new Horario("7:00","14:00"));

      Docente oswi = new Docente();
      decano.setNombre("Beto oswaldo");
      decano.setEdad(28);
      decano.setSalario(4121.50);
      decano.setHorario(new Horario("8:00","16:00"));

      Docente osiris = new Docente();
      osiris.setNombre("angel");
      osiris.setEdad(34);
      osiris.setSalario(35678.23);
      osiris.setHorario(new Horario("8:30","10:00"));


      Materias[] materias = new Materias[3];
      materias[0] = new Materias("Electronica", new Horario("8:30","10:00"), 
                       "112", 4.5, decano);
      materias[1] = new Materias("Calculo", new Horario("10:00","11:30"), 
                       "112", 6.5, decano);
      materias[2] = new Materias("Progrmacion Avanzada", new Horario("11:30","13:00"), 
                       "LabC1", 6.5, oswi);

      Alumno martha = new Alumno("202012345", true, materias);
      Alumno adan = new Alumno("2020670978", true, materias);
      Alumno juan = new Alumno("2020670178", true, materias);
      Alumno manuel= new Alumno("2020876652", true, materias);
      
      System.out.println(martha.getMaterias()[1].getDocente().getNombre());
      
    }

}