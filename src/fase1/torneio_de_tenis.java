
package fase1;

import java.util.Scanner;

public class torneio_de_tenis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int MAX_JOGOS = 6;
        int vitorias = 0;
        
        for(int i = 0; i < MAX_JOGOS; i++){
            if(entrada.nextLine().charAt(0) == 'V'){
                vitorias++;
            }
        }

        // Determina o grupo com base no número de vitórias
        if (vitorias >= 5) {
            System.out.println(1);
        } else if (vitorias >= 3) {
            System.out.println(2);
        } else if (vitorias >= 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
