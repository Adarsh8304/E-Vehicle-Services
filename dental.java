package com.vehical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.vehical.email;
import com.datasource.Oracon;

//import com.booktickets.email;
//import com.datasource.ticket.Oracon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dental extends JFrame {

	private JPanel contentPane;
	private JTextField vehino;
	public String vehitype, vehimotype, servitytype, servcenter, servcentype; 
	private JTextField eiid;
	
//	public JComboBox servcen, servity, servcity, vehimo, vehibr;

	
	 boolean b;
	 boolean ei; 
	 boolean vn;
	 boolean vb;
	 boolean vm;
	 boolean st;
	 boolean sc;
	 boolean snc; 
	 int op = 0;
	 
	 ArrayList al=new ArrayList();
	 private JLabel vn1;
	 //JPanel maha, mumbai, solapur, pune, aurangabad, nashik, nagpur, amravati;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dental frame = new dental();
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
	public dental() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JComboBox servcen = new JComboBox();
		servcen.setFont(new Font("Tahoma", Font.BOLD, 12));
		servcen.setModel(new DefaultComboBoxModel(new String[] {"Select city First"}));
		JComboBox servcity = new JComboBox();
		servcity.setFont(new Font("Tahoma", Font.BOLD, 12));
		servcity.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				servcenter = servcity.getSelectedItem().toString();
				if(servcenter.equals("Mumbai")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Pintos Garage", "Super Auto Garage", "Automovill", "National Garage"}));
				}
				if(servcenter.equals("Pune")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Pune Auto Garage", "Hotwheels Garage", "ICICI Lombard Network Garage", "Rider Club Auto Garage"}));
				}
				if(servcenter.equals("Nagpur")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"GoMechanic Garage Line", "India Garage", "DG Francis Garage"}));
				}
				if(servcenter.equals("Solapur")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Shri Sai Motors", "Star Bullet Garage", "New Premier Motor Garage", "Star Motor Garage"}));
				}
				if(servcenter.equals("Nashik")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Bharath Motor Garage", "Majestic Motor Grage", "New Metro Motor Garage"}));
				}
				if(servcenter.equals("Aurangabad")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Metro Motor Car Garage", "Max Car Garage", "Classic Auto Garage"}));
				}
				if(servcenter.equals("Amravati")) {
					servcen.setModel(new DefaultComboBoxModel(new String[] {"Miracle car", "Royal Garage", "New Star Garage", "VIP Motors"}));
				}
			}
		});
//		maha.setVisible(false);
//		mumbai.setVisible(false);
//		pune.setVisible(false);
//		nashik.setVisible(false);
//		aurangabad.setVisible(false);
//		amravati.setVisible(false);
//		nagpur.setVisible(false);
//		solapur.setVisible(false);
		
		JPanel maha = new JPanel();
		maha.setVisible(false);
		maha.setBackground(Color.WHITE);
		maha.setBounds(219, 57, 901, 665);
		contentPane.add(maha);
		maha.setLayout(null);
		
		JLabel eilb = new JLabel("Please enter correct Email !!!");
		eilb.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				maha.setVisible(true);
			}
		});
		JPanel nagpur = new JPanel();
		
		nagpur.setVisible(false);
		JPanel amravati = new JPanel();
		
		amravati.setVisible(false);
		JPanel solapur = new JPanel();
		
