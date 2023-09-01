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

    public void crearTabla(){
        /*
        System.out.println("Chequeando tabla");
        String select = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_name = 'cliente')";
        try{
            Connection conn = MySQLDAOFactory.createConnection();
            PreparedStatement ps = conn.prepareStatement(select);
            ResultSet resultSet = ps.executeQuery();
            System.out.println(resultSet.next());
            if (!resultSet.next()){
                System.out.println("Creando tabla Clientes");
                crearTablaCliente(conn);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

         */
        Connection conn = MySQLDAOFactory.createConnection();
        crearTablaCliente(conn);
    }

    private void crearTablaCliente(Connection conn){
        String table = "CREATE TABLE cliente(" +
                "id INT," +
                "nombre VARCHAR(500)," +
                "email VARCHAR(150)," +
                "PRIMARY KEY(id))";
        try {
            conn.prepareStatement(table).execute();
            conn.commit();
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void insertarCliente(int id, String nombre, String email) {
        String insert = "INSERT INTO cliente(id, nombre, email) VALUES (?,?,?)";
        try {
            Connection conn = MySQLDAOFactory.createConnection();
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
            Connection conn = MySQLDAOFactory.createConnection();
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
