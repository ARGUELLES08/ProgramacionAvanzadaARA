package entidades;

public class Materias{

    private String nombre;
    private Horario horario;
    private String aula;
    private double creditos;
    private Docente docente;

    public Materias(){
        this.nombre="";
        this.aula="";
        this.creditos=0;
        this.horario=new Horario();
        //este constructor de docente tiene una parte nula
        this.docente=new Docente();
    }

    public Materias(String nombre, Horario horario, String aula, double creditos, Docente docente) {
        this.nombre = nombre;
        this.horario = horario;
        this.aula = aula;
        this.creditos = creditos;
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public double getCreditos() {
        return creditos;
    }

    public void setCreditos(double creditos) {
        this.creditos = creditos;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    
}