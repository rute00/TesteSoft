//ATIVIDADE INSPEÇÃO DE CÓDIGO  - Aluna: Rute TIA: 41923111

package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;


public class TicketMachine {

     
    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) { //Não da para saber se valor refere a cliente ou máquina - COMPUTAÇÃO
        this.valor = valor;
        this.saldo = 0;
    }

    //faltou código Exception - COMISSÃO
    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false; 

//valor não é adicionado pelo sistema - COMISSÃO
        
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) { //vetor não deve ter o valor 1, deveria ser [i] - CONTROLE
                achou = true;
            }
        }
       
        if (!achou) { // variavel 'achou' não faz sentido estar aqui - COMPUTAÇÃO
            throw new PapelMoedaInvalidaException();
        }
        this.saldo += quantia; // variavel quantia não foi inicializada - INICIALIZAÇÃO
    }

    public int getSaldo() {
        return saldo;
    }

    //nada está sendo retornado ao método getTroco - COMISSÃO
    public Iterator<Integer> getTroco() {
        return null;
    }

    
    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
        // variavel 'result' não foi inicializada - INICIALIZAÇÃO
    }
}
