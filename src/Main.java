import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;
        char operador;

        System.out.println("Calculadora Simples");
        System.out.println("Digite o primeiro número:");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        operador = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro! Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido. Use +, -, *, ou /");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
