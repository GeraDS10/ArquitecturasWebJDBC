package DerbyDAO;

import Modelos.FacturaProducto;
import ModelosDAO.FacturaProductoDAO;
import com.sun.jdi.connect.spi.Connection;

import java.net.ConnectException;
import java.util.List;

public class DerbyFacturaProductoDAO implements FacturaProductoDAO {

    private Connection conn;

    public DerbyFacturaProductoDAO(Connection conn) {
        this.conn = conn;
    }

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
