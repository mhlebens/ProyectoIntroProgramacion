/*
Nombre: Heladería "Dulce Placer"
Entregable: Primer avance de proyecto
Autores: 
Campos Zamora Jared
Céspedes Vindas Angel
Mata Halleslebens Fernanda
Montero Sánchez Valerie
*/

package com.mycompany.g2_proyectoprogramacion;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class G2_ProyectoProgramacion {

    public static void main(String[] args) {
        //Declaración de variables
        String admin="admin";
        String nombreUsuario=JOptionPane.showInputDialog("Ingrese el nombre de usuario: ");
        int contraseña=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la contraseña: "));

        //Condicional para el login
        if (nombreUsuario.equals(admin) && contraseña == 1234){
            ImageIcon icono = new ImageIcon("C:\\Users\\Annia\\Desktop\\logo.jpeg");    
            JOptionPane.showMessageDialog(null, "Bienvenid@", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE, icono);
        //Menú para los pedidos que desea realizar
        int menu=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la acción que desea realizar: "+
                                                                                    "\n 1. Tamaño del Cono"+
                                                                                    "\n 2. Cantidad de Helado" + 
                                                                                    "\n 3. Sabores"+
                                                                                    "\n 4. Ver inventario de los productos"+
                                                                                    "\n 5. Salir"));
        switch (menu) {
            case 1:
                //Condición para pedir el tamaño del cono
                JOptionPane.showMessageDialog(null, "Cono");
                break;
            case 2:
                //Condición para pedir cantidad de helado
                JOptionPane.showMessageDialog(null, "Cantidad de helado");
                break;
            case 3:
                //Condición para pedir los sabores
                JOptionPane.showMessageDialog(null, "Sabores");
                break;
            case 4:
                //Condición para ver el inventario de los productos
                JOptionPane.showMessageDialog(null, "Toppings");
                break;
            default:
                //Es como un else, tiene las excepciones
                JOptionPane.showMessageDialog(null, "Número inválido");
                break;
                }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos, intente de nuevo");
                }
    }
}
