public class Main {
    public static void main(String[] args) {
        // Criando o mapa
        Mapa<Integer, String> mapa = new Mapa<>();

        // Inserindo valores no mapa
        System.out.println("Inserindo valores...");
        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(3, "C");

        // Exibindo os valores
        System.out.println("Valor da chave 1: " + mapa.get(1));  // Esperado: "A"
        System.out.println("Valor da chave 2: " + mapa.get(2));  // Esperado: "B"
        System.out.println("Valor da chave 3: " + mapa.get(3));  // Esperado: "C"

        // Atualizando o valor da chave 2
        System.out.println("\nAtualizando valor da chave 2...");
        mapa.put(2, "Z");
        System.out.println("Valor atualizado da chave 2: " + mapa.get(2));  // Esperado: "Z"

        // Removendo a chave 3
        System.out.println("\nRemovendo chave 3...");
        mapa.remove(3);
        System.out.println("Valor da chave 3 após remoção: " + mapa.get(3));  // Esperado: null

        // Removendo a chave 1
        System.out.println("\nRemovendo chave 1...");
        mapa.remove(1);
        System.out.println("Valor da chave 1 após remoção: " + mapa.get(1));  // Esperado: null

        // Adicionando novamente para testar o método `put`
        System.out.println("\nInserindo novamente chave 1...");
        mapa.put(1, "A");
        System.out.println("Valor da chave 1 após reinserção: " + mapa.get(1));  // Esperado: "A"

        // Tentando remover uma chave inexistente
        System.out.println("\nTentando remover chave inexistente 4...");
        boolean removed = mapa.remove(4);
        System.out.println("Resultado da remoção da chave 4: " + removed);  // Esperado: false
    }
}
