// Exemplo de criação de uma árvore binária
public class ExemploArvoreBinaria {
    public static void main(String[] args) {
        // cria a árvore binária
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(555,"A");
        a.insere(333,"B");
        a.insere(888,"C");
        a.insere(111,"D");
        a.insere(444,"E");
        a.insere(999,"F");
        //a.insere(6,"G");
        //a.insere(8,"H");
        //a.insere(2,"I");
        //a.insere(10,"J");
        //a.insere(18,"K");
        //a.insere(25,"L");

        //a.imprimeElementosArvore();
        a.imprimeId();
        System.out.println("Altura: "+a.alturaArvore());
        System.out.println("Esq Festiva: " + a.imprimeEsqFestiva());
    }
}
// final do exemplo de criação de uma árvore binária
