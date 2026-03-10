import java.util.Scanner;
public class Atividade2 {
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Digite um ano para verificar se é bissexto: ");
        int ano = leia.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.printf("O ano %d é bissexto!", ano);
        } else {
            System.out.printf("O ano %d não é bissexto!", ano);
        }
    }
}