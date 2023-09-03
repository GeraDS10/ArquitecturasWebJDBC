package ModelosDAO;

import Modelos.Factura;
import Modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public interface FacturaDAO {

    public void insertarFactura(int idFactura, int idCliente);
    public Factura obtenerFacturaPorId(int idFactura);
    public ArrayList<Factura> obtenerFacturasPorIdCliente(int idCliente);
    public ArrayList<Factura> obtenerFacturas();
}
