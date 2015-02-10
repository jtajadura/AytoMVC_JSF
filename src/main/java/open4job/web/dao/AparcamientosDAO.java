package open4job.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import open4job.web.vo.AparcamientosAccesosVO;

@ManagedBean
@SessionScoped
public class AparcamientosDAO extends GenericDAO {

		//resource injection
		//@Resource(name="jdbc/myoracle")
		//hecho con el try catch
		private DataSource ds;
	
	/*public AparcamientosDAO(String driver, String url, String user,
			String password) {
		super(driver, url, user, password);
	*/
		public AparcamientosDAO() {
				
		//if resource injection is not support, you still can get it manually.
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	// Listado de aparcamientos
	public List<AparcamientosAccesosVO> getListadoAparcamientos() {

		List<AparcamientosAccesosVO> aparcamientos = new ArrayList<AparcamientosAccesosVO>();

		String query = "SELECT * FROM APARCAMIENTO_ACCESOS";

		Statement st = null;
		ResultSet rs = null;

		try {
			Connection connection = ds.getConnection();

			st = connection.createStatement();
			rs = st.executeQuery(query);
			// rs = connection.createStatement().executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				float latitud = rs.getFloat(2);
				float longitud = rs.getFloat(3);
				String titulo = rs.getString(4);
				String icono = rs.getString(5);
				String tipo = rs.getString(6);

				AparcamientosAccesosVO aparcamiento = new AparcamientosAccesosVO(
						id, latitud, longitud, titulo, icono, tipo);
				aparcamientos.add(aparcamiento);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "SQLException : " + e.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (Exception e) {
				}
			}
		}
		this.cerrarConexion();

		return aparcamientos;

	}

	// Obtiene los datos de un registro en concreto
	public AparcamientosAccesosVO getDatosaparcamiento(int idAparcamiento) {

		AparcamientosAccesosVO aparcamiento = null;

		ResultSet rs = null;
		
		//Version con createStatement
		/*try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM APARCAMIENTOACCESO WHERE ID = "
							+ idAparcamiento);
			rs.next();
			System.out.println(rs.getString(1)); // 0 ?
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aparcamiento;
		*/
		
		
		//Version con PreparedStatement
		
		String query = "SELECT * FROM APARCAMIENTOACCESO WHERE ID = ?";
		PreparedStatement pstmt = null;
		try {
			
			Connection connection = ds.getConnection();
			
			pstmt = connection.prepareStatement(query);
		
			pstmt.setInt(1, idAparcamiento);
		
			rs = pstmt.executeQuery();
			
			rs.next();
			System.out.println(rs.getString(1)); // 0 ?
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aparcamiento;
		
	}

}
