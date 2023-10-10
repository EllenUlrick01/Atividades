
import java.util.Scanner;

public class Maine {static void Maine() {
}
    static void Maine(String[] args) {
    Scanner inpuTabu = new Scanner(System.in);
    System.out.print("Insira o numero que você pretende calcular a tabuada" );
    int numBase = inpuTabu.nextInt();

    for (int i =1; i <10; i ++){
        int resultado= numBase * i;
        System.out.println(numBase + "x" + i + "=" +resultado);

        }
    }
}