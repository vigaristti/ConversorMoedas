import moeda.conversor.modelos.ConverteAPI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverteAPI converteAPI = new ConverteAPI();
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("******************************************");
            System.out.println("Bem-vindo/a ao Conversor de Moeda");
            System.out.println(" ");
            System.out.println("Opções de conversão:");
            System.out.println("1) Peso argentino [ARS] >>>> Real Brasileiro [BRL]");
            System.out.println("2) Boliviano boliviano [BOB] >>>> Real Brasileiro [BRL]");
            System.out.println("3) Real Brasileiro [BRL] >>>> Dólar americano [USD]");
            System.out.println("4) Peso chileno [CLP] >>>> Real Brasileiro [BRL]");
            System.out.println("5) Peso colombiano [COP] >>>> Real Brasileiro [BRL]");
            System.out.println("6) Dólar americano [USD] >>>> Real Brasileiro [BRL]");
            System.out.println("7) Sair");
            System.out.println("******************************************");
            System.out.println("Escolha a conversão que gostaria de ser feita:");
            int escolha = scanner.nextInt();

            if (escolha == 7) {
                System.out.println("Encerrando programa");
                break;
            }

            System.out.println("Digite a quantidade a ser convertida:");
            double valor = scanner.nextDouble();

            double resultado = 0;

            switch (escolha) {

                case 1:
                    resultado = converteAPI.conversor("ARS", "BRL", valor);
                    System.out.printf(valor + "[ARS] é igual a " + resultado + "[BRL]\n");
                    break;
                case 2:
                    resultado = converteAPI.conversor("BOB", "BRL", valor);
                    System.out.printf(valor + "[BOB] é igual a " + resultado + "[BRL]\n");
                    break;
                case 3:
                    resultado = converteAPI.conversor("BRL", "USD", valor);
                    System.out.printf(valor + "[BRL] é igual a " + resultado + "[USD]\n");
                    break;
                case 4:
                    resultado = converteAPI.conversor("CLP", "BRL", valor);
                    System.out.printf(valor + "[CLP] é igual a " + resultado + "[BRL]\n");
                    break;
                case 5:
                    resultado = converteAPI.conversor("COP", "BRL", valor);
                    System.out.printf(valor + "[COP] é igual a " + resultado + "[BRL]\n");
                    break;
                case 6:
                    resultado = converteAPI.conversor("USD", "BRL", valor);
                    System.out.printf(valor + "[USD] é igual a " + resultado + "[BRL]\n");
                    break;
                default:
                    System.out.println("Opção não disponivel");
                    break;
            }
        } while (true);
    }
}