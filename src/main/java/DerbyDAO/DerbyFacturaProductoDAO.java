package DerbyDAO;

import Modelos.Factura;
import Modelos.FacturaProducto;
import ModelosDAO.FacturaProductoDAO;
import java.sql.Connection;
import java.util.ArrayList;
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

    @Override
    public ArrayList<Factura> obtenerFacturas() {
        return null;
    }
}
