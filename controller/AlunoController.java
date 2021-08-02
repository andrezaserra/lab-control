/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.Dao;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import modelo.aluno;

/**
 *
 * @author acbse
 */

@ManagedBean
public class AlunoController {
    
    private aluno aluno = new aluno();
    private List<aluno> lista;

    public aluno getAluno() {
        return aluno;
    }

    public void setAluno(aluno a) {
        this.aluno = a;
    }

    public List<aluno> getLista() {
        return lista;
    }

    public void setLista(List<aluno> lista) {
        this.lista = lista;
    }
    
    public void gravar(){
        Dao d = new Dao(aluno.class);
        d.adiciona(aluno);
        
        inicializa();
    }
    
    @PostConstruct
    public void inicializa(){
        Dao d = new Dao(aluno.class);
        lista = d.buscaTodos();
        
        aluno = new aluno();
    }
    
}
