package co.edu.uniminuto.tiendamascotas;

import co.edu.uniminuto.dao.ComidaGatoDao;
import co.edu.uniminuto.dao.ConexionBD;
import co.edu.uniminuto.inventario.ComidaGato;

public class Main {
    public static void main(String[] args) {
        ComidaGato comida= new ComidaGato("754433", "Catchow", 5000, "Cachorros", "no", "Comida especializada para gatos cachorros", 3);
        ComidaGatoDao dao = new ComidaGatoDao();
        dao.registrarComida(comida);
    }
    
}
