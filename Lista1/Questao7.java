public class DivisaoPor2Multiplo3{


    public static void main(String[] args){

        for (int i = 1; i<=100; i++){
            if (i % 3 == 0){
                int multiplo3Int = i/2;
                double multiplo3Double = (double)i/2;

                System.out.println("Número: " + i + ", Divisão por 2 e resultado inteiro: " + multiplo3Int + ", Divisão por 2 e resultado double: " + multiplo3Double);

            }
        }

    }

}
