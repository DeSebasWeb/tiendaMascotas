package co.edu.uniminuto.dao;
    import co.edu.uniminuto.inventario.JuguetesPerro;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JOptionPane;

public class JuguetesPerroDao {
    ConexionBD conexion;
    PreparedStatement statement;

    public JuguetesPerroDao() {
       conexion = new ConexionBD();
       this.statement = null;
    }

    public JuguetesPerro registrarJuguete(JuguetesPerro juguete){
        Connection con = conexion.getConectar();
        String query = "INSERT INTO juguete_p VALUES(?,?,?,?,?)";
        try {
            if (this.statement == null){
                this.statement = con.prepareStatement(query);
                this.statement.setString(1, juguete.getCodigo());
                this.statement.setString(2, juguete.getNombre());
                this.statement.setDouble(3, juguete.getPrecio());
                this.statement.setString(4, juguete.getDescripcion());
                this.statement.setInt(5, juguete.getCantidad());
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
        return juguete;
    }

}
