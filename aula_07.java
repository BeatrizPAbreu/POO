


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
