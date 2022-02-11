package aula04;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(String nC, String t, String d){
        this.setNumConta(nC);
        this.setTipo(t);
        this.setDono(d);
        this.saldo = 0;
        this.status = false;
    }

    // Getters e Setters
    public String getNumConta() {
        return this.numConta;
    }
    public void setNumConta(String nC) {
        this.numConta = nC;
    }

    public String getTipo() {
        if("cc".equals(this.tipo)){
            return "Conta corrente";
        }
        else{
            return "Conta poupança";
        }
    }
    public void setTipo(String t) {
        if(t.equals("cc")) {
            this.tipo = t;
        }
        else if(t.equals("cp")) {
            this.tipo = t;
        }
        else{
            System.out.println("Tipo de conta não reconhecido.");
        }
    }

    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float sd) {
        this.saldo = sd;
    }

    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
    // Outros Métodos
    public void abreConta() {
        if(!this.status){
            setStatus(true);
            if("cc".equals(this.tipo)){
                this.saldo = 50f;
            }
            else{
                this.saldo = 150f;
            }
            System.out.println("Conta de " + this.dono + " foi aberta e saldo de presente foi adicionado!");
        }
        else{
            System.out.println(this.dono + "! Conta já está aberta!");
        }
    }
    public void fechaConta() {
        if(this.status) {
            if(this.saldo != 0) {
                System.out.println("Para fechar a conta, o saldo deve ser zero!");
            }
            else{
                setStatus(false);
                System.out.println("Conta de " + this.dono + " foi fechada!");
            }
        }
        else{
            System.out.println(this.dono + "! Conta já está fechada!");
        }
    }

    public void pagarMensal() {
        if("cc".equals(this.tipo)){
            this.saldo -= 12f;
        }
        else{
            this.saldo -= 20f;
        }
    }

    public void sacar(float valor) {
       if (this.status) {
           if(this.saldo >= valor) {
               this.saldo -= valor;
           }
           else{
               System.out.println(this.dono + "! Saldo insuficiente!");
           }
       }
       else{
           System.out.println(this.dono + "! Conta está fechada, não pode sacar!");
       }
    }

    public void depositar(float valor) {
       if(this.status) {
           this.saldo += valor;
       }
       else{
           System.out.println(this.dono + "! Conta está fechada, não pode depositar!");
       }
    }
}
