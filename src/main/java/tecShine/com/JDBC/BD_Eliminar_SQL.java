package tecShine.com.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD_Eliminar_SQL {

	
	public void EliminarQualquer_BD(String BD) {

		ConnectionFactory cf= new ConnectionFactory();


		Connection con=null;
		PreparedStatement stm=null ;


		String sql="drop database "+BD;

		try{
			con = ConnectionFactory.getConnection();

			stm = con.prepareStatement(sql);
			stm.executeUpdate();

			System.out.println("BD Eliminado com  Sucesso !!!");


		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stm.close();
				cf.fecharConexao();
				cf=null;

				System.out.println("Coneccões Fechadas !!!");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	
	
	
}
