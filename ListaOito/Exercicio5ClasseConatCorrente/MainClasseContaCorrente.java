import java.util.Scanner;

public class MainClasseContaCorrente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClasseContaCorrente classeContaCorrente = new ClasseContaCorrente(014, "Jobson");
        System.out.println("Seu nome é: " + classeContaCorrente.getNome());
        System.out.println("O número da conta é: " + classeContaCorrente.getNumeroConta());
        System.out.println("O valor do seu saldo é: " + classeContaCorrente.getSaldo());
        System.out.println("");

        classeContaCorrente.alterarNome("Robson");
        classeContaCorrente.despositar(500);
        classeContaCorrente.sacar(165.20);

        System.out.println("O seu nome foi alterado para: " + classeContaCorrente.getNome());
        System.out.println("O número da conta é: " + classeContaCorrente.getNumeroConta());
        System.out.println("O seu novo saldo é:: " + classeContaCorrente.getSaldo());

        scanner.close();
    }
}