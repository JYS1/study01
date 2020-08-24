package StudentAdmin;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.awt.*;
import java.awt.List;

import javax.swing.*;
import javax.swing.table.*;

public class Test extends JFrame implements ActionListener{
	JButton btn1 = null;
	JButton btn2 = null;
	JButton btn3 = null;
	JButton btn4 = null;
	JTable table = new JTable();
	JScrollPane jsp = new JScrollPane(table);
	
	String[] name_01 = {"�л� �̸�", "�л� ����", "�л� ����", "����"};
	
	DefaultTableModel dt= new DefaultTableModel(name_01,0);
	
	db_connect db = new db_connect();
	
	public Test() {
		super("�л�����");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setBounds(200, 200, 500, 350);
		this.setLayout(new FlowLayout());
		
		JPanel panelComboBox =  new JPanel();
		JPanel panelList = new JPanel();
		JPanel panelTable = new JPanel();
		JPanel panel = new JPanel();
		
		panelComboBox.setLayout(new FlowLayout());
		panelList.setLayout(new FlowLayout());
		panelTable.setLayout(new FlowLayout());
		panel.setLayout(new FlowLayout());
		
		
		
		String title[] = new String[4];
		title[0] = "�л� �̸�";
		title[1] = "�л� ����";
		title[2] = "�л� ����";
		title[3] = "����";
		
		String data[][] = new String[0][0]; //[]:ī��Ʈ []: �л� �̸�/����
		
		table = new JTable(data, title);
		JScrollPane sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(300, 200));
		
		panelTable.add(sp);
		
		btn1 = new JButton("�л� ���");
		btn1.addActionListener(this);
		panel.add(btn1);
		
		btn2 = new JButton("���� �Է�");
		btn2.addActionListener(this);
		panel.add(btn2);
		
		btn3 = new JButton("�л� ���");
		btn3.addActionListener(this);
		panel.add(btn3);
		
		btn4 = new JButton("�л� ����");
		btn4.addActionListener(this);
		panel.add(btn4);
		

		Vector v = new Vector();
		Vector cols = new Vector();
		
		cols = getColumn();
		
		v = db.getMemberList();
		
		DefaultTableModel model = new DefaultTableModel(getMemberList(), cols);
		
		
		
		this.add(panelComboBox);
		this.add(panelList);
		this.add(panelTable);
		this.add(panel);
		
