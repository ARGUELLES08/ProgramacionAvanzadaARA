package entidades;

public class Alumno extends Persona{
  private String matricula;
  private boolean edoAcademico;
  private Materias[] materias;

  public Alumno(int nMaterias){
      this.matricula="";
      this.edoAcademico=true;
      materias= new Materias[nMaterias];
  }

  public Alumno(String matricula, boolean edoAcademico, Materias[] materias) {
      this.matricula = matricula;
      this.edoAcademico = edoAcademico;
      this.materias = materias;
  }
  public void saludar(){
      super.saludar();
      System.out.println(" y soy alumno");
  }

  public String getMatricula() {
      return matricula;
  }

  public void setMatricula(String matricula) {
      this.matricula = matricula;
  }

  public boolean isEdoAcademico() {
      return edoAcademico;
  }

  public void setEdoAcademico(boolean edoAcademico) {
      this.edoAcademico = edoAcademico;
  }

  public Materias[] getMaterias() {
      return materias;
  }

  public void setMaterias(Materias[] materias) {
      this.materias = materias;
  }

    
}