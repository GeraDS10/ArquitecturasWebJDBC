package DerbyDAO;

import Modelos.Cliente;
import ModelosDAO.ClienteDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DerbyClienteDAO implements ClienteDAO {

    private Connection conn = null;

    public DerbyClienteDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarCliente(int id, String nombre, String email) {

    }

    @Override
    public Cliente obtenerClienteMasFacturado() {
        String select = "SELECT c.idCliente, c.nombre, c.email, COUNT(f.idFactura) AS cantidadFacturas " +
                "FROM cliente c " +
                "INNER JOIN factura f ON c.idCliente = f.idCliente " +
                "GROUP BY c.idCliente, c.nombre, c.email " +
                "ORDER BY cantidadFacturas DESC " +
                "FETCH FIRST ROW ONLY ";
        Cliente cliente = null;
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        String select = " SELECT c.nombre, c.idCliente, c.email " +
                " FROM cliente c " +
                " WHERE c.id = " +
                id;
        Cliente cliente = null;
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    @Override
    public ArrayList obtenerClientes() {

        String select = " SELECT *" +
                        "FROM cliente ";
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Cliente c = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3));
                clientes.add(c);
            }
            ps.close();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
