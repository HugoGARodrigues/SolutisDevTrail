import java.util.Scanner;


public class PrimoMenor{

    public static boolean Primo(int num) {
        if (num <= 1 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();


        System.out.println("Número primos menores que "+num+":");

        for (int i = 2; i < num; i++){
            if (Primo(i)) {
                System.out.print(i + " ");
            }

        }

    scanner.close(); 

    }

}