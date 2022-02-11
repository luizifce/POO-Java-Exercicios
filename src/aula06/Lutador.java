package aula06;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    // Métodos especiais
    public Lutador(String no, String na, int id,
                   float al, float pe, int v, int d, int e) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria() {
        if(peso < 52.2) {
            this.categoria = "inválido";
        }
        else if(peso <= 70.3) {
            this.categoria = "leve";
        }
        else if(peso <= 83.9) {
            this.categoria = "médio";
        }
        else if(peso <= 120.2) {
            this.categoria = "pesado";
        }
        else {
            this.categoria = "inválido";
        }
    }

    // Métodos
    public void ganharLuta() {
        this.vitorias += 1;
    }
    public void perderLuta() {
        this.derrotas += 1;
    }
    public void empatarLuta() {
        this.empates += 1;
    }

    public void apresentar() {
        System.out.println("Lutador: " + this.nome);
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + "m");
        System.out.println("Peso: " + this.peso + "kg");
    }
    public void status() {
        System.out.println(this.nome + " é peso " + this.categoria + ".");
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);

    }
}

