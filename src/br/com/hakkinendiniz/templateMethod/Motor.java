/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.templateMethod;

/**
 *
 * @author santo
 */
public class Motor {
    
    protected void Oleo (){
        System.out.println("Verificando oléo de motor");
    };
    
    protected void Combustivel (){
         System.out.println("Verificando combustivel do motor");
    };
    
    protected void Potencia (){
         System.out.println("Carregando toda a potência do motor");
    };
    
    protected void Som (){
         System.out.println("Processo de combustão resultando no som do motor");
    };
    
    public final void ligar (){
        Oleo();
        Combustivel();
        Potencia();
        Som();
    }
}
