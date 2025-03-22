public class Node<K, V> {
    K chave;
    V valor;
    Node<K, V> anterior;
    Node<K, V> proximo;

    public Node(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}
