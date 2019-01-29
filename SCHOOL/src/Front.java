import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Front {

	public JFrame frameFront;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Front window = new Front();
					window.frameFront.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Front() {
		initialize();
	}
	
	String user;
	
	public Front(String x)
	{
		 user = x;
		
		initialize();
		
	}
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	void setusername(String x)
	{
		String user = x;
	}
	*/
	public void initialize() {
		
		
		frameFront = new JFrame();
		frameFront.getContentPane().setBackground(new Color(74,78,77));
		frameFront.setBounds(100, 100, 1000, 600);
		frameFront.setDefaultCloseOperation(frameFront.DISPOSE_ON_CLOSE);
		frameFront.getContentPane().setLayout(null);
		
		JLabel lbluser = new JLabel("");
		lbluser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbluser.setForeground(Color.WHITE);
		lbluser.setBounds(10, 10, 964, 25);
		frameFront.getContentPane().add(lbluser);
		
		//String user;
		lbluser.setText(("Welcome  "+user));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 255,50));
		panel.setBounds(10, 45, 964, 506);
		frameFront.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnEnrollStudent = new JButton("Enroll Student");
		btnEnrollStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				EnroollStudents en = new EnroollStudents();
				en.setVisible(true);
				
			}
		});
		btnEnrollStudent.setBorder(null);
		
		btnEnrollStudent.setForeground(Color.BLACK);
		btnEnrollStudent.setBackground(new Color(246, 205, 97));
		btnEnrollStudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEnrollStudent.setBounds(676, 10, 278, 99);
		panel.add(btnEnrollStudent);
		btnEnrollStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnEnrollStudent.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnEnrollStudent.setBackground(new Color(246, 205, 97));

			}
		});
		
		JButton btnStudent = new JButton("Student");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Student st = new Student();
				st.setVisible(true);
			}
		});
		btnStudent.setForeground(Color.BLACK);
		btnStudent.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnStudent.setBorder(null);
		btnStudent.setBackground(new Color(246, 205, 97));
		btnStudent.setBounds(676, 133, 278, 99);
		panel.add(btnStudent);
		btnStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnStudent.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnStudent.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		JButton btnEnterStudentsData = new JButton("Enter Students DATA");
		btnEnterStudentsData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EnterData ed = new EnterData();
				ed.setVisible(true);
			}
		});
		btnEnterStudentsData.setForeground(Color.BLACK);
		btnEnterStudentsData.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnEnterStudentsData.setBorder(null);
		btnEnterStudentsData.setBackground(new Color(246, 205, 97));
		btnEnterStudentsData.setBounds(676, 256, 278, 99);
		panel.add(btnEnterStudentsData);
		btnEnterStudentsData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnEnterStudentsData.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnEnterStudentsData.setBackground(new Color(246, 205, 97));

			}
		});
		
		JButton btnAnalysis = new JButton("Analysis");
		btnAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Analysis an = new Analysis();
				an.setVisible(true);
			}
		});
		btnAnalysis.setForeground(Color.BLACK);
		btnAnalysis.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnAnalysis.setBorder(null);
		btnAnalysis.setBackground(new Color(246, 205, 97));
		btnAnalysis.setBounds(676, 376, 278, 99);
		panel.add(btnAnalysis);
		btnAnalysis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				btnAnalysis.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				btnAnalysis.setBackground(new Color(246, 205, 97));

			}
		});
		 
		
		

	}
}
