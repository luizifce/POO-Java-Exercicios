package aula12;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Ave voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave comendo sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave cantando");
    }

    public void fazerNinho() {
        System.out.println("Ave construiu um ninho");
    }
}
