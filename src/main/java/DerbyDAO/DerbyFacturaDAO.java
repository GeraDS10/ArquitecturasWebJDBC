package DerbyDAO;

import Modelos.Cliente;
import Modelos.Factura;
import ModelosDAO.FacturaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public Factura obtenerFacturaPorId(int idFactura) {
        return null;
    }

    @Override
    public List obtenerFacturasPorIdCliente(int idCliente) {
        return null;
    }

    @Override
    public ArrayList<Factura> obtenerFacturas() {
        String select = " SELECT *" +
                "FROM factura ";
        ArrayList<Factura> facturas = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Factura f = new Factura(rs.getInt(1), rs.getInt(2));
                facturas.add(f);
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
    }
}
