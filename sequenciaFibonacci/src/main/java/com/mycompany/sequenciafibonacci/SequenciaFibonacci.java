
package com.mycompany.sequenciafibonacci;

import java.util.Scanner;

public class SequenciaFibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int soma;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("===========================================");
        System.out.println("========= Sequencia de Fibonacci =========");
        System.out.println("===========================================");
        
        System.out.println("Digite a quantidade de termos:");
        int termo=teclado.nextInt();

        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i <= termo; i++) {
            soma = a + b;
            System.out.println(soma);
            a = b;
            b = soma;
        }
    }
     
    }

