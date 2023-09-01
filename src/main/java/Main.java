import DAOFactory.DAOFactory;
import Helpers.CreadorTablas;
import Helpers.PobladorTablas;
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
        DAOFactory mySQL = DAOFactory.createFactory(1);
        CreadorTablas tc = new CreadorTablas();
        tc.crearTablas(mySQL.createConnection());
        PobladorTablas tp = new PobladorTablas();
        tp.poblarTablas(mySQL.createConnection());

    }
}
