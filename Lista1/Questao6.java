

public class ProdutoImpares{
    
    public static boolean eImpar(int num){
        return (num%2 == 0)? false : true ;
    }

    public static boolean eImpar(float num){
        return (num%2 == 0)? false : true ;
    }

    public static void main(String[] args){
        
        int produto = 1;
        float produtoFloat = 1;

        for (int i=15; i<31; i++){
            if (eImpar(i)){
                produto *= i;
            }
        }
        
        for (int i=15; i<31; i++){
            if (eImpar((float)i)){
                produtoFloat *= (float)i;
            }
        }

        System.out.println("O produto dos números inteiros ímpares entre 15 e 30 é: " + produto);
        System.out.println("O produto dos números de ponto flutuante ímpares entre 15 e 30 é: " + produtoFloat);


    }
}