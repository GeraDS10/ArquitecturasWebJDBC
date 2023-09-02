package DerbyDAO;

import Modelos.Producto;
import ModelosDAO.ProductoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DerbyProductoDAO implements ProductoDAO {

    private Connection conn;

    public DerbyProductoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarProducto(int idProducto, String nombre, float valor) {

    }

    @Override
    public Producto obtenerProductoMayorRecaudacion() {
        String select = " SELECT p.idProducto, p.nombre, p.valor, SUM(fp.cantidad) * p.valor AS recaudacion " +
                " FROM factura_producto fp INNER JOIN producto p " +
                " on fp.idProducto = p.idProducto " +
                " GROUP BY p.idProducto, p.nombre, p.valor " +
                " ORDER BY recaudacion DESC " +
                " OFFSET 0 ROWS FETCH NEXT 1 ROW ONLY ";
        Producto producto = null;
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                producto = new Producto(rs.getInt(1), rs.getString(2), rs.getFloat(3));
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }



    @Override
    public float obtenerValorPorId(int idProducto) {
        return 0;
    }


    @Override
    public List obtenerProductos() {
        return null;
    }
}
