package ModelosDAO;

import Modelos.FacturaProducto;

import java.util.List;

public interface FacturaProductoDAO {

    public void insertarFacturaProducto(int idFactura, int idProducto, int cantidad);
    public void eliminarFacturaProducto(int idFactura);
    public FacturaProducto obtenerFacturaProductoPorIdFactura(int idFactura);
    public List obtenerFacturaProductoPorIdProducto(int idProducto);
    public int obtenerCantidadProductosDeFactura(int idFactura);
}
