package DerbyDAO;

import Modelos.Cliente;
import ModelosDAO.ClienteDAO;
import com.sun.jdi.connect.spi.Connection;

import java.util.ArrayList;

public class DerbyClienteDAO implements ClienteDAO {

    private Connection conn;

    public DerbyClienteDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertarCliente(int id, String nombre, String email) {

    }

    @Override
    public Cliente obtenerClienteMasFacturado() {
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
    public ArrayList obtenerClientes() {
        return null;
    }
}
