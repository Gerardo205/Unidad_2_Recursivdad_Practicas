/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class Tablas{
     public String tab (int acu ,int num){
        if(acu==1){
                return num + " x " + 1 + " = " + num + "\n";
        }
        else{
            int aux;
            aux=acu;
            return tab(acu-1,num) + num + " x " + aux + " = " + (num + num * aux-2)  + "\n"; 
        }
     }
}
