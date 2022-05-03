public class main {
    public static void main(String[] args){

        cliente monica = new cliente();
        monica.setNome("Monica");
        monica.setCPF("XXX.XXX.XXX-XXX");
        conta cc = new contaCorrente(monica);
        conta cp = new contaPoupanca(monica);

        cc.depositar(1000000);
        cp.depositar(1000000);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
