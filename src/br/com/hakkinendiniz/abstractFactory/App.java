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
public class App {
    
    public static void main(String[] args) {
        
        //AbstractFactory af = new ComputadorFactory();
        AbstractFactory af = new NotebookFactory();
       
        IExecutar exe = af.cExecutar();
        exe.acao();
    }
    
}
