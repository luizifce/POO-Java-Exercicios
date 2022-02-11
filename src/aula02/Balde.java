package aula02;

public class Balde {
    String cor;
    float capacidade;
    String tipoDeAlça;
    float quantCont = 0;

    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Capacidade(Em L): " + this.capacidade);
        System.out.println("Tipo de alça: " + this.tipoDeAlça);
        System.out.println("Quantidade de Conteudo(Em L): " + this.quantCont);
    }

    void encher(float quant) {
        if((quantCont + quant) <= capacidade) {
            this.quantCont += quant;
            System.out.println("O balde agora tem " + this.quantCont + "L de conteúdo.");
        }
        else {
            System.out.println("O Balde está cheio!");
            this.quantCont = this.capacidade;
        }
    }

    void esvaziar(float quant){
        if((quantCont - quant) >= 0) {
            this.quantCont -= quant;
            System.out.println("O balde agora tem" + this.quantCont + "L de conteúdo.");
        }
        else{
            System.out.println("O balde está vazio!");
        }
    }
}
