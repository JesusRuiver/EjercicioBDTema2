package logica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bbdd.Conexion;

public class Departamento {

	public static void main(String[] args) {

		Conexion conexion = new Conexion("ejemplo", "root", "root");

		conexion.realizaConsulta();
		conexion.cerrarConexion();
	}// fin de main

}
