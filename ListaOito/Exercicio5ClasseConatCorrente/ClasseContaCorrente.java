public class ClasseContaCorrente {
    private int numeroConta;
    private String nome;
    private double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClasseContaCorrente(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }
    public void alterarNome(String nome){
        this.nome = nome;
    }
    public void despositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }
    public void sacar(double valorSaque) {
        if(valorSaque > this.saldo){
            System.out.println("O seu saque é maior que seu saldo, impossivel.");
        }else{
            this.saldo -= valorSaque;
        }
    }
   
}
