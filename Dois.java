import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner inputBuffer = new Scanner (System.in);
        
        System.out.println ("Escreva um numero para verificar");
        int Num = inputBuffer.nextInt();

        int i = Num;

        if (i %2 == 0){
             System.out.println ("É Par");
        }
        else {
             System.out.println ("É impar");
        }

    }
}