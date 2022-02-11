package aula11;

public class Bolsista extends Aluno{
    private int bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Bolsista pagou mensalidade");
    }
}
