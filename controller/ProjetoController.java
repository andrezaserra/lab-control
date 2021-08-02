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
import modelo.projeto;

/**
 *
 * @author acbse
 */

@ManagedBean
public class ProjetoController {
    
    private projeto projeto = new projeto();
    private List<projeto> lista;
    
    public projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(projeto pr) {
        this.projeto = pr;
    }
    
    public List<projeto> getLista() {
        return lista;
    }

    public void setLista(List<projeto> l) {
        this.lista = l;
    }
    
    public void gravar(){
        Dao d = new Dao(projeto.class);
        d.adiciona(projeto);
        
        inicializa();
    }
    
    @PostConstruct
    public void inicializa(){
        Dao d = new Dao(projeto.class);
        lista = d.buscaTodos();
        
        projeto = new projeto();
    }
    
}
