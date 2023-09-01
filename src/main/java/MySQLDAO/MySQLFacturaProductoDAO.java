package MySQLDAO;

import Modelos.FacturaProducto;
import ModelosDAO.FacturaProductoDAO;

import java.util.List;

public class MySQLFacturaProductoDAO implements FacturaProductoDAO {
    @Override
    public void insertarFacturaProducto(int idFactura, int idProducto, int cantidad) {

    }

    @Override
    public void eliminarFacturaProducto(int idFactura) {

    }

    @Override
    public FacturaProducto obtenerFacturaProductoPorIdFactura(int idFactura) {
        return null;
    }

    @Override
    public List obtenerFacturaProductoPorIdProducto(int idProducto) {
        return null;
    }

    @Override
    public int obtenerCantidadProductosDeFactura(int idFactura) {
        return 0;
    }
}
