package co.edu.uniminuto.dao;

import co.edu.uniminuto.inventario.ComidaPerro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ComidaPerroDao {
     ConexionBD conexion;
    PreparedStatement statement;

    public ComidaPerroDao() {
        conexion = new ConexionBD();
        this.statement = null;
    }

    
    
    public ComidaPerro registrarComida(ComidaPerro comida){
        Connection con = conexion.getConectar();
        String query = "INSERT INTO comida_p VALUES(?,?,?,?,?,?,?)";
        try {
            if (this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, comida.getCodigo());
                this.statement.setString(2, comida.getMarca());
                this.statement.setDouble(3, comida.getPrecio());
                this.statement.setString(4, comida.getTamaño());
                this.statement.setString(5, comida.getComidaEspecial());
                this.statement.setString(6, comida.getDescripcion());
                this.statement.setInt(7, comida.getCantidad());
                int respuesta = this.statement.executeUpdate();
                if(respuesta > 0)JOptionPane.showMessageDialog(null, "Se ha registrado el producto");
            
            }
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
        } finally {
            if(con!= null){
                try {
                    this.statement.close();
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComidaGatoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return comida;
    }
    

}
