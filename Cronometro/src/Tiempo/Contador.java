package Tiempo;

public class Contador {
    protected int tiempo;
    protected int segundos;
    
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
    public void inicio(int segundos){
        for(int j=0;j<=segundos;j++){
            for(int i=0;i<1000;i++){       
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){}
            }
        
        this.tiempo = j;
        System.out.println(j);
        }
    }
    
}
