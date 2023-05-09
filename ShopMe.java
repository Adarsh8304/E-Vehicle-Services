package com.vehical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

import com.datasource.Oracon;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShopMe extends JFrame {

	private JPanel contentPane;
	private JTextField eitext;
	private JTextField cntext;
	boolean b, cn, ei, tb, vn, pr, addp;
	int op=0;
	  ArrayList al= new ArrayList();
	  ArrayList ol= new ArrayList();
	  ArrayList cl= new ArrayList();


	  private JTextField ocntext;
	  private JTextField oeitext;
	  private JTextField ccntext;
	  private JTextField ceitext;
	  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMe frame = new ShopMe();
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
	public ShopMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 802);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("window"));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel opnlb, optlb, opricelb, mhp1, mhp2, mh1, mh2, co1, co2, co3, co4, opr1, opr2, opr3, opr4;
		
		JPanel confirm = new JPanel();
		confirm.setBackground(Color.WHITE);
		confirm.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		confirm.setBounds(689, 249, 363, 435);
		contentPane.add(confirm);
		confirm.setLayout(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("New label");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\poplogo.png"));
		lblNewLabel_2_3.setBounds(48, 21, 286, 121);
		confirm.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_11 = new JLabel("New label");
		lblNewLabel_3_11.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\thumb.png"));
		lblNewLabel_3_11.setBounds(83, 115, 203, 157);
		confirm.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_4 = new JLabel("You Have Successfully Booked our Service");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_4.setBounds(22, 264, 310, 32);
		confirm.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("BACK ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirm.setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(94, 315, 188, 32);
		confirm.add(btnNewButton_1);
		confirm.setVisible(false);
		
		JPanel tyrep = new JPanel();
		tyrep.setBounds(380, 222, 1119, 533);
		tyrep.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 102)));
		tyrep.setBackground(new Color(204, 204, 255));
		contentPane.add(tyrep);
		tyrep.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(676, 10, 412, 483);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyrep.add(panel);
		panel.setLayout(null);
		
		JLabel ter = new JLabel("Enter valid Email ID");
		ter.setForeground(Color.RED);
		ter.setFont(new Font("Arial", Font.BOLD, 12));
		ter.setBounds(181, 126, 221, 23);
		panel.add(ter);
		
		JLabel t6 = new JLabel("*");
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		t6.setForeground(new Color(255, 0, 0));
		t6.setFont(new Font("Tahoma", Font.BOLD, 16));
		t6.setBounds(380, 314, 32, 38);
		panel.add(t6);
		
		JTextArea addtext = new JTextArea();
		addtext.setFont(new Font("Arial", Font.BOLD, 16));
		addtext.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		addtext.setBounds(133, 314, 247, 87);
		panel.add(addtext);
		
		JLabel t5 = new JLabel("*");
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		t5.setForeground(Color.RED);
		t5.setFont(new Font("Arial Black", Font.BOLD, 18));
		t5.setBounds(380, 266, 32, 38);
		panel.add(t5);
		
		JLabel t4 = new JLabel("*");
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setForeground(Color.RED);
		t4.setFont(new Font("Arial Black", Font.BOLD, 18));
		t4.setBounds(380, 204, 32, 38);
		panel.add(t4);
		
		JLabel t3 = new JLabel("*");
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(Color.RED);
		t3.setFont(new Font("Arial Black", Font.BOLD, 18));
		t3.setBounds(380, 146, 32, 38);
		panel.add(t3);
		
		JLabel t2 = new JLabel("*");
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setForeground(Color.RED);
		t2.setFont(new Font("Arial Black", Font.BOLD, 18));
		t2.setBounds(380, 87, 32, 38);
		panel.add(t2);
		
		JLabel t1 = new JLabel("*");
		t1.setForeground(new Color(255, 0, 0));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("Arial Black", Font.BOLD, 18));
		t1.setBounds(380, 27, 32, 38);
		panel.add(t1);
		
		JLabel lblNewLabel_3 = new JLabel("Customer Name");
		lblNewLabel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3.setBounds(28, 27, 171, 38);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Email ID");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_1.setBounds(28, 87, 171, 38);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tyer Brand Name");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_2.setBounds(28, 146, 171, 38);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Vehical Name");
		lblNewLabel_3_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_3.setBounds(28, 204, 171, 38);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Price");
		lblNewLabel_3_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_4.setBounds(28, 266, 171, 38);
		panel.add(lblNewLabel_3_4);
		
		JLabel pricelb = new JLabel("");
		pricelb.setFont(new Font("Arial", Font.BOLD, 18));
		pricelb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		pricelb.setBounds(209, 266, 171, 38);
		panel.add(pricelb);
		
		JLabel vnlb = new JLabel("");
		vnlb.setFont(new Font("Arial", Font.BOLD, 18));
		vnlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		vnlb.setBounds(209, 204, 171, 38);
		panel.add(vnlb);
		
		JLabel tblb = new JLabel("");
		tblb.setFont(new Font("Arial", Font.BOLD, 18));
		tblb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		tblb.setBounds(209, 146, 171, 38);
		panel.add(tblb);
		
		eitext = new JTextField();
		eitext.setFont(new Font("Tahoma", Font.BOLD, 16));
		eitext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		eitext.setBounds(209, 87, 171, 38);
		panel.add(eitext);
		eitext.setColumns(10);
		
		cntext = new JTextField();
		cntext.setFont(new Font("Tahoma", Font.BOLD, 16));
		cntext.setColumns(10);
		cntext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		cntext.setBounds(209, 27, 171, 38);
		panel.add(cntext);
		
		t1.setVisible(false);
		t2.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		t6.setVisible(false);
		ter.setVisible(false);

		JButton BOOK = new JButton("BOOK");
		BOOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = false;
				  ei = false;
				  vn = false;
				  cn = false;
				  pr = false;
				  //adb = false;
				  tb = false;
				  addp =false;
				  
				 
				  

				if (cntext.getText().trim().isEmpty()&&eitext.getText().trim().isEmpty()&&tblb.getText().trim().isEmpty()&&vnlb.getText().trim().isEmpty()&&pricelb.getText().trim().isEmpty()&&addtext.getText().trim().isEmpty())
				{
					t1.setVisible(true);
					t2.setVisible(true);
					t3.setVisible(true);
					t4.setVisible(true);
					t5.setVisible(true);
					t6.setVisible(true);
					
				}
				if(cntext.getText().trim().isEmpty())
				{
					
					t1.setVisible(true);


				}
				else {
					t1.setVisible(false);
					al.add(cntext.getText());
					cn = true;
					op = op+1;
				}
				 if (eitext.getText().trim().isEmpty())
				{
					 t2.setVisible(true);

				}
				 else {
						boolean ei ;
						
						ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(eitext.getText()).matches();
						if (eitext!=null) {
							if(ei==false){
								//eilb.setText("wrong input !!!");
								ter.setVisible(true);
								ei = false;					
							}
							else {
								ter.setVisible(false);

								t2.setVisible(false);

								al.add(eitext.getText());
								ei = true;
								b = true ;
								op = op+1;
							}
						}
						}

				
					
		        if(tblb.getText().trim().isEmpty()) {
		        	t3.setVisible(true);
				}else {
				
					t3.setVisible(false);
					al.add(tblb.getText());
					tb = true;
					op = op+1;
				}
					
				
				
				if(vnlb.getText().trim().isEmpty())
				{
					t4.setVisible(true);


				}
				else {
					t4.setVisible(false);
					al.add(vnlb.getText());
					vn = true;
					op = op+1;
				}
			
				if(pricelb.getText().trim().isEmpty())
				{
					t5.setVisible(true);

					
				}
              else {
					
            	  t5.setVisible(false);
					al.add(pricelb.getText());
					pr = true;
					op = op+1;
				}
				if(addtext.getText().trim().isEmpty())
				{
					t6.setVisible(true);

					
				}
              else {
					
            	  t6.setVisible(false);
					al.add(addtext.getText());
					addp = true;
					op = op+1;
				}
			
				if(op  != 0) {
				Oracon ora = new Oracon();
				int a =ora.insertIntotyre(al);
				if(a ==1  ) {
					confirm.setVisible(true);
					//confirm.setVisible(true);
					String email=eitext.getText();
					
//					email em=new email();
//					em.emailservice(email);
				}
				else {
					JOptionPane.showMessageDialog(null,"Not Submitted");
				}
				
				
		
			
				
				}
			}
		});
		BOOK.setForeground(Color.WHITE);
		BOOK.setFont(new Font("Arial", Font.BOLD, 24));
		BOOK.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		BOOK.setBackground(new Color(148, 0, 211));
		BOOK.setBounds(92, 417, 229, 35);
		panel.add(BOOK);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Address");
		lblNewLabel_3_4_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_4_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_4_2.setBounds(28, 314, 99, 38);
		panel.add(lblNewLabel_3_4_2);
		
		JLabel pr2 = new JLabel("Rs 4999");
		pr2.setBounds(383, 491, 171, 38);
		pr2.setHorizontalAlignment(SwingConstants.CENTER);
		pr2.setForeground(new Color(0, 0, 0));
		pr2.setFont(new Font("Arial", Font.BOLD, 18));
		pr2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		tyrep.add(pr2);
		
		JLabel pr1 = new JLabel("Rs 3499");
		pr1.setBounds(383, 230, 171, 38);
		pr1.setHorizontalAlignment(SwingConstants.CENTER);
		pr1.setFont(new Font("Arial", Font.BOLD, 18));
		pr1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		tyrep.add(pr1);
		
		JLabel tyre4 = new JLabel("");
		tyre4.setBounds(319, 269, 320, 220);
		tyre4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pricelb.setText("Rs 4999");
			}
		});
		tyre4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\ceat4999.jpg"));
		tyre4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyrep.add(tyre4);
		
		JLabel tyre3 = new JLabel("");
		tyre3.setBounds(319, 10, 320, 220);
		tyre3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pricelb.setText("Rs 3499");
			}
		});
		tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\ceat3499.jpg"));
		tyre3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyrep.add(tyre3);
		
		JLabel tyre2 = new JLabel("");
		tyre2.setBounds(319, 269, 320, 220);
		tyre2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pricelb.setText("Rs 3750");
			}
		});
		tyre2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyre2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mrf3750.jpg"));
		tyrep.add(tyre2);
		
		JLabel tyre1 = new JLabel("");
		tyre1.setBounds(319, 10, 320, 220);
		tyre1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pricelb.setText("Rs 2290");
			}
		});
		tyre1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyre1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mrf2290.jpg"));
		tyrep.add(tyre1);
		
		JLabel lblNewLabel_2 = new JLabel("Tyer Brand    :-");
		lblNewLabel_2.setBounds(24, 37, 174, 41);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		tyrep.add(lblNewLabel_2);
		
		JButton btnMrf = new JButton("MRF");
		btnMrf.setBounds(49, 88, 229, 35);
		btnMrf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tyre1.setVisible(true);
				tyre2.setVisible(true);
				tyre3.setVisible(false);
				tyre4.setVisible(false);
				pr1.setText("Rs 2290");
				pr2.setText("Rs 3750");
				tblb.setText("MRF");
				
				
			}
		});
		btnMrf.setForeground(Color.WHITE);
		btnMrf.setFont(new Font("Arial", Font.BOLD, 24));
		btnMrf.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnMrf.setBackground(new Color(148, 0, 211));
		tyrep.add(btnMrf);
		
		JButton btnCeat = new JButton("CEAT");
		btnCeat.setBounds(49, 145, 229, 35);
		btnCeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tyre1.setVisible(false);
				tyre2.setVisible(false);
				tyre3.setVisible(true);
				tyre4.setVisible(true);
				pr1.setText("Rs 3499");
				pr2.setText("Rs 4999");
				tblb.setText("CEAT");
			}
		});
		btnCeat.setForeground(Color.WHITE);
		btnCeat.setFont(new Font("Arial", Font.BOLD, 24));
		btnCeat.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnCeat.setBackground(new Color(148, 0, 211));
		tyrep.add(btnCeat);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tyer For Brand   :-");
		lblNewLabel_2_1.setBounds(24, 190, 174, 41);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		tyrep.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("TATA");
		btnNewButton_1_1_1.setBounds(49, 236, 229, 35);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vnlb.setText("TATA");
			}
		});
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton_1_1_1.setBackground(new Color(148, 0, 211));
		tyrep.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("MAHENDRA");
		btnNewButton_1_1_2.setBounds(49, 292, 229, 35);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vnlb.setText("MAHENDRA");
			}
		});
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1_1_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton_1_1_2.setBackground(new Color(148, 0, 211));
		tyrep.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("TOYOTA");
		btnNewButton_1_1_3.setBounds(49, 347, 229, 35);
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vnlb.setText("TOYATA");

			}
		});
		btnNewButton_1_1_3.setForeground(Color.WHITE);
		btnNewButton_1_1_3.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1_1_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton_1_1_3.setBackground(new Color(148, 0, 211));
		tyrep.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("HONDA");
		btnNewButton_1_1_4.setBounds(49, 402, 229, 35);
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vnlb.setText("HONDA");

			}
		});
		btnNewButton_1_1_4.setForeground(Color.WHITE);
		btnNewButton_1_1_4.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1_1_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton_1_1_4.setBackground(new Color(148, 0, 211));
		tyrep.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_5 = new JButton("HYUNDAI");
		btnNewButton_1_1_5.setBounds(49, 454, 229, 35);
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vnlb.setText("HYUNDAI");

			}
		});
		btnNewButton_1_1_5.setForeground(Color.WHITE);
		btnNewButton_1_1_5.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton_1_1_5.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton_1_1_5.setBackground(new Color(148, 0, 211));
		tyrep.add(btnNewButton_1_1_5);
		
		JPanel otherp = new JPanel();
		otherp.setBounds(380, 222, 1119, 533);
		contentPane.add(otherp);
		otherp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 102)));
		otherp.setBackground(new Color(204, 204, 255));
		otherp.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(686, 10, 423, 480);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		otherp.add(panel_1);
		panel_1.setLayout(null);
		 
		 JLabel oer = new JLabel("Enter valid Email ID");
		 oer.setForeground(Color.RED);
		 oer.setFont(new Font("Arial", Font.BOLD, 12));
		 oer.setBounds(167, 125, 221, 23);
		 panel_1.add(oer);
		
		 opricelb = new JLabel("");
		 opricelb.setFont(new Font("Arial", Font.BOLD, 18));
		 opricelb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 opricelb.setBounds(178, 248, 171, 38);
		 panel_1.add(opricelb);
		 
		 	 optlb = new JLabel("");
		 	 optlb.setFont(new Font("Arial", Font.BOLD, 18));
		 	 optlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	 optlb.setBounds(178, 196, 171, 38);
		 	 panel_1.add(optlb);
		 	 
		 	 opnlb = new JLabel("");
		 	 opnlb.setFont(new Font("Arial", Font.BOLD, 18));
		 	 opnlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	 opnlb.setBounds(178, 148, 171, 38);
		 	 panel_1.add(opnlb);
		 	 
		 	  co1 = new JLabel("");
		 	  co1.addMouseListener(new MouseAdapter() {
		 	  	@Override
		 	  	public void mouseClicked(MouseEvent e) {
		 	  		opricelb.setText("Rs 8999");
		 	  		opnlb.setText("White");
		 	  	}
		 	  });
		 	  
		 	   mhp2 = new JLabel("Grabber  Rs 500");
		 	   mhp2.setHorizontalAlignment(SwingConstants.CENTER);
		 	   mhp2.setFont(new Font("Arial", Font.BOLD, 18));
		 	   mhp2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	   mhp2.setBounds(366, 441, 294, 26);
		 	   otherp.add(mhp2);
		 	   
		 	    mhp1 = new JLabel("Holder   Rs 280");
		 	    mhp1.setHorizontalAlignment(SwingConstants.CENTER);
		 	    mhp1.setFont(new Font("Arial", Font.BOLD, 18));
		 	    mhp1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	    mhp1.setBounds(20, 441, 294, 26);
		 	    otherp.add(mhp1);
		 	    
		 	     mh1 = new JLabel("");
		 	     mh1.addMouseListener(new MouseAdapter() {
		 	     	@Override
		 	     	public void mouseClicked(MouseEvent e) {
		 	     		opnlb.setText("Holder");
		 	     		opricelb.setText("Rs 280");
		 	     	}
		 	     });
		 	     mh1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mhold280.jpg"));
		 	     mh1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	     mh1.setBounds(10, 10, 320, 421);
		 	     otherp.add(mh1);
		 	     
		 	      mh2 = new JLabel("");
		 	      mh2.addMouseListener(new MouseAdapter() {
		 	      	@Override
		 	      	public void mouseClicked(MouseEvent e) {
		 	      		opnlb.setText("Grabber");
		 	      		opricelb.setText("Rs 500");
		 	      	}
		 	      });
		 	      mh2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mhold500.jpg"));
		 	      mh2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	      mh2.setBounds(356, 10, 320, 421);
		 	      otherp.add(mh2);
		 	      
		 	      
		 	      
		 	       
		 	      
		 	      
		 	      
		 	      
		 	      
		 	      JLabel lblNewLabel_3_4_1 = new JLabel("Customer Name");
		 	      lblNewLabel_3_4_1.setBounds(22, 30, 146, 26);
		 	      lblNewLabel_3_4_1.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      panel_1.add(lblNewLabel_3_4_1);
		 	      
		 	      JLabel lblNewLabel_3_4_1_1 = new JLabel("Email ID");
		 	      lblNewLabel_3_4_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      lblNewLabel_3_4_1_1.setBounds(22, 89, 146, 26);
		 	      panel_1.add(lblNewLabel_3_4_1_1);
		 	      
		 	      JLabel lblNewLabel_3_4_1_2 = new JLabel("Product Name");
		 	      lblNewLabel_3_4_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      lblNewLabel_3_4_1_2.setBounds(22, 148, 146, 26);
		 	      panel_1.add(lblNewLabel_3_4_1_2);
		 	      
		 	      JLabel lblNewLabel_3_4_1_3 = new JLabel("Price");
		 	      lblNewLabel_3_4_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      lblNewLabel_3_4_1_3.setBounds(22, 248, 146, 26);
		 	      panel_1.add(lblNewLabel_3_4_1_3);
		 	      
		 	      JLabel lblNewLabel_3_4_1_3_1 = new JLabel("Address ");
		 	      lblNewLabel_3_4_1_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1_3_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      lblNewLabel_3_4_1_3_1.setBounds(22, 302, 83, 26);
		 	      panel_1.add(lblNewLabel_3_4_1_3_1);
		 	      
		 	      JTextArea oaddtext = new JTextArea();
		 	      oaddtext.setFont(new Font("Arial", Font.BOLD, 16));
		 	      oaddtext.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		 	      oaddtext.setBounds(110, 304, 247, 87);
		 	      panel_1.add(oaddtext);
		 	      
		 	      ocntext = new JTextField();
		 	      ocntext.setFont(new Font("Tahoma", Font.BOLD, 16));
		 	      ocntext.setColumns(10);
		 	      ocntext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		 	      ocntext.setBounds(178, 30, 171, 38);
		 	      panel_1.add(ocntext);
		 	      
		 	      oeitext = new JTextField();
		 	      oeitext.setFont(new Font("Tahoma", Font.BOLD, 16));
		 	      oeitext.setColumns(10);
		 	      oeitext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		 	      oeitext.setBounds(178, 83, 171, 38);
		 	      panel_1.add(oeitext);
		 	      
	
		 	      
		 	      JLabel o1 = new JLabel("*");
		 	      o1.setForeground(new Color(255, 0, 0));
		 	      o1.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o1.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o1.setBounds(367, 30, 33, 35);
		 	      panel_1.add(o1);
		 	      
		 	      JLabel o2 = new JLabel("*");
		 	      o2.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o2.setForeground(Color.RED);
		 	      o2.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o2.setBounds(367, 89, 33, 35);
		 	      panel_1.add(o2);
		 	      
		 	      JLabel o3 = new JLabel("*");
		 	      o3.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o3.setForeground(Color.RED);
		 	      o3.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o3.setBounds(367, 148, 33, 35);
		 	      panel_1.add(o3);
		 	      
		 	      JLabel o4 = new JLabel("*");
		 	      o4.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o4.setForeground(Color.RED);
		 	      o4.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o4.setBounds(367, 193, 33, 35);
		 	      panel_1.add(o4);
		 	      
		 	      JLabel o6 = new JLabel("*");
		 	      o6.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o6.setForeground(Color.RED);
		 	      o6.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o6.setBounds(367, 297, 33, 35);
		 	      panel_1.add(o6);
		 	      
		 	      JLabel lblNewLabel_3_4_1_2_1 = new JLabel("Product Type");
		 	      lblNewLabel_3_4_1_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		 	      lblNewLabel_3_4_1_2_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	      lblNewLabel_3_4_1_2_1.setBounds(22, 200, 146, 26);
		 	      panel_1.add(lblNewLabel_3_4_1_2_1);
		 	      
		 	      JLabel o5 = new JLabel("*");
		 	      o5.setHorizontalAlignment(SwingConstants.CENTER);
		 	      o5.setForeground(Color.RED);
		 	      o5.setFont(new Font("Arial Black", Font.BOLD, 16));
		 	      o5.setBounds(367, 248, 33, 35);
		 	      panel_1.add(o5);
		 	      
		 	      o1.setVisible(false);
		 	      o2.setVisible(false);
		 	      o3.setVisible(false);
		 	      o4.setVisible(false);
		 	      o5.setVisible(false);
		 	      o6.setVisible(false);
					oer.setVisible(false);

		 	      
		 	      JButton oBOOK = new JButton("BOOK");
		 	      oBOOK.addActionListener(new ActionListener() {
		 	      	public void actionPerformed(ActionEvent e) {
		 	      		b = false;
		 	      		  ei = false;
		 	      		  vn = false;
		 	      		  cn = false;
		 	      		  pr = false;
		 	      		  //adb = false;
		 	      		  tb = false;
		 	      		  addp =false;
		 	      		  
		 	      		 
		 	      		  

		 	      		if (ocntext.getText().trim().isEmpty()&&oeitext.getText().trim().isEmpty()&&opnlb.getText().trim().isEmpty()&&optlb.getText().trim().isEmpty()&&opricelb.getText().trim().isEmpty()&&oaddtext.getText().trim().isEmpty())
		 	      		{
		 	      			o1.setVisible(true);
		 	      			o2.setVisible(true);
		 	      			o3.setVisible(true);
		 	      			o4.setVisible(true);
		 	      			o5.setVisible(true);
		 	      			o6.setVisible(true);
		 	      			
		 	      		}
		 	      		if(ocntext.getText().trim().isEmpty())
		 	      		{
		 	      			
		 	      			o1.setVisible(true);


		 	      		}
		 	      		else {
		 	      			o1.setVisible(false);
		 	      			ol.add(ocntext.getText());
		 	      			cn = true;
		 	      			op = op+1;
		 	      		}
		 	      		 if (oeitext.getText().trim().isEmpty())
		 	      		{
		 	      			 o2.setVisible(true);

		 	      		}
		 	      		 else {
		 	      				boolean ei ;
		 	      				
		 	      				ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(oeitext.getText()).matches();
		 	      				if (oeitext!=null) {
		 	      					if(ei==false){
		 	      						//eilb.setText("wrong input !!!");
										oer.setVisible(true);

		 	      						ei = false;					
		 	      					}
		 	      					else {
										oer.setVisible(false);

		 	      						o2.setVisible(false);

		 	      						ol.add(oeitext.getText());
		 	      						ei = true;
		 	      						b = true ;
		 	      						op = op+1;
		 	      					}
		 	      				}
		 	      				}

		 	      		
		 	      			
		 	              if(opnlb.getText().trim().isEmpty()) {
		 	              	o3.setVisible(true);
		 	      		}else {
		 	      		
		 	      			o3.setVisible(false);
		 	      			ol.add(opnlb.getText());
		 	      			tb = true;
		 	      			op = op+1;
		 	      		}
		 	      			
		 	      		
		 	      		
		 	      		if(optlb.getText().trim().isEmpty())
		 	      		{
		 	      			o4.setVisible(true);


		 	      		}
		 	      		else {
		 	      			o4.setVisible(false);
		 	      			ol.add(optlb.getText());
		 	      			vn = true;
		 	      			op = op+1;
		 	      		}
		 	      	
		 	      		if(opricelb.getText().trim().isEmpty())
		 	      		{
		 	      			o5.setVisible(true);

		 	      			
		 	      		}
            else {
		 	      			
          	  o5.setVisible(false);
          	ol.add(opricelb.getText());
		 	      			pr = true;
		 	      			op = op+1;
		 	      		}
		 	      		if(oaddtext.getText().trim().isEmpty())
		 	      		{
		 	      			o6.setVisible(true);

		 	      			
		 	      		}
            else {
		 	      			
          	  o6.setVisible(false);
          	ol.add(oaddtext.getText());
		 	      			addp = true;
		 	      			op = op+1;
		 	      		}
		 	      	
		 	      		if(op  != 0) {
		 	      		Oracon ora = new Oracon();
		 	      		int a =ora.insertIntoother(ol);
		 	      		if(a ==1  ) {
		 	      			confirm.setVisible(true);
		 	      			//confirm.setVisible(true);
		 	      			String email=oeitext.getText();
		 	      			
//					email em=new email();
//					em.emailservice(email);
		 	      		}
		 	      		else {
		 	      			JOptionPane.showMessageDialog(null,"Not Submitted");
		 	      		}
		 	      		
		 	      		
		 	      
		 	      	
		 	      		
		 	      		}
		 	      	}
		 	      });
		 	      oBOOK.setForeground(Color.WHITE);
		 	      oBOOK.setFont(new Font("Arial", Font.BOLD, 24));
		 	      oBOOK.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		 	      oBOOK.setBackground(new Color(148, 0, 211));
		 	      oBOOK.setBounds(110, 401, 229, 35);
		 	      panel_1.add(oBOOK);
		 	      co1.setBounds(10, 10, 320, 220);
		 	      co1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover8999.jpg"));
		 	      co1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	      otherp.add(co1);
		 	      
		 	       co3 = new JLabel("");
		 	       co3.addMouseListener(new MouseAdapter() {
		 	       	@Override
		 	       	public void mouseClicked(MouseEvent e) {
		 	       		opricelb.setText("Rs 9999");
		 	       		opnlb.setText("Brown");
		 	       	}
		 	       });
		 	       co3.setBounds(10, 265, 320, 220);
		 	       co3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover11999.jpg"));
		 	       co3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	       otherp.add(co3);
		 	       
		 	        co2 = new JLabel("");
		 	        co2.addMouseListener(new MouseAdapter() {
		 	        	@Override
		 	        	public void mouseClicked(MouseEvent e) {
		 	        		opricelb.setText("Rs 11999");
		 	        		opnlb.setText("Orange");
		 	        	}
		 	        });
		 	        co2.setBounds(356, 10, 320, 220);
		 	        co2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover9999.jpg"));
		 	        co2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	        otherp.add(co2);
		 	        
		 	         co4 = new JLabel("");
		 	         co4.addMouseListener(new MouseAdapter() {
		 	         	@Override
		 	         	public void mouseClicked(MouseEvent e) {
		 	         		opricelb.setText("Rs 6999");
		 	         		opnlb.setText("Black");
		 	         	}
		 	         });
		 	         co4.setBounds(356, 265, 320, 220);
		 	         co4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover6999.jpg"));
		 	         co4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		 	         otherp.add(co4);
		 	         
		 	          opr1 = new JLabel("White   Rs 8999");
		 	          opr1.setHorizontalAlignment(SwingConstants.CENTER);
		 	          opr1.setFont(new Font("Arial", Font.BOLD, 18));
		 	          opr1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	          opr1.setBounds(20, 235, 294, 26);
		 	          otherp.add(opr1);
		 	          
		 	           opr2 = new JLabel("Orange   Rs 9999");
		 	           opr2.setHorizontalAlignment(SwingConstants.CENTER);
		 	           opr2.setFont(new Font("Arial", Font.BOLD, 18));
		 	           opr2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	           opr2.setBounds(366, 235, 294, 26);
		 	           otherp.add(opr2);
		 	           
		 	            opr3 = new JLabel("Brown   Rs 11999");
		 	            opr3.setHorizontalAlignment(SwingConstants.CENTER);
		 	            opr3.setFont(new Font("Arial", Font.BOLD, 18));
		 	            opr3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	            opr3.setBounds(34, 495, 294, 26);
		 	            otherp.add(opr3);
		 	            
		 	             opr4 = new JLabel("Black   Rs 6999");
		 	             opr4.setHorizontalAlignment(SwingConstants.CENTER);
		 	             opr4.setFont(new Font("Arial", Font.BOLD, 18));
		 	             opr4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		 	             opr4.setBounds(382, 495, 294, 26);
		 	             otherp.add(opr4);
		 	             
		 	             otherp.setVisible(false);
		 	             mh1.setVisible(false);
		 	             mh2.setVisible(false);
		 	             
		 	             mhp1.setVisible(false);
		 	             mhp2.setVisible(false);
		 	             
		 	             otherp.setVisible(false);
		
		JPanel accmenu = new JPanel();
		accmenu.setBounds(33, 222, 314, 533);
		accmenu.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 102)));
		accmenu.setBackground(new Color(204, 204, 255));
		contentPane.add(accmenu);
		accmenu.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FILTER");
		lblNewLabel_1.setBounds(32, 10, 250, 46);
		lblNewLabel_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(100, 149, 237));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		accmenu.add(lblNewLabel_1);
		
				
				JButton btnTyres = new JButton("Tyres");
				btnTyres.setBounds(58, 117, 210, 35);
				btnTyres.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						tyrep.setVisible(true);
						otherp.setVisible(false);
						
					}
				});
				btnTyres.setForeground(Color.WHITE);
				btnTyres.setFont(new Font("Arial", Font.BOLD, 24));
				btnTyres.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
				btnTyres.setBackground(new Color(148, 0, 211));
				accmenu.add(btnTyres);
				JButton btnCeatCover = new JButton("Seat Cover");
				btnCeatCover.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						otherp.setVisible(true);
						tyrep.setVisible(false);
						optlb.setText("Seat Cover");
						co1.setVisible(true);
						co2.setVisible(true);
						co3.setVisible(true);
						co4.setVisible(true);
						
						opr1.setVisible(true);
						opr2.setVisible(true);
						opr3.setVisible(true);
						opr4.setVisible(true);
						
						mh1.setVisible(false);
						mh2.setVisible(false);
						
						mhp1.setVisible(false);
						mhp2.setVisible(false);

						
					}
				});
				btnCeatCover.setBounds(58, 217, 210, 35);
				btnCeatCover.setForeground(Color.WHITE);
				btnCeatCover.setFont(new Font("Arial", Font.BOLD, 24));
				btnCeatCover.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
				btnCeatCover.setBackground(new Color(148, 0, 211));
				accmenu.add(btnCeatCover);
				
				JButton btnMobileHolder = new JButton("Mobile Holder");
				btnMobileHolder.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						otherp.setVisible(true);
						tyrep.setVisible(false);
						optlb.setText("Mobile Holder");
						co1.setVisible(false);
						co2.setVisible(false);
						co3.setVisible(false);
						co4.setVisible(false);
						
						opr1.setVisible(false);
						opr2.setVisible(false);
						opr3.setVisible(false);
						opr4.setVisible(false);
						
						mh1.setVisible(true);
						mh2.setVisible(true);
						
						mhp1.setVisible(true);
						mhp2.setVisible(true);
					}
				});
				btnMobileHolder.setBounds(58, 275, 210, 35);
				btnMobileHolder.setForeground(Color.WHITE);
				btnMobileHolder.setFont(new Font("Arial", Font.BOLD, 24));
				btnMobileHolder.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
				btnMobileHolder.setBackground(new Color(148, 0, 211));
				accmenu.add(btnMobileHolder);
				
				JLabel lblNewLabel_2_2 = new JLabel("Primary Accessori    :-");
				lblNewLabel_2_2.setBounds(32, 66, 224, 41);
				lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
				accmenu.add(lblNewLabel_2_2);
				
				JLabel lblNewLabel_2_2_1 = new JLabel("Other Accessori    :-");
				lblNewLabel_2_2_1.setBounds(32, 166, 224, 41);
				lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
				accmenu.add(lblNewLabel_2_2_1);
		
		JPanel carp = new JPanel();
		carp.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 102)));
		carp.setBackground(new Color(255, 228, 196));
		carp.setBounds(380, 222, 1119, 533);
		contentPane.add(carp);
		carp.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(679, 10, 416, 513);
		panel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		panel_2.setBackground(Color.WHITE);
		carp.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel cer = new JLabel("Enter valid Email ID");
		cer.setForeground(Color.RED);
		cer.setFont(new Font("Arial", Font.BOLD, 12));
		cer.setBounds(191, 129, 221, 23);
		panel_2.add(cer);
		
		JLabel cprlb = new JLabel("");
		cprlb.setFont(new Font("Arial", Font.BOLD, 18));
		cprlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		cprlb.setBounds(191, 274, 171, 38);
		panel_2.add(cprlb);
		
		JLabel cmnlb = new JLabel("");
		cmnlb.setFont(new Font("Arial", Font.BOLD, 18));
		cmnlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		cmnlb.setBounds(191, 213, 171, 38);
		panel_2.add(cmnlb);
		
		JLabel cbnlb = new JLabel("");
		cbnlb.setFont(new Font("Arial", Font.BOLD, 18));
		cbnlb.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		cbnlb.setBounds(191, 151, 171, 38);
		panel_2.add(cbnlb);
		
		JLabel lblNewLabel_3_5 = new JLabel("Customer Name");
		lblNewLabel_3_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_5.setBounds(10, 28, 171, 38);
		panel_2.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Email ID");
		lblNewLabel_3_6.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_6.setBounds(10, 88, 171, 38);
		panel_2.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Car Brand Name");
		lblNewLabel_3_7.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_7.setBounds(10, 151, 171, 38);
		panel_2.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Car Model Name");
		lblNewLabel_3_8.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_8.setBounds(10, 213, 171, 38);
		panel_2.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Car Price");
		lblNewLabel_3_9.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_9.setBounds(10, 274, 171, 38);
		panel_2.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Address");
		lblNewLabel_3_10.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
		lblNewLabel_3_10.setBounds(10, 333, 114, 38);
		panel_2.add(lblNewLabel_3_10);
		
		JTextArea caddtext = new JTextArea();
		caddtext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		caddtext.setBounds(146, 333, 216, 89);
		panel_2.add(caddtext);
		
		ccntext = new JTextField();
		ccntext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		ccntext.setBounds(191, 28, 171, 38);
		panel_2.add(ccntext);
		ccntext.setColumns(10);
		
		ceitext = new JTextField();
		ceitext.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 139)));
		ceitext.setColumns(10);
		ceitext.setBounds(191, 88, 171, 38);
		panel_2.add(ceitext);
		
		JLabel ce1 = new JLabel("*");
		ce1.setHorizontalAlignment(SwingConstants.CENTER);
		ce1.setForeground(new Color(255, 0, 0));
		ce1.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce1.setBounds(372, 28, 34, 38);
		panel_2.add(ce1);
		
		JLabel ce2 = new JLabel("*");
		ce2.setHorizontalAlignment(SwingConstants.CENTER);
		ce2.setForeground(Color.RED);
		ce2.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce2.setBounds(372, 88, 34, 38);
		panel_2.add(ce2);
		
		JLabel ce3 = new JLabel("*");
		ce3.setHorizontalAlignment(SwingConstants.CENTER);
		ce3.setForeground(Color.RED);
		ce3.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce3.setBounds(372, 151, 34, 38);
		panel_2.add(ce3);
		
		JLabel ce4 = new JLabel("*");
		ce4.setHorizontalAlignment(SwingConstants.CENTER);
		ce4.setForeground(Color.RED);
		ce4.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce4.setBounds(372, 213, 34, 38);
		panel_2.add(ce4);
		
		JLabel ce5 = new JLabel("*");
		ce5.setHorizontalAlignment(SwingConstants.CENTER);
		ce5.setForeground(Color.RED);
		ce5.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce5.setBounds(372, 274, 34, 38);
		panel_2.add(ce5);
		
		JLabel ce6 = new JLabel("*");
		ce6.setHorizontalAlignment(SwingConstants.CENTER);
		ce6.setForeground(Color.RED);
		ce6.setFont(new Font("Arial Black", Font.BOLD, 16));
		ce6.setBounds(372, 333, 34, 38);
		panel_2.add(ce6);
		ce1.setVisible(false);
		ce2.setVisible(false);
		ce3.setVisible(false);
		ce4.setVisible(false);
		ce5.setVisible(false);
		ce6.setVisible(false);
		
				
		cer.setVisible(false);

				JButton btnCars_1 = new JButton("BOOK");
				btnCars_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						b = false;
						  ei = false;
						  vn = false;
						  cn = false;
						  pr = false;
						  //adb = false;
						  tb = false;
						  addp =false;
						  
						 
						  

						if (ccntext.getText().trim().isEmpty()&&ceitext.getText().trim().isEmpty()&&cbnlb.getText().trim().isEmpty()&&cmnlb.getText().trim().isEmpty()&&cprlb.getText().trim().isEmpty()&&caddtext.getText().trim().isEmpty())
						{
							ce1.setVisible(true);
							ce2.setVisible(true);
							ce3.setVisible(true);
							ce4.setVisible(true);
							ce5.setVisible(true);
							ce6.setVisible(true);
							
						}
						
						if(ccntext.getText().trim().isEmpty())
						{
							
							ce1.setVisible(true);


						}
						else {
							ce1.setVisible(false);
							cl.add(ccntext.getText());
							cn = true;
							op = op+1;
						}
						 if (ceitext.getText().trim().isEmpty())
						{
							 ce2.setVisible(true);

						}
						 else {
								boolean ei ;
								
								ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(ceitext.getText()).matches();
								if (ceitext!=null) {
									if(ei==false){
										//eilb.setText("wrong input !!!");
										cer.setVisible(true);

										ei = false;					
									}
									else {
										cer.setVisible(false);

										ce2.setVisible(false);

										cl.add(ceitext.getText());
										ei = true;
										b = true ;
										op = op+1;
									}
								}
								}

						
							
				        if(cbnlb.getText().trim().isEmpty()) {
				        	ce3.setVisible(true);
						}else {
							

							ce3.setVisible(false);
							cl.add(cbnlb.getText());
							tb = true;
							op = op+1;
						}
							
						
						
						if(cmnlb.getText().trim().isEmpty())
						{
							ce4.setVisible(true);


						}
						else {
							ce4.setVisible(false);
							cl.add(cmnlb.getText());
							vn = true;
							op = op+1;
						}
					
						if(cprlb.getText().trim().isEmpty())
						{
							ce5.setVisible(true);

							
						}
            else {
							
          	  ce5.setVisible(false);
							cl.add(cprlb.getText());
							pr = true;
							op = op+1;
						}
						if(caddtext.getText().trim().isEmpty())
						{
							ce6.setVisible(true);

							
						}
            else {
							
          	  ce6.setVisible(false);
							cl.add(caddtext.getText());
							addp = true;
							op = op+1;
						}
					
						if(op  != 0) {
						Oracon ora = new Oracon();
						int a =ora.insertIntocar(cl);
						if(a ==1  ) {
							
							confirm.setVisible(true);
							
							//confirm.setVisible(true);
							String email=ceitext.getText();
							
//					email em=new email();
//					em.emailservice(email);
						}
						else {
							JOptionPane.showMessageDialog(null,"Not Submitted");
						}
						
						
				
					
						
						}
					}
				});
				btnCars_1.setForeground(Color.WHITE);
				btnCars_1.setFont(new Font("Arial", Font.BOLD, 24));
				btnCars_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
				btnCars_1.setBackground(new Color(255, 140, 0));
				btnCars_1.setBounds(120, 446, 210, 35);
				panel_2.add(btnCars_1);
				
				JLabel hors2 = new JLabel("TATA Tiago Rs 8 Lakh ");
				hors2.setBounds(359, 374, 294, 26);
				hors2.setHorizontalAlignment(SwingConstants.CENTER);
				hors2.setFont(new Font("Arial", Font.BOLD, 18));
				hors2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(hors2);
				
				JLabel hors1 = new JLabel("TATA Tiago Rs 8 Lakh ");
				hors1.setBounds(359, 129, 294, 26);
				hors1.setHorizontalAlignment(SwingConstants.CENTER);
				hors1.setFont(new Font("Arial", Font.BOLD, 18));
				hors1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(hors1);
				
				JLabel hocar2 = new JLabel("");
				hocar2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Amaze");
						cprlb.setText("Rs 6.99 Lakh");


					}
				});
				hocar2.setBounds(10, 270, 347, 250);
				hocar2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\honda amaze.jpg"));
				hocar2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hocar2);
				
				JLabel hocar1 = new JLabel("");
				hocar1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("City");
						cprlb.setText("Rs 11.5 Lakh");


					}
				});
				hocar1.setBounds(10, 10, 347, 250);
				hocar1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\honda city.jpg"));
				hocar1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hocar1);
				
				JLabel hycar1 = new JLabel("");
				hycar1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("i20");
						cprlb.setText("Rs 7.46 Lakh");


					}
				});
				hycar1.setBounds(10, 10, 320, 220);
				hycar1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\i20.jpg"));
				hycar1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hycar1);
				
				JLabel hycar2 = new JLabel("");
				hycar2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Creta");
						cprlb.setText("Rs 10.9 Lakh");


					}
				});
				hycar2.setBounds(349, 10, 320, 220);
				hycar2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\creta.jpg"));
				hycar2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hycar2);
				
				JLabel hycar3 = new JLabel("");
				hycar3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Verna");
						cprlb.setText("Rs 10.9 Lakh");


					}
				});
				hycar3.setBounds(10, 270, 320, 220);
				hycar3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\verna.jpg"));
				hycar3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hycar3);
				
				JLabel hycar4 = new JLabel("");
				hycar4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Venue");
						cprlb.setText("Rs 7.72 Lakh");


					}
				});
				hycar4.setBounds(349, 270, 320, 220);
				hycar4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\venue.jpg"));
				hycar4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(hycar4);
				
				JLabel tocar4 = new JLabel("");
				tocar4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Glanza");
						cprlb.setText("Rs 7 Lakh");


					}
				});
				tocar4.setBounds(349, 270, 320, 220);
				tocar4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\glanza.jpg"));
				tocar4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tocar4);
				
				JLabel tocar3 = new JLabel("");
				tocar3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Hycross");
						cprlb.setText("Rs 17 Lakh");


					}
				});
				tocar3.setBounds(10, 270, 320, 220);
				tocar3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\ihyerus.jpeg"));
				tocar3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tocar3);
				
				JLabel tocar2 = new JLabel("");
				tocar2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Innova Crysta");
						cprlb.setText("Rs 20 Lakh");


					}
				});
				tocar2.setBounds(349, 10, 320, 220);
				tocar2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\icrysta.jpg"));
				tocar2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tocar2);
				
				JLabel tocar1 = new JLabel("");
				tocar1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Fortuner");
						cprlb.setText("Rs 33 Lakh");


					}
				});
				tocar1.setBounds(10, 10, 320, 220);
				tocar1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\Fortuner.jpg"));
				tocar1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tocar1);
				
				JLabel macar4 = new JLabel("");
				macar4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("XUV700");
						cprlb.setText("Rs 14 Lakh");


					}
				});
				macar4.setBounds(349, 270, 320, 220);
				macar4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\XUV700.jpg"));
				macar4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(macar4);
				
				JLabel macar3 = new JLabel("");
				macar3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Scorpio");
						cprlb.setText("Rs 13 Lakh");


					}
				});
				macar3.setBounds(10, 270, 320, 220);
				macar3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\scorpio.jpg"));
				macar3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(macar3);
				
				JLabel macar2 = new JLabel("");
				macar2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Bolero");
						cprlb.setText("Rs 9.78 Lakh");


					}
				});
				macar2.setBounds(349, 10, 320, 220);
				macar2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\bolero.jpg"));
				macar2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(macar2);
				
				JLabel macar1 = new JLabel("");
				macar1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Thar");
						cprlb.setText("Rs 11 Lakh");


					}
				});
				macar1.setBounds(10, 10, 320, 220);
				macar1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\thar.jpg"));
				macar1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(macar1);
				
				JLabel tacar1 = new JLabel("");
				tacar1.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						cmnlb.setText("Nexon");
						cprlb.setText("Rs 7.8 Lakh");
					}
				});
				tacar1.setBounds(10, 10, 320, 220);
				tacar1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\nexon.jpg"));
				tacar1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tacar1);
				
				JLabel tacar2 = new JLabel("");
				tacar2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Tiago");
						cprlb.setText("Rs 8 Lakh");

					}
				});
				tacar2.setBounds(349, 10, 320, 220);
				tacar2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\tiago.jpg"));
				tacar2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tacar2);
				
				JLabel tacar3 = new JLabel("");
				tacar3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Harrier");
						cprlb.setText("Rs 15 Lakh");


					}
				});
				tacar3.setBounds(10, 270, 320, 220);
				tacar3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\harrier.jpg"));
				tacar3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tacar3);
				
				JLabel tacar4 = new JLabel("");
				tacar4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						cmnlb.setText("Safari");
						cprlb.setText("Rs 24.5 Lakh");


					}
				});
				tacar4.setBounds(349, 270, 320, 220);
				tacar4.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\safari.jpg"));
				tacar4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
				carp.add(tacar4);
				
				JLabel tars1 = new JLabel("TATA Nexon Rs 7.8 Lakh");
				tars1.setBounds(20, 234, 294, 26);
				tars1.setHorizontalAlignment(SwingConstants.CENTER);
				tars1.setFont(new Font("Arial", Font.BOLD, 18));
				tars1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(tars1);
				
				JLabel tars2 = new JLabel("TATA Tiago Rs 8 Lakh ");
				tars2.setBounds(359, 234, 294, 26);
				tars2.setHorizontalAlignment(SwingConstants.CENTER);
				tars2.setFont(new Font("Arial", Font.BOLD, 18));
				tars2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(tars2);
				
				JLabel tars3 = new JLabel("TATA Harrier Rs 15 Lakh");
				tars3.setBounds(30, 497, 294, 26);
				tars3.setHorizontalAlignment(SwingConstants.CENTER);
				tars3.setFont(new Font("Arial", Font.BOLD, 18));
				tars3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(tars3);
				
				JLabel tars4 = new JLabel("TATA Safari Rs 24.5 Lakh");
				tars4.setBounds(359, 500, 294, 26);
				tars4.setHorizontalAlignment(SwingConstants.CENTER);
				tars4.setFont(new Font("Arial", Font.BOLD, 18));
				tars4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 128)));
				carp.add(tars4);
				
				macar1.setVisible(false);
				macar2.setVisible(false);
				macar3.setVisible(false);
				macar4.setVisible(false);
				
				tocar1.setVisible(false);
				tocar2.setVisible(false);
				tocar3.setVisible(false);
				tocar4.setVisible(false);
				
				hycar1.setVisible(false);
				hycar2.setVisible(false);
				hycar3.setVisible(false);
				hycar4.setVisible(false);
				
				hocar1.setVisible(false);
				hocar2.setVisible(false);
				
				hors1.setVisible(false);
				hors2.setVisible(false);
				

				tars1.setVisible(true);
				tars2.setVisible(true);
				tars3.setVisible(true);
				tars4.setVisible(true);
				carp.setVisible(false);
		
		JPanel carmenu = new JPanel();
		carmenu.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 102)));
		carmenu.setBackground(new Color(255, 228, 196));
		carmenu.setBounds(33, 222, 314, 533);
		contentPane.add(carmenu);
		carmenu.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("FILTER");
		lblNewLabel_1_1.setBounds(32, 10, 250, 46);
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		lblNewLabel_1_1.setBackground(new Color(100, 149, 237));
		carmenu.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Car Brands   :-");
		lblNewLabel_2_2_2.setBounds(32, 66, 224, 41);
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		carmenu.add(lblNewLabel_2_2_2);
		
		JButton btnTata = new JButton("TATA");
		btnTata.setBounds(64, 106, 210, 35);
		btnTata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbnlb.setText("TATA");
				tacar1.setVisible(true);
				tacar2.setVisible(true);
				tacar3.setVisible(true);
				tacar4.setVisible(true);
				
				macar1.setVisible(false);
				macar2.setVisible(false);
				macar3.setVisible(false);
				macar4.setVisible(false);
				
				tocar1.setVisible(false);
				tocar2.setVisible(false);
				tocar3.setVisible(false);
				tocar4.setVisible(false);
				
				hycar1.setVisible(false);
				hycar2.setVisible(false);
				hycar3.setVisible(false);
				hycar4.setVisible(false);
				
				hocar1.setVisible(false);
				hocar2.setVisible(false);
				
				hors1.setVisible(false);
				hors2.setVisible(false);
				

				tars1.setVisible(true);
				tars2.setVisible(true);
				tars3.setVisible(true);
				tars4.setVisible(true);
				
				tars1.setText("TATA Nexon Rs 7.8 Lakh");
				tars2.setText("TATA Tiago Rs 8 Lakh ");
				tars3.setText("TATA Harrier Rs 15 Lakh");
				tars4.setText("TATA Safari Rs 24.5 Lakh");
			}
		});
		btnTata.setForeground(Color.WHITE);
		btnTata.setFont(new Font("Arial", Font.BOLD, 24));
		btnTata.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnTata.setBackground(new Color(255, 140, 0));
		carmenu.add(btnTata);
		
		JButton btnMahendra = new JButton("MAHENDRA");
		btnMahendra.setBounds(64, 162, 210, 35);
		btnMahendra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbnlb.setText("MAHENDRA");
				macar1.setVisible(true);
				macar2.setVisible(true);
				macar3.setVisible(true);
				macar4.setVisible(true);
				
				tacar1.setVisible(false);
				tacar2.setVisible(false);
				tacar3.setVisible(false);
				tacar4.setVisible(false);
				
				tocar1.setVisible(false);
				tocar2.setVisible(false);
				tocar3.setVisible(false);
				tocar4.setVisible(false);
				
				hycar1.setVisible(false);
				hycar2.setVisible(false);
				hycar3.setVisible(false);
				hycar4.setVisible(false);
				
				hocar1.setVisible(false);
				hocar2.setVisible(false);
				
				hors1.setVisible(false);
				hors2.setVisible(false);
				

				tars1.setVisible(true);
				tars2.setVisible(true);
				tars3.setVisible(true);
				tars4.setVisible(true);
				
				tars1.setText("MAHENDRA Thar Rs 11 Lakh");
				tars2.setText("MAHENDRA Bolero Rs 9.78 Lakh");
				tars3.setText("MAHENDRA Scorpio Rs 13 Lakh");
				tars4.setText("MAHENDRA XUV700 Rs 14 Lakh");
			}
		});
		btnMahendra.setForeground(Color.WHITE);
		btnMahendra.setFont(new Font("Arial", Font.BOLD, 24));
		btnMahendra.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnMahendra.setBackground(new Color(255, 140, 0));
		carmenu.add(btnMahendra);
		
		JButton btnToyota = new JButton("TOYOTA");
		btnToyota.setBounds(64, 221, 210, 35);
		btnToyota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbnlb.setText("TOYOTA");

				
				tocar1.setVisible(true);
				tocar2.setVisible(true);
				tocar3.setVisible(true);
				tocar4.setVisible(true);
				
				macar1.setVisible(false);
				macar2.setVisible(false);
				macar3.setVisible(false);
				macar4.setVisible(false);
				
				tacar1.setVisible(false);
				tacar2.setVisible(false);
				tacar3.setVisible(false);
				tacar4.setVisible(false);
				
				hycar1.setVisible(false);
				hycar2.setVisible(false);
				hycar3.setVisible(false);
				hycar4.setVisible(false);
				
				hocar1.setVisible(false);
				hocar2.setVisible(false);
				
				hors1.setVisible(false);
				hors2.setVisible(false);
				

				tars1.setVisible(true);
				tars2.setVisible(true);
				tars3.setVisible(true);
				tars4.setVisible(true);
				
				tars1.setText("TOYOTA Fortuner Rs 33 Lakh");
				tars2.setText("TOYOTA Innova Crysta Rs 20 Lakh");
				tars3.setText("TOYOTA Innova Hycross Rs 17 Lakh");
				tars4.setText("TOYOTA Glanza Rs 7 Lakh");
			}
		});
		btnToyota.setForeground(Color.WHITE);
		btnToyota.setFont(new Font("Arial", Font.BOLD, 24));
		btnToyota.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnToyota.setBackground(new Color(255, 140, 0));
		carmenu.add(btnToyota);
		
		JButton btnHonda = new JButton("HONDA");
		btnHonda.setBounds(64, 278, 210, 35);
		btnHonda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbnlb.setText("HONDA");

				
				hocar1.setVisible(true);
				hocar2.setVisible(true);
				
				hors1.setVisible(true);
				hors2.setVisible(true);
				

				tars1.setVisible(false);
				tars2.setVisible(false);
				tars3.setVisible(false);
				tars4.setVisible(false);
				
				hycar1.setVisible(false);
				hycar2.setVisible(false);
				hycar3.setVisible(false);
				hycar4.setVisible(false);
				
				tocar1.setVisible(false);
				tocar2.setVisible(false);
				tocar3.setVisible(false);
				tocar4.setVisible(false);
				
				macar1.setVisible(false);
				macar2.setVisible(false);
				macar3.setVisible(false);
				macar4.setVisible(false);
				
				tacar1.setVisible(false);
				tacar2.setVisible(false);
				tacar3.setVisible(false);
				tacar4.setVisible(false);
				
				hors1.setText("HONDA City Rs 11.5 Lakh");
				hors2.setText("HONDA Amaze Rs 6.99 Lakh");
				
			}
		});
		btnHonda.setForeground(Color.WHITE);
		btnHonda.setFont(new Font("Arial", Font.BOLD, 24));
		btnHonda.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnHonda.setBackground(new Color(255, 140, 0));
		carmenu.add(btnHonda);
		
		JButton btnHyundai = new JButton("HYUNDAI");
		btnHyundai.setBounds(64, 337, 210, 35);
		btnHyundai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbnlb.setText("HYUNDAI");

				
				hycar1.setVisible(true);
				hycar2.setVisible(true);
				hycar3.setVisible(true);
				hycar4.setVisible(true);
				
				tocar1.setVisible(false);
				tocar2.setVisible(false);
				tocar3.setVisible(false);
				tocar4.setVisible(false);
				
				macar1.setVisible(false);
				macar2.setVisible(false);
				macar3.setVisible(false);
				macar4.setVisible(false);
				
				tacar1.setVisible(false);
				tacar2.setVisible(false);
				tacar3.setVisible(false);
				tacar4.setVisible(false);
				
				hocar1.setVisible(false);
				hocar2.setVisible(false);
				
				hors1.setVisible(false);
				hors2.setVisible(false);
				

				tars1.setVisible(true);
				tars2.setVisible(true);
				tars3.setVisible(true);
				tars4.setVisible(true);
				
				tars1.setText("HYUNDAI i20 Rs 7.46 Lakh");
				tars2.setText("HYUNDAI Creta Rs 10.9 Lakh");
				tars3.setText("HYUNDAI Verna Rs 10.9 Lakh");
				tars4.setText("HYUNDAI Venue Rs 7.72 Lakh");
			}
		});
		btnHyundai.setForeground(Color.WHITE);
		btnHyundai.setFont(new Font("Arial", Font.BOLD, 24));
		btnHyundai.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnHyundai.setBackground(new Color(255, 140, 0));
		carmenu.add(btnHyundai);
		carmenu.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(463, 10, 164, 108);
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 51, 153)));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\shoplogo.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblAutomotive = new JLabel("AUTOMOTIVE");
		lblAutomotive.setBounds(649, 10, 455, 108);
		lblAutomotive.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 51, 153)));
		lblAutomotive.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\Free Car Logo 1.png"));
		lblAutomotive.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 34));
		contentPane.add(lblAutomotive);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 128, 1464, 14);
		separator.setBorder(new MatteBorder(5, 0, 2, 0, (Color) new Color(0, 0, 128)));
		contentPane.add(separator);

		
		JButton btnNewButton = new JButton("ACCESORIES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accmenu.setVisible(true);
				tyrep.setVisible(true);
				
				carmenu.setVisible(false);
				carp.setVisible(false);
				otherp.setVisible(false);
				
			}
		});
		btnNewButton.setBounds(514, 164, 210, 35);
		btnNewButton.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 24));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(148, 0, 211));
		contentPane.add(btnNewButton);
		
		JButton btnCars = new JButton("CARS");
		btnCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accmenu.setVisible(false);
				tyrep.setVisible(false);
				otherp.setVisible(false);
				
				carmenu.setVisible(true);
				carp.setVisible(true);
			}
		});
		btnCars.setBounds(823, 164, 210, 35);
		btnCars.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnCars.setForeground(Color.WHITE);
		btnCars.setFont(new Font("Arial", Font.BOLD, 24));
		btnCars.setBackground(new Color(255, 140, 0));
		contentPane.add(btnCars);
		
		JButton btnCars_2 = new JButton("<-- BACK");
		btnCars_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCars_2.setForeground(Color.WHITE);
		btnCars_2.setFont(new Font("Arial", Font.BOLD, 24));
		btnCars_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 51, 153)));
		btnCars_2.setBackground(new Color(255, 0, 0));
		btnCars_2.setBounds(30, 164, 145, 35);
		contentPane.add(btnCars_2);
	}
}
