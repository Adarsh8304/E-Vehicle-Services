package com.vehical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import com.toedter.components.JSpinField;
import com.datasource.Oracon;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Insurancepage extends JFrame {

	private JPanel contentPane;
	private JTextField claimtxt;
	private JTextField policytxt;
	private JTextField insurnametxt;
	private JTextField pintxt;
	private JTextField mobtxt;
	private JTextField mailtxt;
	private JTextField registxt;
	private JTextField chassistxt;
	private JTextField modeltxt;
	private JTextField drinametxt;
	private JTextField listxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insurancepage frame = new Insurancepage();
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
	public Insurancepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 800);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		dateChooser.setBounds(1017, 237, 421, 26);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Insured Address  :");
		lblNewLabel_2_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(57, 294, 140, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Insured Name     :");
		lblNewLabel_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(57, 241, 139, 20);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Policy No           :");
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(57, 186, 140, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Claim No            :");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(57, 131, 139, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("UNITED INDIA INSURANCE COMPANY LIMITED");
		lblNewLabel_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(449, 10, 756, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Pin Code:");
		lblNewLabel_2_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_1.setBounds(57, 397, 79, 20);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		claimtxt = new JTextField();
		claimtxt.setAlignmentX(Component.LEFT_ALIGNMENT);
		claimtxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		claimtxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		claimtxt.setBounds(193, 127, 565, 29);
		contentPane.add(claimtxt);
		claimtxt.setColumns(10);
	
		
		policytxt = new JTextField();
		policytxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		policytxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		policytxt.setColumns(10);
		policytxt.setBounds(193, 182, 565, 29);
		contentPane.add(policytxt);
		
		insurnametxt = new JTextField();
		insurnametxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		insurnametxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		insurnametxt.setColumns(10);
		insurnametxt.setBounds(193, 237, 565, 29);
		contentPane.add(insurnametxt);
		
		JTextArea insuraddtxt = new JTextArea();
		insuraddtxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		insuraddtxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		insuraddtxt.setBounds(193, 293, 565, 72);
		contentPane.add(insuraddtxt);
		
		pintxt = new JTextField();
		pintxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pintxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		pintxt.setBounds(141, 393, 96, 29);
		contentPane.add(pintxt);
		pintxt.setColumns(10);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Mobile No:");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_1_1.setBounds(277, 397, 79, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		mobtxt = new JTextField();
		mobtxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		mobtxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		mobtxt.setColumns(10);
		mobtxt.setBounds(366, 393, 96, 29);
		contentPane.add(mobtxt);
		
		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("E-Mail:");
		lblNewLabel_2_2_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_1_1_1.setBounds(507, 392, 59, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1_1);
		
		mailtxt = new JTextField();
		mailtxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		mailtxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		mailtxt.setColumns(10);
		mailtxt.setBounds(576, 388, 182, 29);
		contentPane.add(mailtxt);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Vehicle Details    :-");
		lblNewLabel_2_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2_2_1_2.setBounds(43, 449, 154, 20);
		contentPane.add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_2_2_1_3 = new JLabel("Registration No:");
		lblNewLabel_2_2_1_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_3.setBounds(75, 492, 122, 20);
		contentPane.add(lblNewLabel_2_2_1_3);
		
		JLabel lblNewLabel_2_2_1_4 = new JLabel("Chassis No:");
		lblNewLabel_2_2_1_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_4.setBounds(75, 552, 90, 20);
		contentPane.add(lblNewLabel_2_2_1_4);
		
		JLabel lblNewLabel_2_2_1_5 = new JLabel("Model:");
		lblNewLabel_2_2_1_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_5.setBounds(507, 492, 59, 20);
		contentPane.add(lblNewLabel_2_2_1_5);
		
		registxt = new JTextField();
		registxt.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		registxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		registxt.setColumns(10);
		registxt.setBounds(206, 488, 261, 29);
		contentPane.add(registxt);
		
		chassistxt = new JTextField();
		chassistxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		chassistxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		chassistxt.setColumns(10);
		chassistxt.setBounds(193, 548, 565, 29);
		contentPane.add(chassistxt);
		
		modeltxt = new JTextField();
		modeltxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		modeltxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		modeltxt.setColumns(10);
		modeltxt.setBounds(576, 488, 182, 29);
		contentPane.add(modeltxt);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("Driver Details    :-");
		lblNewLabel_2_2_1_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2_2_1_2_1.setBounds(812, 90, 152, 20);
		contentPane.add(lblNewLabel_2_2_1_2_1);
		
		JLabel lblNewLabel_2_2_1_2_2 = new JLabel("Driver Name:");
		lblNewLabel_2_2_1_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_2.setBounds(825, 131, 100, 20);
		contentPane.add(lblNewLabel_2_2_1_2_2);
		
		JLabel lblNewLabel_2_2_1_2_3 = new JLabel("Driver Address:");
		lblNewLabel_2_2_1_2_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_3.setBounds(825, 294, 116, 20);
		contentPane.add(lblNewLabel_2_2_1_2_3);
		
		JLabel lblNewLabel_2_2_1_2_4 = new JLabel("Driver Licence No:");
		lblNewLabel_2_2_1_2_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_4.setBounds(827, 186, 140, 20);
		contentPane.add(lblNewLabel_2_2_1_2_4);
		
		drinametxt = new JTextField();
		drinametxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		drinametxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		drinametxt.setColumns(10);
		drinametxt.setBounds(935, 127, 503, 29);
		contentPane.add(drinametxt);
		
		listxt = new JTextField();
		listxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		listxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		listxt.setColumns(10);
		listxt.setBounds(977, 182, 461, 29);
		contentPane.add(listxt);
		
		JTextArea driaddtxt = new JTextArea();
		driaddtxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		driaddtxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		driaddtxt.setBounds(1005, 293, 433, 72);
		contentPane.add(driaddtxt);
		
		JLabel lblNewLabel_2_2_1_2_4_1 = new JLabel("Was driver under influence of drugs / intoxicants:");
		lblNewLabel_2_2_1_2_4_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_4_1.setBounds(825, 392, 362, 20);
		contentPane.add(lblNewLabel_2_2_1_2_4_1);
		
		JLabel lblNewLabel_2_2_1_2_4_1_1 = new JLabel("Was driver injured:");
		lblNewLabel_2_2_1_2_4_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_4_1_1.setBounds(827, 430, 362, 20);
		contentPane.add(lblNewLabel_2_2_1_2_4_1_1);
		 
		ButtonGroup b1= new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Yes");
		rdbtnNewRadioButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnNewRadioButton.setBounds(1207, 393, 49, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnNo.setBounds(1274, 393, 49, 21);
		contentPane.add(rdbtnNo);
		
		b1.add(rdbtnNo);
		b1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Yes");
		rdbtnNewRadioButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setBounds(1207, 430, 49, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		rdbtnNo_1.setBounds(1274, 430, 49, 21);
		contentPane.add(rdbtnNo_1);
		
		ButtonGroup b2 = new ButtonGroup();
		b2.add(rdbtnNo_1);
		b2.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_2_2_1_2_1_1 = new JLabel("Provide brief description ");
		lblNewLabel_2_2_1_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_1_1.setBounds(823, 492, 185, 20);
		contentPane.add(lblNewLabel_2_2_1_2_1_1);
		
		JTextArea brieftxt = new JTextArea();
		brieftxt.setBorder(new LineBorder(new Color(25, 25, 112), 2, true));
		brieftxt.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		brieftxt.setBounds(1018, 491, 420, 86);
		contentPane.add(brieftxt);
		
		JButton submit = new JButton("Submit");
		submit.setForeground(Color.WHITE);
		submit.setBackground(new Color(30, 144, 255));
		
		submit.setBorder(new LineBorder(new Color(25, 25, 112), 3, true));
		submit.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		submit.setBounds(477, 630, 163, 34);
		contentPane.add(submit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				claimtxt.setText(null);
				policytxt.setText(null);
				insurnametxt.setText(null);
				insuraddtxt.setText(null);
				pintxt.setText(null);
				mobtxt.setText(null);
				mailtxt.setText(null);
				registxt.setText(null);
				modeltxt.setText(null);
				chassistxt.setText(null);
				drinametxt.setText(null);
				listxt.setText(null);
				dateChooser.setDate(null);
				driaddtxt.setText(null);
				brieftxt.setText(null);
			
			}
		});
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(30, 144, 255));
		btnReset.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnReset.setBorder(new LineBorder(new Color(25, 25, 112), 3, true));
		btnReset.setBounds(718, 630, 163, 34);
		contentPane.add(btnReset);
		
		JButton btnCancel = new JButton("Back");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(30, 144, 255));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnCancel.setBorder(new LineBorder(new Color(25, 25, 112), 3, true));
		btnCancel.setBounds(941, 630, 163, 34);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Motor Claim Form");
		lblNewLabel_1_1.setForeground(new Color(25, 25, 112));
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(589, 47, 229, 45);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel w1 = new JLabel("*");
		w1.setForeground(Color.RED);
		w1.setBackground(Color.WHITE);
		w1.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w1.setBounds(768, 128, 20, 21);
		contentPane.add(w1);
		
		JLabel w2 = new JLabel("*");
		w2.setForeground(Color.RED);
		w2.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w2.setBackground(Color.WHITE);
		w2.setBounds(768, 183, 20, 21);
		contentPane.add(w2);
		
		JLabel w3 = new JLabel("*");
		w3.setForeground(Color.RED);
		w3.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w3.setBackground(Color.WHITE);
		w3.setBounds(768, 238, 20, 21);
		contentPane.add(w3);
		
		JLabel w4 = new JLabel("*");
		w4.setForeground(Color.RED);
		w4.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w4.setBackground(Color.WHITE);
		w4.setBounds(768, 291, 20, 21);
		contentPane.add(w4);
		
		JLabel w5 = new JLabel("*");
		w5.setForeground(Color.RED);
		w5.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w5.setBackground(Color.WHITE);
		w5.setBounds(247, 394, 20, 21);
		contentPane.add(w5);
		
		JLabel w6 = new JLabel("*");
		w6.setForeground(Color.RED);
		w6.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w6.setBackground(Color.WHITE);
		w6.setBounds(472, 394, 20, 21);
		contentPane.add(w6);
		
		JLabel w7 = new JLabel("*");
		w7.setForeground(Color.RED);
		w7.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w7.setBackground(Color.WHITE);
		w7.setBounds(768, 389, 20, 21);
		contentPane.add(w7);
		
		JLabel w8 = new JLabel("*");
		w8.setForeground(Color.RED);
		w8.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w8.setBackground(Color.WHITE);
		w8.setBounds(477, 489, 20, 21);
		contentPane.add(w8);
		
		JLabel w9 = new JLabel("*");
		w9.setForeground(Color.RED);
		w9.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w9.setBackground(Color.WHITE);
		w9.setBounds(768, 489, 20, 21);
		contentPane.add(w9);
		
		JLabel w10 = new JLabel("*");
		w10.setForeground(Color.RED);
		w10.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w10.setBackground(Color.WHITE);
		w10.setBounds(768, 549, 20, 21);
		contentPane.add(w10);
		
		JLabel w11 = new JLabel("*");
		w11.setForeground(Color.RED);
		w11.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w11.setBackground(Color.WHITE);
		w11.setBounds(1456, 128, 20, 21);
		contentPane.add(w11);
		
		JLabel w12 = new JLabel("*");
		w12.setForeground(Color.RED);
		w12.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w12.setBackground(Color.WHITE);
		w12.setBounds(1456, 183, 20, 21);
		contentPane.add(w12);
		
		JLabel w13 = new JLabel("*");
		w13.setForeground(Color.RED);
		w13.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w13.setBackground(Color.WHITE);
		w13.setBounds(1456, 291, 20, 21);
		contentPane.add(w13);
		
		JLabel w14 = new JLabel("*");
		w14.setForeground(Color.RED);
		w14.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w14.setBackground(Color.WHITE);
		w14.setBounds(1456, 489, 20, 21);
		contentPane.add(w14);
		
		JLabel lblNewLabel_2_2_1_1_1_1_1 = new JLabel("Choose Date of Accident:");
		lblNewLabel_2_2_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_1_1_1_1.setBounds(826, 236, 182, 20);
		contentPane.add(lblNewLabel_2_2_1_1_1_1_1);
		
		JLabel w15 = new JLabel("*\r\n");
		w15.setForeground(Color.RED);
		w15.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		w15.setBounds(1456, 238, 20, 20);
		contentPane.add(w15);
		
		JLabel lblNewLabel_2_2_1_2_1_2 = new JLabel("Insurance Details   :-");
		lblNewLabel_2_2_1_2_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2_2_1_2_1_2.setBounds(43, 90, 172, 20);
		contentPane.add(lblNewLabel_2_2_1_2_1_2);
		
		JLabel lblNewLabel_2_2_1_2_1_1_1 = new JLabel("of Accident    :");
		lblNewLabel_2_2_1_2_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel_2_2_1_2_1_1_1.setBounds(892, 522, 116, 20);
		contentPane.add(lblNewLabel_2_2_1_2_1_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(new MatteBorder(0, 4, 0, 0, (Color) new Color(0, 0, 0)));
		separator_1.setBounds(799, 127, 16, 448);
		contentPane.add(separator_1);
		
		JLabel lblInsuranceClaimForm_1 = new JLabel("");
		lblInsuranceClaimForm_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\United_India_.png"));
		lblInsuranceClaimForm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsuranceClaimForm_1.setForeground(new Color(0, 0, 139));
		lblInsuranceClaimForm_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsuranceClaimForm_1.setBorder(null);
		lblInsuranceClaimForm_1.setBackground(SystemColor.menu);
		lblInsuranceClaimForm_1.setBounds(262, 10, 172, 81);
		contentPane.add(lblInsuranceClaimForm_1);
		
		
		w1.setVisible(false);
		w2.setVisible(false);
		w3.setVisible(false);
		w4.setVisible(false);
		w5.setVisible(false);
		w6.setVisible(false);
		w7.setVisible(false);
		w8.setVisible(false);
		w9.setVisible(false);
		w10.setVisible(false);
		w11.setVisible(false);
		w12.setVisible(false);
		w13.setVisible(false);
		w14.setVisible(false);
		w15.setVisible(false);
		
		ArrayList al=new ArrayList();
		
		submit.addActionListener(new ActionListener() {
			int c=0;
			@SuppressWarnings({ "unused", "unchecked", "unchecked" })
			public void actionPerformed(ActionEvent e) {
				
			
					
					
					if(claimtxt.getText().trim().isEmpty() && policytxt.getText().trim().isEmpty()&& insurnametxt.getText().trim().isEmpty()&& insuraddtxt.getText().trim().isEmpty()&& pintxt.getText().trim().isEmpty()&& mobtxt.getText().trim().isEmpty()&& mailtxt.getText().trim().isEmpty()&& registxt.getText().trim().isEmpty()&& modeltxt.getText().trim().isEmpty()&& chassistxt.getText().trim().isEmpty()&& drinametxt.getText().trim().isEmpty()&& listxt.getText().trim().isEmpty()&& driaddtxt.getText().trim().isEmpty()&& brieftxt.getText().trim().isEmpty()) {//&& dateChooser.getDate()==null
						w1.setVisible(true);
						w2.setVisible(true);
						w3.setVisible(true);
						w4.setVisible(true);
						w5.setVisible(true);
						w6.setVisible(true);
						w7.setVisible(true);
						w8.setVisible(true);
						w9.setVisible(true);
						w10.setVisible(true);
						w11.setVisible(true);
						w12.setVisible(true);
						w13.setVisible(true);
						w14.setVisible(true);
//						w15.setVisible(true);

						c=1;
					}
					 if (claimtxt.getText().trim().isEmpty()) {
							w1.setVisible(true);
							c=1;
						}
					 else {
						 boolean mn;
							mn= Pattern.compile("^$|[1-9][0-9]{2}").matcher(claimtxt.getText()).matches();
							if (claimtxt!=null) {
								w1.setVisible(true);
								if(mn==false) {
									w1.setVisible(true);
									c=1;
								}	
								else {
									al.add(claimtxt.getText());
									w1.setVisible(false);
									c=0;	
								}
							}
					 }
					 if (policytxt.getText().trim().isEmpty()) {
							w2.setVisible(true);
							c=1;
						}
					 else {
						 boolean pc;
							pc= Pattern.compile("^$|[6-9][0-9]{9}").matcher(policytxt.getText()).matches();
								if (policytxt!=null) {
									w2.setVisible(true);
									if(pc==false) {
										w2.setVisible(true);
									c=1;
								}	
								else {
									al.add(policytxt.getText());
									w2.setVisible(false);
									c=0;
								}
								}
					 }
				     if (insurnametxt.getText().trim().isEmpty()) {
							w3.setVisible(true);
							c=1;
						}
				     else {
							al.add(insurnametxt.getText());	
							w3.setVisible(false);
							c=0;
							
						}
					 if (insuraddtxt.getText().trim().isEmpty()) {
							w4.setVisible(true);
							c=1;
						}
					 else {
							al.add(insuraddtxt.getText());
							w4.setVisible(false);

							c=0;
							
						}
					 if (pintxt.getText().trim().isEmpty()) {
							w5.setVisible(true);
							c=1;
						}
					 else {
						 boolean pin;
							pin= Pattern.compile("^$|[1-9][0-9]{5}").matcher(pintxt.getText()).matches();
							if (pintxt!=null) {
								w5.setVisible(true);
								if(pin==false) {
									w5.setVisible(true);
								c=1;
							}	
							else {
								al.add(pintxt.getText());
								w5.setVisible(false);
								c=0;
							}
							}
					 }
					 if (mobtxt.getText().trim().isEmpty()) {
							w6.setVisible(true);
							c=1;
						}
					 else {
					 boolean mob;
					 mob= Pattern.compile("^$|[6-9][0-9]{9}").matcher(mobtxt.getText()).matches();
					if (mobtxt!=null) {
						w6.setVisible(true);
						if(mob==false) {
							w6.setVisible(true);
						c=1;
					}	
					else {
						al.add(mobtxt.getText());
						w6.setVisible(false);
						c=0;
						
					}
					}
					 }
					 if (mailtxt.getText().trim().isEmpty()) {
							w7.setVisible(true);
							c=1;
						}
					 else {
						 boolean ei;
							ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(mailtxt.getText()).matches();
							if (mailtxt!=null) {
								w7.setVisible(true);
								if(ei==false) {
									w7.setVisible(true);
								c=1;
							}	
							else {
								al.add(mailtxt.getText());
								w7.setVisible(false);
								c=0;
								
							}
							}
					 }
					 if (registxt.getText().trim().isEmpty()) {
							w8.setVisible(true);
							c=1;
						}
					 else {
							al.add(registxt.getText());	
							w8.setVisible(false);

							c=0;
							
						}
					
					 if (modeltxt.getText().trim().isEmpty()) {
						
							w9.setVisible(true);
							c=1;
						}
					 else {
						 boolean mod;
						 mod= Pattern.compile("^$|[1-3][0-9]{3}").matcher(modeltxt.getText()).matches();
						 if(modeltxt!=null) {
								w9.setVisible(true);
						 if(mod==false) {
								w9.setVisible(true);
								c=1;
						 }
						 else {
							al.add(modeltxt.getText());
							w9.setVisible(false);

							c=0;
					 }
						 }
						}
					 if (chassistxt.getText().trim().isEmpty()) {
							w10.setVisible(true);
							c=1;
						}
					 else {
							al.add(chassistxt.getText());
							w10.setVisible(false);

							c=0;
							
						}
					 if (drinametxt.getText().trim().isEmpty()) {
							w11.setVisible(true);
							c=1;
						}
					 else {
							al.add(drinametxt.getText());
							w11.setVisible(false);

							c=0;
							
						}
					 if (listxt.getText().trim().isEmpty()) {
							w12.setVisible(true);
							c=1;
						}
					 else {
						 boolean lis;
							lis= Pattern.compile("^$|[1-9][0-9]{14}").matcher(listxt.getText()).matches();
							if (listxt!=null) {
								w12.setVisible(true);
								if(lis==false) {
									w12.setVisible(true);
								c=1;
							}	
							else {
								al.add(listxt.getText());
								w12.setVisible(false);
								c=0;
							}
							}
					 }
					 if (driaddtxt.getText().trim().isEmpty()) {
							w13.setVisible(true);
							c=1;
						}
					 else {
							al.add(driaddtxt.getText());
							w13.setVisible(false);

							c=0;
							
						}
					 if (brieftxt.getText().trim().isEmpty()) {
							w14.setVisible(true);
							c=1;
						}
					 else {
							al.add(brieftxt.getText());	
							w14.setVisible(false);

							c=0;
							
						}
//					 if(dateChooser.getDate()==null) {
//							w15.setVisible(true);
//							c=1;
//
//					 }
//					 else {
//							w15.setVisible(false);
//
//						 c=0;
//					 }
					
					
					System.out.println(c);
					System.out.println("Empty Warnings Complete");
						

					if(c==0 ) {
					Oracon ora = new Oracon();
					int a =ora.insertIntoInsure(al);
					System.out.println(a);
					if(a==0) {
						JOptionPane.showMessageDialog(null,"Not Submitted");
						c=1;
					}
					else  {
						JOptionPane.showMessageDialog(null,"Successfully Submitted");
						
					}
					}
					else  {
						System.out.println("Kuch tho gadbad hai");
						
					}
//				}
//				
//		
				
				
						}
				
			
		});
		
		
	
		
	}
}
