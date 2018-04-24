/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author nmoreira
 */
public class Maquina implements Serializable, Comparable<Maquina>{
    private String id;          //identificador da maquina (e.g T88)
    private String descricao;   //descricao da maquina (e.g Saturno...)
    private String seccao;      //seccao onde pertence a maquina (tinturaria, acabamento, PQ..)

    public Maquina(){
        id = "";
        descricao = "";
        seccao = "";
    }
    
    public Maquina(Maquina m){
        id = m.id;
        descricao = m.descricao;
        seccao = m.seccao;
    }
    
    public Maquina(String s,String d,String f){
        id = s;
        descricao = d;
        seccao = f;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSeccao() {
        return seccao;
    }

    public void setSeccao(String seccao) {
        this.seccao = seccao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Maquina other = (Maquina) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.seccao, other.seccao);
    }

    @Override
    public String toString() {
        return "Maquina{" + "id=" + id + ", descricao=" + descricao + ", seccao=" + seccao + '}';
    }

    @Override
    public int compareTo(Maquina t) {
        return this.id.compareTo(t.id);
    }
    
   
}
