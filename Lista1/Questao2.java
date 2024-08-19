public class RetornaMaior{
    public static int maior(int a, int b){
        return (a > b)? a : b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println(maior(num1, num2));
    }
}