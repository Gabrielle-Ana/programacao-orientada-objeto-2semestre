package atividade3; //n entendi qual o problema aqui

import java.util.ArrayList;
import java.util.List;

public class SistemaDeGerenciamentoDeEstoque {

    private List<Produto> listaProdutos; // é a lista (classe pai)

    public SistemaDeGerenciamentoDeEstoque () {
        listaProdutos = new ArrayList<>(); // puxa a lista (herda as funções da lista, implementa os métodos)
    }

    //Nome: adicionarItem
	//Descrição: adicionar itens
	//Entrada: nome e quantidade do produto
	//Saida: nenhum
    public void adicionarProduto(String nome, int qtdProd) {
        Produto prodNovo = new Produto(nome, qtdProd);
        listaProdutos.add(prodNovo);
    }

    //Nome: listarItens
	//Descrição: apresentar a lista de produtos
	//Entrada:nenhum
	//Saida: nenhum
    public void listarItens() {
        System.out.println("Produto - Quantidade" );
        for (Produto item : listaProdutos) {
            System.out.println(item.getNome() + " - " + item.getQuantidade());
        }
    }

    //Nome:
	//Descrição:
	//Entrada:
	//Saida
    public void atualizarProduto(String nome, int novaQuantidade) {
        for (Produto item : listaProdutos) {
            if (item.getNome().equals(nome)) {
                item.setQuantidade(novaQuantidade);
                break;
            }
        }
    }
    //Nome: removerProduto
	//Descrição: remover um produto da lista
	//Entrada: nome do produto (nome)
	//Saida: nenhum
    public void removerProduto (String nome) {
        listaProdutos.removeIf(item -> item.getNome() .equals(nome));
    }
//quando eu tiro o comentário daqui dá problema, pq ????
}
    