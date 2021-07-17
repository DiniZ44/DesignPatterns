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
public class MotorV12 extends Motor {

    @Override
    protected void Som() {
        //super.Som(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Processo de combustão resultando no som do motor V12");
    }

    @Override
    protected void Potencia() {
        //super.Potencia(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Carregando toda a potência do motor V12");
    }

    @Override
    protected void Combustivel() {
        //super.Combustivel(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Verificando combustivel do motor v12");
    }

    @Override
    protected void Oleo() {        
        //super.Oleo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Verificando oléo de motor V12");
    }
    
    
}
