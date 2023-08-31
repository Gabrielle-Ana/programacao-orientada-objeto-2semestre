package atividade3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       
        @SuppressWarnings("resource") //o q é isso 
        Scanner scanner = new Scanner(System.in);
        SistemaDeGerenciamentoDeEstoque estoque = new SistemaDeGerenciamentoDeEstoque();
        String nome = null;
        int quantidade, opcao;

        while (true) {
            System.out.println(" *** Menu *** ");
			System.out.println("1. Adicionar item");
			System.out.println("2. Listar itens");
			System.out.println("3. Atualizar quantidade");
            System.out.println("4. Remover itens");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após o número
    
            switch(opcao) {
            case 1: //	Adicionar item
            	System.out.print("Nome do item: ");
                nome = scanner.nextLine();
                System.out.print("Quantidade: ");
                quantidade = scanner.nextInt();
                estoque.adicionarProduto(nome, quantidade);
                break;
            case 2: //	Listar itens
            	estoque.listarItens();
                break;
            case 3: //	Atualizar quantidade
                System.out.print("Nome do item: ");
                nome = scanner.nextLine();
                System.out.print("Nova quantidade: ");
                quantidade = scanner.nextInt();
                estoque.atualizarProduto(nome, quantidade);
                break;
            case 4: //	Remover item
            	System.out.print("Nome do item: ");
                nome = scanner.nextLine();
                estoque.removerProduto(nome);
                break;
            case 5:	// Sair
                System.out.println("Saindo do programa.");
                return;
            default:
                System.out.println("Opção inválida.");
            }
            
        }
    }

}
