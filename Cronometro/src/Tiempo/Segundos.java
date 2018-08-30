package Tiempo;

public class Segundos extends Contador{
    public Segundos(){
        posicion = 1000;
    }
    @Override
    public int contar(){
        for(int j=0;j<1000;j++){
            for(int i=0;i<posicion;i++){
                unidad();
                this.tiempo++;
            }
            unidad = unidad++;
        }    
        return unidad;
    }
}
