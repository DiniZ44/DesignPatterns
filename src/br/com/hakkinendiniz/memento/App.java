/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hakkinendiniz.memento;

/**
 *
 * @author santo
 */
public class App {

    // Situação hipotetica de uma mensagem onde a mensagem é o emissor e a mensagem1 é o recptor
    
    public static void main(String[] args) {
    // Escrevendo a mensagem de um emissor qualquer
    Mensagem mensagem = new Mensagem();
    mensagem.escreverMensagem("Criação da arquitetura memento", false);
    // Passando um momento da mensagem ao zelador que posteriormente vai repassar ao recptor
    Zelador zelador = new Zelador();
    zelador.arquivar(mensagem.criarMemento());
    System.out.println("Emissor diz: " + mensagem.toString());
    
    // Rescrevendo a mensagem atraves de repasse ao recptor
    Mensagem mensagem1 = new Mensagem();
    mensagem1.restaurar(zelador.getMemento());
    // Mensagem foi lida pelo recptor, avisando ao emissor
    mensagem1.setFoiLida(true);
    
    System.out.println("Recptor recebeu: "+mensagem1.toString());
    }
    
    
}
