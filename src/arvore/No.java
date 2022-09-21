/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author ADMIN
 */
public class No<TIPO> {
    private No<TIPO> filhoEsquerdo;
    private No<TIPO> filhoDireito;
    private TIPO valor;
    
    No(TIPO novoValor){
        this.valor = novoValor;
        this.filhoDireito = null;
        this.filhoEsquerdo= null;
    }

    public No<TIPO> getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(No<TIPO> filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public No<TIPO> getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(No<TIPO> filhoDireito) {
        this.filhoDireito = filhoDireito;
    }

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }
    
    
}
