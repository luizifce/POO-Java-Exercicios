package aula04;

public class main {
    public static void main(String[] args){
        ContaBanco cb1 = new ContaBanco("1001", "cc", "Luiz");
        cb1.abreConta();
        cb1.pagarMensal();
        cb1.sacar(39);
        System.out.println(cb1.getSaldo());
    }
}
