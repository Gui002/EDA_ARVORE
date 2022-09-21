/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author Gabriel
 */
public class Arvore <Object extends Comparable> {//Comparable serve para comparar dois objectos
    private Elemento <Object> root;
    
    public Arvore(){
        this.root = null;
    }
    
    public void insert(Object object){
        Elemento <Object> novoElemento = new Elemento <Object> (object);
        if(root == null){
            this.root = novoElemento;
        }else {
            Elemento <Object> atual = this.root;//atual serve para marcar a raíz
            while(true){
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1){ //-1 -> Menor
                    if(atual.getLeft()!=null){
                        atual = atual.getLeft();
                    }else{
                        atual.setLeft(novoElemento);
                    }
                }else{ //se for maior ou igual
                    if(atual.getRight() != null){
                        atual = atual.getRight();
                        
                    }else{
                        atual.setRight(novoElemento);
                    }
                }
            }
        
        }
        
        
    }
    
    public Elemento <Object> getRoot(){
        return root;
    }
    
    
    public void inOrder(Elemento <Object> atual){
       
          if(atual!=null){
              inOrder(atual.getLeft());
              System.out.println(atual.getValor());
              inOrder(atual.getRight());
          }     
     }
}
