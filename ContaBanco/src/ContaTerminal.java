import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = scanner.next();
        System.out.println("Por favor, digite o número de Usuário!");
        Numero = scanner.nextInt();

        scanner.nextLine(); // Consume o caractere de nova linha

        System.out.println("Por favor, digite o Nome de Cliente!");
        NomeCliente = scanner.nextLine();

        // Verifica se o próximo token é um double
        System.out.println("Por favor, digite o saldo que deseja depositar!");
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número válido para o saldo:");
            scanner.next(); // Consumir o token inválido
        }
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

        scanner.close(); // fecha o objeto scanner
    }
}
