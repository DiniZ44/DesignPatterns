/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author santo
 */
public class Assinante implements Observer{
    
    private String nome;
    private String usuario;
    private String senha;

    public Assinante(String nome) {
        this.nome = nome;
    }

    public Assinante(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Olá, "+nome+" Sua assinatura está concluida, aproveite nossos serviços =)" + arg + ")))");
    }
    
}
