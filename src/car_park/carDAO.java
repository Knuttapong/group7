package car_park;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class carDAO {

	Connection con;	
	
	public carDAO(){
		
		
		try{

			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost/ParkingDetail?chracterEncoding=utf-8";
			con = DriverManager.getConnection(dbURL,"root","");
			
		}
		catch(SQLException | ClassNotFoundException e){
			
			System.out.println("Error connect database");
			
			
		}
	}
		
		
		public ArrayList<car> selectDB(String license){
			
			ArrayList<car> cs = new ArrayList<car>();
			try {
			
			
			Statement statement = con.createStatement();
			ResultSet resultset = statement.executeQuery("SELECT * FROM parking WHERE license_plateNumber = "+ license);
		
			while(resultset.next())
			{
				
				String license_plateNumber = resultset.getString("license_plateNumber");
				String province = resultset.getString("province");
				String time_checkin = resultset.getString("time_checkin");
				String time_checkout = resultset.getString("time_checkout");
				
				
				car c = new car();
				c.setLicense_plateNumber(license_plateNumber);
				c.setProvince(province);
				c.setTime_checkin(time_checkin);
				c.setTime_checkout(time_checkout);
				
				
				cs.add(c);
				
				
				
				
				
			}
			
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cs;
			
		}
		
		
	
	
	






}
