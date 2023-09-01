import DAOFactory.DAOFactory;
import Modelos.Cliente;
import ModelosDAO.ClienteDAO;
import MySQLDAO.MySQLClienteDAO;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DAOFactory sql = DAOFactory.createFactory(1);
        ClienteDAO tablaCliente = sql.getClienteDAO();
        tablaCliente.crearTabla();
        CSVParser parser = null;
        try {
            parser = CSVFormat.DEFAULT.withHeader().parse(new
                    FileReader("C:\\Users\\Lolo\\Desktop\\dataPracticoArq\\productos.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord row: parser) {
            tablaCliente.insertarCliente(Integer.parseInt(row.get("idProducto")),row.get("nombre"),row.get("valor"));

            /*System.out.println(row.get("idProducto"));
            System.out.println(row.get("nombre"));
            System.out.println(row.get("valor"));
            System.out.println();
            */
            ArrayList<Cliente> clientes = tablaCliente.obtenerClientes();
            for (Cliente c: clientes
                 ) {
                System.out.println(c);
            }
        }
    }
}
