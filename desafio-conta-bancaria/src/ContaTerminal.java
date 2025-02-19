import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    private Scanner scanner;

    public ContaTerminal() {
        this.numero = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = 0.0;
        this.scanner = new Scanner(System.in);
    }


    public void definirNumero(int numero){
        this.numero = numero;
    }

    public void definirAgencia(String agencia){
        this.agencia = agencia;
    }

    public void definirNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void definirSaldo(double saldo){
        this.saldo = saldo;
    }

    public void start() {
        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta");
        Double saldo = scanner.nextDouble();

        this.definirNumero(numero);
        this.definirAgencia(agencia);
        this.definirNomeCliente(nomeCliente);
        this.definirSaldo(saldo);

        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
        + this.agencia + " conta " + this.numero + " e seu saldo " + this.saldo + " já está disponível para saque." );
    }
}
