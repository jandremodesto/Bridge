package br.metodista.dp.bridge;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação II
 * Padrão de projeto de Estrutura: Brigde
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  27/08/2018 - domingo
 */
public abstract class Descontos {
   
    //Método que não é abstrato
    public double valorComDesconto(double preco){
        return preco *(1.0 - getDesconto());
    } 
    public abstract double getDesconto();
}
