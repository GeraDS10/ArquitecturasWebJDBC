package ModelosDAO;

import java.util.List;

public interface ProductoDAO {

    public void insertarProducto(int idProducto, String nombre, float valor);
    public void eliminarProducto(int idProducto);
    public float obtenerValorPorId(int idProducto);
    public float obtenerValorPorNombre(String nombre);
    public List obtenerProductos();

    //Considerar -> actualizar Precio / actualizar Nombre
}
