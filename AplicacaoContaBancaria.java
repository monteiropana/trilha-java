public class AplicacaoContaBancaria {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Ana", 1234, 1450);
        ContaEspecial contaS = new ContaEspecial("William", 4321, 1230, 10000);
        ContaPoupanca contaP = new ContaPoupanca("Renan", 1324, 1000, 10);

        imprimir(conta, contaS, contaP, "=====VALORES INICIAIS=====");

        conta.sacar(450);
        contaS.sacar(230);
        contaP.sacar(1000);

        imprimir(conta, contaS, contaP, "=====SAQUES=====");
        
        conta.depositar(1200);
        contaS.depositar(6000);
        contaP.depositar(4000);

        imprimir(conta, contaS, contaP, "=====DEPOSITOS=====");

        contaP.calcularNovoSaldo(1.03);

        imprimir(conta, contaS, contaP, "=====CALCULO RENDIMENTO=====");
    }

    public static void imprimir(ContaBancaria conta, ContaBancaria contaS, ContaBancaria contaP, String titulo) {
        System.out.println(titulo);
        System.out.println(conta);
        System.out.println(contaS);
        System.out.println(contaP);
        System.out.println(""); 
    }
}
