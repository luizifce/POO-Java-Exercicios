package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //Métodos
    public void receberAum(double aum){
        this.salario += aum;
    }
}
