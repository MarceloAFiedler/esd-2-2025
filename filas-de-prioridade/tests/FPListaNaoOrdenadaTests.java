import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class FPListaNaoOrdenadaTests {

    @Test
    public void criacao(){
        FilaDePrioridade fp = new FPListaNaoOrdenada();
        int tamanho = fp.tamanho();
        Assertions.assertEquals(0,tamanho
                ,"O tamanho da FP deve ser Zero");
    }

    @Test
    public void adicionarUmElemento(){
        FilaDePrioridade fp = new FPListaNaoOrdenada();
        fp.add(1,1);
        int tamanho = fp.tamanho();
        Assertions.assertEquals(1,tamanho
                ,"O tamanho da FP deve ser Um");
    }

    @Test
    public void obterOElementoNumaListaComUmElemento(){
        FilaDePrioridade fp = new FPListaNaoOrdenada();
        fp.add(9,1);
        int tamanho = fp.tamanho();
        Assertions.assertEquals(1,tamanho
                ,"O tamanho da FP deve ser Um");
        int elemento = fp.obter();
        Assertions.assertEquals(9,elemento
                ,"O elemento deve ser Nove");

    }


    @Test
    public void obterOElementoNumaListaComTresElemento(){
        FilaDePrioridade fp = new FPListaNaoOrdenada();
        fp.add(90,1);
        fp.add(70,4);
        fp.add(40,6);
        int elemento = fp.obter();
        Assertions.assertEquals(40,elemento
                ,"O elemento deve ser 40");

    }

    @Test
    public void removerOElementoNumaListaComTresElemento(){
        FilaDePrioridade fp = new FPListaNaoOrdenada();
        fp.add(90,1);
        fp.add(70,4);
        fp.add(40,6);
        int elemento = fp.remover();
        Assertions.assertEquals(40,elemento
                ,"O elemento deve ser 40");
        int tamanho = fp.tamanho();
        Assertions.assertEquals(2,tamanho
                ,"O tamanho da FP deve ser dois.");
        elemento = fp.obter();
        Assertions.assertEquals(70,elemento
                ,"O elemento deve ser 70");


    }


}
