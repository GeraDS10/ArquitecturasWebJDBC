package ModelosDAO;

import Modelos.Producto;

import java.util.List;

public interface ProductoDAO {

    public void insertarProducto(int idProducto, String nombre, float valor);

    public Producto obtenerProductoMayorRecaudacion();
    public void eliminarProducto(int idProducto);
    public float obtenerValorPorId(int idProducto);
    public float obtenerValorPorNombre(String nombre);
    public List obtenerProductos();

    //Considerar -> actualizar Precio / actualizar Nombre
}
