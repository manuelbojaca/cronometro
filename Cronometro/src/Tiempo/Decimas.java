package Tiempo;

public class Decimas extends Contador{
    public Decimas(){
        posicion = 100;
    }
    
    @Override
    public int contar(){
        unidad = this.tiempo / posicion;
        return unidad; 
    }
}
