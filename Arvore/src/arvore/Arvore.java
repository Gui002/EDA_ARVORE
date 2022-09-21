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
                        break;
                    }
                }else{ //se for maior ou igual
                    if(atual.getRight() != null){
                        atual = atual.getRight();
                        
                    }else{
                        atual.setRight(novoElemento);
                        break;
                    }
                }
            }
        
        }
        
        
    }
    
    public Elemento <Object> getRoot(){
        return root;
    }
    
    
    public boolean contem(Object valor){
        //Buscar o elemento na arvore
        
        Elemento <Object> atual = this.root;
        Elemento <Object> pai = this.root;
        boolean filho_esq = false;
        
        
        if(root == null){ //Se a arvore estiver vazia, retorna false
            return false;
        }
        while(atual.getValor()!=valor){ //enquanto não encontrou
            pai = atual;
            if(valor.compareTo(atual.getValor()) == -1){ //caminha para esquerda
               atual = atual.getLeft(); 
               filho_esq = true; // é filho a esquerda? Sim
               
            }else{ //caminha para direita
                atual = atual.getRight();
                filho_esq = false; // é filho a esquerda? Não
            } 
            if(atual == null)
                return false; // encontrou uma folha -> sai;
        }
        return true;
    }
    
    
    
    
    
    public void inOrder(Elemento <Object> atual){
       
          if(atual!=null){
              inOrder(atual.getLeft());
              System.out.println(atual.getValor());
              inOrder(atual.getRight());
          }     
     }
    
      
    public void preOrder(Elemento <Object> atual){
       
          if(atual!=null){  
              System.out.println(atual.getValor());
              preOrder(atual.getLeft());
              preOrder(atual.getRight());
          }     
     }
    
      
    public void postOrder(Elemento <Object> atual){
       
          if(atual!=null){  
              postOrder(atual.getLeft());
              postOrder(atual.getRight());
              System.out.println(atual.getValor());
          }     
     }
}
