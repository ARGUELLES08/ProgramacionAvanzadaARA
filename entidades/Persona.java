package entidades;

public class Persona{

    private int edad;
    private int altura;
    private double peso;
    private String nombre;

    public Persona(){
        edad=0;
        altura=0;
        peso=0;
        nombre="";
    }

    public Persona(int e, int a, double p, String nombre){
        edad=e;
        altura=a;
        peso=p;
        this.nombre=nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return  edad;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
    public double getPeso(){
        return peso;
    }
    public void saludar(){
        System.out.println("Hola");
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}