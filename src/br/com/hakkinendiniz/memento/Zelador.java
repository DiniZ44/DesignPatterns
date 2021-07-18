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
public class Zelador {
    
    private Memento memento;
    
    public void arquivar (Memento nMemento){
        memento  = nMemento;
    };

    public Memento getMemento() {
        return memento;
    }

//    public void setMemento(Memento memento) {
//        this.memento = memento;
//    }
    
    
}
