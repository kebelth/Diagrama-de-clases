
package proyectofinal;

import javax.swing.JOptionPane;

public class Carnet {
   
    public  String  nombre, apellidos, cedula,correo;
    public int  telf;
    
 
      
    
    public void RegistroCarnet()
    {
        JOptionPane.showMessageDialog(null ,">>Ingrese los datos que se le solicitan<<");
    
          nombre= JOptionPane.showInputDialog(" Digite su nombre: ");
         apellidos = JOptionPane.showInputDialog(" Digite sus apellidos: ");
     
         cedula= JOptionPane.showInputDialog("Digite su cedula: ");
        
         correo= JOptionPane.showInputDialog("DIigte su correo: ");
        
        String  telefono= JOptionPane.showInputDialog("Digite su telefono : ");
        
        telf = Integer.parseInt(telefono);
        
        JOptionPane.showMessageDialog(null,"Su carnet de la  biblioteca esta listo "
                + "\n.Nombre: "+nombre
                +"\n.Apellidos: "+apellidos
                +"\n.cedula : "+cedula
                +" "+" \n.numero de telefono : "+ telf
                +" "+"\n.Correo:"+ correo);
               
        
    }
    
    
    
   /* public Carnet(String  nombre,String  apellidos,String  cedula,String  correo,int  telf){
        this.nombre =nombre;
        this. apellidos = apellidos;
        this.cedula =cedula;
        this.correo=correo;
        this.telf=telf;
      */  

    
    }
    
       
   

