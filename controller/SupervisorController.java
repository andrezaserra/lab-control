package controller;

import Dao.Dao;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import modelo.supervisor;

/**
 *
 * @author acbse
 */

@ManagedBean
public class SupervisorController {
    
    private supervisor supervisor = new supervisor();
    private List<supervisor> lista;

    public supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(supervisor s) {
        this.supervisor = s;
    }

    public List<supervisor> getLista() {
        return lista;
    }

    public void setLista(List<supervisor> lista) {
        this.lista = lista;
    }
    
    public void gravar(){
        Dao d = new Dao(supervisor.class);
        d.adiciona(supervisor);
        
        inicializa();
    }
    
    @PostConstruct
    public void inicializa(){
        Dao d = new Dao(supervisor.class);
        lista = d.buscaTodos();
        
        supervisor = new supervisor();
    }
    
}
