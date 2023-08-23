package engtelecom;



public class Contador {

    private int valorAtual;


    public void atribuiValor (int v) {
        valorAtual = v;
    }

    public void incrementaValor() {
        if (valorAtual < 1000) {
            valorAtual++;
        }
        else {
            System.out.println("Contador no fim");
        }

    }


    public int obtemValor () {
        return valorAtual;
    }


}
