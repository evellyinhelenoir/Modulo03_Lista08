package br.com.zup;

import java.util.Scanner;

public class Sistema {
    public static void menu(){
        System.out.println("Bem vindo ao sistema de cardápios.\n" +
                "Digite 1 para adiconar um novo cardápio.\n" +
                "Digite 2 para exibir os cardápios.\n" +
                "Digite 3 para sair do programa.");
    }
    public static Scanner capturarDados(String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static Prato adicionarPratos (){
        String nome = capturarDados("Digite o nome do prato:").nextLine();
        String ingredientes = capturarDados("Digite os ingredientes do prato:").nextLine();
        String valor = capturarDados("Digite o valor do prato:").nextLine();

        Prato novoPrato = new Prato(nome, valor);
        return novoPrato;
    }
    public static void executar(){
        boolean loop = true;


        while (loop){
            Cardapio cardapio = new Cardapio();

            int opcao = new Scanner(System.in).nextInt();
            int qtdPratos = capturarDados("Digite a quantidade de pratos que deseja adicionar: ").nextInt();

            if (opcao == 1){

            for (int contador = 0; contador < qtdPratos; contador ++){

                Prato prato = adicionarPratos();

                }

            }else if (opcao == 2){
                System.out.println(cardapio);
            }
        }
    }
}
