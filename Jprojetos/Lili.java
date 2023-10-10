import java.util.Random;
import java.util.Scanner;
public class Lili {
    public static void main(String[] args) throws InterruptedException {


        Random random = new Random();

        int randomNumber = random.nextInt(100);
        int numRad;

        do {
            Scanner inputRad = new Scanner(System.in);
            System.out.println("Digite um valor");
            numRad = inputRad.nextInt();
            if (numRad < randomNumber) {
                System.out.println("O numero informado é maior");
            } else if (numRad > randomNumber) {
                System.out.println("O numero informado é menor");
            }
        } while (randomNumber != numRad);

        System.out.println("você acertou");
    }
}
