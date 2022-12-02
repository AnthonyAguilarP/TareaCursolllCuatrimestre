/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dol;

/**
 *
 * @author HP
 */
public class IROcacional extends IR{
    private Double monto=null,porcentaje=null;

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje/100;
    }
    public Double getPagoOcacional(){
        if(monto!=null)return monto;
        else if(porcentaje!=null)return porcentaje*getSalarioFijo();
        else return null;
    }
    public Double INSSOcacional(){
        return getPagoOcacional()*0.0625;
    }
    public Double PagoOcacionalNeto(){
        return getPagoOcacional()-INSSOcacional();
    }
    public Double ExpectativaAnualOcacional(){
        return ExpectativaSalarial()+PagoOcacionalNeto();
    }
    public IR Ocacional(){
        Double s=((ExpectativaAnualOcacional()/12)*100)/93.75;
        return new IR(s);
    }
    public Double IROcacional(){
        return Ocacional().IRAnual()-IRAnual();
    }
    public Double TotalARetener(){
        return IROcacional()+IRMensual();
    }
}
