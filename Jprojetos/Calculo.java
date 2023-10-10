import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");
            System.out.println("5 - Sair");
            
            int escolha = scanner.nextInt();
            
            if (escolha == 5) {
                System.out.println("Calculadora encerrada.");
                break;
            }
            
            System.out.print("Digite o primeiro valor: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite o segundo valor: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            
            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
            
            System.out.println("Resultado: " + resultado);
        }
        
        scanner.close();
    }
}