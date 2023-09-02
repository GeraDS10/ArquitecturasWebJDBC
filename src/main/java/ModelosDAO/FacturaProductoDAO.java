package ModelosDAO;

import Modelos.Factura;
import Modelos.FacturaProducto;

import java.util.ArrayList;
import java.util.List;

public interface FacturaProductoDAO {

    public void insertarFacturaProducto(int idFactura, int idProducto, int cantidad);
    public FacturaProducto obtenerFacturaProductoPorIdFactura(int idFactura);
    public List obtenerFacturaProductoPorIdProducto(int idProducto);
    public int obtenerCantidadProductosDeFactura(int idFactura);
    public ArrayList<Factura> obtenerFacturas();
}
