import java.util.Scanner;
public class MilhaParaKM{


    public static void main(String[] args) {
        double milhas;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a distância em milhas que você quer converter para Kilometros: ");
        milhas = scanner.nextDouble();

        double km = milhas * 1.609;

        System.out.printf("%.0f milhas equivalem a %.2f Kilometros.", milhas, km);
        scanner.close();
    }
}