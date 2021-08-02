/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author acbse
 */

@Entity
public class estagiario {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private String num_SUAP;
    private String nome;

    public String getNum_SUAP() {
        return num_SUAP;
    }

    public void setNum_SUAP(String num_SUAP) {
        this.num_SUAP = num_SUAP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
