/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author acbse
 */

@Entity
public class projeto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    
    private String titulo, assunto, aluno_responsavel, supervisor;
    private String data_de_execucao, lista_de_componentes;
    
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getAluno_responsavel() {
        return aluno_responsavel;
    }

    public void setAluno_responsavel(String aluno_responsavel) {
        this.aluno_responsavel = aluno_responsavel;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getData_de_execucao() {
        return data_de_execucao;
    }

    public void setData_de_execucao(String data_de_execucao) {
        this.data_de_execucao = data_de_execucao;
    }

    public String getLista_de_componentes() {
        return lista_de_componentes;
    }

    public void setLista_de_componentes(String lista_de_componentes) {
        this.lista_de_componentes = lista_de_componentes;
    }
    
}
