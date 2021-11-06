public class ArvoreBinaria {
    private No raiz;

    // construtor da classe Arvore Binaria
    public ArvoreBinaria() {
        this.raiz = null; // inicia a árvore vazia
    }

    // método para inserção de elemento
    public void insere(long id, Object elemento) {
        No novoNo = new No(id,elemento,null,null);
        
        if (raiz == null) {
            raiz = novoNo;
        } else {
            No atual = raiz;
            No pai;

            while (true) {
                pai = atual;

                // vai inserir à esquerda
                if (id < atual.getId()) {
                    atual = atual.getEsq();

                    // pode inserir à esquerda
                    if (atual == null) {
                       pai.setEsq(novoNo);
                        return;
                    } // se não é nulo, vai tentar o próximo filho
                } else { // vai inserir à direita
                    atual = atual.getDir();
                    
                    // pode inserir à direita
                    if (atual == null) {
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    } // final método insere

    // caminhamento pré-fixado da árvore binária
    private void preFixado(No atual) {
        if (atual != null) {
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
            preFixado(atual.getEsq());
            preFixado(atual.getDir());
        }
    } // final método preFixado

    // caminhamento pós-fixado da árvore binária
    private void posFixado(No atual) {
        if (atual != null) {
            posFixado(atual.getEsq());
            posFixado(atual.getDir());
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
        }
    } // final método posFixado

    // caminhamento simétrico fixado da árvore binária
    private void simFixado(No atual) {
        if (atual != null) {
            simFixado(atual.getEsq());
            System.out.println("Id: "+atual.getId()+" Elemento: "+atual.getElemento());
            simFixado(atual.getDir());
        }
    } // final método inFixado

    // impressão dos elementos da árvore
    public void imprimeElementosArvore() {
        preFixado(raiz);
    } // final do método para impressão

    // calcula a altura da árvore
    private long calcAltura(No atual, long a) {
        if (atual != null) {
            long e,d;
            e = calcAltura(atual.getEsq(),a)+1;
            d = calcAltura(atual.getDir(),a)+1;
            if (e > d) {
                return a+e;
            } else {
                return a+d;
            }
        }
        return a;
    } // final método calcAltura

    public long alturaArvore() {
        long a = 0;
        return calcAltura(raiz,a);
    } // final do método alturaArvore

}
// Final da classe ArvoreBinaria
