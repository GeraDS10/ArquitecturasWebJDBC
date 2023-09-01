package ModelosDAO;

import Modelos.Cliente;

import java.util.ArrayList;
import java.util.List;

public interface ClienteDAO {

    public void insertarCliente(int id, String nombre, String email);

    public Cliente obtenerClienteMasFacturado();
    public void eliminarCliente(int id);
    public void actualizarNombreCliente(String nombre);
    public void actualizarEmailCliente(String email);
    public Cliente obtenerClientePorId(int id);

    public Cliente obtenerClientePorEmail(String email);

    public Cliente obtenerClientePorNombre(String nombre);
    public ArrayList obtenerClientes();

}
