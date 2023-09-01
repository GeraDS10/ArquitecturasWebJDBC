package MySQLDAO;

import DAOFactory.MySQLDAOFactory;
import Modelos.Cliente;
import ModelosDAO.ClienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLClienteDAO implements ClienteDAO {
    private Connection conn = null;
    public MySQLClienteDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarCliente(int id, String nombre, String email) {
        String insert = "INSERT INTO cliente(id, nombre, email) VALUES (?,?,?)";
        try {
            //Connection conn = MySQLDAOFactory.createConnection();
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, id);
            ps.setString(2, nombre);
            ps.setString(3, email);
            ps.executeUpdate();
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente obtenerClienteMasFacturado() {
        /*
        SELECT SUM(f.idCliente) AS cantidadFacturas, c.nombre, c.idCliente, c.email FROM cliente c INNER JOIN factura f
            on c.idCliente = f.idCliente
        GROUP BY c.idCliente
        ORDER BY cantidadFacturas DESC;
         */
        return null;
    }

    @Override
    public void eliminarCliente(int id) {

    }

    @Override
    public void actualizarNombreCliente(String nombre) {

    }

    @Override
    public void actualizarEmailCliente(String email) {

    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        return null;
    }

    @Override
    public Cliente obtenerClientePorEmail(String email) {
        return null;
    }

    @Override
    public Cliente obtenerClientePorNombre(String nombre) {
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        String insert = "SELECT * FROM cliente";
        ArrayList<Cliente> resultado = new ArrayList<>();
        try {
            //Connection conn = MySQLDAOFactory.createConnection();
            PreparedStatement ps = conn.prepareStatement(insert);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Cliente c = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                resultado.add(c);
            }
            //conn.close();
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
