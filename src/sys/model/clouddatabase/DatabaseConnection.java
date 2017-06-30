package sys.model.clouddatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static String driver="com.mysql.jdbc.Driver";//���ݿ�����
	private static String url="jdbc:mysql://127.0.0.1:3306/RotaOnLine";//���ݿ��ַ
	private static String user="root";//�˺�
	private static String password="276951438#zch";//����
	
	public Connection conn=null;//�����ݿ���е�һ�λػ�����
	public DatabaseConnection(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn =DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if (!conn.isClosed()) {
				System.out.println("�������ݿ�ɹ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return conn;
	}
	public void closeConnection(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn=null;
		}
	}
}
