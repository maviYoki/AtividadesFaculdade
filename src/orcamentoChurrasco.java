import java.util.Scanner;
public class orcamentoChurrasco {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Quantidade de pessoas para o churrasco: ");
        var quantidadePessoas = sc.nextInt();
        System.out.print("Valor da carne R$ ");
        var valorCarne = sc.nextInt();
        var valorTotalCarne = (0.150*quantidadePessoas)*valorCarne;
        System.out.print("Quantidade de cervejas: ");
        var quantidadesCerveja = sc.nextInt();
        System.out.print("Valor de cada cervejas: ");
        var valorCerveja = sc.nextDouble();
        System.out.print("Quantidade de refrigerantes: ");
        var quantidadeRefrigerantes = sc.nextInt();
        System.out.print("Valor de cada refrigerante");
        var valorRefrigerante = sc.nextInt();
        var valorTotal = (quantidadesCerveja*valorCerveja)+(quantidadeRefrigerantes*valorRefrigerante)+valorTotalCarne;
        System.out.printf("O valor total do churrasco é R$  %.2f", valorTotal);
    }
}
