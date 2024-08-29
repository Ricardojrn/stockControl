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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade){
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Saída de estoque realizada com sucesso.");
        }else {
            System.out.println("Quantidade insuficiente em estoque");
        }
    }

    @Override
    public String toString(){
        return "medicamento: "+ nome + " " + concentracao + " | " + preco + "R$ | estoque: " + quantidadeEstoque;
    }
}
