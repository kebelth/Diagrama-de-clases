/*
* Modulo de facturacion 
*
*
 */
package proyectofinal;

import javax.swing.JOptionPane;
public class Factura {

     public String Usuarios;
    public String Código_de_Identificación;
    public String Nombre_del_Libro;
    public String Fecha;
    Factura Arreglo4[]= new Factura[10];
      
public Factura(){
    
    }
    
    public Factura(String Usuarios,String Código_de_Identificación,String Nombre_del_Libro,String Fecha){
        this.Usuarios= Usuarios;
        this.Código_de_Identificación= Código_de_Identificación;
        this.Nombre_del_Libro= Nombre_del_Libro;
        this.Fecha =  Fecha; 
    }
   
    public void Facturador(){
        

            JOptionPane.showMessageDialog(null,"\n>>> Modulo de Facturacion de la biblioteca Gothan. <<<"
                                                                                + "\n  Por favor ingrese los datos necesarios que se le solicitan "
                                                                                + "\n   ** De no ser correctos se rechazara la solicitud   **       "
                                                                                + "\n         >>>>>>>>>>>>><<<<<<<<<<<<<<<<<<    ");
           
             int filas=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas:  "));
           Factura Factu[]= new Factura[filas];
            

            for(int x=0;x<Factu.length;x++){
                        Usuarios= JOptionPane.showInputDialog("Diigte el usuario: ");
                        Código_de_Identificación= JOptionPane.showInputDialog(" Digite el codigo de identificacion  del libro : ");
                        Nombre_del_Libro = JOptionPane.showInputDialog(" Digite el nombre del libro : ");
                       Fecha = JOptionPane.showInputDialog("Digite la fecha del retiro: ");
  
                
               Factu[x] = new Factura(Usuarios,Código_de_Identificación,Nombre_del_Libro,Fecha);
             
            }
            
             for(int i=0; i< Factu.length;i++){
           JOptionPane.showMessageDialog(null,"   >>Factura <<  "+(i+1)+
                                                                        "\n.>>>>>Usuario: "+Factu[i].Usuarios+
                                                                         "\n.>>>>>El codigo del libro es : "+Factu[i].Código_de_Identificación+
                                                                         "\n.>>>>>Nombre del libro : "+ Factu[i].Nombre_del_Libro+
                                                                         "\n.>>>>>Fecha de retiro : "+ Factu[i].Fecha+
                                                                          "\n.>>>>>Usted tiene 2 semanas para devolver el libro<<<<< "                                                                          );
           
           }
            
            
            
            
            
            
            
            
            
            
    }
    
     
    
    
}
