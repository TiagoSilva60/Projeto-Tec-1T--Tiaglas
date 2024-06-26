import java.util.Scanner;

class GeometriaPlana {
    double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}



public class Menu {
    private final GeometriaPlana geometriaPlana = new GeometriaPlana();
    private final Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Calcular área de figuras planas");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    menuGeometriaPlana();
                    break;
                case "2":
                    menuGeometriaEspacial();
                    break;
                case "3":
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    private void menuGeometriaPlana() {
        System.out.println("\nFiguras planas:");
        System.out.println("1. Quadrado");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Círculo");
        System.out.print("Escolha uma figura: ");
        String figura = scanner.nextLine();

        double resultado;
        switch (figura) {
            case "1":
                System.out.print("Digite o lado do quadrado: ");
                double ladoQuadrado = Double.parseDouble(scanner.nextLine());
                resultado = geometriaPlana.calcularAreaQuadrado(ladoQuadrado);
                System.out.println("Área do quadrado: " + resultado);
                break;
            case "2":
                System.out.print("Digite a base do retângulo: ");
                double baseRetangulo = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite a altura do retângulo: ");
                double alturaRetangulo = Double.parseDouble(scanner.nextLine());
                resultado = geometriaPlana.calcularAreaRetangulo(baseRetangulo, alturaRetangulo);
                System.out.println("Área do retângulo: " + resultado);
                break;
            case "3":
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite a altura do triângulo: ");
                double alturaTriangulo = Double.parseDouble(scanner.nextLine());
                resultado = geometriaPlana.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);
                System.out.println("Área do triângulo: " + resultado);
                break;
            case "4":
                System.out.print("Digite o raio do círculo: ");
                double raioCirculo = Double.parseDouble(scanner.nextLine());
                resultado = geometriaPlana.calcularAreaCirculo(raioCirculo);
                System.out.println("Área do círculo: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }



    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.exibirMenu();
    }
}
