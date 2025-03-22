public class Mapa<K, V> {
    private Node<K, V> cabeca;
    private Node<K, V> cauda;

    public Mapa() {
        this.cabeca = null;
        this.cauda = null;
    }

    // Método put - Insere ou atualiza o valor associado a uma chave
    public void put(K chave, V valor) {
        if (cabeca == null) {
            Node<K, V> novoNo = new Node<>(chave, valor);
            cabeca = novoNo;
            cauda = novoNo;
            return;
        }

        Node<K, V> atual = cabeca;

        while (atual != null) {
            if (atual.chave.equals(chave)) {
                atual.valor = valor;
                return;
            }
            atual = atual.proximo;
        }

        // Se não encontrou a chave, adiciona um novo nó
        Node<K, V> novoNo = new Node<>(chave, valor);
        cauda.proximo = novoNo;
        novoNo.anterior = cauda;
        cauda = novoNo;
    }

    // Método get - Recupera o valor associado a uma chave
    public V get(K chave) {
        Node<K, V> atual = cabeca;

        while (atual != null) {
            if (atual.chave.equals(chave)) {
                return atual.valor;
            }
            atual = atual.proximo;
        }
        return null;  // Retorna null se a chave não for encontrada
    }

    // Método remove - Remove o nó com a chave fornecida
    public boolean remove(K chave) {
        if (cabeca == null) return false;

        Node<K, V> atual = cabeca;

        while (atual != null) {
            if (atual.chave.equals(chave)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    cabeca = atual.proximo;  // Se for o primeiro nó
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    cauda = atual.anterior;  // Se for o último nó
                }

                return true;
            }
            atual = atual.proximo;
        }

        return false;  // Chave não encontrada
    }
}
