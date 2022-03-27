//ATIVIDADE INSPEÇÃO DE CÓDIGO  - Aluna: Rute TIA: 41923111

package br.calebe.ticketmachine.core;


public class PapelMoeda {
//essas variaveis não devem estar nessa classe PapelMoeda
    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
