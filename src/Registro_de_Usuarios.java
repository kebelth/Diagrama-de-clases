/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Keiren
 */
public class Registro_de_Usuarios {
   
    public  String  nombre, apellidos, cedula,correo;
    public int  telf;
    
 
      
    
    public void RegistroCarnet()
    {
        JOptionPane.showMessageDialog(null ,">>Menu de Creacion de Carnet<<");
    
          nombre= JOptionPane.showInputDialog(" Digite su nombre: ");
         apellidos = JOptionPane.showInputDialog(" Digite sus apellidos: ");
     
         cedula= JOptionPane.showInputDialog("Diigte su cedula: ");
        
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
