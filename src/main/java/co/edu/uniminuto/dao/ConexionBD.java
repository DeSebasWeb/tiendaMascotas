package co.edu.uniminuto.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConexionBD {
    private String usuario;
    private String contra;
    private String puerto;
    private String servidor;
    private String nombreBD;
    private String cadena;
    Connection conex;

    public ConexionBD() {
        this.usuario = "root";
        this.contra = "";
        this.puerto = "3306";
        this.servidor = "localhost";
        this.nombreBD = "inventario";
        this.cadena = "jdbc:mysql://"+this.servidor+":"+this.puerto+"/"+this.nombreBD;
        this.conex = null;
    }
    
    private Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conex = DriverManager.getConnection(this.cadena,this.usuario,this.contra);
            System.out.println("Hay conexion a la base de datos");
        } catch(Exception e) {
            System.out.println("No hay conexion con la base de datos"+e.getMessage());
        }     
        return this.conex;
    }
    
    public Connection getConectar(){
        return this.conectar(); 
    }
}