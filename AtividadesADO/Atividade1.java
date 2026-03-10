import java.util.Scanner;
public class Atividadde1ADO {
    static Scanner leia = new Scanner(System.in);

    static void CarroUm(){
        String modelo = "Camaro";
        double valor = 1000000;
        double desconto = 0.20;
        double valor_total = valor * (1 - desconto);
        System.out.printf("Modelo: %s | Valor: %d\nDesconto: 20% | Valor Total: %d",modelo,valor,valor_total);
    }
    static void CarroDois(){
        String modelo = "Chevette";
        double valor = 1500000;
        double desconto = 0.15;
        double valor_total = valor * (1 - desconto);
        System.out.printf("Modelo: %s | Valor: %d\nDesconto: 15% | Valor Total: %d",modelo,valor,valor_total);
    }
    static void CarroTres(){
        String modelo = "Corverte";
        double valor = 2300000;
        double desconto = 0.10;
        double valor_total = valor * (1 - desconto);
        System.out.printf("Modelo: %s | Valor: %d\nDesconto: 10% | Valor Total: %d",modelo,valor,valor_total);
    }
    public static void main(String[] args){
        System.out.println("==== COMPRAR CARROS ====");
        System.out.println("1- Camaro (R$100.000)");
        System.out.println("2- Chevette (R$150.000)");
        System.out.println("3- Corvete (R$230.000)");
        System.out.println("0- Sair da Loja");
        int escolha = leia.nextInt();
        while (escolha < 0 || escolha > 3) {
            System.out.println("Opção inválida! Tente novamente: ");
            escolha = leia.nextInt();
        }
        switch (escolha){
            case 1:
                    System.out.println("Você selecionou o Camaro!");
                    CarroUm();
                    break;
            case 2:
                System.out.println("Você selecionou o Chevette!");
                CarroDois();
                break;
            case 3:
                System.out.println("Você selecionou o Corvete!");
                CarroTres();
                break;
            default:
                return;
            }

    }
}