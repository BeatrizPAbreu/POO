package engtelecom.poo;

import java.util.Objects;

import engtelecom.Contador;

public class App {
    public static void main(String[] args) {


        Contador c = new Contador();



        c.atribuiValor(0);

        System.out.println(c.obtemValor());

        c.incrementaValor();

        System.out.println(c.obtemValor());

        




    }
}