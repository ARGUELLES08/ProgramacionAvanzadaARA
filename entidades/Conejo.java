package entidades;

public class Conejo{
    private int ojos;
    private int orejas;

    public Conejo(int oo, int oa){
        ojos=oo;
        orejas=oa;   
    }
    public void setOrejas(int orejas){
        this.orejas = orejas;
    }
    public int getOrejas(){
        return orejas;
    }
    public void setOjos(int ojos){
        this.ojos = ojos;
    }
    public int getOjos(){
        return ojos;
    }
}