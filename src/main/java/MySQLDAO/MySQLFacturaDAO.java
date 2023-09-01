package MySQLDAO;

import Modelos.Factura;
import ModelosDAO.FacturaDAO;

import java.util.List;

public class MySQLFacturaDAO implements FacturaDAO {
    @Override
    public void insertarFactura(int idCliente) {

    }

    @Override
    public void eliminarFactura(int idFactura) {

    }

    @Override
    public Factura obtenerFacturaPorId(int idFactura) {
        return null;
    }

    @Override
    public List obtenerFacturasPorIdCliente(int idCliente) {
        return null;
    }

    @Override
    public List obtenerFacturas() {
        return null;
    }
}
