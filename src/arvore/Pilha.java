/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Pilha {

    private ArrayList<Integer> a;
    private int topo;

    public Pilha() {
        a = new ArrayList();
        topo = 0;
    }

    public int pop() {
        topo--;
        return a.get(topo);
    }

    public void push(int valor) {
        a.add(valor);
        topo++;

    }

    public int getTopo() {
        return topo;
    }

}
