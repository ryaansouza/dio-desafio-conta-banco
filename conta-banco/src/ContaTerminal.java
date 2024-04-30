import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        /* 
        * TO DO:
        *       Conhecer e Importar a classe Scanner
        *       Exbir as mensagens para o Usuario
        *       Obter pelo Scanner os valores digitados pelo terminal
        *       Exibir a mensagem da conta criada
        **/

        String nomeClienteConta;
        String sobrenomeClienteConta;
        String agenciaConta;
        int numeroConta;
        double saldoConta;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("Por favor inserir seu Primeiro Nome: ");
            nomeClienteConta = scanner.next();

            System.out.print("Por favor inserir seu Sobrenome: ");
            sobrenomeClienteConta = scanner.next();
            
            System.out.print("Por favor inserir Agencia: ");
            agenciaConta = scanner.next();

            System.out.print("Por favor inserir Numero da Conta: ");
            numeroConta = scanner.nextInt();

            System.out.print("Por favor inserir Saldo da Conta: ");
            saldoConta = scanner.nextDouble();
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
            
            System.out.printf("Olá " + nomeClienteConta.concat(" " + sobrenomeClienteConta) + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo R$ %.2f já está disponível para saque.", saldoConta);
            System.out.println("");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }

}