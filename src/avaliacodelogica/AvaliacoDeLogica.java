/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacodelogica;

import java.util.Scanner;

/**
 *
 * @author s.lucas
 */
public class AvaliacoDeLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        double salB, salL, tot, bns, ir;
                Scanner ler = new Scanner(System.in);
                System.out.println("Insira seu nome: ");
                nome = ler.nextLine();
                System.out.println("Insira seu salário bruto: ");
                salB = ler.nextDouble();
                salL = salB * 1.055;
                bns = salL - salB;
                ir = salL-salB;
                    if(salL<3.500){
                        tot = salL + 0.035;
                        ir = tot - salL;
                    }else{
                        tot = salL + 0.075;
                        ir = tot - salL;
                        
                    }
                System.out.println("Nome: "+nome+"\n"
                                 + "Salario bruto: R$"+salB+"\n"
                                 + "Bônus: R$"+bns+"\n"
                                 + "I.R: R$"+ir+"\n"
                                 + "Salário liquido: R$"+salL);
                
    }
    
}
