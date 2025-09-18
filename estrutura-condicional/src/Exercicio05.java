/*Com base na tabela abaixo, escreva um programa que leia o código de um item e 
a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.*/
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do item:");
        int codigo = sc.nextInt();
        System.out.println("Digite a quantidade do item:");
        int quantidade = sc.nextInt();

        double total = 0;
        String item = "";

        if (codigo == 1) {
            total = quantidade * 4;
            item = "CACHORRO QUENTE";
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            item = "X-SALADA";
        } else if (codigo == 3) {
            total = quantidade * 5;
            item = "X-BACON";
        } else if (codigo == 4) {
            total = quantidade * 2;
            item = "TORRADA SIMPLES";
        } else if (codigo == 5) {
            total = quantidade * 1.50;
            item = "REFRIGERANTE";
        } else {
            item = "Item Inválido";
        }
        System.out.printf("%s%nTotal: R$ %.2f%n", item, total);
        sc.close();
    }
}
