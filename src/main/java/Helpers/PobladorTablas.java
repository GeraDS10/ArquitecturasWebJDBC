package Helpers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PobladorTablas {

    public void poblarTablas(Connection conn){
        poblarTablaCliente(conn);
        poblarTablaFactura(conn);
        poblarTablaProducto(conn);
        poblarTablaFacturaProducto(conn);
    }

    private void poblarTablaCliente(Connection conn){
        CSVParser parser = null;
        try {
            parser = CSVFormat.DEFAULT.withHeader().parse(new
                    FileReader("C:\\Users\\gerar\\Desktop\\Practico_1\\clientes.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord row: parser) {
            String insert = "INSERT INTO cliente(idCliente, nombre, email) VALUES (?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, Integer.parseInt(row.get("idCliente")));
                ps.setString(2, row.get("nombre"));
                ps.setString(3, row.get("email"));
                ps.executeUpdate();
                ps.close();
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void poblarTablaFactura(Connection conn){
        CSVParser parser = null;
        try {
            parser = CSVFormat.DEFAULT.withHeader().parse(new
                    FileReader("C:\\Users\\gerar\\Desktop\\Practico_1\\facturas.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord row: parser) {
            String insert = "INSERT INTO factura(idFactura, idCliente) VALUES (?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, Integer.parseInt(row.get("idFactura")));
                ps.setInt(2, Integer.parseInt(row.get("idCliente")));
                ps.executeUpdate();
                ps.close();
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void poblarTablaProducto(Connection conn){
        CSVParser parser = null;
        try {
            parser = CSVFormat.DEFAULT.withHeader().parse(new
                    FileReader("C:\\Users\\gerar\\Desktop\\Practico_1\\productos.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord row: parser) {
            String insert = "INSERT INTO producto(idProducto, nombre, valor) VALUES (?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, Integer.parseInt(row.get("idProducto")));
                ps.setString(2, row.get("nombre"));
                ps.setFloat(3, Float.parseFloat(row.get("valor")));
                ps.executeUpdate();
                ps.close();
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void poblarTablaFacturaProducto(Connection conn){
        CSVParser parser = null;
        try {
            parser = CSVFormat.DEFAULT.withHeader().parse(new
                    FileReader("C:\\Users\\gerar\\Desktop\\Practico_1\\facturas-productos.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord row: parser) {
            String insert = "INSERT INTO factura_producto(idFactura, idProducto, cantidad) VALUES (?,?,?)";
            try {
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setInt(1, Integer.parseInt(row.get("idFactura")));
                ps.setInt(2, Integer.parseInt(row.get("idProducto")));
                ps.setInt(3, Integer.parseInt(row.get("cantidad")));
                ps.executeUpdate();
                ps.close();
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
