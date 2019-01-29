import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
import FramesPackage.Connection;
import FramesPackage.ResultSet;
import FramesPackage.Statement;
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField Sname;
	private JTable table;
	private JTextField tname;
	private JTextField tfname;
	private JTextField tcontact;
	private JTextField taddress;
	private JTextField tdob;
	private JTextField tage;
	private JTextField tcourse;
	private JTextField troll;
	private JTextField tclass;
	private JTextField tsection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student() {
		
		//int first = 0;
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 751);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(74,78,77));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 964, 212);
		panel.setBackground(new Color(14,154,167));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSearchStudents = new JLabel("Search Students");
		lblSearchStudents.setBounds(285, 5, 279, 25);
		lblSearchStudents.setForeground(Color.WHITE);
		lblSearchStudents.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblSearchStudents);
		
		JLabel lblByName = new JLabel("By Name");
		lblByName.setForeground(Color.WHITE);
		lblByName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblByName.setBounds(10, 46, 164, 25);
		panel.add(lblByName);
		
		JLabel lblByClass = new JLabel("By Class");
		lblByClass.setForeground(Color.WHITE);
		lblByClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblByClass.setBounds(10, 91, 164, 25);
		panel.add(lblByClass);
		
		Sname = new JTextField();
		Sname.setBounds(130, 45, 485, 36);
		panel.add(Sname);
		Sname.setColumns(10);
		
		 String name = Sname.getText();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(140, 91, 104, 36);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0", "A", "B", "C", "D", "E", "F", "G"}));
		comboBox_1.setBounds(254, 91, 104, 36);
		panel.add(comboBox_1);
		
		String Sclass =  comboBox.getSelectedItem().toString();
		String Ssection = comboBox_1.getSelectedItem().toString();
		
		
		
		JButton btnSearch_1 = new JButton("SEARCH");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
					DefaultTableModel df = (DefaultTableModel)table.getModel();
					
					
				
				
				String Sclass =  comboBox.getSelectedItem().toString();
				String Ssection = comboBox_1.getSelectedItem().toString();
				 String name = Sname.getText();
				
				
				try
				{
					//DefaultTableModel df = (DefaultTableModel)table.getModel();

					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					
					//stmt.executeQuery("select * from students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"' ORDER by Sroll asc ");

					ResultSet rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"'  ORDER by Sroll asc " );
					//ResultSet rs  = stmt.executeQuery("select * from Students where Sname = '"+name+"' " );

					
					while(rs.next())
					{
						df.addRow(new Object[] {rs.getString("Sroll"),rs.getString("Sname"),rs.getString("Sfname"),rs.getString("Sclass"),rs.getString("Ssection"),rs.getString("Scontact"),rs.getString("Saddress"),rs.getString("Sdob"),rs.getString("Sage"),rs.getString("Sinfo")});
					}
					

				
				}catch(Exception e2) {System.out.println(e2);}
			}
		});
		btnSearch_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSearch_1.setBorder(null);
		btnSearch_1.setBackground(new Color(246, 205, 97));
		btnSearch_1.setBounds(625, 128, 221, 44);
		panel.add(btnSearch_1);
		btnSearch_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSearch_1.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnSearch_1.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		JButton btnSearch = new JButton("SEARCH\r\n");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
			 
			
								String Sclass =  comboBox.getSelectedItem().toString();
								String Ssection = comboBox_1.getSelectedItem().toString();
								 String name = Sname.getText();
								
								
								try
								{
									//DefaultTableModel df = (DefaultTableModel)table.getModel();
				
									
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
									Statement stmt = conn.createStatement();
									
									//ResultSet rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"' " );
									ResultSet rs  = stmt.executeQuery("select * from Students where Sname = '"+name+"'  " );
									while(rs.next())
									{
										df.addRow(new Object[] {rs.getString("Sroll"),rs.getString("Sname"),rs.getString("Sfname"),rs.getString("Sclass"),rs.getString("Ssection"),rs.getString("Scontact"),rs.getString("Saddress"),rs.getString("Sdob"),rs.getString("Sage"),rs.getString("Sinfo")});
									}
									
									
									
								
								}catch(Exception e2) {System.out.println(e2);}
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSearch.setBorder(null);
		btnSearch.setBackground(new Color(246, 205, 97));
		btnSearch.setBounds(625, 46, 221, 44);
		panel.add(btnSearch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel df = (DefaultTableModel)table.getModel();
				int rows = df.getRowCount(); 
				for(int j = rows - 1; j >=0; j--)
				{
				   df.removeRow(j); 
				}
			}
		});
		
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBorder(null);
		btnClear.setBackground(new Color(246, 205, 97));
		btnClear.setBounds(856, 47, 104, 126);
		panel.add(btnClear);
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnClear.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnClear.setBackground(new Color(246, 205, 97));

			}
		});
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
				
				int rowNo = table.getSelectedRow();
				df.removeRow(rowNo);
			}
		});
		btnDeleteStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDeleteStudent.setBorder(null);
		btnDeleteStudent.setBackground(new Color(246, 205, 97));
		btnDeleteStudent.setBounds(10, 158, 221, 44);
		panel.add(btnDeleteStudent);
		
		JLabel lbl = new JLabel("");
		lbl.setForeground(Color.RED);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl.setBounds(241, 158, 374, 44);
		panel.add(lbl);
		btnDeleteStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnDeleteStudent.setBackground(Color.RED);

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnDeleteStudent.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		
		btnSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnSearch.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnSearch.setBackground(new Color(246, 205, 97));

			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(14, 154, 130));
		panel_1.setBounds(10, 232, 964, 463);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 702, 443);
		panel_1.add(scrollPane);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(719, 23, 55, 24);
		panel_1.add(lblName);
		
		tname = new JTextField();
		tname.setBounds(774, 14, 180, 33);
		panel_1.add(tname);
		tname.setColumns(10);
		
		tfname = new JTextField();
		tfname.setColumns(10);
		tfname.setBounds(774, 57, 180, 33);
		panel_1.add(tfname);
		
		JLabel lblFather = new JLabel("Father\r\n");
		lblFather.setForeground(Color.WHITE);
		lblFather.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFather.setBounds(719, 66, 55, 24);
		panel_1.add(lblFather);
		
		JLabel lblCas = new JLabel("Class");
		lblCas.setForeground(Color.WHITE);
		lblCas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCas.setBounds(715, 103, 55, 24);
		panel_1.add(lblCas);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setBounds(784, 103, 55, 24);
		panel_1.add(lblSection);
		
		tcontact = new JTextField();
		tcontact.setColumns(10);
		tcontact.setBounds(774, 180, 180, 33);
		panel_1.add(tcontact);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContact.setBounds(719, 189, 55, 24);
		panel_1.add(lblContact);
		
		taddress = new JTextField();
		taddress.setColumns(10);
		taddress.setBounds(774, 223, 180, 33);
		panel_1.add(taddress);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(719, 232, 55, 24);
		panel_1.add(lblAddress);
		
		tdob = new JTextField();
		tdob.setColumns(10);
		tdob.setBounds(774, 266, 180, 33);
		panel_1.add(tdob);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDob.setBounds(719, 275, 55, 24);
		panel_1.add(lblDob);
		
		tage = new JTextField();
		tage.setColumns(10);
		tage.setBounds(774, 309, 180, 33);
		panel_1.add(tage);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(719, 318, 55, 24);
		panel_1.add(lblAge);
		
		tcourse = new JTextField();
		tcourse.setColumns(10);
		tcourse.setBounds(774, 352, 180, 33);
		panel_1.add(tcourse);
		
		JLabel lblInfo = new JLabel("Course");
		lblInfo.setForeground(Color.WHITE);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInfo.setBounds(719, 361, 55, 24);
		panel_1.add(lblInfo);
		
		JButton btnUpdateEdit = new JButton("Update / Edit");
		btnUpdateEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{

					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					stmt.executeUpdate("delete from students where Sname = '"+tname.getText()+"'");

					stmt.executeUpdate("insert into students(Sname,Sclass,Ssection,Scontact,Saddress,Sfname,Sroll,Sage,Sdob,Sinfo) values('"+tname.getText().toString()+"','"+tclass.getText().toString()+"','"+tsection.getText().toString()+"','"+tcontact.getText()+"','"+taddress.getText()+"','"+tfname.getText()+"','"+Integer.parseInt(troll.getText())+"','"+tage.getText()+"','"+tdob.getText()+"','"+tcourse.getText()+"')");
					
					JOptionPane.showMessageDialog(null, "Update successfull");
					
				
				}catch(Exception e1) {System.out.println(e1);}
			}
		});
		btnUpdateEdit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnUpdateEdit.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnUpdateEdit.setBackground(new Color(246, 205, 97));

			}
		});
		btnUpdateEdit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnUpdateEdit.setBorder(null);
		btnUpdateEdit.setBackground(new Color(246, 205, 97));
		btnUpdateEdit.setBounds(733, 409, 221, 44);
		panel_1.add(btnUpdateEdit);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
				
				int rowNo = table.getSelectedRow();
				
				tname.setText((String) df.getValueAt(rowNo, 1));
				tfname.setText((String) df.getValueAt(rowNo, 2));
				tclass.setText((String) df.getValueAt(rowNo, 3));
				tsection.setText((String) df.getValueAt(rowNo, 4));
				troll.setText((String) df.getValueAt(rowNo, 0));
				tcontact.setText((String) df.getValueAt(rowNo, 5));
				taddress.setText((String) df.getValueAt(rowNo, 6));
				tdob.setText((String) df.getValueAt(rowNo, 7));
				tage.setText((String) df.getValueAt(rowNo, 8));
				tcourse.setText((String) df.getValueAt(rowNo, 9));
				
				lbl.setText((String) df.getValueAt(rowNo, 1));
				
				
				
			}
		});
		table.setFont(new Font("Tahoma", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, ""},
			},
			new String[] {
				"Roll no.", "NAME", "Fathers name", "Class", "Section", "Contact", "Address", "DOB", "AGE", "Course"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(35);
		table.getColumnModel().getColumn(4).setPreferredWidth(39);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(7).setPreferredWidth(65);
		table.getColumnModel().getColumn(8).setPreferredWidth(35);
		table.getColumnModel().getColumn(9).setPreferredWidth(100);
		scrollPane.setViewportView(table);
		
		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setForeground(Color.WHITE);
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRollNo.setBounds(864, 103, 55, 24);
		panel_1.add(lblRollNo);
		
		troll = new JTextField();
		troll.setColumns(10);
		troll.setBounds(874, 137, 80, 33);
		panel_1.add(troll);
		
		tclass = new JTextField();
		tclass.setColumns(10);
		tclass.setBounds(719, 137, 47, 33);
		panel_1.add(tclass);
		
		tsection = new JTextField();
		tsection.setColumns(10);
		tsection.setBounds(784, 137, 55, 33);
		panel_1.add(tsection);
		
		
	}
}
