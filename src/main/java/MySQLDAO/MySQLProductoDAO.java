package MySQLDAO;

import DAOFactory.MySQLDAOFactory;
import Modelos.Producto;
import ModelosDAO.ProductoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySQLProductoDAO implements ProductoDAO {

    private Connection conn = null;

    public MySQLProductoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarProducto(int idProducto, String nombre, float valor) {
        String insert = "INSERT INTO producto(idProducto, nombre, valor) VALUES (?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, idProducto);
            ps.setString(2, nombre);
            ps.setFloat(3,valor);
            ps.executeUpdate();
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Producto obtenerProductoMayorRecaudacion() {
        //Producto resultado = new Producto();
        /*
        SELECT p.idProducto, p.nombre, p.valor, SUM(fp.cantidad) * p.valor AS recaudacion
            FROM factura_producto fp INNER JOIN producto p
                on fp.idProducto = p.idProducto
            GROUP BY p.idProducto
            ORDER BY recaudacion DESC;
         */
        return null;
    }

    @Override
    public void eliminarProducto(int idProducto) {

    }

    @Override
    public float obtenerValorPorId(int idProducto) {
        return 0;
    }

    @Override
    public float obtenerValorPorNombre(String nombre) {
        return 0;
    }

    @Override
    public List obtenerProductos() {
        return null;
    }
}
