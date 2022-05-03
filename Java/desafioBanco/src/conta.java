public abstract class conta implements iConta {

    private static int agenciaPadrao = 1;
    private static int sequencial= 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    public conta(cliente cliente) {
        this.agencia = agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCPF()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Conta número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
