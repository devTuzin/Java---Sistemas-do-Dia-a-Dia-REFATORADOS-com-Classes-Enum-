package Sistema_De_Compra_Online_Refatorado_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {
    private Cliente cliente;
    private String pagamento;
    private double total = 0;
    private double frete = 0;

    private static int lerInteiro(Scanner sc, String mensagem){
        while (true){
            try {
                System.out.println(mensagem);
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e){
                System.out.println("Erro: Digite apenas números inteiros");
                sc.nextLine();
            }
        }
    }
    private static double lerDouble(Scanner sc, String mensagem){
        while (true){
            try{
                System.out.println(mensagem);
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e){
                System.out.println("Erro: Digite apenas numeros");
                sc.nextLine();
            }
        }
    }
    public void adicionarProdutos(){
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            double valorProduto = lerDouble(sc, "Digite o valor do produto");
            int quantidade = lerInteiro(sc, "Digite a quantidade");
        }
    }
}
