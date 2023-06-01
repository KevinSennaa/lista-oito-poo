import java.util.Scanner;

public class MainClasseBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClasseBola classeBola = new ClasseBola("Lilás", "Aço fundido", 40.0);

        classeBola.mostrarCor();
        classeBola.trocarCor("Amarelo");
        classeBola.mostrarCor();

        scanner.close();
    }





}    
