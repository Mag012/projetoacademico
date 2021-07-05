/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swithcalculadora;

import java.util.Scanner;

public class SwithCalculadora {//classe principal
public static void main(String[] args) {
        float numero1, numero2;// variaveis do tipo float
        char operacao;//variavel do tipo char
        Scanner entrada = new Scanner(System.in);//estancia da classe Scanner
        
        System.out.print("Escolha sua operação [+ - * / ]: ");// menu criado,umaoutra forma
        operacao = entrada.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
        

    }

    
}
 
    
        
    
    

