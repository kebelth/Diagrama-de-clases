/*
 proyecto
 */
package proyectofinal;

import javax.swing.JOptionPane;

public class ProyectoFinal {

   
    public static void main(String[] args)
    {
       
       boolean salir= false;
       int opcion;
       Carnet mostrar1=new Carnet();
       Factura mostrar2 = new Factura();
         while(!salir){
             JOptionPane.showMessageDialog(null,"\n>>> MENÚ DE OPCIONES <<<"
                + "\n1.>>> "
                + "\n2.>>>Crear un Carnet de la biblioteca ."
                +"\n3>>> Facturacion ."
                + "\n4. Salir.");
                
            
             String opcion1   =JOptionPane.showInputDialog("\nIntroduzca opción (1-4):");  
              opcion=Integer.parseInt(opcion1);
             
              switch (opcion){
                  case 1:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 1");
                      
                      
                      
                      
                      break;
                   case 2:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 2");
                      mostrar1.RegistroCarnet();
                      
                      
                      
                      break;
                   case 3:
                      JOptionPane.showMessageDialog(null,"has seleccinado la opcion 3");
                      mostrar2.Facturador();
                      
                      
                      break;
                   case 4:
                      JOptionPane.showMessageDialog(null,">>SALIENDO<<");
                      salir = true;
                      break;
                   default :
                         JOptionPane.showMessageDialog(null," solo numeros entre 1 y 4");
               }
              
             }
         }
        
    }
    
    
    
