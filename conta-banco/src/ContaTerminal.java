import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner

        final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // TODO: conhecer e importar a classe scanner

        // Exibir as mensagens para o nosso usuario
        // Obter pela scanner os valores digitados no terminal

        System.out.println("Informe número usuário:");
        int num = scanner.nextInt();
        System.out.println("Por favor digite o número da Agência:");
        String ag = scanner.next();
        System.out.println("Informe o nome do cliente:");
        String nome = scanner.next();
        System.out.println("Informe o saldo: R$");
        float saldo = scanner.nextFloat();

        // Exibir a mensagem conta criada
        System.out.println(" 'Olá: [" + nome + "], obrigada por criar uma conta em nosso banco, sua agencia é [" + ag
                + "], conta [" + num + "] e o saldo [ R$ " + saldo + "] já está disponível para saque.' ");

    }
}
