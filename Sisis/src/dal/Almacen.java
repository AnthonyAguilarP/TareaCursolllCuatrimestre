/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import dol.IR;
import dol.IROcacional;
import dol.Usuario;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author HP
 */
public class Almacen {
    public static void RegistroUsuario(Usuario aa){
        try{
        ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("Usuario"));
        a.writeObject(aa);
        a.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static Usuario IngresoUsuario(){
        try{
        ObjectInputStream a=new ObjectInputStream(new FileInputStream("Usuario"));
        return (Usuario)a.readObject();
        }catch(Exception e){
            return null;
        }
    }
    public static void add(List<IROcacional> aa){
        try{
        ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("add"));
        a.writeObject(aa);
        a.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static List<IROcacional> read(){
        try{
        ObjectInputStream a=new ObjectInputStream(new FileInputStream("add"));
        return (List<IROcacional>)a.readObject();
        }catch(Exception e){
            return null;
        }
    }
}
