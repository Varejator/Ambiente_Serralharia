/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author nmoreira
 */
public class Avaria implements Serializable, Comparable<Avaria> {
    private int id;                     //identificador da avaria
    private String maquina;             //identificador da maquina avariada
    private int serralheiroComecou;     //identificador do serralheiro que comecou o trabalho
    private int serralheiroAcabou;      //identificador do serralheiro que acabou o trabalho
    private Calendar dataInicioArranjo; //data do inicio do arranjo
    private Calendar dataFimArranjo;    //data do fim do arranjo
    private char estado;                //estado do arranjo: 'p' - pendente, 'e' - em execucao, 'r' - resolvido, 'n' - nao resolvido
    private char tipoAvaria;            //tipo da avaria: 'm' - mecanica, 'e' - eletrica, 'c' - construcao civil
    private String descricaoAvaria;     //descricao da avaria
    private boolean imobilizacao;       //true - a maquina esta parada a espera, false - nao esta a espera
    private int requisitante;           //funcionario que efetuou o pedido de arranjo
    private Calendar dataRequisicao;    //data em que foi efetuado o pedido de arranjo
    private char tipoIntervencao;       //tipo de intervencao: 'a' - agendada, 'p' - preventiva, 'c' - corretiva
    
    
    public Avaria(){
        id = -1;
        maquina = "";
        serralheiroComecou = -1;
        serralheiroAcabou = -1;
        dataInicioArranjo = null;
        dataFimArranjo = null;
        estado = 'u';
        tipoAvaria = 'u';
        descricaoAvaria = "";
        imobilizacao = false;
        requisitante = -1;
        dataRequisicao = null;
        tipoIntervencao = 'u';
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public int getSerralheiroComecou() {
        return serralheiroComecou;
    }

    public void setSerralheiroComecou(int serralheiroComecou) {
        this.serralheiroComecou = serralheiroComecou;
    }

    public int getSerralheiroAcabou() {
        return serralheiroAcabou;
    }

    public void setSerralheiroAcabou(int serralheiroAcabou) {
        this.serralheiroAcabou = serralheiroAcabou;
    }

    public Calendar getDataInicioArranjo() {
        return dataInicioArranjo;
    }

    public void setDataInicioArranjo(Calendar dataInicioArranjo) {
        this.dataInicioArranjo = dataInicioArranjo;
    }

    public Calendar getDataFimArranjo() {
        return dataFimArranjo;
    }

    public void setDataFimArranjo(Calendar dataFimArranjo) {
        this.dataFimArranjo = dataFimArranjo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getTipoAvaria() {
        return tipoAvaria;
    }

    public void setTipoAvaria(char tipoAvaria) {
        this.tipoAvaria = tipoAvaria;
    }

    public String getDescricaoAvaria() {
        return descricaoAvaria;
    }

    public void setDescricaoAvaria(String descricaoAvaria) {
        this.descricaoAvaria = descricaoAvaria;
    }

    public boolean isImobilizacao() {
        return imobilizacao;
    }

    public void setImobilizacao(boolean imobilizacao) {
        this.imobilizacao = imobilizacao;
    }

    public int getRequisitante() {
        return requisitante;
    }

    public void setRequisitante(int requisitante) {
        this.requisitante = requisitante;
    }

    public Calendar getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(Calendar dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public char getTipoIntervencao() {
        return tipoIntervencao;
    }

    public void setTipoIntervencao(char tipoIntervencao) {
        this.tipoIntervencao = tipoIntervencao;
    }

    @Override
    public String toString() {
        return "Avaria{" + "id=" + id + ", maquina=" + maquina + ", serralheiroComecou=" + 
                serralheiroComecou + ", serralheiroAcabou=" + serralheiroAcabou + ", dataInicioArranjo=" 
                + dataInicioArranjo + ", dataFimArranjo=" + dataFimArranjo + ", estado=" + estado + ", tipoAvaria=" 
                + tipoAvaria + ", descricaoAvaria=" + descricaoAvaria + ", imobilizacao=" + imobilizacao 
                + ", requisitante=" + requisitante + ", dataRequisicao=" + dataRequisicao + ", tipoIntervencao=" 
                + tipoIntervencao + '}';
    }
   

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Avaria other = (Avaria) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.serralheiroComecou != other.serralheiroComecou) {
            return false;
        }
        if (this.serralheiroAcabou != other.serralheiroAcabou) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (this.tipoAvaria != other.tipoAvaria) {
            return false;
        }
        if (this.imobilizacao != other.imobilizacao) {
            return false;
        }
        if (this.requisitante != other.requisitante) {
            return false;
        }
        if (this.tipoIntervencao != other.tipoIntervencao) {
            return false;
        }
        if (!Objects.equals(this.maquina, other.maquina)) {
            return false;
        }
        if (!Objects.equals(this.descricaoAvaria, other.descricaoAvaria)) {
            return false;
        }
        if (!Objects.equals(this.dataInicioArranjo, other.dataInicioArranjo)) {
            return false;
        }
        if (!Objects.equals(this.dataFimArranjo, other.dataFimArranjo)) {
            return false;
        }
        return Objects.equals(this.dataRequisicao, other.dataRequisicao);
    }

       
    @Override
    public int compareTo(Avaria t) {
        if(this.id>t.id) return 1;
        if(this.id<t.id) return -1;
        return 0;   
    }
    
    
    /*      METODOS     */
    //Devolve uma data num formato dd/mm/aaaa hh:mm
    public String getFormatedDateDMY(Calendar c){
        StringBuilder ss = new StringBuilder();
        //dia
        if(c.get(Calendar.DAY_OF_MONTH)<10){ss.append("0"+c.get(Calendar.DAY_OF_MONTH)+"/");}
        else{ss.append(c.get(Calendar.DAY_OF_MONTH)+"/");}
        //mes e ano
        if(c.get(Calendar.MONTH)<10){ss.append("0"+(c.get(Calendar.MONTH)+1) +"/" + c.get(Calendar.YEAR) + " ");}
        else{ss.append(c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR)+" ");}
        //horas
        if(c.get(Calendar.HOUR_OF_DAY)<10){ss.append("0"+c.get(Calendar.HOUR_OF_DAY)+":");}
        else{ss.append(c.get(Calendar.HOUR_OF_DAY)+":");}
        //minutos
        if(c.get(Calendar.MINUTE)<10){ss.append("0"+c.get(Calendar.MINUTE));}
        else{ss.append(c.get(Calendar.MINUTE));}
        return new String(ss);
    }
    
    public double getFixTime(){
        double ini = 0, fim=0, res;
        ini = this.dataInicioArranjo.getTimeInMillis();
        fim = this.dataFimArranjo.getTimeInMillis();
        res = fim-ini;
        return (res/6000);  
    }
    
    
}
