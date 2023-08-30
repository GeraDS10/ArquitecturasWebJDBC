package ModelosDAO;

import Modelos.Factura;

import java.util.List;

public interface FacturaDAO {

    public void insertarFactura(int idCliente);
    public void eliminarFactura(int idFactura);
    public Factura obtenerFacturaPorId(int idFactura);
    public List obtenerFacturasPorIdCliente(int idCliente);
}
