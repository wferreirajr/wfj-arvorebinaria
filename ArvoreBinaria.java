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
}
// Final da classe ArvoreBinaria
