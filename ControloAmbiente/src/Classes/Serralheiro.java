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
public class Serralheiro implements Serializable, Comparable<Serralheiro>{
    private int id;
    private String nome;
    private char turno;
    
    public Serralheiro(){
        id = -1;
        nome = "";
        turno = ' ';
    }
    
    public Serralheiro(Serralheiro a){
        id = a.id;
        nome = a.nome;
        turno = a.turno;
    }
    
    public Serralheiro(int a, String s, char t){
        id = a;
        nome = s;
        turno = t;
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

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + this.turno;
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
        final Serralheiro other = (Serralheiro) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.turno != other.turno) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Serralheiro{" + "id=" + id + ", nome=" + nome + ", turno=" + turno + '}';
    }
    
    /* metodos */

    @Override
    public int compareTo(Serralheiro t) {
        if(this.id > t.id) return 1;
        if(this.id < t.id) return -1;
        return 0;
    }
    
    
    
}
