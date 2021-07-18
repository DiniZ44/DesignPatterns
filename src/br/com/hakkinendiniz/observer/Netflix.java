/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.observer;

import java.util.Observable;

/**
 *
 * @author santo
 */
public class Netflix extends Observable{
    
    private String mensalidade;


    public void notificar (String m){
        setChanged();
        notifyObservers(m);
    };

    public String getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Netflix{" + "mensalidade=" + mensalidade + '}';
    }
    
    
}
