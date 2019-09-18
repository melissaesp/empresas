/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author usuario
 */
public class sociedadA extends Empresa{
    int nroacciones;
    double capitalT;
    double valorU;
    

    public sociedadA(int nroacciones, double capitalT, double valorU, String nombre, String representanteLegal, double activos) {
        super(nombre, representanteLegal, activos);
        this.nroacciones = nroacciones;
        this.capitalT = capitalT;
        this.valorU = valorU;
    }

    public sociedadA() {
    }

     

   
    public double getNroacciones() {
        return nroacciones;
    }

    public double getCapitalT() {
        return capitalT;
    }

    public double getValorU() {
        return valorU;
    }

    public void setNroacciones(int nroacciones) {
        this.nroacciones = nroacciones;
    }

    public void setCapitalT(double capitalT) {
        this.capitalT = capitalT;
    }

    public void setValorU(double valorU) {
        this.valorU = valorU;
    }

    @Override
    public String toString() {
        return "sociedadA{"+"Nombre="+super.getNombre()+","+"Representante="+super.getRepresentanteLegal()+","+"Activos"+super.getActivos()+","+ "Tamaño="+super.tamañoEmpresa()+","+"Valor Venta="+super.valorventa()+ " ," + "nroacciones=" + nroacciones + ", capitalT=" + capitalT + ", valorU=" + valorU + '}';
   
    }

    

     
     
    
}
