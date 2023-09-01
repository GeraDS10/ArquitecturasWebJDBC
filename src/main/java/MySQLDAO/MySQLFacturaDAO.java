package MySQLDAO;

import DAOFactory.MySQLDAOFactory;
import Modelos.Factura;
import ModelosDAO.FacturaDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySQLFacturaDAO implements FacturaDAO {

    private Connection conn;

    public MySQLFacturaDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarFactura(int idFactura, int idCliente) {
        String insert = "INSERT INTO factura(idFactura, idCliente) VALUES (?,?)";
        try {
            //Connection conn = MySQLDAOFactory.createConnection();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, idFactura);
            ps.setInt(2, idCliente);
            ps.executeUpdate();
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
