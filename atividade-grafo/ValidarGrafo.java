/*
Cada nó está entre 0 e V-1.
Não há auto-loops, onde seja, uma aresta que conecta a si mesmo.
Não há arestas paralelas, ou seja, duas arestas que conectam os mesmos nós.
Se no1 aparece em grafo[no2], então no2 deve aparecer em grafo[no1].
 */

import java.util.*;

public class ValidarGrafo {
    public static boolean eGrafoNaoDirecionadoValido(List<Set<Integer>> grafo) {
        int V = grafo.size();

        for (int no = 0; no < V; no++) {
            Set<Integer> vizinhos = grafo.get(no);

            for (Integer vizinho : vizinhos) {
                if (vizinho < 0 || vizinho >= V) {
                    System.out.println("erro: nó " + vizinho + " está fora do intervalo.");
                    return false;
                }
                if (vizinho == no) {
                    System.out.println("erro: auto-loop detectado no nó " + no);
                    return false;
                }
            }

            for (Integer vizinho : vizinhos) {
                if (!grafo.get(vizinho).contains(no)) {
                    System.out.println("erro: aresta assimétrica entre " + no + " e " + vizinho);
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // grafo válido
        List<Set<Integer>> grafoValido = new ArrayList<>();
        grafoValido.add(new HashSet<>(Arrays.asList(1, 2))); // Nó 0
        grafoValido.add(new HashSet<>(Arrays.asList(0, 2))); // Nó 1
        grafoValido.add(new HashSet<>(Arrays.asList(0, 1))); // Nó 2

        System.out.println("grafo válido? " + eGrafoNaoDirecionadoValido(grafoValido));

        // grafo inválido (auto-loop)
        List<Set<Integer>> grafoInvalidoAutoLoop = new ArrayList<>();
        grafoInvalidoAutoLoop.add(new HashSet<>(Arrays.asList(0, 1)));
        grafoInvalidoAutoLoop.add(new HashSet<>(Arrays.asList(0)));

        System.out.println("grafo válido? " + eGrafoNaoDirecionadoValido(grafoInvalidoAutoLoop));

        // grafo inválido (assimetria)
        List<Set<Integer>> grafoInvalidoAssimetrico = new ArrayList<>();
        grafoInvalidoAssimetrico.add(new HashSet<>(Arrays.asList(1)));
        grafoInvalidoAssimetrico.add(new HashSet<>(Arrays.asList()));

        System.out.println("grafo válido? " + eGrafoNaoDirecionadoValido(grafoInvalidoAssimetrico));
    }
}
