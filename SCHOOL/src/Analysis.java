import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.SystemColor;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class Analysis extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Analysis frame = new Analysis();
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
	public Analysis() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1192, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(74,78,77));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_hs = new JPanel();
		panel_hs.setBounds(209, 10, 957, 677);
		contentPane.add(panel_hs);
		panel_hs.setLayout(null);
		panel_hs.setBackground(new Color(14, 154, 167));
		
		JLabel HSLBL = new JLabel("Search");
		HSLBL.setForeground(Color.WHITE);
		HSLBL.setFont(new Font("Tahoma", Font.BOLD, 16));
		HSLBL.setBounds(10, 21, 494, 44);
		panel_hs.add(HSLBL);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(SystemColor.inactiveCaption);
		panel_8.setBounds(10, 75, 752, 592);
		panel_hs.add(panel_8);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(Color.BLACK);
		separator_8.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator_8.setBounds(10, 541, 732, 12);
		panel_8.add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setForeground(Color.BLACK);
		separator_9.setBounds(27, 10, 14, 572);
		panel_8.add(separator_9);
		
		JLabel label_16 = new JLabel("MATHS");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_16.setBounds(37, 551, 100, 31);
		panel_8.add(label_16);
		
		JLabel label_17 = new JLabel("ENGLISH");
		label_17.setForeground(Color.BLACK);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_17.setBounds(162, 551, 100, 31);
		panel_8.add(label_17);
		
		JLabel lblPhysics = new JLabel("PHYSICS");
		lblPhysics.setForeground(Color.BLACK);
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPhysics.setBounds(475, 551, 100, 31);
		panel_8.add(lblPhysics);
		
		JLabel label_19 = new JLabel("HINDI");
		label_19.setForeground(Color.BLACK);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_19.setBounds(316, 551, 100, 31);
		panel_8.add(label_19);
		
		JLabel lblChemistry = new JLabel("CHEMISTRY");
		lblChemistry.setForeground(Color.BLACK);
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblChemistry.setBounds(617, 551, 125, 31);
		panel_8.add(lblChemistry);
		
		JProgressBar hspbmaths = new JProgressBar();
		hspbmaths.setOrientation(SwingConstants.VERTICAL);
		hspbmaths.setForeground(Color.GREEN);
		hspbmaths.setBorder(null);
		hspbmaths.setBackground(SystemColor.inactiveCaption);
		hspbmaths.setBounds(39, 51, 69, 491);
		panel_8.add(hspbmaths);
		
		JLabel hslblmaths = new JLabel("");
		hslblmaths.setForeground(Color.BLACK);
		hslblmaths.setFont(new Font("Tahoma", Font.BOLD, 15));
		hslblmaths.setBounds(37, 10, 75, 31);
		panel_8.add(hslblmaths);
		
		JProgressBar hspbenglish = new JProgressBar();
		hspbenglish.setOrientation(SwingConstants.VERTICAL);
		hspbenglish.setForeground(Color.GREEN);
		hspbenglish.setBorder(null);
		hspbenglish.setBackground(SystemColor.inactiveCaption);
		hspbenglish.setBounds(173, 51, 69, 491);
		panel_8.add(hspbenglish);
		
		JLabel hslblenglish = new JLabel("");
		hslblenglish.setForeground(Color.BLACK);
		hslblenglish.setFont(new Font("Tahoma", Font.BOLD, 15));
		hslblenglish.setBounds(171, 10, 75, 31);
		panel_8.add(hslblenglish);
		
		JProgressBar pbphysics = new JProgressBar();
		pbphysics.setOrientation(SwingConstants.VERTICAL);
		pbphysics.setForeground(Color.GREEN);
		pbphysics.setBorder(null);
		pbphysics.setBackground(SystemColor.inactiveCaption);
		pbphysics.setBounds(465, 51, 69, 491);
		panel_8.add(pbphysics);
		
		JLabel lblphysics = new JLabel("");
		lblphysics.setForeground(Color.BLACK);
		lblphysics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblphysics.setBounds(459, 10, 75, 31);
		panel_8.add(lblphysics);
		
		JProgressBar hspbhindi = new JProgressBar();
		hspbhindi.setOrientation(SwingConstants.VERTICAL);
		hspbhindi.setForeground(Color.GREEN);
		hspbhindi.setBorder(null);
		hspbhindi.setBackground(SystemColor.inactiveCaption);
		hspbhindi.setBounds(310, 51, 69, 491);
		panel_8.add(hspbhindi);
		
		JLabel hslblhindi = new JLabel("");
		hslblhindi.setForeground(Color.BLACK);
		hslblhindi.setFont(new Font("Tahoma", Font.BOLD, 15));
		hslblhindi.setBounds(308, 10, 75, 31);
		panel_8.add(hslblhindi);
		
		JProgressBar pbchemistry = new JProgressBar();
		pbchemistry.setOrientation(SwingConstants.VERTICAL);
		pbchemistry.setForeground(Color.GREEN);
		pbchemistry.setBorder(null);
		pbchemistry.setBackground(SystemColor.inactiveCaption);
		pbchemistry.setBounds(619, 51, 69, 491);
		panel_8.add(pbchemistry);
		
		JLabel lblchemistry = new JLabel("");
		lblchemistry.setForeground(Color.BLACK);
		lblchemistry.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblchemistry.setBounds(617, 10, 75, 31);
		panel_8.add(lblchemistry);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(SystemColor.inactiveCaption);
		panel_9.setBounds(772, 75, 175, 592);
		panel_hs.add(panel_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(Color.BLACK);
		separator_10.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator_10.setBounds(10, 541, 155, 12);
		panel_9.add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setForeground(Color.BLACK);
		separator_11.setBounds(27, 10, 14, 572);
		panel_9.add(separator_11);
		
		JLabel label_26 = new JLabel("AVERAGE");
		label_26.setForeground(Color.BLACK);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_26.setBounds(51, 551, 125, 31);
		panel_9.add(label_26);
		
		JProgressBar hspbaverage = new JProgressBar();
		hspbaverage.setOrientation(SwingConstants.VERTICAL);
		hspbaverage.setForeground(Color.GREEN);
		hspbaverage.setBorder(null);
		hspbaverage.setBackground(SystemColor.inactiveCaption);
		hspbaverage.setBounds(38, 50, 112, 491);
		panel_9.add(hspbaverage);
		
		JLabel hslblaverage = new JLabel("");
		hslblaverage.setForeground(Color.BLACK);
		hslblaverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		hslblaverage.setBounds(51, 9, 114, 31);
		panel_9.add(hslblaverage);
		
		JLabel lblHigherSecondary = new JLabel("Higher Secondary");
		lblHigherSecondary.setForeground(Color.WHITE);
		lblHigherSecondary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHigherSecondary.setBounds(215, 10, 209, 20);
		panel_hs.add(lblHigherSecondary);
		
		JLabel HSresult = new JLabel("");
		HSresult.setForeground(Color.WHITE);
		HSresult.setFont(new Font("Tahoma", Font.BOLD, 30));
		HSresult.setBounds(772, 10, 175, 55);
		panel_hs.add(HSresult);
		panel_hs.setVisible(false);
		
		JPanel panel_secondary = new JPanel();
		panel_secondary.setBounds(209, 10, 957, 677);
		contentPane.add(panel_secondary);
		panel_secondary.setLayout(null);
		panel_secondary.setBackground(new Color(14, 154, 167));
		
		JLabel SLBL = new JLabel("Search");
		SLBL.setForeground(Color.WHITE);
		SLBL.setFont(new Font("Tahoma", Font.BOLD, 16));
		SLBL.setBounds(10, 10, 494, 55);
		panel_secondary.add(SLBL);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(SystemColor.inactiveCaption);
		panel_5.setBounds(10, 75, 752, 592);
		panel_secondary.add(panel_5);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator_4.setBounds(10, 541, 732, 12);
		panel_5.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(27, 10, 14, 572);
		panel_5.add(separator_5);
		
		JLabel label_3 = new JLabel("MATHS");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_3.setBounds(37, 551, 100, 31);
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("ENGLISH");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_4.setBounds(162, 551, 100, 31);
		panel_5.add(label_4);
		
		JLabel lblScience = new JLabel("SCIENCE");
		lblScience.setForeground(Color.BLACK);
		lblScience.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblScience.setBounds(464, 551, 100, 31);
		panel_5.add(lblScience);
		
		JLabel label_6 = new JLabel("HINDI");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_6.setBounds(316, 551, 100, 31);
		panel_5.add(label_6);
		
		JLabel lblSocial = new JLabel("SOCIAL");
		lblSocial.setForeground(Color.BLACK);
		lblSocial.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblSocial.setBounds(617, 551, 125, 31);
		panel_5.add(lblSocial);
		
		JProgressBar spbmaths = new JProgressBar();
		spbmaths.setOrientation(SwingConstants.VERTICAL);
		spbmaths.setForeground(Color.GREEN);
		spbmaths.setBorder(null);
		spbmaths.setBackground(SystemColor.inactiveCaption);
		spbmaths.setBounds(39, 51, 69, 491);
		panel_5.add(spbmaths);
		
		JLabel slblmaths = new JLabel("");
		slblmaths.setForeground(Color.BLACK);
		slblmaths.setFont(new Font("Tahoma", Font.BOLD, 15));
		slblmaths.setBounds(37, 10, 75, 31);
		panel_5.add(slblmaths);
		
		JProgressBar spbenglish = new JProgressBar();
		spbenglish.setOrientation(SwingConstants.VERTICAL);
		spbenglish.setForeground(Color.GREEN);
		spbenglish.setBorder(null);
		spbenglish.setBackground(SystemColor.inactiveCaption);
		spbenglish.setBounds(173, 51, 69, 491);
		panel_5.add(spbenglish);
		
		JLabel slblenglish = new JLabel("");
		slblenglish.setForeground(Color.BLACK);
		slblenglish.setFont(new Font("Tahoma", Font.BOLD, 15));
		slblenglish.setBounds(171, 10, 75, 31);
		panel_5.add(slblenglish);
		
		JProgressBar pbscience = new JProgressBar();
		pbscience.setOrientation(SwingConstants.VERTICAL);
		pbscience.setForeground(Color.GREEN);
		pbscience.setBorder(null);
		pbscience.setBackground(SystemColor.inactiveCaption);
		pbscience.setBounds(464, 51, 69, 491);
		panel_5.add(pbscience);
		
		JLabel lblscience = new JLabel("");
		lblscience.setForeground(Color.BLACK);
		lblscience.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblscience.setBounds(442, 10, 75, 31);
		panel_5.add(lblscience);
		
		JProgressBar spbhindi = new JProgressBar();
		spbhindi.setOrientation(SwingConstants.VERTICAL);
		spbhindi.setForeground(Color.GREEN);
		spbhindi.setBorder(null);
		spbhindi.setBackground(SystemColor.inactiveCaption);
		spbhindi.setBounds(310, 51, 69, 491);
		panel_5.add(spbhindi);
		
		JLabel slblhindi = new JLabel("");
		slblhindi.setForeground(Color.BLACK);
		slblhindi.setFont(new Font("Tahoma", Font.BOLD, 15));
		slblhindi.setBounds(308, 10, 75, 31);
		panel_5.add(slblhindi);
		
		JProgressBar pbsocial = new JProgressBar();
		pbsocial.setOrientation(SwingConstants.VERTICAL);
		pbsocial.setForeground(Color.GREEN);
		pbsocial.setBorder(null);
		pbsocial.setBackground(SystemColor.inactiveCaption);
		pbsocial.setBounds(619, 51, 69, 491);
		panel_5.add(pbsocial);
		
		JLabel lblsocial = new JLabel("");
		lblsocial.setForeground(Color.BLACK);
		lblsocial.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblsocial.setBounds(617, 10, 75, 31);
		panel_5.add(lblsocial);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(SystemColor.inactiveCaption);
		panel_6.setBounds(772, 75, 175, 592);
		panel_secondary.add(panel_6);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator_6.setBounds(10, 541, 155, 12);
		panel_6.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setForeground(Color.BLACK);
		separator_7.setBounds(27, 10, 14, 572);
		panel_6.add(separator_7);
		
		JLabel label_13 = new JLabel("AVERAGE");
		label_13.setForeground(Color.BLACK);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_13.setBounds(51, 551, 125, 31);
		panel_6.add(label_13);
		
		JProgressBar spbaverage = new JProgressBar();
		spbaverage.setOrientation(SwingConstants.VERTICAL);
		spbaverage.setForeground(Color.GREEN);
		spbaverage.setBorder(null);
		spbaverage.setBackground(SystemColor.inactiveCaption);
		spbaverage.setBounds(38, 50, 112, 491);
		panel_6.add(spbaverage);
		
		JLabel slblaverage = new JLabel("");
		slblaverage.setForeground(Color.BLACK);
		slblaverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		slblaverage.setBounds(51, 9, 114, 31);
		panel_6.add(slblaverage);
		
		JLabel lblSecondary = new JLabel("Secondary");
		lblSecondary.setForeground(Color.WHITE);
		lblSecondary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSecondary.setBounds(281, 0, 209, 20);
		panel_secondary.add(lblSecondary);
		
		JLabel Sresult = new JLabel("");
		Sresult.setForeground(Color.WHITE);
		Sresult.setFont(new Font("Tahoma", Font.BOLD, 30));
		Sresult.setBounds(772, 10, 175, 55);
		panel_secondary.add(Sresult);
		panel_secondary.setVisible(false);
		
		JPanel panel_primary = new JPanel();
		panel_primary.setLayout(null);
		panel_primary.setBackground(new Color(14, 154, 167));
		panel_primary.setBounds(209, 10, 957, 677);
		contentPane.add(panel_primary);
		
		JLabel PLBL = new JLabel("Search");
		PLBL.setForeground(Color.WHITE);
		PLBL.setFont(new Font("Tahoma", Font.BOLD, 16));
		PLBL.setBounds(10, 10, 494, 55);
		panel_primary.add(PLBL);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaption);
		panel_3.setBounds(10, 75, 752, 592);
		panel_primary.add(panel_3);
		panel_3.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator.setForeground(SystemColor.activeCaptionText);
		separator.setBounds(10, 541, 732, 12);
		panel_3.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(SystemColor.activeCaptionText);
		separator_1.setBounds(27, 10, 14, 572);
		panel_3.add(separator_1);
		
		JLabel lblMaths = new JLabel("MATHS");
		lblMaths.setForeground(SystemColor.activeCaptionText);
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMaths.setBounds(37, 551, 100, 31);
		panel_3.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("ENGLISH");
		lblEnglish.setForeground(Color.BLACK);
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEnglish.setBounds(162, 551, 100, 31);
		panel_3.add(lblEnglish);
		
		JLabel lblEvs = new JLabel("EVS");
		lblEvs.setForeground(Color.BLACK);
		lblEvs.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblEvs.setBounds(479, 551, 100, 31);
		panel_3.add(lblEvs);
		
		JLabel lblHindi = new JLabel("HINDI");
		lblHindi.setForeground(Color.BLACK);
		lblHindi.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblHindi.setBounds(316, 551, 100, 31);
		panel_3.add(lblHindi);
		
		JLabel lblComputer = new JLabel("COMPUTER");
		lblComputer.setForeground(Color.BLACK);
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblComputer.setBounds(617, 551, 125, 31);
		panel_3.add(lblComputer);
		
		JProgressBar ppbmaths = new JProgressBar();
		ppbmaths.setBorder(null);
		ppbmaths.setBackground(SystemColor.inactiveCaption);
		ppbmaths.setForeground(Color.GREEN);
		ppbmaths.setOrientation(SwingConstants.VERTICAL);
		ppbmaths.setBounds(39, 51, 69, 491);
		panel_3.add(ppbmaths);
		
		JLabel plblmaths = new JLabel("");
		plblmaths.setForeground(Color.BLACK);
		plblmaths.setFont(new Font("Tahoma", Font.BOLD, 15));
		plblmaths.setBounds(37, 10, 75, 31);
		panel_3.add(plblmaths);
		
		JProgressBar ppbenglish = new JProgressBar();
		ppbenglish.setBorder(null);
		ppbenglish.setBackground(SystemColor.inactiveCaption);
		ppbenglish.setOrientation(SwingConstants.VERTICAL);
		ppbenglish.setForeground(Color.GREEN);
		ppbenglish.setBounds(173, 51, 69, 491);
		panel_3.add(ppbenglish);
		
		JLabel plblenglish = new JLabel("");
		plblenglish.setForeground(Color.BLACK);
		plblenglish.setFont(new Font("Tahoma", Font.BOLD, 15));
		plblenglish.setBounds(171, 10, 75, 31);
		panel_3.add(plblenglish);
		
		JProgressBar pbevs = new JProgressBar();
		pbevs.setBackground(SystemColor.inactiveCaption);
		pbevs.setBorder(null);
		pbevs.setOrientation(SwingConstants.VERTICAL);
		pbevs.setForeground(Color.GREEN);
		pbevs.setBounds(444, 51, 69, 491);
		panel_3.add(pbevs);
		
		JLabel lblevs = new JLabel("");
		lblevs.setForeground(Color.BLACK);
		lblevs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblevs.setBounds(442, 10, 75, 31);
		panel_3.add(lblevs);
		
		JProgressBar ppbhindi = new JProgressBar();
		ppbhindi.setBorder(null);
		ppbhindi.setBackground(SystemColor.inactiveCaption);
		ppbhindi.setOrientation(SwingConstants.VERTICAL);
		ppbhindi.setForeground(Color.GREEN);
		ppbhindi.setBounds(310, 51, 69, 491);
		panel_3.add(ppbhindi);
		
		JLabel plblhindi = new JLabel("");
		plblhindi.setForeground(Color.BLACK);
		plblhindi.setFont(new Font("Tahoma", Font.BOLD, 15));
		plblhindi.setBounds(308, 10, 75, 31);
		panel_3.add(plblhindi);
		
		JProgressBar pbcomputer = new JProgressBar();
		pbcomputer.setBorder(null);
		pbcomputer.setBackground(SystemColor.inactiveCaption);
		pbcomputer.setOrientation(SwingConstants.VERTICAL);
		pbcomputer.setForeground(Color.GREEN);
		pbcomputer.setBounds(619, 51, 69, 491);
		panel_3.add(pbcomputer);
		
		JLabel lblcomputer = new JLabel("");
		lblcomputer.setForeground(Color.BLACK);
		lblcomputer.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblcomputer.setBounds(617, 10, 75, 31);
		panel_3.add(lblcomputer);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(772, 75, 175, 592);
		panel_primary.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setBackground(SystemColor.inactiveCaption);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setFont(new Font("Ebrima", Font.BOLD, 20));
		separator_2.setBounds(10, 541, 155, 12);
		panel_4.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(27, 10, 14, 572);
		panel_4.add(separator_3);
		
		JLabel lblAvrage = new JLabel("AVERAGE");
		lblAvrage.setForeground(Color.BLACK);
		lblAvrage.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblAvrage.setBounds(51, 551, 125, 31);
		panel_4.add(lblAvrage);
		
		JProgressBar ppbaverage = new JProgressBar();
		ppbaverage.setToolTipText("");
		ppbaverage.setOrientation(SwingConstants.VERTICAL);
		ppbaverage.setForeground(Color.GREEN);
		ppbaverage.setBorder(null);
		ppbaverage.setBackground(SystemColor.inactiveCaption);
		ppbaverage.setBounds(38, 50, 112, 491);
		panel_4.add(ppbaverage);
		
		JLabel plblaverage = new JLabel("");
		plblaverage.setForeground(Color.BLACK);
		plblaverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		plblaverage.setBounds(51, 9, 114, 31);
		panel_4.add(plblaverage);
		
		JLabel lblPrimary = new JLabel("primary");
		lblPrimary.setForeground(Color.WHITE);
		lblPrimary.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimary.setBounds(332, 10, 209, 20);
		panel_primary.add(lblPrimary);
		
		JLabel Presult = new JLabel("");
		Presult.setForeground(Color.WHITE);
		Presult.setFont(new Font("Tahoma", Font.BOLD, 30));
		Presult.setBounds(772, 10, 175, 55);
		panel_primary.add(Presult);
		
		panel_primary.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(14, 154, 167));
		panel.setBounds(10, 10, 189, 184);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Search");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(10, 10, 111, 20);
		panel.add(label);
		
		JLabel label_1 = new JLabel("By Class");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(10, 52, 164, 25);
		panel.add(label_1);
		
		JComboBox classbox = new JComboBox();
		classbox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		classbox.setMaximumRowCount(15);
		classbox.setFont(new Font("Tahoma", Font.BOLD, 17));
		classbox.setBounds(10, 87, 65, 36);
		panel.add(classbox);
		
		JComboBox sectionbox = new JComboBox();
		sectionbox.setModel(new DefaultComboBoxModel(new String[] {"0", "A", "B", "C", "D", "E", "F", "G"}));
		sectionbox.setFont(new Font("Tahoma", Font.BOLD, 17));
		sectionbox.setBounds(109, 87, 65, 36);
		panel.add(sectionbox);
		
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
						df.addRow(new Object[] {rs.getString("Sroll"),rs.getString("Sname")});
					}
					
					 
				
				}catch(Exception e2) {System.out.println(e2);}
				
				
				int pclass = Integer.parseInt(Sclass);
				
				if(pclass<=5)
				{
					panel_primary.setVisible(true);
					panel_secondary.setVisible(false);
					panel_hs.setVisible(false);
				}
				else if(pclass>5 && pclass<=10)
				{
					panel_primary.setVisible(false);
					panel_secondary.setVisible(true);
					panel_hs.setVisible(false);
				}
				else
				{
					panel_primary.setVisible(false);
					panel_secondary.setVisible(false);
					panel_hs.setVisible(true);
					
				}
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 19));
		button.setBorder(null);
		button.setBackground(new Color(246, 205, 97));
		button.setBounds(85, 133, 89, 44);
		panel.add(button);
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
		
		
		JButton button_1 = new JButton("CLEAR");
		button_1.addActionListener(new ActionListener() {
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
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBorder(null);
		button_1.setBackground(new Color(246, 205, 97));
		button_1.setBounds(10, 133, 65, 44);
		panel.add(button_1);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) 
			{
				button_1.setBackground(new Color(171,62,22));

			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				button_1.setBackground(new Color(246, 205, 97));

			}
		});
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(14, 154, 167));
		panel_1.setBounds(10, 204, 189, 483);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 169, 463);
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
				
				
				

				String Sclass =  classbox.getSelectedItem().toString();
				String Ssection = sectionbox.getSelectedItem().toString();
				 
				
				
				try
				{
					//DefaultTableModel df = (DefaultTableModel)table.getModel();

					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
					Statement stmt = conn.createStatement();
					
					int rollNo = Integer.parseInt(df.getValueAt(rowNo, 0).toString()); 
					
					ResultSet rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"'  and Sroll = '"+rollNo+"'" );
					//ResultSet rs  = stmt.executeQuery("select * from Students where Sname = '"+name+"' " );
					
					while (rs.next())
					{
					 

						plblmaths.setText(rs.getString("maths"));
						plblenglish.setText(rs.getString("english"));
						plblhindi.setText(rs.getString("hindi"));
						
						slblmaths.setText(rs.getString("maths"));
						slblenglish.setText(rs.getString("english"));
						slblhindi.setText(rs.getString("hindi"));
						
						hslblmaths.setText(rs.getString("maths"));
						hslblenglish.setText(rs.getString("english"));
						hslblhindi.setText(rs.getString("hindi"));
						
						 
						ppbmaths.setValue(Integer.parseInt(plblmaths.getText()));
						ppbenglish.setValue(Integer.parseInt(plblenglish.getText()));
						ppbhindi.setValue(Integer.parseInt(plblhindi.getText()));
						
						spbmaths.setValue(Integer.parseInt(slblmaths.getText()));
						spbenglish.setValue(Integer.parseInt(slblenglish.getText()));
						spbhindi.setValue(Integer.parseInt(slblhindi.getText()));
						
						hspbmaths.setValue(Integer.parseInt(hslblmaths.getText()));
						hspbenglish.setValue(Integer.parseInt(hslblenglish.getText()));
						hspbhindi.setValue(Integer.parseInt(hslblhindi.getText()));	

					}
					
					float hsavg=0,savg=0,pavg=0;

					
					if(Integer.parseInt(Sclass)>10)
					{
						rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"'  and Sroll = '"+rollNo+"'" );

						while(rs.next())
						{
							
							lblphysics.setText(rs.getString("physics"));
							lblchemistry.setText(rs.getString("chemistry"));
							
							pbphysics.setValue(Integer.parseInt(lblphysics.getText()));
							pbchemistry.setValue(Integer.parseInt(lblchemistry.getText()));
						}
						hsavg = (Integer.parseInt(hslblmaths.getText()) + Integer.parseInt(hslblenglish.getText()) + Integer.parseInt(hslblhindi.getText()) + Integer.parseInt(lblphysics.getText()) + Integer.parseInt(lblchemistry.getText()) )/5 ;
						hslblaverage.setText((String.valueOf(hsavg)));
						
						
						hspbaverage.setValue((int)hsavg);
					
					
					}

					else if(Integer.parseInt(Sclass)>5 && Integer.parseInt(Sclass)<11)
					{
						rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"'  and Sroll = '"+rollNo+"'" );

						while(rs.next())
						{
							lblscience.setText(rs.getString("science"));
							lblsocial.setText(rs.getString("social"));
							
							pbscience.setValue(Integer.parseInt(lblscience.getText()));
							pbsocial.setValue(Integer.parseInt(lblsocial.getText()));
							
						}
						 savg = (Integer.parseInt(slblmaths.getText()) + Integer.parseInt(slblenglish.getText()) + Integer.parseInt(slblhindi.getText()) + Integer.parseInt(lblscience.getText()) + Integer.parseInt(lblsocial.getText()) )/5 ;
						slblaverage.setText((String.valueOf(savg)));
						spbaverage.setValue((int)savg);
						
					
						


						
					}
				
					
					if(Integer.parseInt(Sclass)<5)
					{
						rs  = stmt.executeQuery("select * from Students where Sclass = '"+Sclass+"' and Ssection = '"+Ssection+"'  and Sroll = '"+rollNo+"'" );

						while(rs.next())
						{
							
							
							lblevs.setText(rs.getString("evs"));
							lblcomputer.setText(rs.getString("computer"));
							
							pbevs.setValue(Integer.parseInt(lblevs.getText()));
							pbcomputer.setValue(Integer.parseInt(lblcomputer.getText()));
						
						}
						
						 pavg = (Integer.parseInt(plblmaths.getText()) + Integer.parseInt(plblenglish.getText()) + Integer.parseInt(plblhindi.getText()) + Integer.parseInt(lblevs.getText()) + Integer.parseInt(lblcomputer.getText()) )/5 ;
						plblaverage.setText((String.valueOf(pavg)));
						ppbaverage.setValue((int)pavg);
						

					}
					
				
					
					//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
				

					
					if(Integer.parseInt(plblmaths.getText())>= 80)
					{
						ppbmaths.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(plblmaths.getText()) >= 33 && Integer.parseInt(plblmaths.getText()) < 80)
					{
						ppbmaths.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(plblmaths.getText())< 33)
					{
						ppbmaths.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(plblenglish.getText())>= 80)
					{
						ppbenglish.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(plblenglish.getText()) >= 33 && Integer.parseInt(plblenglish.getText()) < 80)
					{
						ppbenglish.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(plblenglish.getText())< 33)
					{
						ppbenglish.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(plblhindi.getText())>= 80)
					{
						ppbhindi.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(plblhindi.getText()) >= 33 && Integer.parseInt(plblhindi.getText()) < 80)
					{
						ppbhindi.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(plblhindi.getText())< 33)
					{
						ppbhindi.setForeground(Color.RED);

					}
					//************************************************end c
					
					
					if(Integer.parseInt(slblmaths.getText())>= 80)
					{
						spbmaths.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(slblmaths.getText()) >= 33 && Integer.parseInt(slblmaths.getText()) < 80)
					{
						spbmaths.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(slblmaths.getText())< 33)
					{
						spbmaths.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(slblenglish.getText())>= 80)
					{
						spbenglish.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(slblenglish.getText()) >= 33 && Integer.parseInt(slblenglish.getText()) < 80)
					{
						spbenglish.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(slblenglish.getText())< 33)
					{
						spbenglish.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(slblhindi.getText())>= 80)
					{
						spbhindi.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(slblhindi.getText()) >= 33 && Integer.parseInt(slblhindi.getText()) < 80)
					{
						spbhindi.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(slblhindi.getText())< 33)
					{
						spbhindi.setForeground(Color.RED);

					}
					//************************************************end c
					
					
					if(Integer.parseInt(hslblmaths.getText())>= 80)
					{
						hspbmaths.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(hslblmaths.getText()) >= 33 && Integer.parseInt(hslblmaths.getText()) < 80)
					{
						hspbmaths.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(hslblmaths.getText())< 33)
					{
						hspbmaths.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(hslblenglish.getText())>= 80)
					{
						hspbenglish.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(hslblenglish.getText()) >= 33 && Integer.parseInt(hslblenglish.getText()) < 80)
					{
						hspbenglish.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(hslblenglish.getText())< 33)
					{
						hspbenglish.setForeground(Color.RED);

					}
					//************************************************
					
					if(Integer.parseInt(hslblhindi.getText())>= 80)
					{
						hspbhindi.setForeground(Color.GREEN);
					}
					else if( Integer.parseInt(hslblhindi.getText()) >= 33 && Integer.parseInt(hslblhindi.getText()) < 80)
					{
						hspbhindi.setForeground(Color.ORANGE);

					}
					else if(Integer.parseInt(hslblhindi.getText())< 33)
					{
						hspbhindi.setForeground(Color.RED);

					}
					//************************************************ chere
					
					if(pavg>=80.00)
					{
						ppbaverage.setForeground(Color.GREEN);
						Presult.setText("PASS");
						Presult.setForeground(Color.GREEN);
					}
					else if (pavg >=33.00 && pavg<80.00)
					{
						ppbaverage.setForeground(Color.ORANGE);
						Presult.setText("PASS");
						Presult.setForeground(Color.GREEN);

					}
					else if (pavg <33.00)
					{
						ppbaverage.setForeground(Color.RED);
						Presult.setText("FAIL");
						Presult.setForeground(Color.RED);
					}
					//***********************************end 1
					if(savg>=80.00)
					{
						spbaverage.setForeground(Color.GREEN);
						Sresult.setText("PASS");
						Sresult.setForeground(Color.GREEN);
					}
					else if (savg >=33.00 && savg<80.00)
					{
						spbaverage.setForeground(Color.ORANGE);
						Sresult.setText("PASS");
						Sresult.setForeground(Color.GREEN);

					}
					else if (savg <33.00)
					{
						spbaverage.setForeground(Color.RED);
						Sresult.setText("FAIL");
						Sresult.setForeground(Color.RED);
					}
					//***********************************end 1
					if(hsavg>=80.00)
					{

						hspbaverage.setForeground(Color.GREEN);
						HSresult.setText("PASS");
						HSresult.setForeground(Color.GREEN);
					}
					else if (hsavg >=33.00 && hsavg<80.00)
					{

						hspbaverage.setForeground(Color.ORANGE);
						HSresult.setText("PASS");
						HSresult.setForeground(Color.GREEN);

					}
					else if (hsavg <33.00)
					{
						

						hspbaverage.setForeground(Color.RED);
						HSresult.setText("FAIL");
						HSresult.setForeground(Color.RED);

					}
					//***********************************end 1

					if(Integer.parseInt(Sclass)<=5)
					{
							if(Integer.parseInt(lblevs.getText()) >= 80)
							{
								pbevs.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblevs.getText())>=33 && Integer.parseInt(lblevs.getText())<80)
							{
								pbevs.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblevs.getText())<33)
							{
								pbevs.setForeground(Color.RED);
		
							}
							//***********************************end 2
		
							if(Integer.parseInt(lblcomputer.getText()) >= 80)
							{
								pbcomputer.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblcomputer.getText())>=33 && Integer.parseInt(lblcomputer.getText())<80)
							{
								pbcomputer.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblcomputer.getText())<33)
							{
								pbcomputer.setForeground(Color.RED);
		
							}
					}
							//***********************************end 2 c
					
					if(Integer.parseInt(Sclass)>5 && Integer.parseInt(Sclass)<11)
					{
							if(Integer.parseInt(lblscience.getText()) >= 80)
							{
								pbscience.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblscience.getText())>=33 && Integer.parseInt(lblscience.getText())<80)
							{
								pbscience.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblscience.getText())<33)
							{
								pbscience.setForeground(Color.RED);
		
							}
							//***********************************end 2
							System.out.println("\n0");
		
							if(Integer.parseInt(lblsocial.getText()) >= 80)
							{
								pbsocial.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblsocial.getText())>=33 && Integer.parseInt(lblsocial.getText())<80)
							{
								pbsocial.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblsocial.getText())<33)
							{
								pbsocial.setForeground(Color.RED);
		
							}
				}
					//***********************************end 2 c here HS
					
					if(Integer.parseInt(Sclass)>10)
					{

							if(Integer.parseInt(lblphysics.getText()) >= 80)
							{
		
								pbphysics.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblphysics.getText())>=33 && Integer.parseInt(lblphysics.getText())<80)
							{
		
								pbphysics.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblphysics.getText())<33)
							{
		
								pbphysics.setForeground(Color.RED);
		
							}
							//***********************************end 2
							if(Integer.parseInt(lblchemistry.getText()) >= 80)
							{
								pbchemistry.setForeground(Color.GREEN);
							}
							else if(Integer.parseInt(lblchemistry.getText())>=33 && Integer.parseInt(lblchemistry.getText())<80)
							{
								pbchemistry.setForeground(Color.ORANGE);
		
							}
							else if (Integer.parseInt(lblchemistry.getText())<33)
							{
								pbchemistry.setForeground(Color.RED);
		
							}
					}
					//***********************************end 2
					
					
					
					
				}catch(Exception e2) {System.out.println(" table touch "+e2);}
				
				
			}
		});
		table.setFont(new Font("Tahoma", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Roll No.", "NAME"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(45);
		table.getColumnModel().getColumn(1).setPreferredWidth(137);
		scrollPane.setViewportView(table);
		
	
		
		
	}
}
