import java.util.Scanner;

public class MainClassePessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassePessoa classePessoa = new ClassePessoa("Mucio", 20, 80, 1.70);
        classePessoa.exibirDados();
        classePessoa.envelhecer();
        classePessoa.emagrecer(5);
        classePessoa.engordar(4);
        classePessoa.crescer(0.04);

        classePessoa.exibirDados();

        scanner.close();
    }
   





}
