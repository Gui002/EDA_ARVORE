/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvore;

/**
 *
 * @author Gabriel
 */
public class Arvore_Binaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arvore <Integer> arvore = new Arvore<Integer> ();
        arvore.insert(10);
        arvore.insert(8);
        arvore.insert(5);
        arvore.insert(9);
        arvore.insert(7);
        arvore.insert(18);
        arvore.insert(13);
        arvore.insert(20);
        
        System.out.println("\nIn-Order");
        System.out.println("=======================================");
        arvore.inOrder(arvore.getRoot());
        
        
        System.out.println("\nPre-Order");
        System.out.println("=======================================");
        arvore.preOrder(arvore.getRoot());
        

        System.out.println("\nPost-Order");
        System.out.println("=======================================");
        arvore.postOrder(arvore.getRoot());
        
        System.out.println("\nExiste 21? "+arvore.contem(21));
        System.out.println("\nExiste 20? "+arvore.contem(20));
        
    }
    
}
