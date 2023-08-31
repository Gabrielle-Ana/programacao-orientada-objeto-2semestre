package atividade3;

public class Produto {
 
    private String nome;
    private int quantidade;

    //Nome: Sistema de Gerenciamento de Estoque
	//Descrição: inicializar a classe
	//Entrada: string nome do produto (nomeAux) e o numero de quantidade de produto (qtdAux)
	//Saida: nenhum
    public Produto(String nomeAux, int qtdAux) {
        this.nome = nomeAux;
        this.quantidade = qtdAux;
    }

    //Nome: getNome
	//Descrição: saber o nome do produto
	//Entrada: nenhuma
	//Saida: nome do produto
    public String getNome() {
        return nome;
    }

    //Nome: setNome
	//Descrição: atribuir o nome do produto
	//Entrada: nome do produto
	//Saida: nenhum retorno
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //Nome: setQuantidade
	//Descrição: atribui(dar o valor) a quantidade de produtos
	//Entrada: a quantidade de produtos
	//Saida: nenhum
     public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Nome: getQuantidade
	//Descrição: retorna a quantidade de produtos
	//Entrada: nenhum
	//Saida: quantidade de produtos
    public int getQuantidade() {
        return quantidade;
    }

}
