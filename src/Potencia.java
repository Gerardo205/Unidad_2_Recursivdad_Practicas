/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerap
 */
public class Potencia {
    public int pot (int n,int p){
        if(p==0){
            return n;
        }
        else{
            return n * pot(n,p-1);
        }
    }
}
