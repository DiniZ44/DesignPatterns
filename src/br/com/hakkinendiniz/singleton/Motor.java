/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.singleton;

/**
 *
 * @author santo
 */
public class Motor {
    
    private static Motor motorLigado;

    private Motor() {
    }
    
    public static synchronized Motor ligarMotor(){
        if(motorLigado == null){
            motorLigado = new Motor();
        }
        return motorLigado;
                
    };
    
}
