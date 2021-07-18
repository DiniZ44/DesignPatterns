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
public class App {
    
    public static void main(String[] args) {
        
        Motor motor = Motor.ligarMotor();
        System.out.println("Unico motor ligado!");
    }
    
}
