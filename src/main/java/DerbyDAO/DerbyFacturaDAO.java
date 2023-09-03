package DerbyDAO;


import Modelos.Factura;
import ModelosDAO.FacturaDAO;
import java.sql.*;
import java.util.ArrayList;


public class DerbyFacturaDAO implements FacturaDAO {

    private Connection conn;

    public DerbyFacturaDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarFactura(int idFactura, int idCliente) {
        String insert = "INSERT INTO factura(idFactura, idCliente) VALUES (?,?)";
        try {
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
    public Factura obtenerFacturaPorId(int idFactura) {
        String select = "SELECT f.idFactura, f.idCliente" +
                "FROM factura f" +
                "WHERE f.idFactura = " + idFactura;
        Factura factura = null;
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                factura = new Factura(rs.getInt(1), rs.getInt(2));

            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return factura;
    }

    @Override
    public ArrayList<Factura> obtenerFacturasPorIdCliente(int idCliente) {
        String select = "SELECT f.idFactura, f.idCliente" +
                "FROM factura f" +
                "WHERE f.idFactura = " + idCliente;
        ArrayList<Factura> facturas = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Factura f  = new Factura(rs.getInt(1), rs.getInt(2));
                facturas.add(f);
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
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
