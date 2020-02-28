import entidades.Alumno;
import entidades.Automovil;
import entidades.Conejo;
import entidades.Persona;

public class  Main {

    public static void main(final String[] args) {

        System.out.println();
        // ejecutar un metodo Constructor
        final Persona beto = new Persona(23, 170, 67.4);
        final Persona martha = new Persona();
        System.out.println();
        beto.edad=87;
        martha.altura=80;
        System.out.println();

        Alumno mario = new Alumno (2020670121,7.65);
        System.out.println();
        mario.boleta=2020675436;
        mario.calificacion=8;
        System.out.println();

        Automovil rojo = new Automovil(4,3,4);
        System.out.println();

        Conejo wiki=new Conejo(2,2);
        System.out.println();
        Conejo.ojos=1;
    }

}