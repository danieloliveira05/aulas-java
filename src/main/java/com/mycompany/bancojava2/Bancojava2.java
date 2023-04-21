
package com.mycompany.bancojava2;

import java.util.Scanner;


public class Bancojava2 {
    static Scanner t = new Scanner (System.in);
    static Scanner t2 = new Scanner (System.in);

public static String[] cad(){
    
    String aux[] = new String[3];
    int op = 0;
    System.out.println("Informe o seu nome: ");
    aux[0] = t.nextLine();
    while (op != 2){
        System.out.println("Informe o seu numero do seu celular: ");
            aux[1] = t.nextLine();
        if (aux[1].length() != 9){
            System.out.println("Informe um numero de celular valido");
        }
        else{
            op = 2;
        }
    }
    while (op != 1){
        System.out.println("Informe seu Cpf: ");
            aux[2] = t.nextLine();
        if (aux[2].length() != 11){
            System.out.println("Informe um cpf valido");
    }
        else{
            op = 1;
    }
    }
    return aux;
}
    public static String trocacel(String[] cel){
        
        String novocel[] = new String[10];
        System.out.println("Informe o novo numero de celular");
        novocel [0] = t.nextLine();
        
        return novocel[0];
    }
    public static int buscaruser (String [] name){
        String veri;
        int i=0;
        
            veri = t.nextLine();
        for(i=0;i<name.length;i++){
        if (veri.equals(name[i])){
            System.out.println("O usuario: "+name[i]);
            return i;
        }
        
        
    }
        return 15;
    }
    
    public static void main(String[] args) {
        int opcao = 0, op = 0, i=0, pos = 0;
        float credito=0, debito=0;
        String dados[] = new String [10];
        String name[] = new String [10];
        String cpf [] = new String [10];
        String cel [] = new String [10];
        
        System.out.println("Bem vindo ao Banco DR");
        while (opcao != 7){
        
        System.out.println("Qual funçao deseja realizar\n1-Cadastro de usuario\n2-Credito\n3-Debito");
            System.out.println("4-Atualizar conta(apenas cel)\n5-Verificar usuario\n6-Verificar saldo\n7-Sair");
                opcao = t2.nextInt();
        
        switch (opcao){
            case 1 -> {
                dados = cad();
                name[i] = dados[0];
                cel[i] = dados[1];
                cpf[i] = dados[2];
                i++;
            }
            case 2 -> {
                System.out.println("Informe o valor que deseja depositar: ");
                    credito = t2.nextFloat();
                
            }
            case 3 -> {
                    while(op != 1){
                        System.out.println("Informe o valor que deseja sacar: ");
                            debito = t2.nextFloat();
                        if (debito > credito){
                            System.out.println("Saldo insuficiente");
                        }
                        else{
                            op = 1;
                        }
                    }
            }
            case 4 -> {
                System.out.println("nome: " + name[1]);
                System.out.println("celular: "+ cel[1]);
                System.out.println("cpf: " + cpf[1]);
                cel[1] = trocacel(cel);
                System.out.println("novo numero de celular: "+cel[1]);
                
            }
            case 5 -> {
                System.out.println("Informe o nome do usuario que procuras:");
                pos = buscaruser(name);
                if(pos == 15){
                    System.out.println("Usuario não encontrado!");
                }else{
                    System.out.println("Nome: " + name[pos]);
                    System.out.println("cpf: "+ cpf[pos]);
                    System.out.println("cel: "+ cel[pos]);
                }
            }
            case 6 -> {
                
            }
        }
        }     
    }
}
