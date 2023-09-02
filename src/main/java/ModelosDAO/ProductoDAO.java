package ModelosDAO;

import Modelos.Producto;

import java.util.List;

public interface ProductoDAO {

    public void insertarProducto(int idProducto, String nombre, float valor);

    public Producto obtenerProductoMayorRecaudacion();
    public float obtenerValorPorId(int idProducto);
    public List obtenerProductos();

    //Considerar -> actualizar Precio / actualizar Nombre
}
