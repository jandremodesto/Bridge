package br.metodista.dp.bridge;

import java.util.Locale;

/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura: Brigde
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  27/08/2018 - domingo
 */
public class Produto {
        private String nome;
        private String descricao;
        private double preco;
        //Incluindo atributo desconto.
        private Descontos desconto;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    //Get e set desconto
    public Descontos getDesconto() {
        return desconto;
    }
    public void setDesconto(Descontos desconto) {
        this.desconto = desconto;
    }
    //Incliindo um método valorComDesconto
    public double valorComDesconto(){
        if(desconto != null){
            return desconto.valorComDesconto(preco);
        }else{
            return preco;
        }
    }
    @Override
    public String toString() {
        return String.format(new Locale("pt","BR"),
               "Produtos:%s\nDescricao:%s\nValor:%2f\nPor:%2f"
               ,nome,descricao,preco,valorComDesconto());
    }
}
