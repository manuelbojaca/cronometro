package Tiempo;

public class Centesimas extends Contador{
      public Centesimas(){
        posicion = 10;
    }
    
    @Override
    public int contar(){
        unidad = getTiempo() / posicion;
        return unidad; 
    }
}
