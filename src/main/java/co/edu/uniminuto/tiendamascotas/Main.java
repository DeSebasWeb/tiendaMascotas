package co.edu.uniminuto.tiendamascotas;

import co.edu.uniminuto.dao.ComidaGatoDao;
import co.edu.uniminuto.dao.ComidaPerroDao;
import co.edu.uniminuto.dao.ConexionBD;
import co.edu.uniminuto.inventario.ComidaGato;
import co.edu.uniminuto.inventario.ComidaPerro;

public class Main {
    public static void main(String[] args) {
        
        ComidaPerro comida= new ComidaPerro("754433", "Catchow", 5000, "Cachorros", "no", "Comida especializada para gatos cachorros", 3);
        ComidaPerroDao dao = new ComidaPerroDao();
        dao.registrarComida(comida);
    }
    
}
