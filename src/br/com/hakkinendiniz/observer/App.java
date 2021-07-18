/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.observer;

/**
 *
 * @author santo
 */
public class App {
    
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        
        Assinante hakkinen = new Assinante("Hakkinen Diniz");
        Assinante glauber = new Assinante("Glauber Pires");
        Assinante diniz = new Assinante("Diniz Santos");
        
        netflix.addObserver(hakkinen);
        netflix.addObserver(glauber);
        netflix.addObserver(diniz);
        
        netflix.notificar("Equipe da Netflix");
    }
}
