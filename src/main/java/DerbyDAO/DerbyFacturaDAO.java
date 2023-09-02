package DerbyDAO;

import Modelos.Factura;
import ModelosDAO.FacturaDAO;
import com.sun.jdi.connect.spi.Connection;

import java.net.ConnectException;
import java.util.List;

public class DerbyFacturaDAO implements FacturaDAO {

    private Connection conn;

    public DerbyFacturaDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarFactura(int idFactura, int idCliente) {

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
