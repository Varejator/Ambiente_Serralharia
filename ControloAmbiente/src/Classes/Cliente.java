/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nmoreira
 */
public class Cliente implements Serializable{
    private HashMap<String,String> logins;  //logins possiveis
    private ArrayList<Maquina> maquinas;
    private int nMaquinas;
}
