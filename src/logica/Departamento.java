package logica;

import bbdd.Conexion;

public class Departamento {

	public static void main(String[] args) {

		Conexion conexion = new Conexion("ejemplo", "root", "root");

		conexion.realizaConsulta();
		
		conexion.dimeTablas();
		
		conexion.dimeColumnas();
		
		conexion.cerrarConexion();
	}// fin de main

}
