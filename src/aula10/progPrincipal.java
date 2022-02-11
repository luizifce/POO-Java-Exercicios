package aula10;

public class progPrincipal {
    public static void main(String[] args){
        Pessoa pes = new Pessoa();
        Aluno alu = new Aluno();
        Professor prof = new Professor();
        Funcionario func = new Funcionario();

        pes.setNome("Pedro");
        alu.setNome("Maria");
        prof.setNome("Cláudio");
        func.setNome("Fabiana");

        alu.setCurso("Informática");
        prof.setSalario(2500.75);
        func.setSetor("Estoque");

        /*
        Essas 3 linhas de código vão dar erro, pois a classe pessoa, por exemplo, não tem o método "receberAum" que é um
        método da sua classe filha Professor.
        pes.receberAum(550.20);
        alu.mudarTrabalho();
        func.cancelarMatr();
         */

        System.out.println(pes.toString());
        System.out.println(alu.toString());
        System.out.println(func.toString());
        System.out.println(prof.toString());
    }
}
