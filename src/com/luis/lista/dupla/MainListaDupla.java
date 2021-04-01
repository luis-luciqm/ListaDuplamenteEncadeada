package com.luis.lista.dupla;
/**
 *
 * @author luis
 */
import java.util.Scanner;
public class MainListaDupla {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        int op = -1;
        Scanner sc = new Scanner(System.in);
        lista.InserirInicio(3);
        lista.InserirInicio(8);
        
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Verificar se a lista está vazia\n"
                    + "2 - Ver comprimento da lista\n"
                    + "3 - Buscar o primeiro elemento da lista\n"
                    + "4 - Buscar o ultimo elemento da lista\n"
                    + "5 - Listar os elementos da lista\n"
                    + "6 - Inserir no inicio da lista\n"
                    + "7 - Inserir no Fim da lista\n"
                    + "8 - Deletar do Inicio da lista\n"
                    + "9 - Deletar do fim da lista\n"
                    + "0 - Sair");
            op = sc.nextInt();
            
            switch(op){
                case 1:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\nNão está vazia!\n");
                    }
                break;
                
                case 2:
                    System.out.println("\nO comprimento da lista é: " + lista.tamanhoLista()+"\n");
                break;
                
                case 3:
                    System.out.println("\nPrimeiro elemento: "+lista.buscarPrimeiroELemento()+"\n");
                break;
                
                case 4:
                    System.out.println("\nUltimo elemento: "+lista.buscarUltimoElemento()+"\n");
                break;
                
                case 5:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\nElementos da lista: "+lista.toString()+"\n");
                    }
                break;
                
                case 6:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\nDigite um numero para inserir no inicio: ");
                        op = sc.nextInt();
                        lista.InserirInicio(op);
                    }
                break;
                
                case 7:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\nDigite um numero para inserir no fim: ");
                        op = sc.nextInt();
                        lista.inserirFim(op);
                    }
                break;
                
                case 8:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\n"+lista.deletarInicio()+" foi removido\n");   
                    }
                break;
                
                case 9:
                    if(lista.estavazia()){
                        System.out.println("\nEstá vazia!\n");
                    }else{
                        System.out.println("\n"+lista.deletarFim()+" foi removido\n");   
                    }
                break;
            }
        }while(op != 0);
        
    }
}
