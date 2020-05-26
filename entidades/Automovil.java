
package entidades;

public class Automovil{
    private int llantas; 
    private int puertas;
    private int sillones;


	public Automovil(int l, int p, int s) {
        llantas=l;
        puertas=p;
        sillones=s;
    }

    public int getLlantas(){
        return llantas;
    }

    public void setLlantas(int llantas){
        this.llantas = llantas;
    }

    public int getPuertas(){
        return puertas;
    }
    
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    public int getSillones(){
        return sillones;
    }

    public void setSillones(int sillones){
        this.sillones = sillones;
    }
}