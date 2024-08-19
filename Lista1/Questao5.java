import java.util.Scanner;
import java.util.Arrays;

public class DiaSemana{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String diasSemana[] = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira","Sabado", "Domingo"};
        int numero;
        
        System.out.println("Insira um numero de 1 a 7");
        numero = scanner.nextInt();

        System.out.println(diasSemana[numero-1]);

        scanner.close();



    }
}