import java.util.Scanner;

public class MainBichinhoVirtual {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   
    ClasseBichinhoVirtual tamagushi = new ClasseBichinhoVirtual("Bobby", 50, 80, 2);
    
        System.out.println("Nome: " + tamagushi.retornarNome());
        System.out.println("Fome: " + tamagushi.retornarFome());
        System.out.println("Saúde: " + tamagushi.retornarSaude());
        System.out.println("Idade: " + tamagushi.retornarIdade());
        System.out.println("Humor: " + tamagushi.retornarHumor());
        System.out.println("");
    
        tamagushi.alterarNome("Tommy");
        tamagushi.alterarFome(90);
        tamagushi.alterarSaude(30);
        tamagushi.alterarIdade(3);
    
        System.out.println("Nome: " + tamagushi.retornarNome());
        System.out.println("Fome: " + tamagushi.retornarFome());
        System.out.println("Saúde: " + tamagushi.retornarSaude());
        System.out.println("Idade: " + tamagushi.retornarIdade());
        System.out.println("Humor: " + tamagushi.retornarHumor());

        scanner.close();

    }
}    
