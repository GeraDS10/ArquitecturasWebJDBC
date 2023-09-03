package MySQLDAO;

import Modelos.FacturaProducto;
import ModelosDAO.FacturaProductoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String select = "SELECT fp.idFactura, fp.idProducto, fp.cantidad" +
                "FROM factura_producto fp" +
                "WHERE fp.idFactura = " + idFactura;
        FacturaProducto fp = null;
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                fp = new FacturaProducto(rs.getInt(1), rs.getInt(2), rs.getInt(3));

            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fp;
    }

    @Override
    public ArrayList<FacturaProducto> obtenerFacturaProductoPorIdProducto(int idProducto) {
        String select = "SELECT fp.idFactura, fp.idProducto, fp.cantidad" +
                "FROM factura_producto fp" +
                "WHERE fp.idFactura = " + idProducto;
        ArrayList<FacturaProducto> fp = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                FacturaProducto f = new FacturaProducto(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                fp.add(f);
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fp;
    }

    @Override
    public ArrayList<FacturaProducto> obtenerFacturas() {
        String select = "SELECT * " +
                "FROM factura_producto";
        ArrayList<FacturaProducto> fp = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                FacturaProducto f = new FacturaProducto(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                fp.add(f);
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fp;
    }
}

