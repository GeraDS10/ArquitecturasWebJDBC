package DerbyDAO;

import Modelos.Producto;
import ModelosDAO.ProductoDAO;
import com.sun.jdi.connect.spi.Connection;

import java.util.List;

public class DerbyProductoDAO implements ProductoDAO {

    private Connection conn;

    public DerbyProductoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarProducto(int idProducto, String nombre, float valor) {

    }

    @Override
    public Producto obtenerProductoMayorRecaudacion() {
        return null;
    }

    @Override
    public void eliminarProducto(int idProducto) {

    }

    @Override
    public float obtenerValorPorId(int idProducto) {
        return 0;
    }

    @Override
    public float obtenerValorPorNombre(String nombre) {
        return 0;
    }

    @Override
    public List obtenerProductos() {
        return null;
    }
}
