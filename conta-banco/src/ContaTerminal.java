public class ContaTerminal {
    // Definindo os atributos da classe
    
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        // Criando uma instância da classe ContaTerminal
        ContaTerminal conta = new ContaTerminal();

        // Usando a classe Scanner para capturar entrada do usuário
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Solicitando ao usuário que insira os dados da conta
        System.out.print("Por favor, digite o número da agência: ");
        conta.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        conta.numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextInt()

        System.out.print("Por favor, digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        conta.saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados da conta
        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}