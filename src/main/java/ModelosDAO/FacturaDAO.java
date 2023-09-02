package ModelosDAO;

import Modelos.Factura;

import java.util.ArrayList;
import java.util.List;

public interface FacturaDAO {

    public void insertarFactura(int idFactura, int idCliente);
    public Factura obtenerFacturaPorId(int idFactura);
    public List obtenerFacturasPorIdCliente(int idCliente);
    public ArrayList<Factura> obtenerFacturas();
}
