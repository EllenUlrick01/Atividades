import java.util.Scanner;

public class Um {
    public static void main (String[] args) {
        Scanner inputBuffer = new  Scanner (System.in);

        System.out.println("Escreva o primeiro numero ");
        int num1 = inputBuffer.nextInt();
        
        System.out.println("Escreva o segundo numero ");
        int num2 = inputBuffer.nextInt();
        
        System.out.println(
            String.format("A soma dos dois numeros é  %s", (num1 + num2))
        );
        
    }    
}
