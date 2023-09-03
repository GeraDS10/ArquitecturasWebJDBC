import DAOFactory.DAOFactory;
import Helpers.CreadorTablas;
import Helpers.PobladorTablas;
import Modelos.Cliente;
import Modelos.Factura;
import Modelos.Producto;
import ModelosDAO.ClienteDAO;
import ModelosDAO.FacturaDAO;
import ModelosDAO.ProductoDAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Factory MySQL
        //DAOFactory mySQL = DAOFactory.createFactory(1);

        //Factory Derby
        //DAOFactory derby = DAOFactory.createFactory(2);


        // Creacion y poblar Tablas MySQL (PRESUPONEN DB LLAMADA practicodb -->
        /*
        //String ubicacion = "ubicacion carpeta contenedora archivos ccv";
        CreadorTablas tc = new CreadorTablas();
        tc.crearTablas(mySQL.createConnection());

        PobladorTablas tp = new PobladorTablas();
        tp.poblarTablas(mySQL.createConnection(),ubicacion);


         */


        // Consultas MySQL -->
        /*

         // Punto 3 práctico

        ClienteDAO cDAO = mySQL.getClienteDAO();
        Cliente cliente = cDAO.obtenerClienteMasFacturado();
        System.out.println( "Cliente id: " + cliente.getId() + "\n" + "Nombre: " + cliente.getNombre() + "\n" + "Email: " + cliente.getEmail() );

        // Punto 4 práctico

        ProductoDAO pDAO = mySQL.getProductoDAO();
        Producto producto = pDAO.obtenerProductoMayorRecaudacion();
        System.out.println( "Producto id: " + producto.getIdProducto() + "\n" + "Nombre: " + producto.getNombre() + "\n" + "Valor: " + producto.getValor() );
         */


        // Crear y poblar Tablas Derby -->
         /*
       CreadorTablas tc = new CreadorTablas();
        tc.crearTablas(derby.createConnection());
        PobladorTablas tp = new PobladorTablas();
        tp.poblarTablas(derby.createConnection());
         */



        // Consultas Derby -->
        /*

        // Punto 3 práctico
         ClienteDAO DerbyClienteDAO = derby.getClienteDAO();
        Cliente clienteDerby = DerbyClienteDAO.obtenerClienteMasFacturado();
        System.out.println( "Cliente id: " + clienteDerby.getId() + "\n" + "Nombre: " + clienteDerby.getNombre() + "\n" + "Email: " + clienteDerby.getEmail() );


        // Punto 4 práctico
        ProductoDAO DerbyProductoDAO = derby.getProductoDAO();
        Producto productoDerby = DerbyProductoDAO.obtenerProductoMayorRecaudacion();
        System.out.println( "Producto id: " + productoDerby.getIdProducto() + "\n" + "Nombre: " + productoDerby.getNombre() + "\n" + "Valor: " + productoDerby.getValor() );

         */

    }
}
