package MySQLDAO;

import ModelosDAO.ProductoDAO;

import java.util.List;

public class MySQLProductoDAO implements ProductoDAO {
    @Override
    public void insertarProducto(int idProducto, String nombre, float valor) {

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
