import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TabelaHashTeste {
    @Test
    public void testeNovaTabelaHash(){
        Mapa m = new TabelaHash();
        boolean vazio = m.estaVazio();
        int tamanho = m.tamanho();
        Assertions.assertEquals(true, vazio, "a tabela esta vazia");
        Assertions.assertEquals(0, tamanho, "a tabela deve ter tamanho 0");
    }

    public void testeNovaTabelaHashComTamanho1(){
        Mapa m = new TabelaHash();
        boolean vazio = m.estaVazio();
        int tamanho = m.tamanho();
        m.adicionar(1,10);
        Assertions.assertEquals(false, 1, "a tabela tem 1 numero");
        Assertions.assertEquals(0, tamanho, "a tabela deve ter tamanho 0");
    }
}
