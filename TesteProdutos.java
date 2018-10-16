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
public class TesteProdutos  {
    public static void main(String[] args) {
        Produto livro = new Produto();
        livro.setNome("Ops! A memória sumiu? - Escovando bists");
        livro.setDescricao("Romance sobre como a memória sumiu, a aplicação fugiu e o "
                            + "servidor caiu. Autor:José da Collections");
        livro.setPreco(30.0);
        // livro.setDesconto(0.15);
        livro.setDesconto(new DescontoDiaProgramador());
        System.out.println(livro.toString()+"\n");
        
        Produto livro2 = new Produto();
        livro2.setNome("Java para todos - Além do mimimi.");
        livro2.setDescricao("Aprendendo a programar sem reclamar. Autor:James Null Pointer.");
        livro2.setPreco(25.0);
       // livro2.setDesconto(0.15);
       livro2.setDesconto(new DescontoLivros());
       System.out.println(livro2.toString());
    }
}
