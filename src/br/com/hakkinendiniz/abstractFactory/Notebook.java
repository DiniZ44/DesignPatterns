/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.abstractFactory;

/**
 *
 * @author santo
 */
public class Notebook extends Funcionar{

    public Notebook(IExecutar executar) {
        super(executar);
    }

    @Override
    public void desligar() {
        System.out.println("Encerrendo as atividades do sistema!");
    }
    
}
