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
public class Professor {
    
    private int id;
    private String nome;
    private String idade;
    private String formacao;
    private String endereço;
    private float salario;
    private String contato;

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Professor(int id, String nome, String idade, String formacao, String endereço, float salario, String contato) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.formacao = formacao;
        this.endereço = endereço;
        this.salario = salario;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", nome=" + nome + ", idade=" + idade + ", formacao=" + formacao + ", endere\u00e7o=" + endereço + ", salario=" + salario + ", contato=" + contato + '}';
    }
    
    
    
}
