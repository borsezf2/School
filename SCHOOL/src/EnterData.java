import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EnterData extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField Pmaths;
	private JTextField Penglish;
	private JTextField Phindi;
	private JTextField Pevs;
	private JTextField Pcomputer;
	private JTextField Smaths;
	private JTextField Senglish;
	private JTextField Shindi;
	private JTextField Sscience;
	private JTextField Ssocial;
	private JTextField HSmaths;
	private JTextField HSenglish;
	private JTextField HShindi;
	private JTextField HSphysics;
	private JTextField HSchemistry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnterData frame = new EnterData();
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
	public EnterData() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(74,78,77));

		setContentPane(contentPane);
		contentPane.setLayout(null);
						
								
								JPanel panel_4 = new JPanel();
								panel_4.setBounds(374, 10, 284, 677);
								contentPane.add(panel_4);
								panel_4.setBackground(new Color(14,154,167));
								panel_4.setLayout(null);
								
								JLabel lblHigherSeconday = new JLabel("HIGHER SECONDAY");
								lblHigherSeconday.setForeground(Color.WHITE);
								lblHigherSeconday.setFont(new Font("Tahoma", Font.BOLD, 20));
								lblHigherSeconday.setBounds(10, 10, 247, 25);
								panel_4.add(lblHigherSeconday);
								
								JLabel label_10 = new JLabel("MATHS");
								label_10.setForeground(Color.WHITE);
								label_10.setFont(new Font("Tahoma", Font.BOLD, 20));
								label_10.setBounds(10, 367, 164, 25);
								panel_4.add(label_10);
								
								JLabel label_11 = new JLabel("ENGLISH");
								label_11.setForeground(Color.WHITE);
								label_11.setFont(new Font("Tahoma", Font.BOLD, 20));
								label_11.setBounds(10, 408, 164, 25);
								panel_4.add(label_11);
								
								JLabel label_12 = new JLabel("HINDI");
								label_12.setForeground(Color.WHITE);
								label_12.setFont(new Font("Tahoma", Font.BOLD, 20));
								label_12.setBounds(10, 461, 164, 25);
								panel_4.add(label_12);
								
								JLabel lblPhysics = new JLabel("PHYSICS");
								lblPhysics.setForeground(Color.WHITE);
								lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 20));
								lblPhysics.setBounds(10, 496, 164, 25);
								panel_4.add(lblPhysics);
								
								JLabel HSchemistrylable = new JLabel("CHEMISTRY");
								HSchemistrylable.setForeground(Color.WHITE);
								HSchemistrylable.setFont(new Font("Tahoma", Font.BOLD, 20));
								HSchemistrylable.setBounds(10, 548, 164, 25);
								panel_4.add(HSchemistrylable);
								
								HSmaths = new JTextField();
								HSmaths.setFont(new Font("Tahoma", Font.BOLD, 20));
								HSmaths.setColumns(10);
								HSmaths.setBounds(161, 367, 96, 31);
								panel_4.add(HSmaths);
								
								HSenglish = new JTextField();
								HSenglish.setFont(new Font("Tahoma", Font.BOLD, 20));
								HSenglish.setColumns(10);
								HSenglish.setBounds(161, 409, 96, 31);
								panel_4.add(HSenglish);
								
								HShindi = new JTextField();
								HShindi.setFont(new Font("Tahoma", Font.PLAIN, 20));
								HShindi.setColumns(10);
								HShindi.setBounds(161, 455, 96, 31);
								panel_4.add(HShindi);
								
								HSphysics = new JTextField();
								HSphysics.setFont(new Font("Tahoma", Font.PLAIN, 20));
								HSphysics.setColumns(10);
								HSphysics.setBounds(161, 496, 96, 31);
								panel_4.add(HSphysics);
								
								HSchemistry = new JTextField();
								HSchemistry.setFont(new Font("Tahoma", Font.BOLD, 20));
								HSchemistry.setColumns(10);
								HSchemistry.setBounds(161, 542, 96, 31);
								panel_4.add(HSchemistry);
								
								JLabel HSLBL = new JLabel("");
								HSLBL.setForeground(Color.WHITE);
								HSLBL.setFont(new Font("Tahoma", Font.BOLD, 20));
								HSLBL.setBounds(10, 77, 247, 158);
								panel_4.add(HSLBL);
								
								JButton HSsubmit = new JButton("SUBMIT");
								HSsubmit.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e)
									{
										try
										{
											DefaultTableModel df = (DefaultTableModel)table.getModel();
											
											int rowNo = table.getSelectedRow();
											
											Class.forName("com.mysql.jdbc.Driver");
											Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
											Statement stmt = conn.createStatement();
											
										//	stmt.executeUpdate("update students set maths = '"+Integer.parseInt(HSmaths.getText())+"', english = '"+Integer.parseInt(HSenglish.getText())+"', hindi = '"+Integer.parseInt(HShindi.getText())+"', physics = '"+Integer.parseInt(HSphysics.getText())+"', chemistry = '"+Integer.parseInt(HSchemistry.getText())+"' where Sroll = " +df.getValueAt(rowNo, 0));
											
											int rollNo = Integer.parseInt(df.getValueAt(rowNo, 0).toString()); 
											
											stmt.executeUpdate("update students set maths = '"+HSmaths.getText()+"', english = '"+HSenglish.getText()+"', hindi = '"+HShindi.getText()+"', physics = '"+HSphysics.getText()+"', chemistry = '"+HSchemistry.getText()+"' where Sroll = '"+rollNo+"' and Sname = '"+df.getValueAt(rowNo, 1).toString()+"'" );

											JOptionPane.showMessageDialog(null, "Update successfull");
											
										
										}catch(Exception e1) {System.out.println("HS " +e1);}
										
										HSmaths.setText("");
										HSenglish.setText("");
										HShindi.setText("");
										HSphysics.setText("");
										HSchemistry.setText("");
										
										
										Smaths.setText("");
										Senglish.setText("");
										Shindi.setText("");
										Sscience.setText("");
										Ssocial.setText("");
										
										Pmaths.setText("");
										Penglish.setText("");
										Phindi.setText("");
										Pevs.setText("");
										Pcomputer.setText("");
										
									}
								});
								HSsubmit.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseEntered(MouseEvent e) 
									{
										HSsubmit.setBackground(new Color(171,62,22));

									}
									@Override
									public void mouseExited(MouseEvent e)
									{
										HSsubmit.setBackground(new Color(246, 205, 97));

									}
								});
								HSsubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
								HSsubmit.setBorder(null);
								HSsubmit.setBackground(new Color(246, 205, 97));
								HSsubmit.setBounds(10, 583, 247, 58);
								panel_4.add(HSsubmit);
								
								JLabel label_16 = new JLabel("All the marks should be out of 100");
								label_16.setBounds(10, 631, 293, 36);
								panel_4.add(label_16);
								panel_4.setVisible(false);
						
						JPanel panel_3 = new JPanel();
						panel_3.setBackground(new Color(14,154,167));
						panel_3.setBounds(374, 10, 284, 677);
						contentPane.add(panel_3);
						panel_3.setLayout(null);
						
						JLabel lblSecondary = new JLabel("Secondary");
						lblSecondary.setForeground(Color.WHITE);
						lblSecondary.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblSecondary.setBounds(10, 10, 164, 25);
						panel_3.add(lblSecondary);
						
						JLabel label_2 = new JLabel("MATHS");
						label_2.setForeground(Color.WHITE);
						label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
						label_2.setBounds(10, 367, 164, 25);
						panel_3.add(label_2);
						
						JLabel label_3 = new JLabel("ENGLISH");
						label_3.setForeground(Color.WHITE);
						label_3.setFont(new Font("Tahoma", Font.BOLD, 20));
						label_3.setBounds(10, 408, 164, 25);
						panel_3.add(label_3);
						
						JLabel label_4 = new JLabel("HINDI");
						label_4.setForeground(Color.WHITE);
						label_4.setFont(new Font("Tahoma", Font.BOLD, 20));
						label_4.setBounds(10, 461, 164, 25);
						panel_3.add(label_4);
						
						JLabel SCIENCEF = new JLabel("SCIENCE");
						SCIENCEF.setForeground(Color.WHITE);
						SCIENCEF.setFont(new Font("Tahoma", Font.BOLD, 20));
						SCIENCEF.setBounds(10, 496, 164, 25);
						panel_3.add(SCIENCEF);
						
						JLabel SOCIAL = new JLabel("SOCIAL");
						SOCIAL.setForeground(Color.WHITE);
						SOCIAL.setFont(new Font("Tahoma", Font.BOLD, 20));
						SOCIAL.setBounds(10, 548, 164, 25);
						panel_3.add(SOCIAL);
						
						Smaths = new JTextField();
						Smaths.setFont(new Font("Tahoma", Font.BOLD, 20));
						Smaths.setColumns(10);
						Smaths.setBounds(161, 367, 96, 31);
						panel_3.add(Smaths);
						
						Senglish = new JTextField();
						Senglish.setFont(new Font("Tahoma", Font.BOLD, 20));
						Senglish.setColumns(10);
						Senglish.setBounds(161, 409, 96, 31);
						panel_3.add(Senglish);
						
						Shindi = new JTextField();
						Shindi.setFont(new Font("Tahoma", Font.PLAIN, 20));
						Shindi.setColumns(10);
						Shindi.setBounds(161, 455, 96, 31);
						panel_3.add(Shindi);
						
						Sscience = new JTextField();
						Sscience.setFont(new Font("Tahoma", Font.PLAIN, 20));
						Sscience.setColumns(10);
						Sscience.setBounds(161, 496, 96, 31);
						panel_3.add(Sscience);
						
						Ssocial = new JTextField();
						Ssocial.setFont(new Font("Tahoma", Font.BOLD, 20));
						Ssocial.setColumns(10);
						Ssocial.setBounds(161, 542, 96, 31);
						panel_3.add(Ssocial);
						
						JLabel SLBL = new JLabel("");
						SLBL.setForeground(Color.WHITE);
						SLBL.setFont(new Font("Tahoma", Font.BOLD, 20));
						SLBL.setBounds(10, 77, 264, 161);
						panel_3.add(SLBL);
						
						JButton Ssubmit = new JButton("SUBMIT");
						Ssubmit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) 
							{
								try
								{
									DefaultTableModel df = (DefaultTableModel)table.getModel();
									
									int rowNo = table.getSelectedRow();
									
									
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
									Statement stmt = conn.createStatement();
									
									int rollNo = Integer.parseInt(df.getValueAt(rowNo, 0).toString()); 
									
									stmt.executeUpdate("update students set maths = '"+Integer.parseInt(Smaths.getText())+"', english = '"+Integer.parseInt(Senglish.getText())+"', hindi = '"+Integer.parseInt(Shindi.getText())+"', science = '"+Integer.parseInt(Sscience.getText())+"', social = '"+Integer.parseInt(Ssocial.getText())+"' where Sroll = '"+rollNo+"' and Sname = '"+df.getValueAt(rowNo, 1).toString()+"'");

									JOptionPane.showMessageDialog(null, "Update successfull");
									
								
								}catch(Exception e2) {System.out.println("S "+e2);}
							}
						});
						Ssubmit.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) 
							{
								Ssubmit.setBackground(new Color(171,62,22));

							}
							@Override
							public void mouseExited(MouseEvent e)
							{
								Ssubmit.setBackground(new Color(246, 205, 97));

							}
						});
						Ssubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
						Ssubmit.setBorder(null);
						Ssubmit.setBackground(new Color(246, 205, 97));
						Ssubmit.setBounds(10, 583, 247, 58);
						panel_3.add(Ssubmit);
						
						JLabel label_8 = new JLabel("All the marks should be out of 100");
						label_8.setBounds(10, 631, 293, 36);
						panel_3.add(label_8);
						panel_3.setVisible(false);
						
						JLabel PLBL = new JLabel("");
						PLBL.setForeground(Color.WHITE);
						PLBL.setFont(new Font("Tahoma", Font.BOLD, 20));
						PLBL.setBounds(10, 77, 264, 136);
						
						JPanel panel_2 = new JPanel();
						panel_2.setBounds(374, 10, 284, 677);
						contentPane.add(panel_2);
						panel_2.setBackground(new Color(14,154,167));
						panel_2.setLayout(null);
						
						JLabel lblPrimary = new JLabel("PRIMARY");
						lblPrimary.setForeground(Color.WHITE);
						lblPrimary.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblPrimary.setBounds(10, 10, 164, 25);
						panel_2.add(lblPrimary);
						
						JLabel lblMaths = new JLabel("MATHS");
						lblMaths.setForeground(Color.WHITE);
						lblMaths.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblMaths.setBounds(10, 367, 164, 25);
						panel_2.add(lblMaths);
						
						JLabel lblEnglish = new JLabel("ENGLISH");
						lblEnglish.setForeground(Color.WHITE);
						lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblEnglish.setBounds(10, 408, 164, 25);
						panel_2.add(lblEnglish);
						
						JLabel lblHindi = new JLabel("HINDI");
						lblHindi.setForeground(Color.WHITE);
						lblHindi.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblHindi.setBounds(10, 461, 164, 25);
						panel_2.add(lblHindi);
						
						JLabel lblEvs = new JLabel("EVS");
						lblEvs.setForeground(Color.WHITE);
						lblEvs.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblEvs.setBounds(10, 496, 164, 25);
						panel_2.add(lblEvs);
						
						JLabel lblComputer = new JLabel("COMPUTER");
						lblComputer.setForeground(Color.WHITE);
						lblComputer.setFont(new Font("Tahoma", Font.BOLD, 20));
						lblComputer.setBounds(10, 548, 164, 25);
						panel_2.add(lblComputer);
						
						Pmaths = new JTextField();
						Pmaths.setFont(new Font("Tahoma", Font.BOLD, 20));
						Pmaths.setBounds(161, 367, 96, 31);
						panel_2.add(Pmaths);
						Pmaths.setColumns(10);
						
						Penglish = new JTextField();
						Penglish.setFont(new Font("Tahoma", Font.BOLD, 20));
						Penglish.setColumns(10);
						Penglish.setBounds(161, 409, 96, 31);
						panel_2.add(Penglish);
						
						Phindi = new JTextField();
						Phindi.setFont(new Font("Tahoma", Font.PLAIN, 20));
						Phindi.setColumns(10);
						Phindi.setBounds(161, 455, 96, 31);
						panel_2.add(Phindi);
						
						Pevs = new JTextField();
						Pevs.setFont(new Font("Tahoma", Font.PLAIN, 20));
						Pevs.setColumns(10);
						Pevs.setBounds(161, 496, 96, 31);
						panel_2.add(Pevs);
						
						Pcomputer = new JTextField();
						Pcomputer.setFont(new Font("Tahoma", Font.BOLD, 20));
						Pcomputer.setColumns(10);
						Pcomputer.setBounds(161, 542, 96, 31);
						panel_2.add(Pcomputer);
						
						
						panel_2.add(PLBL);
						
						JButton Psubmit = new JButton("SUBMIT");
						Psubmit.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) 
							{
								
								try
								{
									DefaultTableModel df = (DefaultTableModel)table.getModel();
									
									int rowNo = table.getSelectedRow();
									
									Class.forName("com.mysql.jdbc.Driver");
									Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
									Statement stmt = conn.createStatement();
									
									int rollNo = Integer.parseInt(df.getValueAt(rowNo, 0).toString()); 
									
									stmt.executeUpdate("update students set maths = '"+Integer.parseInt(Pmaths.getText())+"', english = '"+Integer.parseInt(Penglish.getText())+"', hindi = '"+Integer.parseInt(Phindi.getText())+"', evs = '"+Integer.parseInt(Pevs.getText())+"', computer = '"+Integer.parseInt(Pcomputer.getText())+"' where Sroll = '"+rollNo+"' and Sname = '"+df.getValueAt(rowNo, 1).toString()+"'" );
									
									JOptionPane.showMessageDialog(null, "Update successfull");
									
								
								}catch(Exception e3) {System.out.println("P "+e3);}
							}
						});
						Psubmit.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) 
							{
								Psubmit.setBackground(new Color(171,62,22));

							}
							@Override
							public void mouseExited(MouseEvent e)
							{
								Psubmit.setBackground(new Color(246, 205, 97));

							}
						});
						Psubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
						Psubmit.setBorder(null);
						Psubmit.setBackground(new Color(246, 205, 97));
						Psubmit.setBounds(10, 583, 247, 58);
						panel_2.add(Psubmit);
						
						JLabel lblAllTheMarks = new JLabel("All the marks should be out of 100");
						lblAllTheMarks.setBounds(10, 631, 293, 36);
						panel_2.add(lblAllTheMarks);
						panel_2.setVisible(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(14, 154, 167));
		panel_1.setBounds(10, 204, 354, 483);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 334, 463);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
				
				int rowNo = table.getSelectedRow();
				
				PLBL.setText( df.getValueAt(rowNo, 0) + "- " +df.getValueAt(rowNo, 1));
				SLBL.setText(df.getValueAt(rowNo, 0) + "- " +df.getValueAt(rowNo, 1));
				HSLBL.setText( df.getValueAt(rowNo, 0) + "- " +df.getValueAt(rowNo, 1));
			}
		});
		table.setFont(new Font("Tahoma", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"roll no.", "Name", "Course"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setPreferredWidth(142);
		table.getColumnModel().getColumn(2).setResizable(false);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 354, 184);
		panel.setBackground(new Color(14,154,167));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setForeground(Color.WHITE);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSearch.setBounds(10, 10, 111, 20);
		panel.add(lblSearch);
		
		JLabel label = new JLabel("By Class");
		label.setBounds(10, 52, 164, 25);
		panel.add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JComboBox classbox = new JComboBox();
		classbox.setMaximumRowCount(15);
		classbox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		classbox.setBounds(10, 87, 104, 36);
		panel.add(classbox);
		classbox.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JComboBox sectionbox = new JComboBox();
		sectionbox.setModel(new DefaultComboBoxModel(new String[] {"0", "A", "B", "C", "D", "E", "F", "G"}));
		sectionbox.setBounds(124, 87, 104, 36);
		panel.add(sectionbox);
		sectionbox.setFont(new Font("Tahoma", Font.BOLD, 19));

		
		JButton button = new JButton("SEARCH");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
					
					
				
				
				String Sclass =  classbox.getSelectedItem().toString();
				String Ssection = sectionbox.getSelectedItem().toString();
				 
				
				
				try
				{
					//DefaultTableModel df = (DefaultTableModel)table.getModel();

					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					
					ResultSet rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"' ORDER by Sroll asc" );
					//ResultSet rs  = stmt.executeQuery("select * from Students where Sname = '"+name+"' " );
					while(rs.next())
					{
						df.addRow(new Object[] {rs.getString("Sroll"),rs.getString("Sname"),rs.getString("Sinfo")});
					}
					
					 
				
				}catch(Exception e2) {System.out.println(e2);}
				
				
				int pclass = Integer.parseInt(Sclass);
				
				if(pclass<=5)
				{
					panel_2.setVisible(true);
					panel_3.setVisible(false);
					panel_4.setVisible(false);
				}
				else if(pclass>5 && pclass<=10)
				{
					panel_2.setVisible(false);
					panel_3.setVisible(true);
					panel_4.setVisible(false);
				}
				else
				{
					panel_2.setVisible(false);
					panel_3.setVisible(false);
					panel_4.setVisible(true);
					
				}
				
				
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				button.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				button.setBackground(new Color(246, 205, 97));

			}
		});
		button.setBounds(181, 133, 164, 44);
		panel.add(button);
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBorder(null);
		button.setBackground(new Color(246, 205, 97));
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DefaultTableModel df = (DefaultTableModel)table.getModel();
				int rows = df.getRowCount(); 
				for(int j = rows - 1; j >=0; j--)
				{
				   df.removeRow(j); 
				}
			}
		});
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
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBorder(null);
		btnClear.setBackground(new Color(246, 205, 97));
		btnClear.setBounds(10, 133, 111, 44);
		panel.add(btnClear);
		
		
	}
}
