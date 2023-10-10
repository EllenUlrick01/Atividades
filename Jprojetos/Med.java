import java.util.Scanner;
public class Med {
    public static void med(String[] args) {
        Scanner scMedia = new Scanner(System.in);
        System.out.print("Quantos números você deseja calcular média?");
        int qtdNumeros=scMedia.nextInt();

        double somar = 0;

        for (int i = 1;  i <= qtdNumeros; i++) {
            System.out.print("Digite o número" + i + ":");
            double numMedia = scMedia.nextDouble();
            somar += numMedia;
        }
        double media = somar /qtdNumeros;

        System.out.print("A média dos dois numeros é:" + media);

    }
}