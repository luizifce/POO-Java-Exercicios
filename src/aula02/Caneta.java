package aula02;

public class Caneta {
    private String modelo;
    protected String cor;
    private float ponta = 0.5f;
    protected int carga;
    public boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada?: " + this.tampada);
    }
    public void rabiscar() {
        if (tampada) {
            System.out.println("A caneta está tampada, não pode rabiscar.");;
        }
        else{
            System.out.println("Caneta " + this.modelo + " está rabiscando!");
        }
    }

    public void tampar() {
        if(tampada) {
            System.out.println("A caneta já está tampada!");
        }
        else{
            this.tampada = true;
            System.out.println("Caneta tampada!");
        }
    }

    public void destampar(){
        if (tampada) {
            this.tampada = false;
            System.out.println("Caneta destampada!");
        }
        else{
            System.out.println("A caneta já está destampada!");
        }
    }
}
