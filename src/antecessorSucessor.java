import java.util.Scanner;

public class antecessorSucessor {
    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        var sc = new Scanner(System.in);
        var n = sc.nextInt();
        var predecessor = n-1;
        var succesor = n+1;
        System.out.printf("O número sucessor do valor informado é %d%n", succesor);
        System.out.printf("E o número antecessor é %d%n", predecessor);
        }
}
