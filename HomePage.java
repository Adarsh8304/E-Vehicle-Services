package com.vehical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;

//import com.booktickets.email;
import com.datasource.Oracon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class HomePage extends JFrame {

	private JPanel contentPane;
	private JTextField fntext;
	private JTextField lntext;
	private JTextField mntext;
	private JTextField eitext;
	private JTextField pwtext;
	private JTextField cptext;
	private JTextField usertext;
	private JTextField passwordtext;
	public JPanel registerp,loginp, homepanel;
	public JLabel usname, uname;
	boolean b;
	boolean fnb;
	boolean lnb;
	boolean mnb;
	boolean eib;
	boolean pwb;
	boolean cpb;
	int op = 0;
	
	ArrayList al=new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 802);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	  
	 loginp = new JPanel();
	 loginp.setVisible(false);
	 
	  registerp = new JPanel();
	  registerp.setVisible(false);
	  registerp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
	  registerp.setBounds(3, 3, 1520, 760);
	  contentPane.add(registerp);
	  registerp.setLayout(null);
	  
	  JPanel regp = new JPanel();
	  regp.setLayout(null);
	  regp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
	  regp.setBackground(new Color(255, 140, 0));
	  regp.setBounds(885, 24, 523, 546);
	  registerp.add(regp);
	  
	  JLabel lblNewLabel_2_1 = new JLabel("First Name             :-");
	  lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_1.setBounds(33, 26, 215, 24);
	  regp.add(lblNewLabel_2_1);
	  
	  JLabel lblNewLabel_2_1_1 = new JLabel("Last Name              :-");
	  lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_1_1.setBounds(33, 88, 215, 24);
	  regp.add(lblNewLabel_2_1_1);
	  
	  JLabel lblNewLabel_2_2 = new JLabel("Mobile No               :-");
	  lblNewLabel_2_2.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_2.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_2.setBounds(33, 155, 215, 24);
	  regp.add(lblNewLabel_2_2);
	  
	  JLabel lblNewLabel_2_3 = new JLabel("Email ID                  :-");
	  lblNewLabel_2_3.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_3.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_3.setBounds(33, 228, 215, 24);
	  regp.add(lblNewLabel_2_3);
	  
	  JLabel lblNewLabel_2_4 = new JLabel("Password                :-");
	  lblNewLabel_2_4.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_4.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_4.setBounds(33, 296, 215, 24);
	  regp.add(lblNewLabel_2_4);
	  
	  JLabel lblNewLabel_2_5 = new JLabel("Confirm Password  :-");
	  lblNewLabel_2_5.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_5.setFont(new Font("Arial Black", Font.PLAIN, 18));
	  lblNewLabel_2_5.setBounds(33, 360, 215, 24);
	  regp.add(lblNewLabel_2_5);
	  
	  fntext = new JTextField();
	  fntext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  fntext.setColumns(10);
	  fntext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  fntext.setBounds(258, 19, 230, 31);
	  regp.add(fntext);
	  
	  lntext = new JTextField();
	  lntext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  lntext.setColumns(10);
	  lntext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  lntext.setBounds(258, 90, 230, 31);
	  regp.add(lntext);
	  
	  mntext = new JTextField();
	  mntext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  mntext.setColumns(10);
	  mntext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  mntext.setBounds(258, 157, 230, 31);
	  regp.add(mntext);
	  
	  eitext = new JTextField();
	  eitext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  eitext.setColumns(10);
	  eitext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  eitext.setBounds(258, 221, 230, 31);
	  regp.add(eitext);
	  
	  pwtext = new JTextField();
	  pwtext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  pwtext.setColumns(10);
	  pwtext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  pwtext.setBounds(258, 298, 230, 31);
	  regp.add(pwtext);
	  
	  cptext = new JTextField();
	  cptext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	  cptext.setColumns(10);
	  cptext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	  cptext.setBounds(258, 362, 230, 31);
	  regp.add(cptext);
	  
	  JLabel fnlb = new JLabel("");
	  fnlb.setForeground(Color.RED);
	  fnlb.setBounds(258, 49, 224, 24);
	  regp.add(fnlb);
	  
	  JLabel lnlb = new JLabel("");
	  lnlb.setForeground(Color.RED);
	  lnlb.setBounds(264, 123, 224, 24);
	  regp.add(lnlb);
	  
	  JLabel mnlb = new JLabel("");
	  mnlb.setForeground(Color.RED);
	  mnlb.setBounds(264, 187, 224, 24);
	  regp.add(mnlb);
	  
	  JLabel eilb = new JLabel("");
	  eilb.setForeground(Color.RED);
	  eilb.setBounds(258, 253, 224, 24);
	  regp.add(eilb);
	  
	  JLabel pwlb = new JLabel("");
	  pwlb.setForeground(Color.RED);
	  pwlb.setBounds(264, 328, 224, 24);
	  regp.add(pwlb);
	  
	  JLabel cplb = new JLabel("");
	  cplb.setForeground(Color.RED);
	  cplb.setBounds(264, 391, 224, 24);
	  regp.add(cplb);
	  
	  JButton regbtn = new JButton("Register");
	  regbtn.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		fnlb.setVisible(false);
			lnlb.setVisible(false);
			mnlb.setVisible(false);
			eilb.setVisible(false);
			pwlb.setVisible(false);
			cplb.setVisible(false);
			 b = false;
			  fnb = false;
			  lnb = false;
			  mnb = false;
			  eib = false;
			  pwb = false;
			  cpb = false;
			if (fntext.getText().trim().isEmpty()&&lntext.getText().trim().isEmpty()&&mntext.getText().trim().isEmpty()&&eitext.getText().trim().isEmpty()&&pwtext.getText().trim().isEmpty()&&cptext.getText().trim().isEmpty())
			{
				fnlb.setText("Enter First Name !!!");
				lnlb.setText("Enter Last Name !!!");
				mnlb.setText("Enter Mobile Number !!!");
				eilb.setText("Enter Email ID !!!");
				pwlb.setText("Enter Password !!!");
				cplb.setText("Confirm Password !!!");
				fnlb.setVisible(true);
				lnlb.setVisible(true);
				mnlb.setVisible(true);
				eilb.setVisible(true);
				pwlb.setVisible(true);
				cplb.setVisible(true);
				
			}
			 if (fntext.getText().trim().isEmpty())
			{
				fnlb.setText("Enter First Name !!!");
				fnlb.setVisible(true);
				
			}
			 else {
				 boolean fn ;
					
				 fn= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(fntext.getText()).matches();
				if (fntext!=null) {
					if(fn==false){
						fnlb.setText("wrong input !!!");
						fnlb.setVisible(true);	
						fnb = false;
					}	
					else {
						al.add(fntext.getText());
						op = op+1;
						fnb = true;
					}
				}				
				
				
			 }
			if(lntext.getText().trim().isEmpty())
			{
				lnlb.setText("Enter Last Name !!!");
			 
				lnlb.setVisible(true);
			
			}else {
				boolean ln ;
				
				 ln= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(lntext.getText()).matches();
				if (lntext!=null) {
					if(ln==false){
						lnlb.setText("wrong input !!!");
						lnlb.setVisible(true);
						lnb = false;
					}	
					else {
						al.add(lntext.getText());
						lnb = true;
						op = op+1;
					}
				}
				
			}
	        if(mntext.getText().trim().isEmpty()) {
	        	mnlb.setText("Enter Mobile Number !!!");
	        	mnlb.setVisible(true);
			}else {
				boolean mn ;
				
				
				 mn= Pattern.compile("^$|[6-9][0-9]{9}").matcher(mntext.getText()).matches();
				if (mntext!=null) {
					if(mn==false){
						mnlb.setText("wrong input !!!");
						mnlb.setVisible(true);	
						mnb = false;
					}
					else {
						
						al.add(mntext.getText());
						mnb = true;
						op = op+1;
					}
				}
			}
			
			
			if(eitext.getText().trim().isEmpty())
			{
				eilb.setText("Enter Email ID !!!");
				
				eilb.setVisible(true);
			}else {
			boolean ei ;
			
			ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(eitext.getText()).matches();
			if (eitext!=null) {
				if(ei==false){
					eilb.setText("wrong input !!!");
					eilb.setVisible(true);	
					eib = false;					
				}
				else {
					al.add(eitext.getText());
					eib = true;
					b = true ;
					op = op+1;
				}
			}
			}
			if(pwtext.getText().trim().isEmpty())
			{
				pwlb.setText("Enter Password !!!");
			
				pwlb.setVisible(true);
				
			}
			else {
				if(pwtext!=null) {
					al.add(pwtext.getText());
					pwb = true ;
					op = op+1;
				}
				
			}
			
			
			int c = 0;
			
			if(cptext.getText().trim().isEmpty())
			{
				cplb.setText("Confirm Password !!!");
				
				cplb.setVisible(true);
			}else {
				if(!cptext.getText().equals(pwtext.getText()))
				{
					cplb.setText("wrong input");
					cplb.setVisible(true);
					c = 1;
					cpb = false;
					
					
				}
				else {
					al.add(cptext.getText());
					cpb = true;
					op = op+1;
					
				}
			
				
			}
			
			
			
			
	if(op  != 0) {
			
			Oracon ora = new Oracon();
			int a =ora.insertIntoDB(al);
			if(a ==1  ) {
				JOptionPane.showMessageDialog(null,"Successfully Submited.."+
			                                  "login please");
				loginp.setVisible(true);
				registerp.setVisible(false);
			String email=eitext.getText();
			
			email em=new email();
			em.emailsend(email);
			}
			else {
				JOptionPane.showMessageDialog(null,"Not Submitted");
			}
			}
			else {
				JOptionPane.showMessageDialog(null,"Not ok");
			}
	
		
			
			}
		
	  		
	  	  });
	  regbtn.setForeground(Color.WHITE);
	  regbtn.setFont(new Font("Arial", Font.BOLD, 18));
	  regbtn.setBackground(new Color(0, 0, 139));
	  regbtn.setBounds(84, 434, 143, 31);
	  regp.add(regbtn);
	  
	  JLabel lblNewLabel_2_5_1_1 = new JLabel("Login");
	  lblNewLabel_2_5_1_1.addMouseListener(new MouseAdapter() {
	  	@Override
	  	public void mouseClicked(MouseEvent e) {
	  		loginp.setVisible(true);
	  		registerp.setVisible(false);

	  	}
	  });
	  lblNewLabel_2_5_1_1.setForeground(new Color(0, 0, 205));
	  lblNewLabel_2_5_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	  lblNewLabel_2_5_1_1.setBounds(319, 492, 49, 24);
	  regp.add(lblNewLabel_2_5_1_1);
	  
	  JLabel lblNewLabel_2_5_1 = new JLabel("Already have an account /");
	  lblNewLabel_2_5_1.setForeground(new Color(255, 255, 255));
	  lblNewLabel_2_5_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	  lblNewLabel_2_5_1.setBounds(134, 492, 182, 24);
	  regp.add(lblNewLabel_2_5_1);
	  
	  JButton btnBack = new JButton("Back");
	  btnBack.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		loginp.setVisible(false);
	 		registerp.setVisible(false);
	 		homepanel.setVisible(true);
	  	}
	  });
	  btnBack.setForeground(Color.WHITE);
	  btnBack.setFont(new Font("Arial", Font.BOLD, 18));
	  btnBack.setBackground(new Color(0, 0, 139));
	  btnBack.setBounds(292, 434, 143, 31);
	  regp.add(btnBack);
	  
	  JLabel lblNewLabel = new JLabel("New label");
	  lblNewLabel.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\regbck.jpg"));
	  lblNewLabel.setBounds(3, 3, 1520, 760);
	  registerp.add(lblNewLabel);
	 loginp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
	 loginp.setBounds(3, 3, 1520, 760);
	 contentPane.add(loginp);
	 loginp.setLayout(null);
	 
	 JPanel logp = new JPanel();
	 logp.setLayout(null);
	 logp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
	 logp.setBackground(new Color(245, 245, 245));
	 logp.setBounds(523, 143, 523, 534);
	 loginp.add(logp);
	 
	 JLabel lblNewLabel_1_1 = new JLabel("");
	 lblNewLabel_1_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\dplogin.png"));
	 lblNewLabel_1_1.setBounds(168, 24, 192, 198);
	 logp.add(lblNewLabel_1_1);
	 
	 JLabel lblNewLabel_2_6 = new JLabel("User Name     :-");
	 lblNewLabel_2_6.setFont(new Font("Arial Black", Font.PLAIN, 18));
	 lblNewLabel_2_6.setBounds(60, 257, 169, 24);
	 logp.add(lblNewLabel_2_6);
	 
	 JLabel lblNewLabel_2_4_1 = new JLabel("Password       :-");
	 lblNewLabel_2_4_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
	 lblNewLabel_2_4_1.setBounds(60, 323, 169, 24);
	 logp.add(lblNewLabel_2_4_1);
	 
	 usertext = new JTextField();
	 usertext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	 usertext.setColumns(10);
	 usertext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	 usertext.setBounds(226, 257, 230, 31);
	 logp.add(usertext);
	 
	 passwordtext = new JTextField();
	 passwordtext.setFont(new Font("Tahoma", Font.PLAIN, 16));
	 passwordtext.setColumns(10);
	 passwordtext.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
	 passwordtext.setBounds(226, 323, 230, 31);
	 logp.add(passwordtext);
	 
	 JButton btnBack_1 = new JButton("Back");
	 btnBack_1.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {
	 		loginp.setVisible(false);
	 		registerp.setVisible(true);
	 	}
	 });
	 btnBack_1.setForeground(Color.WHITE);
	 btnBack_1.setFont(new Font("Arial", Font.BOLD, 18));
	 btnBack_1.setBackground(new Color(0, 0, 139));
	 btnBack_1.setBounds(285, 415, 143, 31);
	 logp.add(btnBack_1);
	 
	 JLabel lblNewLabel_2_5_1_1_1 = new JLabel("Register");
	 lblNewLabel_2_5_1_1_1.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		loginp.setVisible(false);
	 		registerp.setVisible(true);
	 	}
	 });
	 lblNewLabel_2_5_1_1_1.setForeground(new Color(0, 0, 205));
	 lblNewLabel_2_5_1_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	 lblNewLabel_2_5_1_1_1.setBounds(311, 476, 59, 24);
	 logp.add(lblNewLabel_2_5_1_1_1);
	 
	 JLabel lblNewLabel_2_5_1_2 = new JLabel("Create new account /");
	 lblNewLabel_2_5_1_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
	 lblNewLabel_2_5_1_2.setBounds(153, 476, 152, 24);
	 logp.add(lblNewLabel_2_5_1_2);
	 
	 JLabel ulb = new JLabel("");
	 ulb.setForeground(Color.RED);
	 ulb.setBounds(226, 289, 224, 24);
	 logp.add(ulb);
	 
	 JLabel plb = new JLabel("");
	 plb.setForeground(Color.RED);
	 plb.setBounds(226, 353, 224, 24);
	 logp.add(plb);
	 
	 JLabel icidpass = new JLabel("");
	 icidpass.setForeground(Color.RED);
	 icidpass.setBounds(141, 381, 224, 24);
	 logp.add(icidpass);
	 
	 JButton btnLogin = new JButton("Login");
	 btnLogin.addActionListener(new ActionListener() {
	 	public void actionPerformed(ActionEvent e) {

			String fnam= fntext.getText();
			if(usertext.getText().trim().isEmpty()&&passwordtext.getText().trim().isEmpty()) {
				ulb.setText("Enter Username !!!");
				plb.setText("Enter Password !!!");
				ulb.setVisible(true);
				plb.setVisible(true);
				
			}
			else if(usertext.getText().trim().isEmpty()) {
				ulb.setText("Enter Username !!!");
				ulb.setVisible(true);
				plb.setVisible(false);
			}
			else if(passwordtext.getText().trim().isEmpty()) {
				plb.setText("Enter Password !!!");
				plb.setVisible(true);
				ulb.setVisible(false);
			}
			else {
				ulb.setVisible(false);
				plb.setVisible(false);
				int op = +1;
			}
		boolean b;
			Oracon db = new Oracon();
			b = db.login(usertext.getText() , passwordtext.getText());
			
			
			
			
			if(b==false) {
			icidpass.setVisible(true);
				
			}
			
				
				if(b ==true) {
				
					
					//JOptionPane.showMessageDialog(null,"Successfully login");
					
					setVisible(true);
					icidpass.setVisible(false);
					loginp.setVisible(false);
					registerp.setVisible(false);
					
					
					usname.setText(fnam);
//					Oracon or = new Oracon();
//					or.view1(usertext.getText());
//					uname.setText(or.fname);
//					uname.setVisible(true);
//					usname.setVisible(false);
//			    usname.setText(.fname);
//		        usname.setVisible(true);
//				uname.setVisible(false);
					//uname.setText(b.fname);
				}
				else {
					JOptionPane.showMessageDialog(null,"Not Submitted");
				}
				
				Oracon or = new Oracon();
				or.view1(usertext.getText());
				uname.setText(or.fname);
				uname.setVisible(true);
				usname.setVisible(false);
//				panel.setVisible(true);
		}
	 	
	 });
	 btnLogin.setForeground(Color.WHITE);
	 btnLogin.setFont(new Font("Arial", Font.BOLD, 18));
	 btnLogin.setBackground(new Color(0, 0, 139));
	 btnLogin.setBounds(92, 415, 143, 31);
	 logp.add(btnLogin);
	 
	 JLabel lblNewLabel_2 = new JLabel("");
	 lblNewLabel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
	 lblNewLabel_2.setOpaque(true);
	 lblNewLabel_2.setBackground(new Color(220, 220, 220));
	 lblNewLabel_2.setBounds(486, 76, 596, 656);
	 loginp.add(lblNewLabel_2);
	 
	 JLabel lblNewLabel_1 = new JLabel("New label");
	 lblNewLabel_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\logbck.jpg"));
	 lblNewLabel_1.setBounds(3, 3, 1520, 760);
	 loginp.add(lblNewLabel_1);
	 
	 homepanel = new JPanel();
	 homepanel.setFocusTraversalKeysEnabled(false);
	 homepanel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
	 homepanel.setBounds(3, 3, 1525, 760);
	 contentPane.add(homepanel);
	 homepanel.setLayout(null);
	 
	 JPanel infop = new JPanel();
	 infop.setBounds(664, 136, 430, 448);
	 infop.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 102)));
	 infop.setBackground(new Color(0, 153, 255));
	 homepanel.add(infop);
	 infop.setLayout(null);
	 
	 JLabel lblNewLabel_8_1 = new JLabel("");
	 lblNewLabel_8_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\viewprof.png"));
	 lblNewLabel_8_1.setBounds(133, 10, 163, 131);
	 infop.add(lblNewLabel_8_1);
	 
	 JLabel pfname = new JLabel("View Profile");
	 pfname.setHorizontalAlignment(SwingConstants.CENTER);
	 pfname.setForeground(Color.WHITE);
	 pfname.setFont(new Font("Arial", Font.BOLD, 18));
	 pfname.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 pfname.setBounds(133, 169, 252, 33);
	 infop.add(pfname);
	 
	 JLabel plname = new JLabel("View Profile");
	 plname.setHorizontalAlignment(SwingConstants.CENTER);
	 plname.setForeground(Color.WHITE);
	 plname.setFont(new Font("Arial", Font.BOLD, 18));
	 plname.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 plname.setBounds(133, 221, 252, 33);
	 infop.add(plname);
	 
	 JLabel pmobile = new JLabel("View Profile");
	 pmobile.setHorizontalAlignment(SwingConstants.CENTER);
	 pmobile.setForeground(Color.WHITE);
	 pmobile.setFont(new Font("Arial", Font.BOLD, 18));
	 pmobile.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 pmobile.setBounds(133, 273, 252, 33);
	 infop.add(pmobile);
	 
	 JLabel peid = new JLabel("View Profile");
	 peid.setHorizontalAlignment(SwingConstants.CENTER);
	 peid.setForeground(Color.WHITE);
	 peid.setFont(new Font("Arial", Font.BOLD, 18));
	 peid.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 peid.setBounds(133, 331, 252, 33);
	 infop.add(peid);
	 
	 JLabel lblFirstName = new JLabel("First Name");
	 lblFirstName.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 lblFirstName.setBounds(33, 169, 141, 25);
	 infop.add(lblFirstName);
	 
	 JLabel lblLastName = new JLabel("Last Name");
	 lblLastName.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 lblLastName.setBounds(33, 221, 141, 25);
	 infop.add(lblLastName);
	 
	 JLabel lblMobileNo = new JLabel("Mobile No.");
	 lblMobileNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 lblMobileNo.setBounds(33, 273, 141, 25);
	 infop.add(lblMobileNo);
	 
	 JLabel lblEmailId = new JLabel("Email ID");
	 lblEmailId.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 lblEmailId.setBounds(33, 331, 97, 25);
	 infop.add(lblEmailId);
	 
	 JLabel profwarn = new JLabel("You are not logged in !!!");
	 profwarn.setHorizontalAlignment(SwingConstants.CENTER);
	 profwarn.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	 profwarn.setBounds(33, 374, 352, 38);
	 infop.add(profwarn);
	 
	 JPanel infoview = new JPanel();
	 infoview.setBounds(1118, 136, 273, 221);
	 infoview.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 102)));
	 infoview.setBackground(new Color(0, 153, 255));
	 homepanel.add(infoview);
	 infoview.setLayout(null);
	 profwarn.setVisible(false);
	 infop.setVisible(false);
	 JLabel lblNewLabel_4 = new JLabel("View Profile");
	 lblNewLabel_4.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseEntered(MouseEvent e) {
	 		String viewname = uname.getText();
	 		infop.setVisible(true);
	 		if(uname.getText().isEmpty())
			{
				profwarn.setVisible(true);
			}
			else {
				profwarn.setVisible(false);
			Oracon or = new Oracon();
			or.profileview(uname.getText());
			pfname.setText(viewname);
			plname.setText(or.plname);
			pmobile.setText(or.pmobile);
			peid.setText(or.peid);
			
		}
	 	}
	 	@Override
	 	public void mouseExited(MouseEvent e) {
	 		infop.setVisible(false);
	 	}
	 });
	 lblNewLabel_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
	 lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	 lblNewLabel_4.setForeground(new Color(255, 255, 255));
	 lblNewLabel_4.setBounds(10, 9, 253, 33);
	 infoview.add(lblNewLabel_4);
	 
	 JLabel lblNewLabel_4_2 = new JLabel("View Your Bookings");
	 lblNewLabel_4_2.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		ViewBook vb = new ViewBook();
	 		vb.setVisible(true);
	 	}
	 });
	 lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
	 lblNewLabel_4_2.setForeground(Color.WHITE);
	 lblNewLabel_4_2.setFont(new Font("Arial", Font.BOLD, 18));
	 lblNewLabel_4_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 lblNewLabel_4_2.setBounds(10, 52, 253, 33);
	 infoview.add(lblNewLabel_4_2);
	 
	 JLabel lblNewLabel_4_3_1 = new JLabel("Exit");
	 lblNewLabel_4_3_1.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 	  infoview.setVisible(false);

	 	}
	 });
	 lblNewLabel_4_3_1.setHorizontalAlignment(SwingConstants.CENTER);
	 lblNewLabel_4_3_1.setForeground(Color.WHITE);
	 lblNewLabel_4_3_1.setFont(new Font("Arial", Font.BOLD, 18));
	 lblNewLabel_4_3_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 lblNewLabel_4_3_1.setBounds(10, 178, 253, 33);
	 infoview.add(lblNewLabel_4_3_1);
	 
	 JLabel lblNewLabel_4_3_1_1 = new JLabel("Log out");
	 lblNewLabel_4_3_1_1.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		usname.setVisible(true);
	 		uname.setVisible(false);
	 		uname.setText("");
	 	}
	 });
	 lblNewLabel_4_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	 lblNewLabel_4_3_1_1.setForeground(Color.WHITE);
	 lblNewLabel_4_3_1_1.setFont(new Font("Arial", Font.BOLD, 18));
	 lblNewLabel_4_3_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 lblNewLabel_4_3_1_1.setBounds(10, 135, 253, 33);
	 infoview.add(lblNewLabel_4_3_1_1);
	 
	 JLabel lblNewLabel_4_3_1_1_1 = new JLabel("Log in");
	 lblNewLabel_4_3_1_1_1.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		loginp.setVisible(true);
	 		registerp.setVisible(false);
	 	}
	 });
	 lblNewLabel_4_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	 lblNewLabel_4_3_1_1_1.setForeground(Color.WHITE);
	 lblNewLabel_4_3_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
	 lblNewLabel_4_3_1_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 102)));
	 lblNewLabel_4_3_1_1_1.setBounds(10, 95, 253, 33);
	 infoview.add(lblNewLabel_4_3_1_1_1);
	 infoview.setVisible(false);
	 JLabel info = new JLabel("");
	 info.setBounds(1401, 63, 59, 58);
	 info.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		infoview.setVisible(true);
	 	}
	 });
	 info.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\ibtn.png"));
	 homepanel.add(info);
	 
	 JLabel no2 = new JLabel("");
	 no2.setBounds(807, 437, 59, 58);
	 no2.setVisible(false);
	 no2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\no2.png"));
	 homepanel.add(no2);
	 
	 JLabel no1 = new JLabel("");
	 no1.setBounds(807, 437, 59, 58);
	 no1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\no11.png"));
	 homepanel.add(no1);
	 
	 JLabel logohHeading = new JLabel("");
	 logohHeading.setBounds(93, 45, 834, 194);
	 logohHeading.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\Free Car Logo2.png"));
	 homepanel.add(logohHeading);
	 
	 JLabel clean = new JLabel("");
	 clean.setBounds(480, 522, 132, 106);
	 clean.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		dental dn = new dental();
	 		dn.setVisible(true);
	 	}
	 });
	 clean.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\detail1.png"));
	 clean.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(clean);
	 
	 JLabel acre = new JLabel("");
	 acre.setBounds(298, 287, 132, 106);
	 acre.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		manual mn = new manual();
	 		mn.setVisible(true);
	 	}
	 });
	 acre.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\AC1.png"));
	 acre.setHorizontalTextPosition(SwingConstants.LEADING);
	 acre.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 acre.setAlignmentY(0.0f);
	 homepanel.add(acre);
	 
	 JLabel batt = new JLabel("");
	 batt.setBounds(470, 308, 132, 85);
	 batt.addKeyListener(new KeyAdapter() {
	 	@Override
	 	public void keyPressed(KeyEvent e) {
	 		manual mn = new manual();
	 		mn.setVisible(true);
	 	}
	 });
	 batt.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\tyer battery1.png"));
	 batt.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(batt);
	 
	 JLabel tywh = new JLabel("");
	 tywh.setBounds(639, 307, 132, 86);
	 tywh.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		manual mn = new manual();
	 		mn.setVisible(true);
	 	}
	 });
	 tywh.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\tyre1.png"));
	 tywh.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(tywh);
	 
	 JLabel cleanlbl = new JLabel("Cleaning & Polishing");
	 cleanlbl.setBounds(480, 638, 148, 25);
	 cleanlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(cleanlbl);
	 
	 JLabel aclbl = new JLabel("AC Repair");
	 aclbl.setBounds(330, 415, 100, 25);
	 aclbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(aclbl);
	 
	 JLabel battlbl = new JLabel("Batteries");
	 battlbl.setBounds(499, 415, 92, 25);
	 battlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(battlbl);
	 
	 JLabel tywhlbl = new JLabel("Coolant & Oil Change");
	 tywhlbl.setBounds(634, 415, 154, 25);
	 tywhlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(tywhlbl);
	 
	 JLabel schlbl = new JLabel("Periodic Services");
	 schlbl.setBounds(103, 239, 179, 38);
	 schlbl.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
	 homepanel.add(schlbl);
	 
	 JLabel mechlbl = new JLabel("Mechanical Repairs");
	 mechlbl.setBounds(93, 495, 206, 38);
	 mechlbl.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
	 homepanel.add(mechlbl);
	 
	 JSeparator separator = new JSeparator();
	 separator.setBounds(103, 468, 684, 17);
	 separator.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
	 homepanel.add(separator);
	 
	 JLabel dent = new JLabel("");
	 dent.setBounds(133, 543, 132, 91);
	 dent.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		dental dn = new dental();
	 		dn.setVisible(true);
	 		
	 		//setVisible(false);
	 	}
	 });
	 dent.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\Body Paint1.png"));
	 dent.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(dent);
	 
	 JLabel suspen = new JLabel("");
	 suspen.setBounds(298, 543, 132, 91);
	 suspen.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		dental dn = new dental();
	 		dn.setVisible(true);
	 	}
	 });
	 suspen.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\suspen1.png"));
	 suspen.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(suspen);
	 
	 JLabel manualtest = new JLabel("");
	 manualtest.setBounds(119, 308, 132, 76);
	 manualtest.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		manual mn = new manual();
	 		mn.setVisible(true);
	 	}
	 });
	 manualtest.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\periodicimage1.png"));
	 manualtest.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(manualtest);
	 
	 JLabel body = new JLabel("");
	 body.setBounds(639, 543, 132, 91);
	 body.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		dental dn = new dental();
	 		dn.setVisible(true);
	 	}
	 });
	 body.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\Clutch1.png"));
	 body.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(body);
	 
	 JLabel dentlbl = new JLabel("Denting & Painting");
	 dentlbl.setBounds(120, 638, 145, 25);
	 dentlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(dentlbl);
	 
	 JLabel suspenlbl = new JLabel("Suspension & Fitments");
	 suspenlbl.setBounds(281, 638, 163, 25);
	 suspenlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(suspenlbl);
	 
	 JLabel manuallbl = new JLabel("Manual Testing");
	 manuallbl.setBounds(133, 415, 132, 25);
	 manuallbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(manuallbl);
	 
	 JLabel bodylbl = new JLabel("Body Parts");
	 bodylbl.setBounds(664, 638, 84, 25);
	 bodylbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(bodylbl);
	 
	 JSeparator separator_1 = new JSeparator();
	 separator_1.setBounds(904, 238, 16, 448);
	 separator_1.setBorder(new MatteBorder(0, 4, 0, 0, (Color) new Color(0, 0, 0)));
	 homepanel.add(separator_1);
	 
	 JLabel lblNewLabel_4_1_2_1 = new JLabel("");
	 lblNewLabel_4_1_2_1.setBounds(1037, 287, 313, 344);
	 lblNewLabel_4_1_2_1.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		Insurancepage in =new Insurancepage();
	 		in.setVisible(true);
	 	}
	 });
	 lblNewLabel_4_1_2_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\ins3.png"));
	 lblNewLabel_4_1_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(lblNewLabel_4_1_2_1);
	 
	 JLabel lblInsuranceClaims = new JLabel("Insurance Claims");
	 lblInsuranceClaims.setBounds(1095, 627, 206, 38);
	 lblInsuranceClaims.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
	 homepanel.add(lblInsuranceClaims);
	 
	 JLabel objectslb = new JLabel("Accessorries");
	 objectslb.setBounds(119, 638, 145, 25);
	 objectslb.setVisible(false);
	 objectslb.setHorizontalAlignment(SwingConstants.CENTER);
	 
	 JLabel shoping = new JLabel("Shoping & Trading");
	 shoping.setBounds(93, 495, 206, 38);
	 shoping.setVisible(false);
	 shoping.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
	 homepanel.add(shoping);
	 
	 JLabel objects = new JLabel("");
	 objects.setBounds(133, 543, 132, 91);
	 objects.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		ShopMe sm = new ShopMe();
			sm.setVisible(true);

	 	}
	 });
	 objects.setVisible(false);
	 objects.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\objects.png"));
	 objects.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(objects);
	 objectslb.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(objectslb);
	 
	 JLabel carshoplb = new JLabel("Cars");
	 carshoplb.setBounds(281, 638, 163, 25);
	 carshoplb.setVisible(false);
	 carshoplb.setHorizontalAlignment(SwingConstants.CENTER);
	 carshoplb.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	 homepanel.add(carshoplb);
	 
	 JLabel carshop = new JLabel("");
	 carshop.setBounds(298, 543, 132, 91);
	 carshop.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		ShopMe sm = new ShopMe();
			sm.setVisible(true);
	 	}
	 });
	 carshop.setVisible(false);
	 carshop.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop.png"));
	 carshop.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
	 homepanel.add(carshop);
	 
	 
	 JLabel uparr = new JLabel("");
	 uparr.setBounds(807, 368, 59, 58);
	 uparr.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		no1.setVisible(true);
	 		no2.setVisible(false);

	 		schlbl.setVisible(true);
	 		manualtest.setVisible(true);
	 		manuallbl.setVisible(true);
	 		acre.setVisible(true);
	 		aclbl.setVisible(true);
	 		batt.setVisible(true);
	 		battlbl.setVisible(true);
	 		tywh.setVisible(true);
	 		tywhlbl.setVisible(true);
	 		
	 		shoping.setVisible(false);
	 		objects.setVisible(false);
	 		objectslb.setVisible(false);
	 		carshop.setVisible(false);
	 		carshoplb.setVisible(false);
	 		schlbl.setBounds(103, 239, 179, 38);
	 		manualtest.setBounds(119, 308, 132, 76);
	 		manuallbl.setBounds(133, 415, 132, 25);
	 		acre.setBounds(298, 287, 132, 106);
	 		aclbl.setBounds(330, 415, 100, 25);
	 		batt.setBounds(470, 308, 132, 85);
	 		battlbl.setBounds(499, 415, 92, 25);
	 		tywh.setBounds(639, 307, 132, 86);
	 		tywhlbl.setBounds(634, 415, 154, 25);
	 		
	 		mechlbl.setBounds(93, 495, 206, 38);
	 		dent.setBounds(133, 543, 132, 91);
	 		dentlbl.setBounds(120, 638, 145, 25);
	 		suspen.setBounds(298, 543, 132, 91);
	 		suspenlbl.setBounds(281, 638, 163, 25);
	 		clean.setBounds(480, 522, 132, 106);
	 		cleanlbl.setBounds(480, 638, 148, 25);
	 		body.setBounds(639, 543, 132, 91);
	 		bodylbl.setBounds(664, 638, 84, 25);

	 	}
	 });
	 uparr.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\upscroll.png"));
	 homepanel.add(uparr);
	 
	 JLabel down = new JLabel("");
	 down.setBounds(807, 505, 59, 58);
	 down.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		no1.setVisible(false);
	 		no2.setVisible(true);
	 		schlbl.setVisible(false);
	 		manualtest.setVisible(false);
	 		manuallbl.setVisible(false);
	 		acre.setVisible(false);
	 		aclbl.setVisible(false);
	 		batt.setVisible(false);
	 		battlbl.setVisible(false);
	 		tywh.setVisible(false);
	 		tywhlbl.setVisible(false);
	 		
	 		mechlbl.setBounds(103, 239, 179, 38);
	 		dent.setBounds(119, 318, 132, 76);
	 		dentlbl.setBounds(115, 415, 140, 25);
	 		suspen.setBounds(298, 297, 132, 106);
	 		suspenlbl.setBounds(285, 415, 163, 25);
	 		clean.setBounds(470, 308, 132, 85);
	 		cleanlbl.setBounds(484, 415, 148, 25);
	 		body.setBounds(639, 317, 132, 86);
	 		bodylbl.setBounds(649, 415, 154, 25);
	 		
	 		shoping.setVisible(true);
	 		objects.setVisible(true);
	 		objectslb.setVisible(true);
	 		carshop.setVisible(true);
	 		carshoplb.setVisible(true);
	 	}
	 });
	 down.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\downscrolls.png"));
	 homepanel.add(down);
	 
	 JLabel lblNewLabel_8 = new JLabel("");
	 lblNewLabel_8.setBounds(1140, 73, 45, 37);
	 lblNewLabel_8.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\profile.png"));
	 homepanel.add(lblNewLabel_8);
	 
	 uname = new JLabel("");
	 uname.setBounds(1195, 73, 179, 28);
	 uname.setFont(new Font("Arial", Font.BOLD, 16));
	 uname.setVisible(false);
	 homepanel.add(uname);
	 
	 usname = new JLabel("Register/Login");
	 usname.setBounds(1195, 73, 179, 28);
	 usname.addMouseListener(new MouseAdapter() {
	 	@Override
	 	public void mouseClicked(MouseEvent e) {
	 		registerp.setVisible(true);
	 	}
	 });
	 usname.setFont(new Font("Arial", Font.BOLD, 18));
	 homepanel.add(usname);
	 
	 JLabel lblNewLabel_3 = new JLabel("");
	 lblNewLabel_3.setBounds(1118, 63, 273, 58);
	 lblNewLabel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	 homepanel.add(lblNewLabel_3);
	 
	 JLabel homeback = new JLabel("");
	 homeback.setBounds(3, 3, 1520, 760);
	 homeback.setOpaque(true);
	 homeback.setBackground(new Color(135, 206, 235));
	 homeback.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
	 homepanel.add(homeback);
		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setOpaque(true);
//		lblNewLabel.setBackground(new Color(224, 255, 255));
//		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
//		lblNewLabel.setBounds(0, 0, 1536, 763);
//		contentPane.add(lblNewLabel);
	}
}
