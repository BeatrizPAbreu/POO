//Main

package engtelecom.poo;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

//        Caneta c =  new Caneta();
//        Caneta d =  new Caneta();
//        c.definirCor("azul");
//        d.definirCor("verde");
//
//
//        c.desenhar();
//        d.desenhar();

        Caneta[] canetas = new Caneta[5];

        for (int i = 0; i < canetas.length; i++) {
            canetas[i] = new Caneta();
        }
        canetas[0].definirCor("azul");
        canetas[1].definirCor("verde");
        canetas[2].definirCor("azul");
        canetas[3].definirCor("preta");
        canetas[4].definirCor("vermelha");

        canetas[0].definirTinta(100);
        canetas[0].desenhar(

//        for (Caneta c : canetas) {
//            if (c.obterCor().equals("azul")) {
//                c.desenhar(3);
//            }
//        }


    }
}


//Classe caneta

package engtelecom.poo;

public class Caneta {

    // Atributos

    private String cor;
    private double nivelTinta;


    //Métodos
    public void desenhar (int dist) {
        System.out.println("Desenhando " + cor);
        
    }

    public void definirCor (String c) {
        cor = c;

    }

    public void definirTinta (double t) {
        nivelTinta = t;
    }


    public String obterCor() {
        return cor;
    }

    public double getNivelTinta() {
        return nivelTinta;
    }

    public void setNivelTinta(double nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
}
