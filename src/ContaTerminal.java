import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner texto = new Scanner(System.in);

        String nome;
        System.out.println("Poderia nós informar seu nome:");
        nome = texto.nextLine();
        System.out.println("Óla " + nome + "seja brm-vindo!");

        String agencia;
        System.out.println("Agora sr(a) " + nome +" pedimos que nós informe o nome da sua agência:");
        agencia = texto.nextLine();

        int numero;
        System.out.println("Por favor, digite o número da Agência!");
        numero = texto.nextInt();
        
        Double saldo;
        System.out.println("Estamos quase terminando");
        System.out.println("Por favor digite o seu saldo");
        saldo= texto.nextDouble();

        System.out.println("Óla " + nome + " obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

     

        texto.close();
    }
}
