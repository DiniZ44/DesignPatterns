/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.memento;

/**
 *
 * @author santo
 */
public class Mensagem {
    private String mensagem;
    private boolean foiLida;
    
    public void escreverMensagem(String nMensagem, boolean nFoiLida){
        mensagem = nMensagem;
        foiLida = nFoiLida;
    };

    public Mensagem() {
    }
    
    public Memento criarMemento (){
        Memento memento  = new Memento();
        memento.setMensagem(mensagem);
        memento.setFoiLida(foiLida);
        return memento;
    };
    
    public void restaurar (Memento memento){
        mensagem = memento.getMensagem();
        foiLida = memento.isFoiLida();
    };

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isFoiLida() {
        return foiLida;
    }

    public void setFoiLida(boolean foiLida) {
        this.foiLida = foiLida;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "mensagem=" + mensagem + ", foiLida=" + foiLida + '}';
    }
    
    
}
