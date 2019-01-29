import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class EnroollStudents extends JFrame {

	private JPanel contentPane;
	private JTextField Sname;
	private JTextField Scontact;
	private JTextField Saddress;
	private JTextField Sroll;
	private JTextField Sage;
	private JTextField Sdob;
	private JTextField Sfname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnroollStudents frame = new EnroollStudents();
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
	public EnroollStudents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 878, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(74,78,77));
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblEnrollStudent = new JLabel("Enroll Student");
		lblEnrollStudent.setForeground(Color.WHITE);
		lblEnrollStudent.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnrollStudent.setBounds(399, 10, 173, 39);
		contentPane.add(lblEnrollStudent);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 65, 844, 486);
		panel.setBackground(new Color(14,154,167));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(10, 20, 91, 41);
		panel.add(lblName);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setForeground(Color.WHITE);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClass.setBounds(10, 122, 91, 41);
		panel.add(lblClass);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setForeground(Color.WHITE);
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(10, 218, 91, 41);
		panel.add(lblContact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(10, 321, 91, 41);
		panel.add(lblAddress);
		
		JLabel Fname = new JLabel("Father's Name");
		Fname.setForeground(Color.WHITE);
		Fname.setFont(new Font("Tahoma", Font.BOLD, 18));
		Fname.setBounds(397, 20, 349, 41);
		panel.add(Fname);
		
		
		
		JLabel lblRollNumner = new JLabel("Roll Number");
		lblRollNumner.setForeground(Color.WHITE);
		lblRollNumner.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRollNumner.setBounds(397, 122, 137, 41);
		panel.add(lblRollNumner);
		
		JLabel dobbb = new JLabel("DOB");
		dobbb.setForeground(Color.WHITE);
		dobbb.setFont(new Font("Tahoma", Font.BOLD, 18));
		dobbb.setBounds(397, 224, 91, 41);
		panel.add(dobbb);
		
		JLabel lblAdditionalInfo = new JLabel("Course");
		lblAdditionalInfo.setForeground(Color.WHITE);
		lblAdditionalInfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdditionalInfo.setBounds(397, 321, 188, 41);
		panel.add(lblAdditionalInfo);
		
		
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(Color.WHITE);
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSection.setBounds(268, 122, 91, 41);
		panel.add(lblSection);
		
		JComboBox Sclass = new JComboBox();
		Sclass.setFont(new Font("Tahoma", Font.BOLD, 18));
		Sclass.setMaximumRowCount(20);
		Sclass.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		Sclass.setBounds(10, 167, 118, 41);
		panel.add(Sclass);
		
		JComboBox Ssection = new JComboBox();
		Ssection.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E", "F", "G"}));
		Ssection.setMaximumRowCount(20);
		Ssection.setFont(new Font("Tahoma", Font.BOLD, 18));
		Ssection.setBounds(236, 167, 118, 41);
		panel.add(Ssection);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAge.setBounds(609, 122, 137, 41);
		panel.add(lblAge);
		
		Sname = new JTextField();
		Sname.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sname.setColumns(10);
		Sname.setBounds(10, 71, 349, 41);
		panel.add(Sname);
		
		Scontact = new JTextField();
		Scontact.setFont(new Font("Tahoma", Font.BOLD, 20));
		Scontact.setColumns(10);
		Scontact.setBounds(10, 269, 349, 41);
		panel.add(Scontact);
		
		Saddress = new JTextField();
		Saddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Saddress.setColumns(10);
		Saddress.setBounds(10, 372, 349, 41);
		panel.add(Saddress);
		
		Sroll = new JTextField();
		Sroll.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sroll.setColumns(10);
		Sroll.setBounds(397, 173, 137, 41);
		panel.add(Sroll);
		
		Sage = new JTextField();
		Sage.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sage.setColumns(10);
		Sage.setBounds(609, 170, 137, 41);
		panel.add(Sage);
		
		Sdob = new JTextField();
		Sdob.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sdob.setColumns(10);
		Sdob.setBounds(397, 270, 174, 41);
		panel.add(Sdob);
		
		Sfname = new JTextField();
		Sfname.setFont(new Font("Tahoma", Font.BOLD, 20));
		Sfname.setBorder(null);
		Sfname.setColumns(10);
		Sfname.setBounds(397, 71, 349, 41);
		panel.add(Sfname);
		
		JLabel lblTest = new JLabel("");
		lblTest.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTest.setForeground(Color.GREEN);
		lblTest.setBounds(10, 26, 379, 29);
		contentPane.add(lblTest);
		
		
		JButton btnEnter = new JButton("Enter DATA");
		btnEnter.setBounds(397, 423, 353, 53);
		btnEnter.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnEnter.setBorder(null);
		btnEnter.setBackground(new Color(246, 205, 97));
		panel.add(btnEnter);
		
		JComboBox Scourse = new JComboBox();
		Scourse.setModel(new DefaultComboBoxModel(new String[] {"-", "Primary ", "Secondary ", "PCM", "PCB", "PCMB", "Commerce", "Art/Humanities", "other"}));
		Scourse.setBounds(397, 372, 349, 41);
		panel.add(Scourse);
		panel.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblName, Sname, Sclass, Ssection, Scontact, Saddress, Sfname, Sroll, Sage, Sdob, btnEnter, lblClass, lblContact, lblAddress, Fname, lblRollNumner, dobbb, lblAdditionalInfo, lblSection, lblAge}));
		
		
		
		
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					
					stmt.executeUpdate("insert into students(Sname,Sclass,Ssection,Scontact,Saddress,Sfname,Sroll,Sage,Sdob,Sinfo) values('"+Sname.getText().toString()+"','"+Sclass.getSelectedItem().toString()+"','"+Ssection.getSelectedItem().toString()+"','"+Scontact.getText()+"','"+Saddress.getText()+"','"+Sfname.getText()+"','"+Integer.parseInt(Sroll.getText())+"','"+Sage.getText()+"','"+Sdob.getText()+"','"+Scourse.getSelectedItem().toString()+"')");

					String NAME = Sname.getText();
					lblTest.setText(NAME + "is enrolled successfully");
					
					

				
				}catch(Exception e1) {System.out.println(e1);}
				
				Sname.setText("");
				Sfname.setText("");
				Sclass.setSelectedIndex(0);
				Ssection.setSelectedIndex(0);
				Scourse.setSelectedIndex(0);
				Saddress.setText("");
				Scontact.setText("");
				Sroll.setText("");
				Sage.setText("");
				Sdob.setText("");
				
				
			}
		});
		
		
		
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnEnter.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnEnter.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		JLabel lblnd = new JLabel("2nd");
		lblnd.setBounds(152, 101, 86, 34);
		contentPane.add(lblnd);
		
		
	}
}
