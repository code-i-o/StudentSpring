package com.training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;





public class StudentDao {
	
	public boolean register(Student s) {
		int status=0;
		Connection con;
		try {
			con = MyConnection.createConnection();
			PreparedStatement pst=con.prepareStatement("insert into student(name,course,address)values(?,?,?)");
			pst.setString(1,s.getName());
			pst.setString(2,s.getCourse());
			pst.setString(3,s.getAddress());
			status=pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(status>0)
          return true;
		return false;
	}

}
