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
public class ArvoreBinaria<TIPO extends Comparable> {

    private No<TIPO> raiz;
    private int numElementos;

    ArvoreBinaria() {
        this.raiz = null;
        numElementos = 0;
    }

    public void adicionar(TIPO valor) {
        No<TIPO> novoValor = new No(valor);

        if (this.raiz == null) {
            this.raiz = novoValor;
            numElementos++;

        } else {
            No<TIPO> actual = raiz;
            while (true) {
                if (novoValor.getValor().compareTo(actual.getValor()) == -1) {
                    if (actual.getFilhoEsquerdo() == null) {
                        actual.setFilhoEsquerdo(novoValor);
                        numElementos++;

                        break;
                    } else {
                        actual = actual.getFilhoEsquerdo();
                    }
                } else if (novoValor.getValor().compareTo(actual.getValor()) == 1) {
                    if (actual.getFilhoDireito() == null) {
                        actual.setFilhoDireito(novoValor);
                        numElementos++;

                        break;
                    } else {
                        actual = actual.getFilhoDireito();
                    }
                }
            }
        }
    }
    
    
    //Gambiara 
    public void printInorder(){
        imprimirEmOrdem(this.raiz);
    }
    public void printPostorder(){
        imprimirPosOrdem(this.raiz);
    }
    public void printPreorder(){
        imprimirPreOrdem(this.raiz);
    }
    //
    private void imprimirEmOrdem(No<TIPO> actual) {
        if (actual != null) {
            imprimirEmOrdem(actual.getFilhoEsquerdo());
            System.out.println(actual.getValor());
            imprimirEmOrdem(actual.getFilhoDireito());
        }
    }

    private void imprimirPreOrdem(No<TIPO> actual) {
        if (actual != null) {
            System.out.println(actual.getValor());
            imprimirPreOrdem(actual.getFilhoEsquerdo());
            imprimirPreOrdem(actual.getFilhoDireito());
        }
    }

    private void imprimirPosOrdem(No<TIPO> actual) {
        if (actual != null) {
            imprimirPosOrdem(actual.getFilhoEsquerdo());
            imprimirPosOrdem(actual.getFilhoDireito());
            System.out.println(actual.getValor());
        }
    }

    public No<TIPO> getRaiz() {
        return raiz;
    }

    public void setRaiz(No<TIPO> raiz) {
        this.raiz = raiz;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

}
