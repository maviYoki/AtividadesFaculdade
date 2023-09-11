import java.util.Scanner;
public class salario {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Salario base: ");
        var salarioBase = sc.nextDouble();
        System.out.print("Bonus salarial: ");
        var bonus = sc.nextDouble();
        System.out.print("Imposto de renda: ");
        var impostoDeRenda = sc.nextDouble();
        var totalSalario = (salarioBase+bonus)-impostoDeRenda;
        System.out.printf("Seu salario é R$  %.2f", totalSalario);
    }
}
