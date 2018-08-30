package Tiempo;

public abstract class Contador {
    protected int tiempo;
    protected int segundos;
    protected int posicion;
    protected int unidad;
    
    public int getTiempo(){
        return this.tiempo;
    }
    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    } 
    public int getSegundos(){
        return this.segundos;
    }
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    public int getUnidad(){
        return this.unidad;
    }
    public void setUnidad(int unidad){
        this.unidad = unidad;
    }
    public void unidad(){     
        try{
            Thread.sleep(1);
        }catch(InterruptedException e){
            System.out.println("Error fundamental");
        }
    }    
    //public abstract void imprimir();
    public abstract int contar();
}

