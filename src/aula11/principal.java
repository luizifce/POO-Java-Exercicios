package aula11;

public class principal {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); <- Gera erro, pois a classe "Pessoa" é abstrata(não pode ser instanciada).
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Bolsista b1 = new Bolsista();
    }
}
