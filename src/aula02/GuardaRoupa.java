package aula02;

public class GuardaRoupa {
    public String cor;
    public int portas;
    public int gavetas;
    public int capacidade;
    private int quantRoupa;

    public void colocaRoupa(int quant){
        if ((quantRoupa + quant) <= capacidade) {
            quantRoupa += quant;
            System.out.println(quant + " roupas adicionadas!");
        }
        else{
            quantRoupa = capacidade;
            System.out.println("O guarda roupa está cheio!");
        }
    }

    public void tiraRoupa(int quant) {
        if ((quantRoupa - quant) >= 0) {
            quantRoupa -= quant;
            System.out.println(quant + " roupas retiradas!");
        }
        else{
            System.out.println("Guarda Roupa vazio!");
        }
    }
}
