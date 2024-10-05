import java.util.Scanner;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}

class Rectangulo {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }
}

class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una figura para calcular el área:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Ingresa el radio del círculo:");
                double radio = scanner.nextDouble();
                Circulo circulo = new Circulo(radio);
                System.out.println("El área del círculo es: " + circulo.calcularArea());
                break;

            case 2:
                System.out.println("Ingresa el largo del rectángulo:");
                double largo = scanner.nextDouble();
                System.out.println("Ingresa el ancho del rectángulo:");
                double ancho = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(largo, ancho);
                System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
                break;

            case 3:
                System.out.println("Ingresa la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingresa la altura del triángulo:");
                double altura = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura);
                System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                break;

            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}

