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
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Guilherme Jacob Panguana");
            ArvoreBinaria<Integer> n = new ArvoreBinaria();
            n.adicionar(10);
            n.adicionar(8);
            n.adicionar(15);
            n.printInorder();
            System.out.println("-----");
            n.printPreorder();
            System.out.println("-----");
            n.printPreorder();
        
   }
    
}