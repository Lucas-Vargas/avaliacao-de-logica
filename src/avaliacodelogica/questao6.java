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
public class questao6 {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    double cir, area, diam, r;
    System.out.println("Informe o valor do raio: ");
    r = ler.nextDouble();
    cir = 2*Math.PI*r;
    area = Math.PI * Math.pow(r, 2);
    diam = 2*r;System.out.println("Raio informado: "+r+"\n"+ "Circunferencia: "+cir+"\n"+ "Área: "+area+"\n"+ "Diâmetro: "+diam);
    }
}