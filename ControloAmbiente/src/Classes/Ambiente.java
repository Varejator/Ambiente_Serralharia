/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author nmoreira
 */
public class Ambiente implements Serializable{
    public String login;
    public String password;
    public ArrayList<Avaria> avarias;
    
    public Ambiente(){
        login = "ambiental";
        password = "ambiental";
        avarias = new ArrayList<Avaria>();
    }
    
    public Ambiente(Ambiente a){
        login = a.login;
        password = a.password;
        avarias = new ArrayList<Avaria>();
        for(Avaria s : a.getAvarias()){
            avarias.add(s);
        }
    }
    
    public Ambiente(String l, String p, ArrayList<Avaria> a){
        login = l;
        password = p;
        avarias = new ArrayList<Avaria>();
        for(Avaria s : a){
            avarias.add(s);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Avaria> getAvarias() {
        return avarias;
    }

    public void setAvarias(ArrayList<Avaria> avarias) {
        this.avarias = avarias;
    }

    @Override
    public String toString() {
        return "Ambiente{" + "login=" + login + ", password=" + password + ", avarias=" + avarias + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.login);
        hash = 59 * hash + Objects.hashCode(this.password);
        hash = 59 * hash + Objects.hashCode(this.avarias);
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
        final Ambiente other = (Ambiente) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return Objects.equals(this.avarias, other.avarias);
    }
    
    //escolher os dados a mostrar com base nos criterios de pesquisa
    public ArrayList Select(String args[]){
        ArrayList<Avaria> avarias = new ArrayList<Avaria>();
        
        return avarias;
    }
    
    //le o ficheiro de historico e carrega em memoria
    public void carregaDados(String input) throws IOException, ParseException{
        String line; String[] tokens;Avaria aux;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {        
        while ((line = br.readLine()) != null) {
                tokens = line.split(",");
                aux = new Avaria();
                aux.setId(Integer.parseInt(tokens[0]));
                aux.setMaquina(tokens[1]);
                aux.setSerralheiroComecou(Integer.parseInt(tokens[2]));
                aux.setSerralheiroAcabou(Integer.parseInt(tokens[3]));
                cal.setTime(sdf.parse(tokens[4]));
                aux.setDataInicioArranjo(cal);
                cal.setTime(sdf.parse(tokens[5]));
                aux.setDataFimArranjo(cal);
                aux.setEstado(tokens[6].charAt(0));
                aux.setTipoAvaria(tokens[7].charAt(0));
                aux.setDescricaoAvaria(tokens[8]);
                aux.setImobilizacao(Boolean.parseBoolean(tokens[9]));
                aux.setRequisitante(Integer.parseInt(tokens[10]));
                cal.setTime(sdf.parse(tokens[11]));
                aux.setDataRequisicao(cal);
                aux.setTipoIntervencao(tokens[12].charAt(0));
                this.avarias.add(aux);
            }
        }
    }
    
   
}
