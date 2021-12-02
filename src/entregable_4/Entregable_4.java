
package entregable_4;

import javax.swing.JOptionPane;
public class Entregable_4 {

   
    public static void main(String[] args) {
      JOptionPane.showMessageDialog(null,"Bienvenido al menu principal de la Biblioteca de Gotham");
      String Librería;
      String Registro_de_Usuario;
      String Facturas;
      String Salida;
         
       boolean salir= false;
       int opcion;
       Carnet mostrar1=new Carnet();
       
         while(!salir){
             JOptionPane.showMessageDialog(null,"\n>>> MENÚ DE OPCIONES <<<"
                + "\n1. "
                + "\n2.Crear un Carnet de la biblioteca ."
                +"\n3. ."
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
