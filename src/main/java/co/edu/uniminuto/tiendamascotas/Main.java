package co.edu.uniminuto.tiendamascotas;

import co.edu.uniminuto.dao.ConexionBD;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.getConectar();
}
    
}
