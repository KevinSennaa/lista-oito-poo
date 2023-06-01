import java.util.Scanner;
public class MainClasseTv{
    public static void main(String[] args) {
        ClasseTv classeTv= new ClasseTv();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Você tem 85 canais disponíveis a sua escolha, informe um dos canais:");
        classeTv.setNumeroCanal(scanner.nextInt());
        System.out.println("Digite o volume:");
        classeTv.setVolume(scanner.nextInt());
        int opcao=0;

        while(opcao !=4){
            System.out.println("Digite 1 para aumentar o volume.");
            System.out.println("Digite 2 para diminuir o volume.");
            System.out.println("Digite 3 para mudar de canal.");
            System.out.println("Digite 4 para sair do programa.");
            opcao= scanner.nextInt();

        switch(opcao){
            case 1: System.out.println("Informe o valor de aumento do volume:");
            classeTv.aumentarVolume(scanner.nextInt());
            break;
            case 2: System.out.println("Informe o valor de diminuição do volume:");
            classeTv.diminuirVolume(scanner.nextInt());
            break;
            case 3: System.out.println("Informe o canal:");
            classeTv.mudarCanal(scanner.nextInt());
            break;
            case 4: System.out.println("Desligando");
            break;
            default:
            System.out.println("Opção inválida");
             }
        }
            scanner.close();
    }
}