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
public class sociedadC extends Empresa{
    private double capitalI;

    public sociedadC() {
    }

    public sociedadC(double capitalI, String nombre, String representanteLegal, double activos) {
        super(nombre, representanteLegal, activos);
        this.capitalI = capitalI;
    }

    

    public sociedadC(double capitalI) {
        this.capitalI = capitalI;
    }
    public double getCapitalI() {
        return capitalI;
    }

    public void setCapitalI(double capitalI) {
        this.capitalI = capitalI;
    }

public String rentabilidad(){
        String rentabilidad="";
        if(super.getActivos()>=(2.5*capitalI)){
            rentabilidad="rentable";
        }
        else{
            rentabilidad="No rentable";
        }
        return rentabilidad;
    }

    @Override
    public String toString() {
        return "SocColetiva{" +"Nombre="+super.nombre+","+"Representante="+super.representanteLegal+","+"Activos"+super.activos+","+"Tamaño="+super.tamañoEmpresa()+","+"Valor Venta="+super.valorventa()+","+  "capitalInicial=" + capitalI +","+"Rentabilidad="+rentabilidad()+ '}'+"\n";
    }   
}

  