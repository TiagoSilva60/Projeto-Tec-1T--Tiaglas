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

class GeometriaEspacial {
    double calcularVolumeCubo(double lado) {
        return Math.pow(lado, 3);
    }

    double calcularVolumeParalelepipedo(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
    }

    double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}

public class Menu {
    private final GeometriaPlana geometriaPlana = new GeometriaPlana();
    private final GeometriaEspacial geometriaEspacial = new GeometriaEspacial();
    private final Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Calcular área de figuras planas");
            System.out.println("2. Calcular volume de figuras espaciais");
            System.out.println("3. Sair");
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

    private void menuGeometriaEspacial() {
        System.out.println("\nFiguras espaciais:");
        System.out.println("1. Cubo");
        System.out.println("2. Paralelepípedo");
        System.out.println("3. Esfera");
        System.out.print("Escolha uma figura: ");
        String figura = scanner.nextLine();

        double resultado;
        switch (figura) {
            case "1":
                System.out.print("Digite o lado do cubo: ");
                double ladoCubo = Double.parseDouble(scanner.nextLine());
                resultado = geometriaEspacial.calcularVolumeCubo(ladoCubo);
                System.out.println("Volume do cubo: " + resultado);
                break;
            case "2":
                System.out.print("Digite o comprimento do paralelepípedo: ");
                double comprimentoParalelepipedo = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite a largura do paralelepípedo: ");
                double larguraParalelepipedo = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite a altura do paralelepípedo: ");
                double alturaParalelepipedo = Double.parseDouble(scanner.nextLine());
                resultado = geometriaEspacial.calcularVolumeParalelepipedo(comprimentoParalelepipedo, larguraParalelepipedo, alturaParalelepipedo);
                System.out.println("Volume do paralelepípedo: " + resultado);
                break;
            case "3":
                System.out.print("Digite o raio da esfera: ");
                double raioEsfera = Double.parseDouble(scanner.nextLine());
                resultado = geometriaEspacial.calcularVolumeEsfera(raioEsfera);
                System.out.println("Volume da esfera: " + resultado);
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
