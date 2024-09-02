package org.control;

public class Medicamento {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String concentracao;
    private String laboratorio;
    private String apresentacao;

    //Construtores
    public Medicamento(String nome, double preco, String concentracao,
                       String apresentacao, String laboratorio){
        this.nome = nome;
        this.concentracao = concentracao;
        this.apresentacao = apresentacao;
        this.laboratorio = laboratorio;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }
    //Getters e setters
    public String getNome() {
        return nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque = quantidade;
    }

    @Override
    public String toString(){
        return "medicamento: "+ nome + " " + concentracao + " | Laboratório: "+ laboratorio+ " | preço: " + preco + " R$ | estoque: " + quantidadeEstoque;
    }
}
