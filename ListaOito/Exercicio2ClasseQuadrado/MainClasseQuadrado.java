import java.util.Scanner;

public class MainClasseQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClasseQuadrado classeQuadrado = new ClasseQuadrado(26);

        System.out.println("Lado do quadrado é: " + classeQuadrado.retornarValorLado());
        classeQuadrado.mudarValorLado(12);
        System.out.println("Novo valor do lado: " + classeQuadrado.retornarValorLado());
        System.out.println("Área do quadrado é: " + classeQuadrado.calcularArea());
       
        scanner.close();
}

}