public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCLiente(String nomeCLiente){
        this.nomeCliente = nomeCLiente;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double SacarValor) {
        if (this.saldo - SacarValor < 0) {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo = this.saldo - SacarValor;
    }

    public void depositar(double valorDepositar) {
        this.saldo += valorDepositar;
    }

    public String toString() {
        return "Conta Bancaria: [nomeCliente: " + nomeCliente + ", numConta: " + numConta + ", saldo: " + saldo + "]";
    }
}
