package arvore;

public class ArvoreBinaria<TIPO extends Comparable> {

    private No<TIPO> raiz;
    private int numElementos;
    private int folhas;

    ArvoreBinaria() {
        this.raiz = null;
        numElementos = 0;
        this.folhas = 0;
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
    public void printInorder() {
        imprimirEmOrdem(this.raiz);
    }

    public void printPostorder() {
        imprimirPosOrdem(this.raiz);
    }

    public void printPreorder() {
        imprimirPreOrdem(this.raiz);
    }

    //
    private void imprimirEmOrdem(No<TIPO> actual) {
        if (actual != null) {
            imprimirEmOrdem(actual.getFilhoEsquerdo());
            System.out.print(actual.getValor() + " ");
            imprimirEmOrdem(actual.getFilhoDireito());
            if (actual.getFilhoEsquerdo() == null && actual.getFilhoEsquerdo() == null) {
                this.folhas++;
            }
        }
    }

    private void imprimirPreOrdem(No<TIPO> actual) {
        if (actual != null) {
            System.out.print(actual.getValor() + " ");
            imprimirPreOrdem(actual.getFilhoEsquerdo());
            imprimirPreOrdem(actual.getFilhoDireito());
        }
    }

    private void imprimirPosOrdem(No<TIPO> actual) {
        if (actual != null) {
            imprimirPosOrdem(actual.getFilhoEsquerdo());
            imprimirPosOrdem(actual.getFilhoDireito());
            System.out.print(actual.getValor() + " ");
        }
    }

    //Metodo para verificar se contem ou não o elemento
    public boolean contem(TIPO valor) {
        //Buscar o elemento na arvore

        No<TIPO> atual = this.raiz;
        No<TIPO> pai = this.raiz;
        boolean filho_esq = false;

        if (raiz == null) { //Se a arvore estiver vazia, retorna false
            return false;
        }
        while (atual.getValor() != valor) { //enquanto não encontrou
            pai = atual;
            if (valor.compareTo(atual.getValor()) == -1) { //caminha para esquerda
                atual = atual.getFilhoEsquerdo();
                filho_esq = true; // é filho a esquerda? Sim

            } else { //caminha para direita
                atual = atual.getFilhoDireito();
                filho_esq = false; // é filho a esquerda? Não
            }
            if (atual == null) {
                return false; // encontrou uma folha -> sai;
            }
        }
        return true;
    }

    //Conta nos
    public int contaNos(No<TIPO> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contaNos(no.getFilhoDireito()) + contaNos(no.getFilhoEsquerdo());
    }

    //Conta folhas
    public int contaFolhas(No<TIPO> no) {
        if (no == null) {
            return 0;
        }
        if (no.getFilhoDireito() == null && no.getFilhoEsquerdo() == null) {
            return 1;
        }
        return contaFolhas(no.getFilhoDireito()) + contaFolhas(no.getFilhoEsquerdo());
    }

    public int nivel(TIPO valor) {
        No<TIPO> actual = this.getRaiz();
        int nivel = 0;

        while (actual != null) {
            if (actual.getValor().equals(valor)) {
                return nivel;
            }
            if (valor.compareTo(actual.getValor()) == -1) {
                actual = actual.getFilhoEsquerdo();
            } else if (valor.compareTo(actual.getValor()) == 1) {
                actual = actual.getFilhoDireito();
            }
            nivel++;
        }
        if (actual == null) {
            return -1;
        }
        return nivel;
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

    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

}
