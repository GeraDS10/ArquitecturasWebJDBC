import DAOFactory.DAOFactory;
import Helpers.CreadorTablas;
import Helpers.PobladorTablas;
import Modelos.Cliente;
import Modelos.Producto;
import ModelosDAO.ClienteDAO;
import ModelosDAO.ProductoDAO;

public class Main {
    public static void main(String[] args) {
        DAOFactory mySQL = DAOFactory.createFactory(1);
        DAOFactory derby = DAOFactory.createFactory(2);

        /* Tablas MySQL -->
        CreadorTablasSQL tc = new CreadorTablas();
        tc.crearTablas(mySQL.createConnection());
        PobladorTablasSQL tp = new PobladorTablas();
        tp.poblarTablas(mySQL.createConnection());
         */

        /* Tablas Derby

         */
        CreadorTablas tc = new CreadorTablas();
        tc.crearTablas(derby.createConnection());
        PobladorTablas tp = new PobladorTablas();
        tp.poblarTablas(derby.createConnection());




        /* Consultas MySQL -->
        ClienteDAO cDAO = mySQL.getClienteDAO();
        Cliente cliente = cDAO.obtenerClienteMasFacturado();
        System.out.println( "Cliente id: " + cliente.getId() + "\n" + "Nombre: " + cliente.getNombre() + "\n" + "Email: " + cliente.getEmail() );

        ProductoDAO pDAO = mySQL.getProductoDAO();
        Producto producto = pDAO.obtenerProductoMayorRecaudacion();
        System.out.println( "Producto id: " + producto.getIdProducto() + "\n" + "Nombre: " + producto.getNombre() + "\n" + "Valor: " + producto.getValor() );
         */


    }
}
