package controller;

import Dao.Dao;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import modelo.estagiario;

/**
 *
 * @author acbse
 */

@ManagedBean
public class EstagiarioController {
    
    private estagiario estagiario = new estagiario();
    private List<estagiario> lista;

    public estagiario getEstagiario() {
        return estagiario;
    }

    public void setEstagiario(estagiario e) {
        this.estagiario = e;
    }

    public List<estagiario> getLista() {
        return lista;
    }

    public void setLista(List<estagiario> lista) {
        this.lista = lista;
    }
    
    public void gravar(){
        Dao d = new Dao(estagiario.class);
        d.adiciona(estagiario);
        
        inicializa();
    }
    
    @PostConstruct
    public void inicializa(){
        Dao d = new Dao(estagiario.class);
        lista = d.buscaTodos();
        
        estagiario = new estagiario();
    }
    
}
