package ModelosDAO;

import Modelos.Cliente;

import java.util.ArrayList;
import java.util.List;

public interface ClienteDAO {

    public void insertarCliente(int id, String nombre, String email);

    public Cliente obtenerClienteMasFacturado();

    public Cliente obtenerClientePorId(int id);


    public ArrayList obtenerClientes();

}
