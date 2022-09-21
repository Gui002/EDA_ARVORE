/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author Gabriel
 */
public class Elemento <Object> {
    
    private Object valor;
    private Elemento <Object> left;
    private Elemento <Object> right;
    
    
    public Elemento (Object novoValor){
        this.valor = novoValor;
    }
    
    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Elemento<Object> getLeft() {
        return left;
    }

    public void setLeft(Elemento<Object> left) {
        this.left = left;
    }

    public Elemento<Object> getRight() {
        return right;
    }

    public void setRight(Elemento<Object> right) {
        this.right = right;
    }
    
    
}
