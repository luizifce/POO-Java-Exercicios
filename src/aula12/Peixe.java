package aula12;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Peixe nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    public void soltarBolha() {
        System.out.println("Peixe soltou uma bolha");
    }
}
