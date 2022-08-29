import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor Digite o seu nome : ");

        String nomeCliente = scan.nextLine();

        System.out.println("Por favor Digite o número da agência : ");

        String agencia = scan.nextLine();

        System.out.println("Por favor Digite o número da conta : ");
        int numero = scan.nextInt();


        System.out.println("Por favor Digite o seu Saldo : ");
        float saldo = scan.nextFloat();

        System.out.println("Olá "+nomeCliente+" Obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
                " conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");

    }
}