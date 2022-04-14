public class ContaEspecial extends ContaBancaria {
    private double limiteDisponivelParaSaque;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limiteDisponivelParaSaque) {
        super(nomeCliente, numConta, saldo);
        this.limiteDisponivelParaSaque = limiteDisponivelParaSaque;
    }

    public double getLimiteDisponivelParaSaque(){
        return this.limiteDisponivelParaSaque;
    }
    public void setLimiteDisponivelParaSaque(double limiteDisponivelParaSaque){
        this.limiteDisponivelParaSaque = limiteDisponivelParaSaque;
    }

    @Override
    public void sacar(double valorQueVaiSerSacado) {
        if(valorQueVaiSerSacado > limiteDisponivelParaSaque) {
            System.out.println("Limite indisponivel");
            return;
        }
        setSaldo(getSaldo() - valorQueVaiSerSacado);
    }

    @Override
    public String toString() {
        return "Conta Especial: [nomeCliente: " + getNomeCliente() + ", numConta: " + getNumConta() + ", saldo: " + getSaldo() + ", limiteDisponivelParaSaque: " + limiteDisponivelParaSaque + "]";
    }
}
