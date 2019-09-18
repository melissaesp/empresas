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
public abstract class Empresa {
    protected String nombre;
    protected String representanteLegal;
    protected double activos;
    double salarioM=828116;

    public Empresa() {
    }

    public Empresa(String nombre, String representanteLegal, double activos) {
        this.nombre = nombre;
        this.representanteLegal = representanteLegal;
        this.activos = activos;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public double getActivos() {
        return activos;
    }

    public void setActivos(double activos) {
        this.activos = activos;
    }
    public String tamañoEmpresa(){
        String tamaño="";
        if((activos*salarioM)<(500*salarioM)){
            tamaño="Es de tipo: microempresa";
            
        }
   if((activos*salarioM)>(500*salarioM)&&activos<(5000*salarioM)){
       tamaño="Es de tipo: Pequeña";
   }
    if((activos*salarioM)>(5000*salarioM)&&(activos*salarioM)<=(30000*salarioM)){
       tamaño="Es de tipo: mediana";
   }
   else{
       tamaño="Grande";
   }
   return tamaño;
    }
    public double valorventa(){
        double valorV=0;
        if(tamañoEmpresa().equals("Es de tipo: microempresa")||tamañoEmpresa().equals("Es de tipo: Pequeña")){
            valorV=(activos*0.22)+activos;
        }
        else{
            valorV=(activos*0.35)+activos;
        }
    return valorV;
    }

    @Override
    public abstract String toString() ;
        
    
}

