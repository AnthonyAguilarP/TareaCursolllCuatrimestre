/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misc;

import dol.IROcacional;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Controles {
    public static String[] Listado(List<IROcacional> b){
        String[] a=new String[b.size()];
        int i=0;
        for(IROcacional c:b){
            a[i]=b.get(i).NombreCompleto();
            i++;
        }
        return a;
    }
    public static boolean Comprobante(List<IROcacional> b){
        int i=0,j;
        for(IROcacional a: b){
            j=0;
            for(IROcacional c: b){
                if(b.get(i).NombreCompleto().equals(b.get(j).NombreCompleto()) && i!=j)return false;
                    j++;
            }
            i++;
        }
        return true;
    }
    public static Double Sueldo(String a){
        try{
            return Double.parseDouble(a);
        }catch(Exception e){
            return null;
        }
    }
}
