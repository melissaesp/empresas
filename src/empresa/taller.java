/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
/**
 *
 
 */
public class taller {

    public static void main(String[] args) {
        ArrayList<sociedadC>Colectiva=new ArrayList<sociedadC>();
        ArrayList<sociedadA>anonimas=new ArrayList<sociedadA>();
        List Union=new ArrayList();
       String opciones=JOptionPane.showInputDialog("Opcion a seleccionar:"+"\n"+"Crear empresa"+"\n");
       String NombreEmpresa="";
       double valorTotalA=0;
        String Respuesta="";
        
        
        String representante="";
       if(opciones.equalsIgnoreCase("crear empresa"))
           do{
              String nombre=JOptionPane.showInputDialog("Digite nombre");
      double Activos=Double.parseDouble(JOptionPane.showInputDialog("Digite activos"));
      representante= JOptionPane.showInputDialog("Digite representante");
       String tipo=JOptionPane.showInputDialog("Tipo de empresa \n  COLECTIVA \n ANONIMA"); 
        if(tipo.equalsIgnoreCase("COLECTIVA")){
            
          double capitalI= Double.parseDouble(JOptionPane.showInputDialog("Digite Capital"));
       
            Colectiva.add(new sociedadC(capitalI,nombre, representante, Activos));
             for(int x=0;x<Colectiva.size();x++) {
                    System.out.println(Colectiva.get(x));
                }
             Respuesta=JOptionPane.showInputDialog("¿Desea Ingresar otra empresa?");
        for (sociedadC a:Colectiva){
        
         valorTotalA+=a.valorventa();  
            System.out.println(valorTotalA);
    }
      
             
           }else{
        int numeroAcciones=Integer.parseInt(JOptionPane.showInputDialog("Digite acciones"));
        double capital=Double.parseDouble(JOptionPane.showInputDialog("Digite capital"));
        double Valor=Double.parseDouble(JOptionPane.showInputDialog("Digite Valor"));
        
         anonimas.add(new sociedadA(numeroAcciones, capital, Valor, nombre, representante, Activos));
        for(int x=0;x<anonimas.size();x++) {
                    System.out.println(anonimas.get(x));
                }
         Respuesta=JOptionPane.showInputDialog("¿Desea Ingresar otra empresa?");
        for (sociedadA b:anonimas){
        
         valorTotalA +=b.valorventa();  }    
        }
        
    }while(!Respuesta.equalsIgnoreCase("no"));
     String reporte="Dinero total acumulado de los valores de venta de las empresas=" + valorTotalA;
    JOptionPane.showMessageDialog(null, reporte);
    String Eliminar=JOptionPane.showInputDialog("Desea eliminar una empresa");
    if(Eliminar.equalsIgnoreCase("SI")){
       
      
       Union.addAll(Colectiva);
       Union.addAll(anonimas);
       JOptionPane.showMessageDialog(null,Union); 
       int posicion=Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar"));
       
       Union.remove(posicion-1);
      for(int x=0;x<Union.size();x++) {
                    System.out.println(Union.get(x));
                }
    }
        JOptionPane.showMessageDialog(null,Union); 
    
    
    
    
    }      
    }
    
    
   
   
           
           