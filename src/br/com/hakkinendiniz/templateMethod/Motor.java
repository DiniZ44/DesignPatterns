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
public abstract class Motor {
    
    protected abstract void Oleo ();;
    
    protected abstract void Combustivel ();;
    
    protected abstract void Potencia ();;
    
    protected abstract void Som ();;
    
    public final void ligar (){
        Oleo();
        Combustivel();
        Potencia();
        Som();
    }
}
