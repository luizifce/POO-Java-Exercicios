package aula09;

public class main {
    public static void main(String[] args){
        Pessoa[] p = new Pessoa[2];
        p[0] = new Pessoa("Luizao", 19, "M");
        p[1] = new Pessoa("Ana", 16, "F");

        Livro[] l = new Livro[3];
        l[0] = new Livro("POO básico", "José da Silva", 100, p[0]);
        l[1] = new Livro("POO avançado", "José da Silva", 200, p[0]);
        l[2] = new Livro("Fundamentos do teatro", "Thomas de Aquino", 150, p[1]);

        l[0].folhear(100);
        l[0].voltaPag();
        l[0].detalhes();
    }
}

