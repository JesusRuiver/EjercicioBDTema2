/**
 * 
 */
package bbdd;

import java.sql.*;

/**
 * @author Jesús Manuel Ruiz Verdejo
 *
 */
public class Conexion {

	private Connection conexion = null;

	private String database = "";

	private String usuario = "";

	private String pass = "";

	private String url = "";

	public Conexion(String database, String usuario, String pass) {

		try {

			this.database = database;
			this.usuario = usuario;
			this.pass = pass;

			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			url = "jdbc:mysql://localhost/" + database;

			// Establecemos la conexion con la BD
			conexion = DriverManager.getConnection(url, usuario, pass);

			System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok\n");

		}

		catch (SQLException ex) {

			System.out.println(ex);

		}

		catch (ClassNotFoundException ex) {

			System.out.println(ex);

		}

	}

	public void realizaConsulta() {

		try {

			// Preparamos la consulta
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM departamentos";
			ResultSet resul = sentencia.executeQuery(sql);

			// Recorremos el resultado para visualizar cada fila
			// Se hace un bucle mientras haya registros y se van visualizando
			while (resul.next()) {
				System.out.printf("%d, %s, %s %n", resul.getInt(1), resul.getString(2), resul.getString(3));

			}
			resul.close(); // Cerrar ResultSet
			sentencia.close(); // Cerrar Statement
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConexion() {

		return conexion;

	}

	public Connection cerrarConexion() {

		try {

			conexion.close();

			System.out.println("Cerrando conexion a " + url + " . . . . . Ok");

		} catch (SQLException ex) {

			System.out.println(ex);

		}

		conexion = null;

		return conexion;

	}

}
