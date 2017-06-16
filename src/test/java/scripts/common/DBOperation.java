package scripts.common;

import java.sql.*;

import org.apache.log4j.Logger;


public class DBOperation {

	protected static final Logger logger = Logger.getLogger(SeleniumDrivers.class);
	
	public Connection getConnection() throws Exception {

		String url = "jdbc:oracle:thin:@192.168.71.52:1521:JRESSTUDIO";
		String user = "jdbctester";
		String password = "jdbctester";
		Class driverClass = Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,password);
		return conn;

	}

	public void insertTestData(Connection conn) {

		try {
			conn.setAutoCommit(false);
			Long beginTime = System.currentTimeMillis();
			//构造预处理statement
			PreparedStatement pst = conn.prepareStatement("insert into t1(id) values (?)");
			for (int i = 1; i <= 10; i++) {
				pst.setInt(1, i);
				pst.addBatch();
				//设置提交次数
				if(i%5 == 0){//可以设置不同的大小；如50，100，500，1000等等
					pst.executeBatch();
					conn.commit();
					pst.clearBatch();
				}
			}
			Long endTime = System.currentTimeMillis();
			logger.info("pst+batch："+(endTime-beginTime)/5 +"秒");
			pst.close();
			conn.close();

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
	}

	public void deleteTestData(Connection conn) {

		String sql = "delete from XXX where id=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, "001");
			pst.executeUpdate();

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

	}

	public void selectTestData(Connection conn) {

		String sql = "select * from XXXXX";
		ResultSet rs = null;
		String id;
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				id = rs.getString("id");
				logger.info("id = " + id);
			}
			pst.close();
			conn.close();

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

	}

	public void updateTestData(Connection conn) {

		String sql = "update table set name=? where id=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,"lzh");
			pst.setString(2,"001");
			pst.executeUpdate();
			pst.close();
			conn.close();

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

	}




	
}
