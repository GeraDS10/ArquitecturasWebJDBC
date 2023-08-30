package ModelosDAO;

public interface ProductoDAO {

    public void insertarProducto(int idProducto, String nombre, float valor);
    public void eliminarProducto(int idProducto);
    public float obtenerValorPorId(int idProducto);
    public float obtenerValorPorNombre(String nombre);

    //Considerar -> actualizar Precio / actualizar Nombre
}
