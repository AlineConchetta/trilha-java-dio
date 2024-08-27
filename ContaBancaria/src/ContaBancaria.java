import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String [] args){
        int conta = 1342;

    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

    System.out.println("Por favor digite o nome do titular da conta");
    String nomeTitular = scanner.next();

    System.out.println("Digite o número da agencia");
    int agencia = scanner.nextInt();

    System.out.println("Por favor digite seu saldo");
    double saldo = scanner.nextDouble();

    //imprimindo dados obtidos

    System.out.println("Olá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " 
    + agencia + ", conta " + conta + " e seu saldo "+ saldo + " já está disponível para saque.");

    }
}
