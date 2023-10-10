import java.util.Scanner;

public class Mainu {
    static Scanner inpuTemp= new Scanner(System.in);
    static double numTemp;
    static double resulTemp;
    static char opcao;

    public static void main(String[] args) {
        System.out.println("Digite o valor que deseja converter");
        opcao = inpuTemp.next().charAt(0);

        if (opcao == 'C' || opcao == 'c'){
            resulTemp =(numTemp *1.8) + 32;
            System.out.println("resultado" + resulTemp + "º");
        }
        else if (opcao == 'F'|| opcao=='f') {
            resulTemp = (numTemp -32)/1.8;
            System.out.printf("resultado:" + resulTemp + "º");
        }
        else {
            System.out.println("opção inválida. Por favor, digite 'C' ou 'F'.");
        }

        inpuTemp.close();

    }
}