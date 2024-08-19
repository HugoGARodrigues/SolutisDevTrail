import java.util.Scanner;


public class Palindromo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String invertida = new StringBuilder(palavra).reverse().toString();

        if(palavra.equals(invertida)){
            System.out.println("A palavra " + palavra + " pode ser lida igualmente de trás para frente");
        } else{
            System.out.println("A palavra " + palavra + " não pode ser lida igualmente de trás para frente");
        }
        scanner.close();
        }
        
        
    }

