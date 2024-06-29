package co.edu.uniminuto.tiendamascotas;

import co.edu.uniminuto.dao.ComidaGatoDao;
import co.edu.uniminuto.dao.ComidaPerroDao;
import co.edu.uniminuto.dao.ConexionBD;
import co.edu.uniminuto.dao.JuguetesGatoDao;
import co.edu.uniminuto.dao.JuguetesPerroDao;
import co.edu.uniminuto.inventario.ComidaGato;
import co.edu.uniminuto.inventario.ComidaPerro;
import co.edu.uniminuto.inventario.JuguetesGato;
import co.edu.uniminuto.inventario.JuguetesPerro;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int seleccion;
        int seleccion2;
        String codigoBarras;
        String marca;
        double precio;
        String tamaño;
        String comidaEspecial = "";
        String descripcion;
        int cantidad;
        String nombre;
        
        /*
        
        
        JuguetesGato juguete = new JuguetesGato("754433", "Rascador", 70.540, "Rascador especializado para gatos", 3);
        JuguetesGatoDao dao = new JuguetesGatoDao();
        dao.registrarJuguete(juguete);
        
        
        
        */
        
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de inventario de la veterinaria");
        while(true){
            try {
                seleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al inventario de la tienda de mascotas\nQue desea hacer el dia de hoy?\n1)Introducir nuevo paquete de comida\n2)Introducir nuevo juguete\n3)salir del programa"));
                if(seleccion ==1){
                    seleccion2 = Integer.parseInt(JOptionPane.showInputDialog("1)Paquete de comida para perro\n2)Paquete de comida para gato"));
                    if (seleccion2 ==1){
                        codigoBarras = JOptionPane.showInputDialog("Cual es el codigo de barras de la comida? (Recuerde que debe der maximo 6 digitos)");
                        marca = JOptionPane.showInputDialog("Cual es la marca de la comida?");
                        precio= Double.parseDouble(JOptionPane.showInputDialog("Cual es el precio de la comida?"));
                        tamaño= JOptionPane.showInputDialog("Para que tamaño de perro es la comida? cachorro o adulto");
                        comidaEspecial= JOptionPane.showInputDialog("La comida es para un fin en especial como cuidado de riñones, cuidado de piel etc...\n introduzca 'si' para confrmar \t introduzca 'no para negar'");
                        descripcion = JOptionPane.showInputDialog("De la descripcion de la comida, para que raza especificamente, cuidados etc...");
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos paquetes de comida va a introducir?")); 
                        
                        ComidaPerro comida= new ComidaPerro(codigoBarras, marca, precio, tamaño, comidaEspecial, descripcion, cantidad);
                        ComidaPerroDao dao = new ComidaPerroDao();
                        dao.registrarComida(comida);
                        break;
                    }else if(seleccion2==2){
                        codigoBarras = JOptionPane.showInputDialog("Cual es el codigo de barras de la comida? (Recuerde que debe der maximo 6 digitos)");
                        marca = JOptionPane.showInputDialog("Cual es la marca de la comida?");
                        precio= Double.parseDouble(JOptionPane.showInputDialog("Cual es el precio de la comida?"));
                        tamaño= JOptionPane.showInputDialog("Para que tamaño de gato es la comida? cachorro o adulto");
                        comidaEspecial= JOptionPane.showInputDialog("La comida es para un fin en especial como cuidado de riñones, cuidado de piel etc...\n introduzca 'si' para confrmar \t introduzca 'no para negar'");
                        descripcion = JOptionPane.showInputDialog("De la descripcion de la comida, para que raza especificamente, cuidados etc...");
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos paquetes de comida va a introducir?")); 
                        
                        ComidaGato comida= new ComidaGato(codigoBarras, marca, precio, tamaño, comidaEspecial, descripcion, cantidad);
                        ComidaGatoDao dao = new ComidaGatoDao();
                        dao.registrarComida(comida);
                        break;
                    }
                }else if(seleccion==2){
                    seleccion2 = Integer.parseInt(JOptionPane.showInputDialog("1)Juguete para perro\n2)Juguete para gato"));
                    if (seleccion2 ==1){
                        codigoBarras = JOptionPane.showInputDialog("Cual es el codigo de barras del juguete? (Recuerde que debe der maximo 6 digitos)");
                        nombre = JOptionPane.showInputDialog("Cual es el nombre del juguete");
                        precio= Double.parseDouble(JOptionPane.showInputDialog("Cual es el precio del juguete?"));
                        descripcion = JOptionPane.showInputDialog("Descripcion del juguete");
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos juguetes va a introducir?")); 
                        
                        JuguetesPerro juguete = new JuguetesPerro(codigoBarras, nombre, precio, descripcion, cantidad);
                        JuguetesPerroDao dao = new JuguetesPerroDao();
                        dao.registrarJuguete(juguete);
                    }else if(){
                    }
                }else if(seleccion==3){
                    JOptionPane.showMessageDialog(null, "Usted ha salido del inventario");
                    break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La opcion que quiere no esta disponible");
            }
            
            
        }
    }
    
}
