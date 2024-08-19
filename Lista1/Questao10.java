import java.util.Scanner;

public class ContaCaracter{

    public static void main(String[] args){

        int contadorVogais = 0, contadorVazio = 0, contadorConsoante=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavras = scanner.nextLine().toLowerCase();

        for (int i = 0; i < palavras.length(); i++){
            char letra = palavras.charAt(i);


            if(letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contadorVogais++;
            }else if(letra == ' '){
                contadorVazio++;
            }else{
                contadorConsoante++;
            }

        }


        System.out.println("Quantidade de vogais: " + contadorVogais);
        System.out.println("Quantidade de caracteres vazios: " + contadorVazio);
        System.out.println("Quantidade de consoantes: " + contadorConsoante);

        scanner.close();
    }

}