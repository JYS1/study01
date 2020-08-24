package StudentAdmin;

import java.awt.Component;
import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.table.DefaultTableModel;

import StudentAdmin.Test.*;



public class db_connect {
	Connection conn;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	 
	
	public db_connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db?serverTimezone=UTC","root","1234");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 로드 Fail");
		} catch (SQLException e ) {
			System.out.println(e + "=> 연결 Fail");
		}
	}
	
	public void dbClose() {
		try {
			if(rs != null) rs.close();
			if(st != null) st.close();
			if(ps != null) ps.close();
		} catch (Exception e) {
			System.out.println(e + "=> dbClose Fail");
		}
	}
	
	
	
	
	
	public int userListInsert(InputStudent user) {
		int result = 0;
		try {
			ps = conn.prepareStatement("insert into student_table(name,age,sex) values(?,?,?)");

			ps.setString(1, user.name_t.getText());
			ps.setInt(2, Integer.parseInt(user.age_t.getText()));
			ps.setString(3, user.sex_t);
			
			result = ps.executeUpdate();

		} catch (SQLException e ) {
			System.out.println(e + "=> userListInsert Fail");
		} finally {
			dbClose();
		}
		
		return result;
	}
	
	
	
	
	public int userInputGrade(InputGrade user) {
		
		int result = 0;
		try {
			ps = conn.prepareStatement("update student_table set score1=?,score2=?,score3=?,score4=?,sum=?,avg=?,grade=? where name = ?");
			
			ps.setInt(1, Integer.parseInt(user.test1_s.getText()));
			ps.setInt(2, Integer.parseInt(user.test2_s.getText()));
			ps.setInt(3, Integer.parseInt(user.test3_s.getText()));
			ps.setInt(4, Integer.parseInt(user.test4_s.getText()));
			ps.setInt(5, user.sum);
			ps.setInt(6, user.avg);
			ps.setString(7, user.grade);
			ps.setString(8, user.str);
		
			result = ps.executeUpdate();
			
		} catch (SQLException e){
			System.out.println(e + "=> userListInsert Fail");
		} finally {
			dbClose();
		}
		
		return result;
		
	}
	
	public void userSelectAll(DefaultTableModel t_model) {
		try {
			st = conn.createStatement();
			rs = st.executeQuery("select name,age,sex,grade from student_table");
			
			for(int i = 0; i < t_model.getRowCount();) {
				t_model.removeRow(0);
			}
			
			while (rs.next()) {
				Object data[] = {
						rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
				};
				t_model.addRow(data);
			}
		} catch (SQLException e) {
			System.out.println(e + "=> userSelectAll Fail");
		} finally {
			dbClose();
		}
	}
	
	
	
	
	public Vector getMemberList(){
	       
        Vector data = new Vector();  //Jtable에 값을 쉽게 넣는 방법 1. 2차원배열   2. Vector 에 vector추가
       
           
        Connection con = null;       //연결
        PreparedStatement ps = null; //명령
        ResultSet rs = null;         //결과
       
        try{
           
        	st = conn.createStatement();
			rs = st.executeQuery("select name,age,sex,grade from student_table");
            
           
            while(rs.next()){
                String name = rs.getString("name");
                String age = rs.getString("age");
                String sex = rs.getString("sex");
                String grade = rs.getString("grade");
               
                Vector row = new Vector();
                row.add(name);
                row.add(age);
                row.add(sex);
                row.add(grade);
               
                data.add(row);             
            }//while
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }

	public int userDelete(Delete user) {
		
		int result = 0;
		try {
			ps = conn.prepareStatement("delete from student_table where name = ?");
			
			
			ps.setString(1, user.str);
		
			result = ps.executeUpdate();
			
		} catch (SQLException e){
			System.out.println(e + "=> userListInsert Fail");
		} finally {
			dbClose();
		}
		
		return result;
		
	}
	
	

	
	
}
