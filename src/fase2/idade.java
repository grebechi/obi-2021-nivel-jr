//Exercício: Idade de Camila (Fase 1) 
//https://olimpiada.ic.unicamp.br/pratique/pj/2021/f1/idade/
package fase2;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int idade1, idade2, idade3;
        idade1 = entrada.nextInt();
        idade2 = entrada.nextInt();
        idade3 = entrada.nextInt();
        
        if(idade1 >= idade2 && idade1 >= idade3){ 
            if(idade2 >= idade3){ 
                System.out.print(idade2);
            }else{ 
                System.out.print(idade3);
            }
        }else if(idade2 >= idade3 && idade2 >= idade1){ 
            if(idade1 >=idade3){ 
                System.out.print(idade1);
            }else{ 
                System.out.print(idade3);
            }
        
        }else if(idade2 >= idade1){
            System.out.print(idade2);
        }else{
            System.out.print(idade1);
        }
    }
}
