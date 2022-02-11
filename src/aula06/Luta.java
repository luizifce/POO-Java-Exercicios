package aula06;
import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    //Métodos Especiais
    public void setDesafiante(Lutador redSide){
        this.desafiante = redSide;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setDesafiado(Lutador blueSide){
        this.desafiado = blueSide;
    }
    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setRounds(int r){
        this.rounds = r;
    }
    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean apv){
        this.aprovada = apv;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        }
        else{
            setAprovada(false);
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        Random aleatorio = new Random();

        if(this.aprovada){
            System.out.println("=== DESAFIANTE ===\n");
            this.desafiante.apresentar();

            System.out.println("\n=== DESAFIADO ===");
            this.desafiado.apresentar();

            System.out.println("\n=== RESULTADO ===");
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empate!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                }
                case 1 -> {
                    System.out.println(this.desafiante.getNome() + " venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                }
                default -> {
                    System.out.println(this.desafiado.getNome() + " venceu!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                }
            }
            System.out.println("==================");
        }
        else{
            System.out.println("A luta não pode acontecer!");
        }
    }
}
