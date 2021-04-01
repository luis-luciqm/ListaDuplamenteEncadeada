package com.luis.lista.dupla;
/**
 *
 * @author luis
 */
public class ListaDupla {
    No inicio;
    No fim;
    int tam = 0;
    
    public void InserirInicio(int info){
        No no = new No(); // Crio um No
        no.info = info; // atribuo um valor a ele;
        no.anterior = null; // o no.anterior do Novo No é null
        no.proximo = inicio; // esse meu novo No irá apontar para o proximo No, ou seja, onde inicio estiver apontando
        
        if(inicio != null){
            inicio.anterior = no; // apontando no.anterior para o No criado
        }
        inicio = no; // variavel inicio começa a apontar para o novo No
        
        if(tam == 0){ // se não existir elementos na lista ainda
            fim = inicio; // o fim irá apontar para o No que inicio apontou na primeira vez
        }
        tam++;
    }
    
    public Object buscarPrimeiroELemento(){
        No aux = inicio;
        return aux.info;
    }
    
    public Object buscarUltimoElemento(){
        No aux = fim;
        return aux.info;
    }
    
    public int tamanhoLista(){
        return tam;
    }
    
    public boolean estavazia(){
        return tam == 0;
    }
    
    public void inserirFim(int info){
        No no = new No();
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        
        if(fim != null){
            fim.proximo = no;
        }
        fim = no;
        
        if(tam == 0){
            inicio = fim;
        }
        tam++;
    }
    
    public Object deletarInicio(){
        No aux = inicio;
        inicio = inicio.proximo;
        tam--;
        return aux.info;
    }
    
    public Object deletarFim(){
        No aux = inicio;
        No temp;
        
        while(aux.proximo != null){
            temp = aux;
            aux = aux.proximo;
            
            if(aux.proximo == null){
                temp.proximo = null;
                tam--;
                return aux.info;
            }
        }
        inicio = null;
        tam--;
        return aux.info;
        
    }
    
    @Override
    public String toString(){
        No local = inicio;
        String lista = "";
        
        while(local != null){
            lista += local.info + " " ;
            local = local.proximo;
        }
        
        return lista;
    }
}
