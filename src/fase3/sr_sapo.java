//Exercício: Sr. Sapo (Fase 3)  
//https://olimpiada.ic.unicamp.br/pratique/pj/2021/f3/sapo/
package fase3;

import java.util.Scanner;

public class sr_sapo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroColunas = entrada.nextInt(); // largura do lago (eixo X)
        int numeroLinhas = entrada.nextInt();  // altura do lago (eixo Y)

        boolean[][] existePedra = new boolean[numeroColunas + 1][numeroLinhas + 1];
        boolean[][] jaVisitado = new boolean[numeroColunas + 1][numeroLinhas + 1];

        int quantidadePedras = entrada.nextInt();

        for (int i = 0; i < quantidadePedras; i++) {
            int coluna = entrada.nextInt();
            int linha = entrada.nextInt();
            existePedra[coluna][linha] = true;
        }

        int colunaInicial = entrada.nextInt();
        int linhaInicial = entrada.nextInt();

        int colunaDestino = entrada.nextInt();
        int linhaDestino = entrada.nextInt();

        // Executa a busca em profundidade
        dfs(colunaInicial, linhaInicial, existePedra, jaVisitado, numeroColunas, numeroLinhas);

        // Verifica se o destino foi alcançado
        if (jaVisitado[colunaDestino][linhaDestino]) {
            System.out.println("S"); // Sim, chegou até lá
        } else {
            System.out.println("N"); // Não, impossível chegar
        }
    }

    public static void dfs(int colunaAtual, int linhaAtual, boolean[][] existePedra, boolean[][] jaVisitado, int maxColunas, int maxLinhas) {
        jaVisitado[colunaAtual][linhaAtual] = true;

        for (int distancia = 1; distancia <= 3; distancia++) {
            // Direita
            if (colunaAtual + distancia <= maxColunas &&
                !jaVisitado[colunaAtual + distancia][linhaAtual] &&
                existePedra[colunaAtual + distancia][linhaAtual]) {
                dfs(colunaAtual + distancia, linhaAtual, existePedra, jaVisitado, maxColunas, maxLinhas);
            }

            // Esquerda
            if (colunaAtual - distancia >= 1 &&
                !jaVisitado[colunaAtual - distancia][linhaAtual] &&
                existePedra[colunaAtual - distancia][linhaAtual]) {
                dfs(colunaAtual - distancia, linhaAtual, existePedra, jaVisitado, maxColunas, maxLinhas);
            }

            // Baixo
            if (linhaAtual + distancia <= maxLinhas &&
                !jaVisitado[colunaAtual][linhaAtual + distancia] &&
                existePedra[colunaAtual][linhaAtual + distancia]) {
                dfs(colunaAtual, linhaAtual + distancia, existePedra, jaVisitado, maxColunas, maxLinhas);
            }

            // Cima
            if (linhaAtual - distancia >= 1 &&
                !jaVisitado[colunaAtual][linhaAtual - distancia] &&
                existePedra[colunaAtual][linhaAtual - distancia]) {
                dfs(colunaAtual, linhaAtual - distancia, existePedra, jaVisitado, maxColunas, maxLinhas);
            }
        }
    }
}
