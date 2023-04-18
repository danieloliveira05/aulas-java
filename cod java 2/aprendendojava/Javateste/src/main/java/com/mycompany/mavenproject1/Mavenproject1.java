
package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static int cadcel(){
        Scanner t2 = new Scanner (System.in);
        int cel[] = new int [10];
         
        System.out.println("Informe o seu numero de celular");
            cel[0]= t2.nextInt();
            return cel[0];
    }
    public static int cadcpf(){
        Scanner t2 = new Scanner (System.in);
        int cpf[] = new int [10];
       
        System.out.println("Informe o numero do seu cpf");
            cpf[0]= t2.nextInt();
            return cpf[0];
    }
    public static String caduser(){
        String usuario[] = new String[10];
        Scanner t = new Scanner (System.in);
        int cpf[] = new int [10];
        System.out.println("Cadastro de usuario\nInforme o seu nome");
            usuario[0] = t.nextLine();
                    return usuario[0];
    }
    public static int cadsaldo(){
        Scanner t2 = new Scanner (System.in);
            int valor[] = new int[10];
            System.out.println("Informe o saldo da sua conta");
                valor[0] = t2.nextInt();
                return valor[0];
    }
            
    public static void main(String[] args) {
        
        Scanner t2 = new Scanner (System.in);
        int opcao = 0, cpf=0, cel=0, saldo=0;
        
        Scanner t = new Scanner (System.in);
        String name[] = new String[10];
        String user;
        
        System.out.println("Bem vindo ao banco GV ");
        
        while (opcao != 7){
        
        System.out.println("Qual funçao deseja realizar\n1-Cadastro de usuario\n2-Credito\n3-Debito");
            System.out.println("4-Atualizar conta(apenas cel)\n5-Verificar usuario\n6-Verificar saldo");
                opcao = t2.nextInt();
        
        switch (opcao){
            case 1 -> {
                user = caduser();
                cpf = cadcpf();
                cel = cadcel();
                saldo = cadsaldo();
            }
            case 2 -> {
                
            }
            case 3 -> {
                
            }
            case 4 -> {
                System.out.println("O nome do usuario: " + user); 
                System.out.println("O cpf do usuario: " + cpf);
                System.out.println("O numero celular do usuario: " + cel);
                System.out.println("O saldo da conta do usuario: " + saldo);
                saldo = cadsaldo();
            }
            case 5 -> {
                
            }
            
            case 6 -> {
                
            }
            
        }
        }   
    }
}
