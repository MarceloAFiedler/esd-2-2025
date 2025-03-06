public interface Mapa {
    void adicionar(int chave, int valor);
    int remover(int chave);
    int obter(int chave);
    boolean existeChave(int chave);
    int tamanho();
    boolean estaVazio();

}
