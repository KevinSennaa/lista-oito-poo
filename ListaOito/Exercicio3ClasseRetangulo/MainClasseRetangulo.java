import java.util.Scanner;

public class MainClasseRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClasseRetangulo classeRetangulo = new ClasseRetangulo();

        System.out.println("Digite o primeiro lado: ");
        classeRetangulo.setLadoA(scanner.nextDouble());

        System.out.println("Digite o segundo lado: ");
        classeRetangulo.setLadoB(scanner.nextDouble());

        classeRetangulo.calcularPerimetro();
        classeRetangulo.calcularArea();

        System.out.println("A quantidade de pisos é: " + classeRetangulo.calcularArea());
        System.out.println("A quantidade de rodapés é: " + classeRetangulo.calcularPerimetro());

        scanner.close();
    }
    
}
