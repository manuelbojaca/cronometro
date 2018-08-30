package Tiempo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Contador c;
        Scanner sc = new Scanner(System.in);
        System.out.println("# segundos");
        int segundos = sc.nextInt();
        c = new Contador();
        c.inicio(segundos);
        System.out.println(c.getTiempo()+" segundos");
    }   
}
