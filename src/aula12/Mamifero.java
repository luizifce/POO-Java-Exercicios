package aula12;

public class Mamifero extends Animal{
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Mamifero Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
