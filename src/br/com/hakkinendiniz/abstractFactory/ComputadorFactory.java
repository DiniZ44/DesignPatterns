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
public class ComputadorFactory implements AbstractFactory{
    
    @Override
    public IFuncionar cFuncionar() {
        return new Computador(cExecutar());
    }

    @Override
    public IExecutar cExecutar() {
        return new ProgramaA();
    }
    
}
