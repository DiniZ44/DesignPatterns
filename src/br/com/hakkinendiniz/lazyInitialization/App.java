/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.lazyInitialization;

/**
 *
 * @author santo
 */
public class App {
    
    public static void main(String[] args) throws Exception {
        
        Disciplina dc = new Disciplina(1, "Arquitetura de Software", "60h", 1);
        // Pegando a disciplina
        System.out.println(dc);
        // Pegando a disciplina apenas com o id e nome do professor
        System.out.println(dc.getProfessor());
        // Pegando todas as informações de professor e disciplina
        System.out.println(dc);
    }
    
}
