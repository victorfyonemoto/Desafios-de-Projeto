public class contaCorrente extends conta{

    public contaCorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfo();
    }
}