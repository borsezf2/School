import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

//import FramesPackage.ResultSet;

//import FramesPackage.Connection;
//import FramesPackage.Statement;

//import FramesPackage.Connection;
//import FramesPackage.ResultSet;
//import FramesPackage.Statement;

//import FramesPackage.Connection;
//import FramesPackage.Statement;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField usernameLogin;
	private JTextField usernameReg;
	private JPasswordField passwordLogin;
	private JPasswordField passwordReg;
	private JPasswordField confirmpasswordReg;
	private JPasswordField adminPin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		/*
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
			Statement stmt = conn.createStatement();
			
		
		}catch(Exception e) {System.out.println(e);}
		*/
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(74,78,77));
		frame.getContentPane().setLayout(null);
		
		JLabel lblpass = new JLabel("");
		lblpass.setForeground(Color.RED);
		lblpass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblpass.setBounds(51, 490, 487, 38);
		frame.getContentPane().add(lblpass);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(14,154,167));
		panel.setBounds(51, 89, 376, 391);
		frame.getContentPane().add(panel);
		
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("USER-NAME");
		lblUsername.setBackground(new Color(0, 0, 0));
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(10, 70, 356, 38);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(10, 165, 356, 38);
		panel.add(lblPassword);
		
		usernameLogin = new JTextField();
		usernameLogin.setForeground(new Color(0, 0, 0));
		usernameLogin.setBackground(new Color(255, 255, 255));
		usernameLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usernameLogin.setBounds(10, 119, 356, 36);
		panel.add(usernameLogin);
		usernameLogin.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN\r\n");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				//String password1 = passwordReg.getText().toString();
				//String password2 = passwordLogin.getText().toString();
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					
					ResultSet rs  = stmt.executeQuery("select * from login where username='"+usernameLogin.getText()+"' and password='"+passwordLogin.getText()+"'");
					
					//String password1 = rs.getString("password");
					String username = usernameLogin.getText();
					//String username = "harsh";
					
					
					
					if(rs.next())
					{
						Front f = new Front(username);
						f.frameFront.setVisible(true);
						
						frame.dispose();
						
						usernameLogin.setText("");
						passwordLogin.setText("");
						usernameLogin.requestFocus();
					
					}
					else
					{
						lblpass.setText("not a user or wrong password");
					}
					
					//stmt.executeUpdate("select * from students order by Sroll ASC");
					
					stmt.executeQuery("select * from students  ORDER by Sroll ");
					
					
					
				
				}catch(Exception e1) {System.out.println(e1);}
				
				
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnLogin.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnLogin.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
		
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.setBorder(null);
		btnLogin.setBackground(new Color(246, 205, 97));
		btnLogin.setBounds(10, 328, 356, 53);
		panel.add(btnLogin);
		
		passwordLogin = new JPasswordField();
		passwordLogin.setBounds(10, 213, 356, 38);
		panel.add(passwordLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(14,154,167));
		panel_1.setBounds(548, 89, 376, 462);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("USER-NAME");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(10, 10, 356, 38);
		panel_1.add(label);
		
		usernameReg = new JTextField();
		usernameReg.setFont(new Font("Times New Roman", Font.BOLD, 20));
		usernameReg.setColumns(10);
		usernameReg.setBackground(new Color(255, 255, 255));
		usernameReg.setBounds(10, 58, 356, 36);
		panel_1.add(usernameReg);
		
		JLabel label_1 = new JLabel("PassWord");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(10, 104, 356, 38);
		panel_1.add(label_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm PassWord");
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblConfirmPassword.setBounds(10, 200, 356, 38);
		panel_1.add(lblConfirmPassword);
		
		adminPin = new JPasswordField();
		adminPin.setBounds(10, 327, 356, 38);
		panel_1.add(adminPin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int admin = 111;
				
				String password1 = passwordReg.getText().toString();
				String password2 = confirmpasswordReg.getText().toString();
				
				int adminget = Integer.parseInt(adminPin.getText().toString());
				
				
				
				 
				
				int x = password1.compareTo(password2);
				try
				{
					if(admin==adminget)
					{   try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
							Statement stmt = conn.createStatement();
							
								
								if(x==0)
								{
									stmt.executeUpdate("insert into login(username,password) values('"+usernameReg.getText()+"','"+passwordReg.getText().toString()+"')");
									lblpass.setText("You are Registered "+usernameReg.getText());
									lblpass.setForeground(Color.GREEN);
								}
								else
								{
									lblpass.setText("passwords don't match");
									
								}
							
								
						}catch(Exception e1) {System.out.println(e1);}
					}
					else
						lblpass.setText("Admin requried");
				}catch(Exception e3) {System.out.println(e3);}
		
				usernameReg.setText("");
				passwordReg.setText("");
				confirmpasswordReg.setText("");
				usernameReg.requestFocus();
			
			}
			
		
			
		});
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e)
			{
				btnRegister.setBackground(new Color(171,62,22));
				
			}
			@Override
			public void mouseExited(MouseEvent e) 
			{
				btnRegister.setBackground(new Color(246,205,97));

			}
		});
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnRegister.setBackground(new Color(246,205,97));
		btnRegister.setBorder(null);
		btnRegister.setBounds(10, 399, 356, 53);
		panel_1.add(btnRegister);
		
		passwordReg = new JPasswordField();
		passwordReg.setBounds(10, 152, 356, 38);
		panel_1.add(passwordReg);
		
		confirmpasswordReg = new JPasswordField();
		confirmpasswordReg.setBounds(10, 248, 356, 38);
		panel_1.add(confirmpasswordReg);
		
		JLabel lblAdminPin = new JLabel("Admin pin");
		lblAdminPin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdminPin.setBounds(10, 290, 356, 38);
		panel_1.add(lblAdminPin);
		
		
		
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setBackground(new Color(255, 255, 255));
		lblLogIn.setForeground(new Color(255, 255, 255));
		lblLogIn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblLogIn.setBounds(175, 25, 217, 54);
		frame.getContentPane().add(lblLogIn);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setForeground(new Color(255, 255, 255));
		lblRegister.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblRegister.setBounds(676, 25, 217, 54);
		frame.getContentPane().add(lblRegister);
		
		
	}
}
