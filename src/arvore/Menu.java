package arvore;

import java.io.*;

public class Menu {

    private int resp, resp2, valor;
    BufferedReader in;
    private ArvoreBinaria<Integer> arvore, arvore2;
    private Pilha pilha;

    Menu() throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        arvore = new ArvoreBinaria();
        arvore2 = new ArvoreBinaria();
        pilha = new Pilha();
        System.out.println("ARVORE BINARIA");
        do {
            System.out.println("1-Adicionar");
            System.out.println("2-Imprimir em ordem");
            System.out.println("3-Imprimir em pre-ordem");
            System.out.println("4-Imprimir em pos-ordem");
            System.out.println("5-Contem");
            System.out.println("6-Conta Nos");
            System.out.println("7-PILHA---ARVORE");
            System.out.println("8-Conta Folhas");
            System.out.println("9-Nivel");
            System.out.println("10-Sair");
            resp = Integer.parseInt(in.readLine());
            switch (resp) {
                case 1:
                    do {
                        System.out.print(">> ");
                        valor = Integer.parseInt(in.readLine());
                        arvore.adicionar(valor);
                        System.out.println("Adicionar outro 1-SIM || 2-Nao :");
                        resp2 = Integer.parseInt(in.readLine());
                    } while (resp2 != 2);
                    break;
                case 2:
                    System.out.print("|| ");
                    arvore.printInorder();
                    System.out.print(" ||");
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("|| ");
                    arvore.printPreorder();
                    System.out.print(" ||");
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("|| ");
                    arvore.printPostorder();
                    System.out.print(" ||");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Coloque numero que deseja procura");
                    System.out.print(">> ");
                    valor = Integer.parseInt(in.readLine());
                    if (arvore.contem(valor)) {
                        System.out.println("O valor " + valor + " e um elemento da arvore");
                    } else {
                        System.out.println("O valor " + valor + "nao conta na arvore");

                    }
                    break;
                case 6:
                     System.out.println("A arvore tem " + arvore.contaNos(arvore.getRaiz()) + " Elementos");
                    break;
                case 7:
                    pilha.push(1);
                    pilha.push(4);
                    pilha.push(5);
                    pilha.push(8);
                    pilha.push(10);
                    pilha.push(9);
                    pilha.push(11);
                    this.toBst();
                    System.out.println("PILHA---ARVORE");
                    arvore2.printInorder();
                    System.out.println(" ");

                    break;
                case 8:
                    System.out.println("A arvore tem "+arvore.contaFolhas(arvore.getRaiz())+"Folhas");
                    break;
                case 9:
                    System.out.println("Informe o elemento para saber o nivel");
                    System.out.print(">> ");
                    int v = Integer.parseInt(in.readLine());
                    if(arvore.nivel(v) == -1){
                        System.out.println("Elemento nao encontrado");
                    }else{
                        System.out.println("Elemento :"+v+" Nivel :"+arvore.nivel(v));
                    }
                    break;
                default:
                    if (resp == 10) {
                        System.out.println("-----------------------------------------");
                    } else {
                        System.out.println("Numero invalido");
                    }
            }
        } while (resp != 10);

    }

    public void toBst() {
        int top = pilha.getTopo();
        while (top > 0) {
            arvore2.adicionar(pilha.pop());
            top--;
        }
    }

}
