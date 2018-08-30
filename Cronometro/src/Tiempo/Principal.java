package Tiempo;

import java.util.Scanner;	

public class Principal {

    public static void main(String[] args) {
        
        Contador s, d, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Presione cualquier tecla 1 + Enter para iniciar");
        int boton = sc.nextInt();
        s = new Segundos();
        d = new Decimas();
        c = new Centesimas();
        System.out.println(s.contar()+" "+ d.contar()+" "+ c.contar());
    }   
}
