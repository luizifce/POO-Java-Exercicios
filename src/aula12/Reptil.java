package aula12;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Reptil rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Reptil comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
}
