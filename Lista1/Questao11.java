import java.util.Scanner;

public class DuasPalavras{

    public static void main(String[] args){
        

        String palavra1, palavra2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a primeira palavra:");
        palavra1 = scanner.nextLine();
        
        System.out.println("Insira a segunda palavra:");
        palavra2 = scanner.nextLine();

        if(palavra1.compareTo(palavra2)<0){
            System.out.println(palavra1 + " vem antes de " + palavra2);
        
        }else if(palavra1.compareTo(palavra2)>0){
            System.out.println(palavra2 + " vem antes de " + palavra1);
        }else{
            System.out.println("As palavras são iguais");
        }
        
        if (palavra1.length()>palavra2.length()){
            System.out.println("A palavra " + palavra1 + " é mais longa que " + palavra2); 
        }else if(palavra1.length()< palavra2.length()){
            System.out.println("A palavra " + palavra2 + " é mais longa que " + palavra1);

        }else{
            System.out.println("A palavra " + palavra1 + " e a palavra " + palavra2 + " possuem a mesma quantidade de caracteres");
        }

        scanner.close();

    }

}