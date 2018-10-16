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
public class DescontoDiaProgramador extends Descontos {
    private double desconto = 0.5;
    
    @Override
    public double getDesconto() {
        return desconto;
    }
}