		this.setVisible(true);
		
	}
	private Vector getColumn() {
		// TODO Auto-generated method stub
		 Vector col = new Vector();
	        col.add("�л� �̸�");
	        col.add("�л� ����");
	        col.add("�л� ����");
	        col.add("����");
	        
	        
		return col;
	}
	
	 public Vector getMemberList(){
	       
	        Vector data = new Vector();  //Jtable�� ���� ���� �ִ� ��� 1. 2�����迭   2. Vector �� vector�߰�
	      	                
	       
	        try{
	        	db.st = db.conn.createStatement();
				db.rs = db.st.executeQuery("select name,age,sex,grade from student_table");
	            
	           
	            while(db.rs.next()){
	                String name = db.rs.getString("name");
	                String age = db.rs.getString("age");
	                String sex = db.rs.getString("sex");
	                String grade = db.rs.getString("grade");
	                
	               
	                Vector row = new Vector();
	                row.add(name);
	                row.add(sex);
	                row.add(age);
	                row.add(grade);
	               
	                data.add(row);             
	            }//while
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return data;
	    }//getMemberList()
	
	 public void jTableRefresh(){
	       
	        
	        DefaultTableModel model= new DefaultTableModel(db.getMemberList(), getColumn());
	        table.setModel(model);    
	       
	    }
	
	public void refreshTable() {
		String titleTemp[] = new String[4];
		titleTemp[0] = "�л� �̸�";
		titleTemp[1] = "�л� ����";
		titleTemp[2] = "�л� ����";
		titleTemp[3] = "����";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1) {
			new InputStudent();
		}
		if(e.getSource() == btn2) {
			new InputGrade();
		}
		if(e.getSource() == btn3) {
			
			jTableRefresh();
			}
		if(e.getSource() == btn4) {
			new Delete();
		}
	}
	
	private TableModel DefaultTableModel(String[][] dataStudentArray, String[] titleTemp) {
		// TODO Auto-generated method stub
		return null;
	}

	class InputStudent extends JFrame implements ActionListener{
		JLabel name, age;
		JRadioButton male, female;
		JButton btn1, btn2;
		ButtonGroup group;
		JTextField name_t, age_t;
		String sex_t;
		String grade;
		
		public InputStudent() // �л� �Է�
		{
			super("�л� �Է�");
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setBounds(200, 200, 250, 300);
			this.setLayout(new FlowLayout());
			
			JPanel panelName = new JPanel();
			JPanel panelRadio = new JPanel();
			JPanel panelAge = new JPanel();
			JPanel panelButton = new JPanel();
			
			panelName.setLayout(new FlowLayout());
			panelRadio.setLayout(new FlowLayout());
			panelAge.setLayout(new FlowLayout());
			panelButton.setLayout(new FlowLayout());
			
			name = new JLabel("�̸�");
			age = new JLabel("����");
			name_t = new JTextField(10);
			age_t = new JTextField(10);
			male = new JRadioButton("����", false);
			female = new JRadioButton("����", false);
			
			btn1 = new JButton("����");
			btn2 = new JButton("���");
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			
			//���� �׷�ȭ
			group = new ButtonGroup();
			group.add(male);
			group.add(female);
			
			//�гο� �߰�
			panelName.add(name);
			panelName.add(name_t);
			
			panelAge.add(age);
			panelAge.add(age_t);
			
			panelRadio.add(male);
			panelRadio.add(female);
			
			panelButton.add(btn1);
			panelButton.add(btn2);
			
			this.add(panelName);
			this.add(panelAge);
			this.add(panelRadio);
			this.add(panelButton, BorderLayout.SOUTH);
			
			this.setVisible(true);
		}
 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btn1) {
				String sex ="";
				if(male.isSelected()) {
					sex = male.getText().toString();
				} else {
					sex = female.getText().toString();
				}
				
				sex_t = sex;
				
				db.userListInsert(this);
				
				
				male.setSelected(false);
				female.setSelected(false);
				name_t.setText(null);
				age_t.setText(null);
				
			}
			if(e.getSource() == btn2) {
				dispose();
			}
			
		}
		


	}
    class InputGrade extends JFrame implements ActionListener {
    	
    	JComboBox Students_combo;
		JLabel test1 ,test2 ,test3 ,test4, name;
		JTextField test1_s, test2_s, test3_s, test4_s;

		JButton btn1, btn2;
		int num1, num2, num3, num4, avg ,sum;
		String t1, t2, t3, t4;
		String grade,str;
		
		public InputGrade() {
			super("���� �Է�");
			this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setBounds(200, 200, 250, 300);
			this.setLayout(new FlowLayout());
			
			JPanel panelCombo = new JPanel();
			JPanel panelTest1 = new JPanel();
			JPanel panelTest2 = new JPanel();
			JPanel panelTest3 = new JPanel();
			JPanel panelTest4 = new JPanel();
			JPanel panelButton = new JPanel();
			
			
		
			
			panelCombo.setLayout(new FlowLayout());
			panelTest1.setLayout(new FlowLayout());
			panelTest2.setLayout(new FlowLayout());
			panelTest3.setLayout(new FlowLayout());
			panelTest4.setLayout(new FlowLayout());
			panelButton.setLayout(new FlowLayout());
			
			
			
			name = new JLabel("�̸� :");
			Students_combo = new JComboBox();
			test1 = new JLabel("�ڹ�      :");
			test2 = new JLabel("C���    :");
			test3 = new JLabel("���̽�  :");
			test4 = new JLabel("HTML    :");
			
			
			test1_s = new JTextField(10);
			test2_s = new JTextField(10);
			test3_s = new JTextField(10);
			test4_s = new JTextField(10);
			
			btn1 = new JButton("���");
			btn2 = new JButton("���");
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			
			
			
			try {
				db.st = db.conn.createStatement();
				db.rs = db.st.executeQuery("select name from student_table");
				
				
				while(db.rs.next()) {
					String name = db.rs.getString("name");
					
					Students_combo.addItem(name);
					
				}
				
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				db.dbClose();
			}
			
			
			
			
			
			panelCombo.add(name);
			panelCombo.add(Students_combo);
		
			
			panelTest1.add(test1);
			panelTest1.add(test1_s);
			
			panelTest2.add(test2);
			panelTest2.add(test2_s);
			
			panelTest3.add(test3);
			panelTest3.add(test3_s);
			
			panelTest4.add(test4);
			panelTest4.add(test4_s);
			
			panelButton.add(btn1);
			panelButton.add(btn2);
			
			this.add(panelCombo, BorderLayout.NORTH);
			this.add(panelTest1);
			this.add(panelTest2);
			this.add(panelTest3);
			this.add(panelTest4);
			this.add(panelButton, BorderLayout.SOUTH);
			
			this.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int LOW_SCORE = 0;
			int HIGH_SCORE = 100;
			
		    if(e.getSource() == btn1) {
		    		
			t1 = test1_s.getText().trim();
			t2 = test2_s.getText().trim();
			t3 = test3_s.getText().trim();
			t4 = test4_s.getText().trim();
				
			
		    num1 = Integer.parseInt(t1);
			num2 = Integer.parseInt(t2);
			num3 = Integer.parseInt(t3);
			num4 = Integer.parseInt(t4);
			
			while(num1 < LOW_SCORE || num1 > HIGH_SCORE) {
				JOptionPane.showMessageDialog(null, "������ 0 ~ 100 ���̸� �Է� �ϼ��� !", "���", JOptionPane.WARNING_MESSAGE);
				test1_s.setText("");
				num1 = 0;
			}
			sum = (num1 +num2 + num3 + num4);
			avg =  sum / 4; 
			
			if(avg >= 90) {
				grade = "A+";
			} else if( avg >= 80) {
				grade = "A";
			} else if( avg >= 70) {
				grade = "B";
			} else if( avg >= 60) {
				grade = "C";
			} else if( avg >= 50) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			str = (String)Students_combo.getSelectedItem();
			
			db.userInputGrade(this);
			System.out.println("���� �Է� �Ϸ�");
//			for(Students s:StudentManeger.list) {
//				if(str == s.name) {
//					s.grade = grade;
//				}
//			}
			
			
 
			test1_s.setText("");
			test2_s.setText("");
			test3_s.setText("");
			test4_s.setText("");
			grade = null;
		    }
			
			else if(e.getSource() == btn2) {
				dispose();
			}
			
		}
		
	}
    
    class Delete extends JFrame implements ActionListener {
    	JLabel name;
    	JComboBox delete_combo;
    	JButton btn1, btn2;
    	String str;
    	
    	public Delete() {
    		super("�л� ��� ����");
    		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    		this.setBounds(200, 200, 350, 160);
    		this.setLayout(new FlowLayout());
    		
    		JPanel panelDelete = new JPanel();
    		JPanel panelCombo = new JPanel();
    		JPanel panelButton = new JPanel();
    		
    		panelDelete.setLayout(new FlowLayout());
    		panelButton.setLayout(new FlowLayout());
    		
    		name = new JLabel("���� �Ͻ� �л� �̸��� �����ϼ��� :");
    		delete_combo = new JComboBox();
    		btn1 = new JButton("Ȯ��");
    		btn2 = new JButton("���");
    		
    		btn1.addActionListener(this);
    		btn2.addActionListener(this);
    		
    		for(Students s:StudentManeger.list) {
    			delete_combo.addItem(s.name);
    		}
    		
    		try {
				db.st = db.conn.createStatement();
				db.rs = db.st.executeQuery("select name from student_table");
				
				
				while(db.rs.next()) {
					String name = db.rs.getString("name");
					
					delete_combo.addItem(name);
					
				}
				
			} catch(Exception e) {
				System.out.println(e);
			} finally {
				db.dbClose();
			}
    		panelDelete.add(name);
    		panelDelete.add(delete_combo);
    		
    		panelButton.add(btn1);
    		panelButton.add(btn2);
    		
    		this.add(panelDelete);
    		this.add(panelButton);
    		
    		this.setVisible(true);
    	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == btn1) {
//				String str = (String)delete_combo.getSelectedItem();
//				for(Students s : StudentManeger.list) {
//					if(str.startsWith(s.name)) {
//						StudentManeger.list.remove(s);
//						continue;
//					}
//				}
				
				str = (String)delete_combo.getSelectedItem();
				db.userDelete(this);
				System.out.println("���� ����");
				db.dbClose();
			} else if(e.getSource() == btn2) {
				dispose();
			}
		}
    	
    }

}
