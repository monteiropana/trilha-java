public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca() {}

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento(){
        return this.diaRendimento;
    }
    public void setDiaRendimento( int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        setSaldo(getSaldo() * taxaRendimento);
    }

    @Override
    public String toString() {
        return "Conta Poupanca: [nomeCliente: " + getNomeCliente() + ", numConta: " + getNumConta() + ", saldo: " + getSaldo() + ", diaRendimento: " + diaRendimento + "]";
    }
}