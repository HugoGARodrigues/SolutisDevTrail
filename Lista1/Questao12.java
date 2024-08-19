import java.util.Scanner;
public class TanquesKm{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int continuar = 0;
        float kmPorLitro = 0;
        int kmDirigido = 0, litrosDeGasolina = 0, kmTotal = 0, litrosTotal = 0;
        while(true){
            System.out.println("Você deseja inserir informações sobre seu tanque de gasolina e autonomia?: Insira o numero 1");
            System.out.println("Você deseja finalizar o programa?: Insira o numero 0");
            continuar = scanner.nextInt();

            if(continuar == 1){
                

                System.out.println("Digite a quantidade de km dirigidos: ");
                kmDirigido = scanner.nextInt();

                System.out.println("Digite a quantidade de litros de gasolina usada: ");
                litrosDeGasolina = scanner.nextInt();

                kmTotal += kmDirigido;
                litrosTotal += litrosDeGasolina;
                kmPorLitro = (float) kmTotal / litrosTotal;

                System.out.printf("A média da autonomia dos seus tanques até aqui é %.2f km/l\n", kmPorLitro);
                System.out.println("A quilometragem combinada até aqui é de : " + kmTotal);
                System.out.println("A soma total de litros de combustível até aqui é de : " + litrosTotal);
            }else if(continuar == 0){
                System.out.println("Programa encerrado!");
                System.out.println("Valores finais:");
                System.out.printf("A média da autonomia dos seus tanques até aqui é %.2f km/l\n", kmPorLitro);
                System.out.println("A quilometragem combinada até aqui é de : " + kmTotal);
                System.out.println("A soma total de litros de combustível até aqui é de : " + litrosTotal);

                break;
            }else{
                System.out.println("Opção inválida. Insira o número 1 ou 0");
            }
        }



    }

}