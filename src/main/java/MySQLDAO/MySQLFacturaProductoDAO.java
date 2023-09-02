package MySQLDAO;

import DAOFactory.MySQLDAOFactory;
import Modelos.Factura;
import Modelos.FacturaProducto;
import ModelosDAO.FacturaProductoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLFacturaProductoDAO implements FacturaProductoDAO {

    private Connection conn = null;

    public MySQLFacturaProductoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarFacturaProducto(int idFactura, int idProducto, int cantidad) {
        String insert = "INSERT INTO factura_producto(idFactura, idProducto, cantidad) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, idFactura);
            ps.setInt(2, idProducto);
            ps.setInt(3,cantidad);
            ps.executeUpdate();
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public FacturaProducto obtenerFacturaProductoPorIdFactura(int idFactura) {
        return null;
    }

    @Override
    public List obtenerFacturaProductoPorIdProducto(int idProducto) {
        return null;
    }

    @Override
    public int obtenerCantidadProductosDeFactura(int idFactura) {
        return 0;
    }

    @Override
    public ArrayList<Factura> obtenerFacturas() {
        return null;
    }
}
