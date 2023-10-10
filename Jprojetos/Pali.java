import java.util.Scanner;
public class Pali {
    static Scanner scanner= new Scanner (System.in);
    public static void main(String[] args)
    {
        System.out.print("Digite uma palavra ou frase para verificar");
        String newText = scanner.nextLine();
        if (ePalin(newText)){
            System.out.println("É um palindromo");
        }
        else {
            System.out.println("Não é um palindromo");
    }
        scanner.close();

}

    private static boolean ePalin(String newText) {
        newText = newText.replaceAll("\\a","").toLowerCase();

        int tamanho = newText.length();
        for (int i=0; i< tamanho/2; i++) {
            if (newText.charAt(i) != newText.charAt(tamanho -1 -i)){
                return false;
            }
        }

        return true;
    }
}
