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
public class Memento {
    private String mensagem;
    private boolean foiLida;

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
        return "Memento{" + "mensagem=" + mensagem + ", foiLida=" + foiLida + '}';
    }  
    
    
}