//		JPanel solapur = new JPanel();
		solapur.setVisible(false);
		JPanel pune = new JPanel();
		
		
		pune.setVisible(false);
		JPanel mumbai = new JPanel();
		
		





		
		
		
		
		
		mumbai.setVisible(false);
		JPanel aurangabad = new JPanel();
		
		aurangabad.setVisible(false);
		JPanel nashik = new JPanel();
		
		nashik.setVisible(false);
		
		
		
		JLabel lblNewLabel_7_6 = new JLabel("");
		lblNewLabel_7_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Amravati");
				amravati.setVisible(true);
				maha.setVisible(false);
				
			}
		});
		lblNewLabel_7_6.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_6.setBounds(535, 128, 24, 23);
		maha.add(lblNewLabel_7_6);
		
		JLabel lblNewLabel_7_5 = new JLabel("");
		lblNewLabel_7_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Nagpur");
				nagpur.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7_5.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_5.setBounds(677, 115, 24, 23);
		maha.add(lblNewLabel_7_5);
		
		JLabel lblNewLabel_7_4 = new JLabel("");
		lblNewLabel_7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Aurangabad");
				aurangabad.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7_4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_4.setBounds(346, 186, 24, 23);
		maha.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_7_3 = new JLabel("");
		lblNewLabel_7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Nashik");
				nashik.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_3.setBounds(248, 166, 24, 23);
		maha.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Mumbai");
				mumbai.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_2.setBounds(139, 235, 24, 23);
		maha.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Pune");
				pune.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_1.setBounds(217, 267, 24, 23);
		maha.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcity.setSelectedItem("Solapur");
				solapur.setVisible(true);
				maha.setVisible(false);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7.setBounds(346, 322, 24, 23);
		maha.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\mahamap.png"));
		lblNewLabel_6.setBounds(36, 5, 821, 569);
		maha.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton_2.setBounds(364, 599, 120, 23);
		maha.add(btnNewButton_2);
		nashik.setBounds(219, 57, 901, 665);
		contentPane.add(nashik);
		nashik.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Preview is not available yet, So please do Manual Search");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(20, 10, 871, 575);
		nashik.add(lblNewLabel_10);
		
		JButton btnNewButton_3_4 = new JButton("BACK");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				nashik.setVisible(false);
			}
		});
		btnNewButton_3_4.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_4.setBounds(362, 598, 139, 30);
		nashik.add(btnNewButton_3_4);
		aurangabad.setLayout(null);
		aurangabad.setBounds(219, 57, 901, 665);
		contentPane.add(aurangabad);
		
		JLabel lblNewLabel_12 = new JLabel("Preview is not available yet, So please do Manual Search");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(33, 10, 834, 586);
		aurangabad.add(lblNewLabel_12);
		
		JButton btnNewButton_3_2 = new JButton("BACK");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				aurangabad.setVisible(false);
			}
		});
		btnNewButton_3_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_2.setBounds(396, 606, 139, 30);
		aurangabad.add(btnNewButton_3_2);
		mumbai.setBounds(219, 57, 901, 665);
		contentPane.add(mumbai);
		mumbai.setLayout(null);
		
		JLabel lblNewLabel_7_10 = new JLabel("");
		lblNewLabel_7_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Super Auto Garage");
				mumbai.setVisible(false);

			}
		});
		lblNewLabel_7_10.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_10.setBounds(487, 126, 24, 23);
		mumbai.add(lblNewLabel_7_10);
		
		JLabel lblNewLabel_7_9 = new JLabel("");
		lblNewLabel_7_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("National Garage");
				mumbai.setVisible(false);

			}
		});
		lblNewLabel_7_9.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_9.setBounds(499, 312, 24, 23);
		mumbai.add(lblNewLabel_7_9);
		
		JLabel lblNewLabel_7_8 = new JLabel("");
		lblNewLabel_7_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Automovill");
				mumbai.setVisible(false);

			}
		});
		lblNewLabel_7_8.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_8.setBounds(342, 187, 24, 23);
		mumbai.add(lblNewLabel_7_8);
		
		JLabel lblNewLabel_7_7 = new JLabel("");
		lblNewLabel_7_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Pintos Garage");
				mumbai.setVisible(false);
			}
		});
		lblNewLabel_7_7.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7.setBounds(268, 107, 24, 23);
		mumbai.add(lblNewLabel_7_7);
		
		JButton btnNewButton_3_6 = new JButton("BACK");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				mumbai.setVisible(false);
			}
		});
		btnNewButton_3_6.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_6.setBounds(384, 601, 139, 30);
		mumbai.add(btnNewButton_3_6);
		
		JLabel lblNewLabel_15 = new JLabel("Pintos Garage");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15.setBounds(302, 102, 145, 28);
		mumbai.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Super Auto Garage");
		lblNewLabel_15_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1.setBounds(521, 121, 221, 28);
		mumbai.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_15_2 = new JLabel("Automovill");
		lblNewLabel_15_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_2.setBounds(383, 182, 221, 28);
		mumbai.add(lblNewLabel_15_2);
		
		JLabel lblNewLabel_15_3 = new JLabel("National Garage");
		lblNewLabel_15_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_3.setBounds(543, 307, 221, 28);
		mumbai.add(lblNewLabel_15_3);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\city maps\\mummap.jpg"));
		lblNewLabel_8.setBounds(31, 10, 845, 575);
		mumbai.add(lblNewLabel_8);
		pune.setBounds(219, 57, 901, 665);
		contentPane.add(pune);
		pune.setLayout(null);
		
		JButton btnNewButton_3_5 = new JButton("BACK");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				pune.setVisible(false);
			}
		});
		btnNewButton_3_5.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_5.setBounds(373, 604, 139, 30);
		pune.add(btnNewButton_3_5);
		
		JLabel lblNewLabel_7_7_1 = new JLabel("");
		lblNewLabel_7_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Pune Auto Garage");
				pune.setVisible(false);
			}
		});
		lblNewLabel_7_7_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1.setBounds(227, 161, 24, 23);
		pune.add(lblNewLabel_7_7_1);
		
		JLabel lblNewLabel_7_7_2 = new JLabel("");
		lblNewLabel_7_7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Hotwheels Garage");
				pune.setVisible(false);

			}
		});
		lblNewLabel_7_7_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_2.setBounds(110, 253, 24, 23);
		pune.add(lblNewLabel_7_7_2);
		
		JLabel lblNewLabel_7_7_3 = new JLabel("");
		lblNewLabel_7_7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("ICICI Lombard Network Garage");
				pune.setVisible(false);

			}
		});
		lblNewLabel_7_7_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_3.setBounds(152, 334, 24, 23);
		pune.add(lblNewLabel_7_7_3);
		
		JLabel lblNewLabel_7_7_4 = new JLabel("");
		lblNewLabel_7_7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Rider Club Auto Garage");
				pune.setVisible(false);

				
			}
		});
		lblNewLabel_7_7_4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_4.setBounds(629, 418, 24, 23);
		pune.add(lblNewLabel_7_7_4);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Pune Auto Garage");
		lblNewLabel_15_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1.setBounds(274, 161, 221, 28);
		pune.add(lblNewLabel_15_1_1);
		
		JLabel lblNewLabel_15_1_2 = new JLabel("Hotwheels Garage");
		lblNewLabel_15_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_2.setBounds(143, 248, 221, 28);
		pune.add(lblNewLabel_15_1_2);
		
		JLabel lblNewLabel_15_1_3 = new JLabel("ICICI Lombard Network Garage");
		lblNewLabel_15_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_3.setBounds(186, 329, 221, 28);
		pune.add(lblNewLabel_15_1_3);
		
		JLabel lblNewLabel_15_1_4 = new JLabel("Rider Club Auto Garage");
		lblNewLabel_15_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_4.setBounds(538, 452, 221, 28);
		pune.add(lblNewLabel_15_1_4);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\city maps\\punemap.png"));
		lblNewLabel_9.setBounds(26, 10, 850, 584);
		pune.add(lblNewLabel_9);
		solapur.setLayout(null);
		solapur.setBounds(219, 57, 901, 665);
		contentPane.add(solapur);
		
		JButton btnNewButton_3_3 = new JButton("BACK");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				solapur.setVisible(false);
			}
		});
		btnNewButton_3_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_3.setBounds(373, 598, 139, 30);
		solapur.add(btnNewButton_3_3);
		
		JLabel lblNewLabel_7_7_1_1 = new JLabel("");
		lblNewLabel_7_7_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Star Motor Garage");
				solapur.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_1.setBounds(699, 431, 24, 23);
		solapur.add(lblNewLabel_7_7_1_1);
		
		JLabel lblNewLabel_7_7_1_2 = new JLabel("");
		lblNewLabel_7_7_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("New Premier Motor Garage");
				solapur.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_2.setBounds(752, 353, 24, 23);
		solapur.add(lblNewLabel_7_7_1_2);
		
		JLabel lblNewLabel_7_7_1_3 = new JLabel("");
		lblNewLabel_7_7_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Shri Sai Motors");
				solapur.setVisible(false);
			}
		});
		lblNewLabel_7_7_1_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3.setBounds(344, 186, 24, 23);
		solapur.add(lblNewLabel_7_7_1_3);
		
		JLabel lblNewLabel_7_7_1_4 = new JLabel("");
		lblNewLabel_7_7_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Star Bullet Garage");
				solapur.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_4.setBounds(114, 282, 24, 23);
		solapur.add(lblNewLabel_7_7_1_4);
		
		JLabel lblNewLabel_15_1_1_1 = new JLabel("Shri Sai Motors");
		lblNewLabel_15_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1.setBounds(384, 186, 221, 28);
		solapur.add(lblNewLabel_15_1_1_1);
		
		JLabel lblNewLabel_15_1_1_2 = new JLabel("Star Bullet Garage");
		lblNewLabel_15_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_2.setBounds(147, 277, 221, 28);
		solapur.add(lblNewLabel_15_1_1_2);
		
		JLabel lblNewLabel_15_1_1_3 = new JLabel("Star Motor Garage");
		lblNewLabel_15_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_3.setBounds(608, 497, 221, 28);
		solapur.add(lblNewLabel_15_1_1_3);
		
		JLabel lblNewLabel_15_1_1_4 = new JLabel("New Premier Motor Garage");
		lblNewLabel_15_1_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_4.setBounds(670, 293, 221, 28);
		solapur.add(lblNewLabel_15_1_1_4);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\city maps\\solapurmap.png"));
		lblNewLabel_11.setBounds(28, 10, 852, 578);
		solapur.add(lblNewLabel_11);
		amravati.setLayout(null);
		amravati.setBounds(219, 57, 901, 665);
		contentPane.add(amravati);
		
		JButton btnNewButton_3_1 = new JButton("BACK");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				amravati.setVisible(false);
			}
		});
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_1.setBounds(371, 598, 139, 30);
		amravati.add(btnNewButton_3_1);
		
		JLabel lblNewLabel_7_7_1_3_1 = new JLabel("");
		lblNewLabel_7_7_1_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Miracle car");
				amravati.setVisible(false);
			}
		});
		lblNewLabel_7_7_1_3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_1.setBounds(390, 51, 24, 23);
		amravati.add(lblNewLabel_7_7_1_3_1);
		
		JLabel lblNewLabel_7_7_1_3_2 = new JLabel("");
		lblNewLabel_7_7_1_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("Royal Garage");
				amravati.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_3_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_2.setBounds(128, 179, 24, 23);
		amravati.add(lblNewLabel_7_7_1_3_2);
		
		JLabel lblNewLabel_7_7_1_3_3 = new JLabel("");
		lblNewLabel_7_7_1_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("New Star Garage");
				amravati.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_3_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_3.setBounds(414, 225, 24, 23);
		amravati.add(lblNewLabel_7_7_1_3_3);
		
		JLabel lblNewLabel_7_7_1_3_4 = new JLabel("");
		lblNewLabel_7_7_1_3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("VIP Motors");
				amravati.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_3_4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_4.setBounds(530, 503, 24, 23);
		amravati.add(lblNewLabel_7_7_1_3_4);
		
		JLabel lblNewLabel_15_1_1_1_1 = new JLabel("Miracle car");
		lblNewLabel_15_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_1.setBounds(424, 46, 221, 28);
		amravati.add(lblNewLabel_15_1_1_1_1);
		
		JLabel lblNewLabel_15_1_1_1_2 = new JLabel("Royal Garage");
		lblNewLabel_15_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_2.setBounds(163, 174, 221, 28);
		amravati.add(lblNewLabel_15_1_1_1_2);
		
		JLabel lblNewLabel_15_1_1_1_3 = new JLabel("New Star Garage");
		lblNewLabel_15_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_3.setBounds(448, 225, 221, 28);
		amravati.add(lblNewLabel_15_1_1_1_3);
		
		JLabel lblNewLabel_15_1_1_1_4 = new JLabel("VIP Motors");
		lblNewLabel_15_1_1_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_4.setBounds(571, 498, 221, 28);
		amravati.add(lblNewLabel_15_1_1_1_4);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\city maps\\Amravatimap.png"));
		lblNewLabel_13.setBounds(33, 10, 843, 573);
		amravati.add(lblNewLabel_13);
		nagpur.setLayout(null);
		nagpur.setBounds(219, 57, 901, 665);
		contentPane.add(nagpur);
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				maha.setVisible(true);
				nagpur.setVisible(false);
				
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(381, 613, 139, 30);
		nagpur.add(btnNewButton_3);
		
		JLabel lblNewLabel_7_7_1_3_1_1 = new JLabel("");
		lblNewLabel_7_7_1_3_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("GoMechanic Garage Line");
				nagpur.setVisible(false);

			}
		});
		lblNewLabel_7_7_1_3_1_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_1_1.setBounds(475, 239, 24, 23);
		nagpur.add(lblNewLabel_7_7_1_3_1_1);
		
		JLabel lblNewLabel_7_7_1_3_1_2 = new JLabel("");
		lblNewLabel_7_7_1_3_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("DG Francis Garage");
				nagpur.setVisible(false);


			}
		});
		lblNewLabel_7_7_1_3_1_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_1_2.setBounds(496, 396, 24, 23);
		nagpur.add(lblNewLabel_7_7_1_3_1_2);
		
		JLabel lblNewLabel_7_7_1_3_1_3 = new JLabel("");
		lblNewLabel_7_7_1_3_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				servcen.setSelectedItem("India Garage");
				nagpur.setVisible(false);


			}
		});
		lblNewLabel_7_7_1_3_1_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\locate.png"));
		lblNewLabel_7_7_1_3_1_3.setBounds(160, 300, 24, 23);
		nagpur.add(lblNewLabel_7_7_1_3_1_3);
		
		JLabel lblNewLabel_15_1_1_1_2_1 = new JLabel("GoMechanic Garage Line");
		lblNewLabel_15_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_2_1.setBounds(519, 239, 221, 28);
		nagpur.add(lblNewLabel_15_1_1_1_2_1);
		
		JLabel lblNewLabel_15_1_1_1_2_2 = new JLabel("India Garage");
		lblNewLabel_15_1_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_2_2.setBounds(211, 300, 221, 28);
		nagpur.add(lblNewLabel_15_1_1_1_2_2);
		
		JLabel lblNewLabel_15_1_1_1_2_3 = new JLabel("DG Francis Garage");
		lblNewLabel_15_1_1_1_2_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15_1_1_1_2_3.setBounds(530, 396, 221, 28);
		nagpur.add(lblNewLabel_15_1_1_1_2_3);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\city maps\\nagpurmap.jpg"));
		lblNewLabel_14.setBounds(35, 10, 841, 593);
		nagpur.add(lblNewLabel_14);
		lblNewLabel_5.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\globe.png"));
		lblNewLabel_5.setBounds(1380, 424, 52, 39);
		contentPane.add(lblNewLabel_5);
		eilb.setFont(new Font("Tahoma", Font.BOLD, 15));
		eilb.setForeground(Color.RED);
		eilb.setBounds(1152, 194, 224, 21);
		contentPane.add(eilb);
		
		JPanel confirm = new JPanel();
		confirm.setBackground(Color.BLACK);
		confirm.setBounds(346, 88, 565, 550);
		contentPane.add(confirm);
		confirm.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("You Have Successfully Booked our Service");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setBounds(89, 330, 403, 32);
		confirm.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("Automotive");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(172, 108, 194, 32);
		confirm.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\poplogo.png"));
		lblNewLabel_2.setBounds(132, 40, 286, 121);
		confirm.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\thumb.png"));
		lblNewLabel_3.setBounds(163, 158, 203, 157);
		confirm.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("BACK ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirm.setVisible(false);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton_1.setBounds(172, 400, 188, 32);
		confirm.add(btnNewButton_1);
		confirm.setVisible(false);
		
		JLabel e1 = new JLabel("*");
		e1.setForeground(Color.RED);
		e1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		e1.setBounds(1370, 168, 20, 16);
		contentPane.add(e1);
		servcity.setModel(new DefaultComboBoxModel(new String[] {"", "Mumbai", "Pune", "Nagpur", "Solapur", "Nashik", "Aurangabad", "Amravati"}));
		servcity.setBounds(1160, 424, 200, 32);
		contentPane.add(servcity);
		
		JLabel lblEmailId = new JLabel("Email ID             -");
		lblEmailId.setBounds(935, 165, 183, 28);
		lblEmailId.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblEmailId);
		
		eiid = new JTextField();
		eiid.setFont(new Font("Tahoma", Font.BOLD, 16));
		eiid.setBounds(1160, 165, 200, 28);
		eiid.setColumns(10);
		contentPane.add(eiid);
		
		JLabel lblServiceCities = new JLabel("Service Cities     -");
		lblServiceCities.setBounds(935, 423, 197, 28);
		lblServiceCities.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblServiceCities);
		
		JComboBox vehimo = new JComboBox();
		vehimo.setFont(new Font("Tahoma", Font.BOLD, 12));
		 vehimo.addItemListener(new ItemListener() {
		 	public void itemStateChanged(ItemEvent e) {
		 		vehimotype = vehimo.getSelectedItem().toString();
		 	}
		 });
		vehimo.setBounds(1160, 312, 200, 32);
		vehimo.setModel(new DefaultComboBoxModel(new String[] {"Select Vehical Brand First"}));
		contentPane.add(vehimo);
		
		JComboBox vehibr = new JComboBox();
		vehibr.setFont(new Font("Tahoma", Font.BOLD, 12));
		vehibr.setBounds(1160, 260, 200, 32);
		vehibr.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				vehitype = vehibr.getSelectedItem().toString();
				if(vehitype.equals("Mahindra")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Scorpio", "Bolero", "Thar", "XUV500", "XUV300", "XUV700"}));
				}
				if(vehitype.equals("Toyota")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Corola", "Fortuner", "Innova", "Supra"}));
				}
				if(vehitype.equals("Honda")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"City", "Amaze", "CRX", "Jazz", "WR-V"}));
				}
				if(vehitype.equals("Hyundai")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Creta", "Venue", "i20", "Verna"}));
				}
				if(vehitype.equals("Tata")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Tiago", "Harrier", "Nexon", "Safari", "Punch", "Nano"}));
				}
				if(vehitype.equals("Maruti Suzuki")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Ertiga", "Swift", "Wagon R", "Alto", "Brezza", "Vitara"}));
				}
				if(vehitype.equals("")) {
					vehimo.setModel(new DefaultComboBoxModel(new String[] {"Select Vehical Brand First"}));
				}

				
				
			}
		});
		vehibr.setModel(new DefaultComboBoxModel(new String[] {"", "Mahindra", "Toyota", "Honda", "Hyundai", "Tata", "Maruti Suzuki"}));
		contentPane.add(vehibr);
		
		JLabel lblVehicalModel = new JLabel("Vehical Model    -");
		lblVehicalModel.setBounds(935, 311, 183, 28);
		lblVehicalModel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblVehicalModel);
		
		 
	 servcen.addItemListener(new ItemListener() {
	 	public void itemStateChanged(ItemEvent e) {
	 		servcentype = servcen.getSelectedItem().toString();
	 	}
	 });
		servcen.setBounds(1212, 466, 148, 32);
		contentPane.add(servcen);
		
		JComboBox<Object> servity = new JComboBox<Object>();
		servity.setFont(new Font("Tahoma", Font.BOLD, 12));
	 servity.addItemListener(new ItemListener() {
	 	public void itemStateChanged(ItemEvent e) {
	 		servitytype = servity.getSelectedItem().toString();
	 	}
	 });
		servity.setBounds(1160, 367, 200, 32);
		servity.setModel(new DefaultComboBoxModel(new String[] {"", "Denting & Painting", "Suspension & Fitments", "Cleaning & Polishing", "Body Parts Repair"}));
		contentPane.add(servity);
		
		vehino = new JTextField();
		vehino.setFont(new Font("Tahoma", Font.BOLD, 16));
		vehino.setBounds(1162, 214, 198, 28);
		contentPane.add(vehino);
		vehino.setColumns(10);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(970, 597, 111, 33);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnBack.setBackground(new Color(0, 0, 139));
		contentPane.add(btnBack);
		
		JLabel lblSelectNearestCenter = new JLabel("Select Nearest Center    -");
		lblSelectNearestCenter.setBounds(935, 470, 260, 28);
		lblSelectNearestCenter.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblSelectNearestCenter);
		
		JLabel lblServiceType = new JLabel("Service Type      -");
		lblServiceType.setBounds(935, 366, 183, 28);
		lblServiceType.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblServiceType);
		
		JLabel lblVehicalName = new JLabel("Vehical Brand    -");
		lblVehicalName.setBounds(935, 259, 183, 28);
		lblVehicalName.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblVehicalName);
		
		JLabel lblVehicalNo = new JLabel("Vehical No.        -");
		lblVehicalNo.setBounds(935, 214, 183, 28);
		lblVehicalNo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		contentPane.add(lblVehicalNo);
		
		JLabel lblNewLabel = new JLabel("Fill your details   -");
		lblNewLabel.setBounds(910, 127, 222, 28);
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 20));
		contentPane.add(lblNewLabel);
		
		JLabel heading = new JLabel("Automation");
		heading.setBounds(965, 67, 411, 58);
		heading.setFont(new Font("Wide Latin", Font.BOLD, 29));
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(heading);
		
		
		
		JLabel vn1 = new JLabel("*");
		vn1.setForeground(Color.RED);
		vn1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		vn1.setBounds(1370, 214, 20, 16);
		contentPane.add(vn1);
		
		JLabel vb1 = new JLabel("*");
		vb1.setForeground(Color.RED);
		vb1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		vb1.setBounds(1370, 260, 20, 16);
		contentPane.add(vb1);
		
		JLabel vm1 = new JLabel("*");
		vm1.setForeground(Color.RED);
		vm1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		vm1.setBounds(1370, 312, 20, 16);
		contentPane.add(vm1);
		
		JLabel st1 = new JLabel("*");
		st1.setForeground(Color.RED);
		st1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		st1.setBounds(1370, 367, 20, 16);
		contentPane.add(st1);
		
		JLabel sc1 = new JLabel("*");
		sc1.setForeground(Color.RED);
		sc1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		sc1.setBounds(1370, 424, 20, 16);
		contentPane.add(sc1);
		
		JLabel snc1 = new JLabel("*");
		snc1.setForeground(Color.RED);
		snc1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		snc1.setBounds(1370, 466, 20, 16);
		contentPane.add(snc1);
		
		e1.setVisible(false);
		vn1.setVisible(false);
		vb1.setVisible(false);
		vm1.setVisible(false);
		st1.setVisible(false);
		sc1.setVisible(false);
		snc1.setVisible(false);
		
		
		JButton btnNewButton = new JButton("BOOK SERVICE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = false;
				  ei = false;
				  vn = false;
				  vb = false;
				  vm = false;
				  //adb = false;
				  st = false;
				  sc = false;
				  snc = false;
				 
				  

				if (eiid.getText().trim().isEmpty()&&vehino.getText().trim().isEmpty()&&vehibr.getSelectedItem().toString().trim().isEmpty()&&vehimo.getSelectedItem().toString().trim().isEmpty()&&servity.getSelectedItem().toString().trim().isEmpty()&&servcity.getSelectedItem().toString().trim().isEmpty()&&servcen.getSelectedItem().toString().trim().isEmpty())
				{
					e1.setVisible(true);
					vn1.setVisible(true);
					vb1.setVisible(true);
					vm1.setVisible(true);
					st1.setVisible(true);
					sc1.setVisible(true);
					snc1.setVisible(true);
//					error.setVisible(true);
					
				}
				 if (eiid.getText().trim().isEmpty())
				{
					 e1.setVisible(true);
//						error.setVisible(true);

				}
				 else {
						boolean ei ;
						
						ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(eiid.getText()).matches();
						if (eiid!=null) {
							if(ei==false){
								//eilb.setText("wrong input !!!");
								eilb.setVisible(true);	
								ei = false;					
							}
							else {
								 e1.setVisible(false);
									eilb.setVisible(false);	

								al.add(eiid.getText());
								ei = true;
								b = true ;
								op = op+1;
							}
						}
						}

				if(vehino.getText().trim().isEmpty())
				{
					
					vn1.setVisible(true);
//					error.setVisible(true);


				}
				else {
					vn1.setVisible(false);

					al.add(vehino.getText());
					vn = true;
					op = op+1;
				}
					
		        if(vehibr.getSelectedItem().toString().trim().isEmpty()) {
					vb1.setVisible(true);
//					error.setVisible(true);

				}else {
					vb1.setVisible(false);

					al.add(vehibr.getSelectedItem().toString());
					vb = true;
					op = op+1;
				}
					
				
				
				if(vehimo.getSelectedItem().toString().trim().isEmpty())
				{
					vm1.setVisible(true);
//					error.setVisible(true);


				}
				else {
					vm1.setVisible(false);

					al.add(vehimo.getSelectedItem().toString());
					vm = true;
					op = op+1;
				}
			
				if(servity.getSelectedItem().toString().trim().isEmpty())
				{
					st1.setVisible(true);
//					error.setVisible(true);


					
				}
                else {
					st1.setVisible(false);

					al.add(servity.getSelectedItem().toString());
					st = true;
					op = op+1;
				}
			
				
				if(servcity.getSelectedItem().toString().trim().isEmpty())
				{
					sc1.setVisible(true);
//					error.setVisible(true);


				}
				else {
					sc1.setVisible(false);

					al.add(servcity.getSelectedItem().toString());
					sc = true;
					op = op+1;
				}
				
				if(servcen.getSelectedItem().toString().trim().isEmpty())
				{
					snc1.setVisible(true);
//					error.setVisible(true);


				}else {
					snc1.setVisible(false);
					al.add(servcen.getSelectedItem().toString());
					snc = true;
					op = op+1;
				}
				
				
				
				
				
	
				if(op  != 0) {
				Oracon ora = new Oracon();
				int a =ora.insertIntodental(al);
				if(a ==1  ) {
					
					confirm.setVisible(true);
					String email=eiid.getText();
					
//					email em=new email();
//					em.emailservice(email);
				}
				else {
					JOptionPane.showMessageDialog(null,"Not Submitted");
				}
				
				
		
			
				
				}
			}
			
		});
		btnNewButton.setBounds(1112, 539, 212, 33);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 139));
		contentPane.add(btnNewButton);
		
		JLabel bookback = new JLabel("New label");
		bookback.setBounds(749, -11, 696, 733);
		bookback.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\popviewdental2.png"));
		contentPane.add(bookback);
		
		JLabel manualback = new JLabel("New label");
		manualback.setBounds(3, 3, 1520, 760);
		manualback.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\dental back.jpg"));
		contentPane.add(manualback);
	}
}
