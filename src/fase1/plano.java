//Exercício: Plano de Internet (Fase 1) 
//https://olimpiada.ic.unicamp.br/pratique/pj/2021/f1/plano/
package fase1;

import java.util.Scanner;

public class plano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int valorMensal = entrada.nextInt();
        int numeroDeMeses = entrada.nextInt();
        int valorDisponivel = 0;
        
        for(int i = 0; i < numeroDeMeses; i++){
            valorDisponivel += valorMensal;
            valorDisponivel -= entrada.nextInt(); //retira a quantidade utilizada no mes   
        }
        
        System.out.print(valorDisponivel + valorMensal); //apresenta o valor disponível no próximo mês
    }
}
