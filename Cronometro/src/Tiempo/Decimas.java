package Tiempo;

public class Decimas extends Contador{
    public Decimas(){
        posicion = 100;
    }
    
    public int contar(){
        unidad = getTiempo() / 100;
        return unidad;
    }
}

