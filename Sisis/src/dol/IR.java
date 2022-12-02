/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author CCBB
 */
public class IR extends Persona{
    private Double SalarioFijo;

    public IR() {
    }

    public IR(Double SalarioFijo) {
        this.SalarioFijo = SalarioFijo;
    }

    public Double getSalarioFijo() {
        return SalarioFijo;
    }

    public void setSalarioFijo(Double SalarioFijo) {
        this.SalarioFijo = SalarioFijo;
    }
    public Double Inss(){
        return SalarioFijo*0.0625;
    }
    public Double SalarioNeto(){
        return SalarioFijo-Inss();
    }
    public Double ExpectativaSalarial(){
        return SalarioNeto()*12;
    }
    public Double SobreExceso(){
        if(ExpectativaSalarial()<=100000)return 0.0;
        else if(ExpectativaSalarial()>100000 && ExpectativaSalarial()<=200000)return 100000.0;
        else if(ExpectativaSalarial()>200000 && ExpectativaSalarial()<=350000)return 200000.0;
        else if(ExpectativaSalarial()>350000 && ExpectativaSalarial()<=500000)return 350000.0;
        else if(ExpectativaSalarial()>500000)return 500000.0;
        else return null;
    }
    public Double BaseImponible(){
        return ExpectativaSalarial()-SobreExceso();
    }
    public Double PorcentajeAplicacion(){
        if(ExpectativaSalarial()<=100000)return 0.0;
        else if(ExpectativaSalarial()>100000 && ExpectativaSalarial()<=200000)return .15;
        else if(ExpectativaSalarial()>200000 && ExpectativaSalarial()<=350000)return .20;
        else if(ExpectativaSalarial()>350000 && ExpectativaSalarial()<=500000)return .25;
        else if(ExpectativaSalarial()>500000)return .30;
        else return null;
    }
    public Double PorcentajeAplicado(){
        return PorcentajeAplicacion()*BaseImponible();
    }
    public Double ImpuestoBase(){
        if(ExpectativaSalarial()<=100000)return 0.0;
        else if(ExpectativaSalarial()>100000 && ExpectativaSalarial()<=200000)return 0.0;
        else if(ExpectativaSalarial()>200000 && ExpectativaSalarial()<=350000)return 15000.0;
        else if(ExpectativaSalarial()>350000 && ExpectativaSalarial()<=500000)return 45000.0;
        else if(ExpectativaSalarial()>500000)return 82500.0;
        else return null;
    }
    public Double IRAnual(){
        return ImpuestoBase()+PorcentajeAplicado();
    }
    public Double IRMensual(){
        return IRAnual()/12;
    }
}
