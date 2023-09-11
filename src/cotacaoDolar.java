import java.util.Scanner;
public class cotacaoDolar {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Informe a cotação atual do dólar em reais: R$ ");
        var cotacaoDolar = sc.nextDouble();
        System.out.print("Informe seu saldo em dólar: $ ");
        var saldoAtual = sc.nextDouble();
        var saldoEmDolar = cotacaoDolar*saldoAtual;
        System.out.printf(" O valor do seu saldo em reais é  R$ %.2f",saldoEmDolar);
    }
}
