/**
 * 
 */
package bbdd;

import java.sql.*;

/**
 * @author Jes�s Manuel Ruiz Verdejo
 *
 */
public class Conexion {

	private Connection conexion = null;

	private String database = "";

	private String usuario = "";

	private String contrase�a = "";
	
	private String url = "";

	public Conexion(String database, String usuario, String password) {

		try {

			this.database = database;

			// Cargar el driver
			Class.forName("com.mysql.jdbc.Driver");

			url = "jdbc:mysql://localhost/" + database;
			
			// Establecemos la conexion con la BD
			conexion = DriverManager.getConnection(url, usuario, contrase�a);

			System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");

		}

		catch (SQLException ex) {

			System.out.println(ex);

		}

		catch (ClassNotFoundException ex) {

			System.out.println(ex);

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
