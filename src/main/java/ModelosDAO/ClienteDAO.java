package ModelosDAO;

import Modelos.Cliente;

public interface ClienteDAO {

    public void insertarCliente();
    public void eliminarCliente();
    public void actualizarNombreCliente(String nombre);
    public void actualizarEmailCliente(String email);
    public Cliente obtenerClientePorId(int id);

    public Cliente obtenerClientePorEmail(String email);

    public Cliente obtenerClientePorNombre(String nombre);

}
