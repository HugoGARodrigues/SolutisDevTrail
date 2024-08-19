import java.util.Scanner;

public class AreaCirculo{

    public static final double PI = 3.14159;

    public static void main(String[] args){
        double areaTotalCirculo = 0;
        

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        areaTotalCirculo = PI*(raio*raio);
        areaTotalCirculo = Math.round(areaTotalCirculo);

        System.out.println("A area do circulo é: " + areaTotalCirculo);
        scanner.close();


    }


}