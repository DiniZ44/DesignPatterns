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
public class Disciplina {
    
    private int id;
    private Professor professor;
    private String nome;
    private String cargaHoraria;
    private int professor_id;
    private ProfessorDAO professorDAO;

    public Disciplina(int id, String nome, String cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(int id, String nome, String cargaHoraria, int professor_id) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor_id = professor_id;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Professor getProfessor() throws Exception {
        if(professor == null)
            professor = professorDAO.getProf(professor_id);
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", professor=" + professor + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", professor_id=" + professor_id + ", professorDAO=" + professorDAO + '}';
    }
    
                
    
}
