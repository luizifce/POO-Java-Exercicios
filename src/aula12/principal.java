package aula12;

public class principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Tartaruga t = new Tartaruga();
        Canguru k = new Canguru();

        m.emitirSom();
        k.emitirSom();

        k.locomover();
        m.locomover();
        k.usarBolsa();

        r.emitirSom();
        t.emitirSom();
        r.locomover();
        t.locomover();
    }
}
