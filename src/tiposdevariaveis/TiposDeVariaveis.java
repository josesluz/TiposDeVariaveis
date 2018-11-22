/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdevariaveis;

import java.util.Scanner;

/**
 *
 * @author 042131009
 */
public class TiposDeVariaveis {

    public static void main(String[] args) {
        byte idade = 23;
        int rg = 1523326585;
        float salario = 600.00f;
        double decimoTerceiro = 450.50;
        String nome = "José Luz";
        char inicial = 'J';
        //Entrevista
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomePessoa = ler.nextLine();
        System.out.println("Informe a sua idade: ");
        int idadePessoa = ler.nextInt();
        System.out.println("Informe o seu salário: ");
        float salarioPessoa = ler.nextFloat();
        System.out.println(nomePessoa+ " tem "+idadePessoa+" anos e ganha "+salarioPessoa);
    }
    
}