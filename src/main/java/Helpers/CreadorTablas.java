package Helpers;

import java.sql.Connection;
import java.sql.SQLException;

public class CreadorTablas {

    public void crearTablas(Connection conn){
        crearTablaCliente(conn);
        crearTablaFactura(conn);
        crearTablaProducto(conn);
        crearTablaFacturaProducto(conn);
    }

    private void crearTablaCliente(Connection conn){
        String table = "CREATE TABLE cliente(" +
                "idCliente INT," +
                "nombre VARCHAR(500)," +
                "email VARCHAR(150)," +
                "PRIMARY KEY(idCliente))";
        try {
            conn.prepareStatement(table).execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void crearTablaFactura(Connection conn){
        String table = "CREATE TABLE factura(" +
                "idFactura INT," +
                "idCliente INT," +
                "PRIMARY KEY(idFactura)," +
                "FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente))";
        try {
            conn.prepareStatement(table).execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void crearTablaFacturaProducto(Connection conn){
        String table = "CREATE TABLE factura_producto(" +
                "idFactura INT," +
                "idProducto INT," +
                "cantidad INT)";
        try {
            conn.prepareStatement(table).execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void crearTablaProducto(Connection conn){
        String table = "CREATE TABLE producto(" +
                "idProducto INT," +
                "nombre VARCHAR(45)," +
                "valor FLOAT," +
                "PRIMARY KEY(idProducto))";
        try {
            conn.prepareStatement(table).execute();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
