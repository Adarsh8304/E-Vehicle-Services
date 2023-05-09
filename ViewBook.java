package com.vehical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.MatteBorder;

import com.datasource.Oracon;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ViewBook extends JFrame {

	private JPanel contentPane;
	private JTextField eid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBook frame = new ViewBook();
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
	public ViewBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 802);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mechp = new JPanel();
		mechp.setBackground(new Color(0, 51, 153));
		mechp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 102)));
		mechp.setBounds(955, 44, 561, 672);
		contentPane.add(mechp);
		mechp.setLayout(null);
		
		JLabel lblMechanicalsRepairs = new JLabel("Mechanicals Repairs");
		lblMechanicalsRepairs.setHorizontalAlignment(SwingConstants.CENTER);
		lblMechanicalsRepairs.setForeground(Color.WHITE);
		lblMechanicalsRepairs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMechanicalsRepairs.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblMechanicalsRepairs.setBounds(265, 32, 261, 26);
		mechp.add(lblMechanicalsRepairs);
		
		JLabel lblVehicalNo_1 = new JLabel("Vehical No.");
		lblVehicalNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1.setForeground(Color.WHITE);
		lblVehicalNo_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1.setBorder(null);
		lblVehicalNo_1.setBounds(30, 125, 202, 26);
		mechp.add(lblVehicalNo_1);
		
		JLabel lblVehicalBrand_1 = new JLabel("Vehical Brand");
		lblVehicalBrand_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalBrand_1.setForeground(Color.WHITE);
		lblVehicalBrand_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalBrand_1.setBorder(null);
		lblVehicalBrand_1.setBounds(30, 188, 202, 26);
		mechp.add(lblVehicalBrand_1);
		
		JLabel lblVehicalModel_1 = new JLabel("Vehical Model");
		lblVehicalModel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalModel_1.setForeground(Color.WHITE);
		lblVehicalModel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalModel_1.setBorder(null);
		lblVehicalModel_1.setBounds(30, 254, 202, 26);
		mechp.add(lblVehicalModel_1);
		
		JLabel lblServiceType_1 = new JLabel("Service Type");
		lblServiceType_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServiceType_1.setForeground(Color.WHITE);
		lblServiceType_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblServiceType_1.setBorder(null);
		lblServiceType_1.setBounds(30, 322, 202, 26);
		mechp.add(lblServiceType_1);
		
		JLabel lblServicesCities_1 = new JLabel("Services Cities");
		lblServicesCities_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicesCities_1.setForeground(Color.WHITE);
		lblServicesCities_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblServicesCities_1.setBorder(null);
		lblServicesCities_1.setBounds(30, 395, 202, 26);
		mechp.add(lblServicesCities_1);
		
		JLabel lblSelectedNearestCenter_1 = new JLabel("Selected Nearest Center");
		lblSelectedNearestCenter_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNearestCenter_1.setForeground(Color.WHITE);
		lblSelectedNearestCenter_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSelectedNearestCenter_1.setBorder(null);
		lblSelectedNearestCenter_1.setBounds(30, 465, 202, 26);
		mechp.add(lblSelectedNearestCenter_1);
		
		JLabel dvno = new JLabel("Periodic Services");
		dvno.setHorizontalAlignment(SwingConstants.CENTER);
		dvno.setForeground(Color.WHITE);
		dvno.setFont(new Font("Tahoma", Font.BOLD, 16));
		dvno.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dvno.setBounds(248, 125, 261, 26);
		mechp.add(dvno);
		
		JLabel dvbrand = new JLabel("Periodic Services");
		dvbrand.setHorizontalAlignment(SwingConstants.CENTER);
		dvbrand.setForeground(Color.WHITE);
		dvbrand.setFont(new Font("Tahoma", Font.BOLD, 16));
		dvbrand.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dvbrand.setBounds(248, 188, 261, 26);
		mechp.add(dvbrand);
		
		JLabel dvmodel = new JLabel("Periodic Services");
		dvmodel.setHorizontalAlignment(SwingConstants.CENTER);
		dvmodel.setForeground(Color.WHITE);
		dvmodel.setFont(new Font("Tahoma", Font.BOLD, 16));
		dvmodel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dvmodel.setBounds(248, 254, 261, 26);
		mechp.add(dvmodel);
		
		JLabel dstype = new JLabel("Periodic Services");
		dstype.setHorizontalAlignment(SwingConstants.CENTER);
		dstype.setForeground(Color.WHITE);
		dstype.setFont(new Font("Tahoma", Font.BOLD, 16));
		dstype.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dstype.setBounds(248, 322, 261, 26);
		mechp.add(dstype);
		
		JLabel dscity = new JLabel("Periodic Services");
		dscity.setHorizontalAlignment(SwingConstants.CENTER);
		dscity.setForeground(Color.WHITE);
		dscity.setFont(new Font("Tahoma", Font.BOLD, 16));
		dscity.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dscity.setBounds(248, 395, 261, 26);
		mechp.add(dscity);
		
		JLabel dscenter = new JLabel("Periodic Services");
		dscenter.setHorizontalAlignment(SwingConstants.CENTER);
		dscenter.setForeground(Color.WHITE);
		dscenter.setFont(new Font("Tahoma", Font.BOLD, 16));
		dscenter.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		dscenter.setBounds(248, 465, 261, 26);
		mechp.add(dscenter);
		
		JLabel lblPeriodicServices_1_1 = new JLabel("Periodic Services");
		lblPeriodicServices_1_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\periologo.png"));
		lblPeriodicServices_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeriodicServices_1_1.setForeground(Color.WHITE);
		lblPeriodicServices_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPeriodicServices_1_1.setBorder(null);
		lblPeriodicServices_1_1.setBounds(61, 11, 171, 104);
		mechp.add(lblPeriodicServices_1_1);
		mechp.setVisible(false);
		
		JPanel insurp = new JPanel();
		insurp.setBackground(new Color(255, 248, 220));
		insurp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		insurp.setBounds(399, 10, 985, 720);
		contentPane.add(insurp);
		insurp.setLayout(null);
		
		JLabel lblInsuranceClaimForm = new JLabel("United India Insurance Claim Form");
		lblInsuranceClaimForm.setBounds(483, 35, 265, 26);
		lblInsuranceClaimForm.setBackground(new Color(240, 240, 240));
		lblInsuranceClaimForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsuranceClaimForm.setForeground(new Color(0, 0, 139));
		lblInsuranceClaimForm.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsuranceClaimForm.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		insurp.add(lblInsuranceClaimForm);
		
		JLabel iclaim = new JLabel("Insurance Claim Form");
		iclaim.setBounds(194, 101, 265, 26);
		iclaim.setHorizontalAlignment(SwingConstants.CENTER);
		iclaim.setForeground(new Color(0, 0, 139));
		iclaim.setFont(new Font("Tahoma", Font.BOLD, 16));
		iclaim.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		iclaim.setBackground(SystemColor.menu);
		insurp.add(iclaim);
		
		JLabel ipolicy = new JLabel("Insurance Claim Form");
		ipolicy.setBounds(194, 165, 265, 26);
		ipolicy.setHorizontalAlignment(SwingConstants.CENTER);
		ipolicy.setForeground(new Color(0, 0, 139));
		ipolicy.setFont(new Font("Tahoma", Font.BOLD, 16));
		ipolicy.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ipolicy.setBackground(SystemColor.menu);
		insurp.add(ipolicy);
		
		JLabel iiname = new JLabel("Insurance Claim Form");
		iiname.setBounds(194, 231, 265, 26);
		iiname.setHorizontalAlignment(SwingConstants.CENTER);
		iiname.setForeground(new Color(0, 0, 139));
		iiname.setFont(new Font("Tahoma", Font.BOLD, 16));
		iiname.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		iiname.setBackground(SystemColor.menu);
		insurp.add(iiname);
		
		JLabel iiadd = new JLabel("Insurance Claim Form");
		iiadd.setBounds(194, 301, 265, 44);
		iiadd.setHorizontalAlignment(SwingConstants.CENTER);
		iiadd.setForeground(new Color(0, 0, 139));
		iiadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		iiadd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		iiadd.setBackground(SystemColor.menu);
		insurp.add(iiadd);
		
		JLabel ipin = new JLabel("Insurance Claim Form");
		ipin.setBounds(194, 377, 265, 26);
		ipin.setHorizontalAlignment(SwingConstants.CENTER);
		ipin.setForeground(new Color(0, 0, 139));
		ipin.setFont(new Font("Tahoma", Font.BOLD, 16));
		ipin.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ipin.setBackground(SystemColor.menu);
		insurp.add(ipin);
		
		JLabel imob = new JLabel("Insurance Claim Form");
		imob.setBounds(194, 453, 265, 26);
		imob.setHorizontalAlignment(SwingConstants.CENTER);
		imob.setForeground(new Color(0, 0, 139));
		imob.setFont(new Font("Tahoma", Font.BOLD, 16));
		imob.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		imob.setBackground(SystemColor.menu);
		insurp.add(imob);
		
		JLabel iregis = new JLabel("Insurance Claim Form");
		iregis.setBounds(194, 527, 265, 26);
		iregis.setHorizontalAlignment(SwingConstants.CENTER);
		iregis.setForeground(new Color(0, 0, 139));
		iregis.setFont(new Font("Tahoma", Font.BOLD, 16));
		iregis.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		iregis.setBackground(SystemColor.menu);
		insurp.add(iregis);
		
		JLabel imodel = new JLabel("Insurance Claim Form");
		imodel.setBounds(688, 101, 265, 26);
		imodel.setHorizontalAlignment(SwingConstants.CENTER);
		imodel.setForeground(new Color(0, 0, 139));
		imodel.setFont(new Font("Tahoma", Font.BOLD, 16));
		imodel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		imodel.setBackground(SystemColor.menu);
		insurp.add(imodel);
		
		JLabel ichassis = new JLabel("Insurance Claim Form");
		ichassis.setBounds(688, 165, 265, 26);
		ichassis.setHorizontalAlignment(SwingConstants.CENTER);
		ichassis.setForeground(new Color(0, 0, 139));
		ichassis.setFont(new Font("Tahoma", Font.BOLD, 16));
		ichassis.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ichassis.setBackground(SystemColor.menu);
		insurp.add(ichassis);
		
		JLabel idriver = new JLabel("Insurance Claim Form");
		idriver.setBounds(688, 231, 265, 26);
		idriver.setHorizontalAlignment(SwingConstants.CENTER);
		idriver.setForeground(new Color(0, 0, 139));
		idriver.setFont(new Font("Tahoma", Font.BOLD, 16));
		idriver.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		idriver.setBackground(SystemColor.menu);
		insurp.add(idriver);
		
		JLabel ilicence = new JLabel("Insurance Claim Form");
		ilicence.setBounds(688, 301, 265, 26);
		ilicence.setHorizontalAlignment(SwingConstants.CENTER);
		ilicence.setForeground(new Color(0, 0, 139));
		ilicence.setFont(new Font("Tahoma", Font.BOLD, 16));
		ilicence.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ilicence.setBackground(SystemColor.menu);
		insurp.add(ilicence);
		
		JLabel idadd = new JLabel("Insurance Claim Form");
		idadd.setBounds(688, 377, 265, 44);
		idadd.setHorizontalAlignment(SwingConstants.CENTER);
		idadd.setForeground(new Color(0, 0, 139));
		idadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		idadd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		idadd.setBackground(SystemColor.menu);
		insurp.add(idadd);
		
		JLabel ibrief = new JLabel("Insurance Claim Form");
		ibrief.setBounds(688, 453, 265, 50);
		ibrief.setHorizontalAlignment(SwingConstants.CENTER);
		ibrief.setForeground(new Color(0, 0, 139));
		ibrief.setFont(new Font("Tahoma", Font.BOLD, 16));
		ibrief.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ibrief.setBackground(SystemColor.menu);
		insurp.add(ibrief);
		
		JLabel lblClaimNo = new JLabel("Claim No.");
		lblClaimNo.setBounds(10, 101, 182, 26);
		lblClaimNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblClaimNo.setForeground(new Color(0, 0, 139));
		lblClaimNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClaimNo.setBorder(null);
		lblClaimNo.setBackground(SystemColor.menu);
		insurp.add(lblClaimNo);
		
		JLabel lblPolicyNo = new JLabel("Policy No.");
		lblPolicyNo.setBounds(10, 165, 182, 26);
		lblPolicyNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolicyNo.setForeground(new Color(0, 0, 139));
		lblPolicyNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPolicyNo.setBorder(null);
		lblPolicyNo.setBackground(SystemColor.menu);
		insurp.add(lblPolicyNo);
		
		JLabel lblInsureName = new JLabel("Insured Name");
		lblInsureName.setBounds(10, 231, 182, 26);
		lblInsureName.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsureName.setForeground(new Color(0, 0, 139));
		lblInsureName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsureName.setBorder(null);
		lblInsureName.setBackground(SystemColor.menu);
		insurp.add(lblInsureName);
		
		JLabel lblInsuredAddress = new JLabel("Insured Address");
		lblInsuredAddress.setBounds(10, 301, 182, 26);
		lblInsuredAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsuredAddress.setForeground(new Color(0, 0, 139));
		lblInsuredAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsuredAddress.setBorder(null);
		lblInsuredAddress.setBackground(SystemColor.menu);
		insurp.add(lblInsuredAddress);
		
		JLabel lblPinCode = new JLabel("Pin Code");
		lblPinCode.setBounds(10, 377, 182, 26);
		lblPinCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPinCode.setForeground(new Color(0, 0, 139));
		lblPinCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPinCode.setBorder(null);
		lblPinCode.setBackground(SystemColor.menu);
		insurp.add(lblPinCode);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setBounds(10, 453, 182, 26);
		lblMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo.setForeground(new Color(0, 0, 139));
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMobileNo.setBorder(null);
		lblMobileNo.setBackground(SystemColor.menu);
		insurp.add(lblMobileNo);
		
		JLabel lblRegistrationNo = new JLabel("Registration No.");
		lblRegistrationNo.setBounds(10, 527, 182, 26);
		lblRegistrationNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrationNo.setForeground(new Color(0, 0, 139));
		lblRegistrationNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistrationNo.setBorder(null);
		lblRegistrationNo.setBackground(SystemColor.menu);
		insurp.add(lblRegistrationNo);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(496, 101, 182, 26);
		lblModel.setHorizontalAlignment(SwingConstants.CENTER);
		lblModel.setForeground(new Color(0, 0, 139));
		lblModel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblModel.setBorder(null);
		lblModel.setBackground(SystemColor.menu);
		insurp.add(lblModel);
		
		JLabel lblChassisNo = new JLabel("Chassis No.");
		lblChassisNo.setBounds(496, 165, 182, 26);
		lblChassisNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblChassisNo.setForeground(new Color(0, 0, 139));
		lblChassisNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChassisNo.setBorder(null);
		lblChassisNo.setBackground(SystemColor.menu);
		insurp.add(lblChassisNo);
		
		JLabel lblDriverName = new JLabel("Driver Name");
		lblDriverName.setBounds(496, 231, 182, 26);
		lblDriverName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriverName.setForeground(new Color(0, 0, 139));
		lblDriverName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDriverName.setBorder(null);
		lblDriverName.setBackground(SystemColor.menu);
		insurp.add(lblDriverName);
		
		JLabel lblDriverLicenseNo = new JLabel("Driver License No.");
		lblDriverLicenseNo.setBounds(496, 301, 182, 26);
		lblDriverLicenseNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriverLicenseNo.setForeground(new Color(0, 0, 139));
		lblDriverLicenseNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDriverLicenseNo.setBorder(null);
		lblDriverLicenseNo.setBackground(SystemColor.menu);
		insurp.add(lblDriverLicenseNo);
		
		JLabel lblDriverAddress = new JLabel("Driver Address");
		lblDriverAddress.setBounds(496, 377, 182, 26);
		lblDriverAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblDriverAddress.setForeground(new Color(0, 0, 139));
		lblDriverAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDriverAddress.setBorder(null);
		lblDriverAddress.setBackground(SystemColor.menu);
		insurp.add(lblDriverAddress);
		
		JLabel lblBriefDescription = new JLabel("Brief Description");
		lblBriefDescription.setBounds(496, 453, 182, 26);
		lblBriefDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblBriefDescription.setForeground(new Color(0, 0, 139));
		lblBriefDescription.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBriefDescription.setBorder(null);
		lblBriefDescription.setBackground(SystemColor.menu);
		insurp.add(lblBriefDescription);
		
		JLabel lblInsuranceClaimForm_1 = new JLabel("");
		lblInsuranceClaimForm_1.setBounds(270, 8, 209, 81);
		lblInsuranceClaimForm_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\United_India_.png"));
		lblInsuranceClaimForm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInsuranceClaimForm_1.setForeground(new Color(0, 0, 139));
		lblInsuranceClaimForm_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInsuranceClaimForm_1.setBorder(null);
		lblInsuranceClaimForm_1.setBackground(SystemColor.menu);
		insurp.add(lblInsuranceClaimForm_1);
		
		JPanel carp = new JPanel();
		carp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		carp.setBackground(new Color(255, 228, 196));
		carp.setBounds(357, 44, 1159, 673);
		contentPane.add(carp);
		carp.setLayout(null);
		
		JPanel carp_1 = new JPanel();
		carp_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		carp_1.setBackground(new Color(175, 238, 238));
		carp_1.setBounds(722, 120, 412, 424);
		carp.add(carp_1);
		carp_1.setLayout(null);
		
		JLabel lblCarBooking = new JLabel("Car Booking");
		lblCarBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarBooking.setForeground(new Color(0, 0, 139));
		lblCarBooking.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarBooking.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		lblCarBooking.setBounds(91, 20, 226, 26);
		carp_1.add(lblCarBooking);
		
		JLabel ccn = new JLabel("Car Booking");
		ccn.setHorizontalAlignment(SwingConstants.CENTER);
		ccn.setForeground(new Color(0, 0, 139));
		ccn.setFont(new Font("Tahoma", Font.BOLD, 16));
		ccn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		ccn.setBounds(195, 66, 196, 26);
		carp_1.add(ccn);
		
		JLabel cbn = new JLabel("Car Booking");
		cbn.setHorizontalAlignment(SwingConstants.CENTER);
		cbn.setForeground(new Color(0, 0, 139));
		cbn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cbn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		cbn.setBounds(195, 108, 196, 26);
		carp_1.add(cbn);
		
		JLabel cmn = new JLabel("Car Booking");
		cmn.setHorizontalAlignment(SwingConstants.CENTER);
		cmn.setForeground(new Color(0, 0, 139));
		cmn.setFont(new Font("Tahoma", Font.BOLD, 16));
		cmn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		cmn.setBounds(195, 159, 196, 26);
		carp_1.add(cmn);
		
		JLabel cpr = new JLabel("Car Booking");
		cpr.setHorizontalAlignment(SwingConstants.CENTER);
		cpr.setForeground(new Color(0, 0, 139));
		cpr.setFont(new Font("Tahoma", Font.BOLD, 16));
		cpr.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		cpr.setBounds(195, 209, 196, 26);
		carp_1.add(cpr);
		
		JLabel cadd = new JLabel("Car Booking");
		cadd.setHorizontalAlignment(SwingConstants.CENTER);
		cadd.setForeground(new Color(0, 0, 139));
		cadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		cadd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		cadd.setBounds(195, 256, 196, 43);
		carp_1.add(cadd);
		
		JLabel lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomerName.setForeground(new Color(0, 0, 139));
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCustomerName.setBorder(null);
		lblCustomerName.setBounds(10, 66, 175, 26);
		carp_1.add(lblCustomerName);
		
		JLabel lblCarBrandName = new JLabel("Car Brand Name");
		lblCarBrandName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarBrandName.setForeground(new Color(0, 0, 139));
		lblCarBrandName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarBrandName.setBorder(null);
		lblCarBrandName.setBounds(10, 108, 175, 26);
		carp_1.add(lblCarBrandName);
		
		JLabel lblCarModelName = new JLabel("Car Model Name");
		lblCarModelName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarModelName.setForeground(new Color(0, 0, 139));
		lblCarModelName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCarModelName.setBorder(null);
		lblCarModelName.setBounds(10, 159, 175, 26);
		carp_1.add(lblCarModelName);
		
		JLabel dbfgf = new JLabel("Car Price");
		dbfgf.setHorizontalAlignment(SwingConstants.CENTER);
		dbfgf.setForeground(new Color(0, 0, 139));
		dbfgf.setFont(new Font("Tahoma", Font.BOLD, 16));
		dbfgf.setBorder(null);
		dbfgf.setBounds(10, 209, 175, 26);
		carp_1.add(dbfgf);
		
		JLabel cdfs1 = new JLabel("Address");
		cdfs1.setHorizontalAlignment(SwingConstants.CENTER);
		cdfs1.setForeground(new Color(0, 0, 139));
		cdfs1.setFont(new Font("Tahoma", Font.BOLD, 16));
		cdfs1.setBorder(null);
		cdfs1.setBounds(10, 256, 175, 26);
		carp_1.add(cdfs1);
		
		JLabel carimg = new JLabel("");
		carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\thar.jpg"));
		carimg.setHorizontalAlignment(SwingConstants.CENTER);
		carimg.setForeground(new Color(0, 0, 139));
		carimg.setFont(new Font("Tahoma", Font.BOLD, 16));
		carimg.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 139)));
		carimg.setBounds(10, 10, 1139, 653);
		carp.add(carimg);
		
		JPanel otherp = new JPanel();
		otherp.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		otherp.setBackground(new Color(186, 85, 211));
		otherp.setBounds(955, 44, 561, 673);
		contentPane.add(otherp);
		otherp.setLayout(null);
		
		JLabel lblOtherAccessories = new JLabel("Other Accessories");
		lblOtherAccessories.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtherAccessories.setForeground(Color.WHITE);
		lblOtherAccessories.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOtherAccessories.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblOtherAccessories.setBounds(153, 22, 261, 26);
		otherp.add(lblOtherAccessories);
		
		JLabel tyre3_1 = new JLabel("");
		tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover8999.jpg"));
		tyre3_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyre3_1.setBounds(121, 69, 320, 220);
		otherp.add(tyre3_1);
		
		JLabel lblVehicalNo_1_1_1 = new JLabel("Customer Name");
		lblVehicalNo_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_1_1.setForeground(Color.WHITE);
		lblVehicalNo_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_1_1.setBorder(null);
		lblVehicalNo_1_1_1.setBounds(37, 317, 202, 26);
		otherp.add(lblVehicalNo_1_1_1);
		
		JLabel lblVehicalNo_1_4_1 = new JLabel("Price");
		lblVehicalNo_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_4_1.setForeground(Color.WHITE);
		lblVehicalNo_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_4_1.setBorder(null);
		lblVehicalNo_1_4_1.setBounds(37, 452, 202, 26);
		otherp.add(lblVehicalNo_1_4_1);
		
		JLabel lblVehicalNo_1_5_1 = new JLabel("Address");
		lblVehicalNo_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_5_1.setForeground(Color.WHITE);
		lblVehicalNo_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_5_1.setBorder(null);
		lblVehicalNo_1_5_1.setBounds(37, 506, 202, 26);
		otherp.add(lblVehicalNo_1_5_1);
		
		JLabel lblVehicalNo_1_2_1 = new JLabel("Product Name");
		lblVehicalNo_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_2_1.setForeground(Color.WHITE);
		lblVehicalNo_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_2_1.setBorder(null);
		lblVehicalNo_1_2_1.setBounds(37, 364, 202, 26);
		otherp.add(lblVehicalNo_1_2_1);
		
		JLabel lblVehicalNo_1_2_1_1 = new JLabel("Product  Type");
		lblVehicalNo_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_2_1_1.setForeground(Color.WHITE);
		lblVehicalNo_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_2_1_1.setBorder(null);
		lblVehicalNo_1_2_1_1.setBounds(37, 405, 202, 26);
		otherp.add(lblVehicalNo_1_2_1_1);
		
		JLabel ocn = new JLabel("Other Accessories");
		ocn.setHorizontalAlignment(SwingConstants.CENTER);
		ocn.setForeground(Color.WHITE);
		ocn.setFont(new Font("Tahoma", Font.BOLD, 16));
		ocn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		ocn.setBounds(249, 317, 261, 26);
		otherp.add(ocn);
		
		JLabel opn = new JLabel("Other Accessories");
		opn.setHorizontalAlignment(SwingConstants.CENTER);
		opn.setForeground(Color.WHITE);
		opn.setFont(new Font("Tahoma", Font.BOLD, 16));
		opn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		opn.setBounds(249, 364, 261, 26);
		otherp.add(opn);
		
		JLabel opt = new JLabel("Other Accessories");
		opt.setHorizontalAlignment(SwingConstants.CENTER);
		opt.setForeground(Color.WHITE);
		opt.setFont(new Font("Tahoma", Font.BOLD, 16));
		opt.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		opt.setBounds(249, 405, 261, 26);
		otherp.add(opt);
		
		JLabel opr = new JLabel("Other Accessories");
		opr.setHorizontalAlignment(SwingConstants.CENTER);
		opr.setForeground(Color.WHITE);
		opr.setFont(new Font("Tahoma", Font.BOLD, 16));
		opr.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		opr.setBounds(249, 452, 261, 26);
		otherp.add(opr);
		
		JLabel oadd = new JLabel("Other Accessories");
		oadd.setHorizontalAlignment(SwingConstants.CENTER);
		oadd.setForeground(Color.WHITE);
		oadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		oadd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		oadd.setBounds(249, 506, 261, 37);
		otherp.add(oadd);
		
		JPanel tyrep = new JPanel();
		tyrep.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyrep.setBackground(new Color(186, 85, 211));
		tyrep.setBounds(357, 44, 561, 672);
		contentPane.add(tyrep);
		tyrep.setLayout(null);
		
		JLabel lblPrimaryAccessories = new JLabel("Primary Accessories");
		lblPrimaryAccessories.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrimaryAccessories.setForeground(Color.WHITE);
		lblPrimaryAccessories.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrimaryAccessories.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblPrimaryAccessories.setBounds(137, 27, 261, 26);
		tyrep.add(lblPrimaryAccessories);
		
		JLabel tyre3 = new JLabel("");
		tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mrf2290.jpg"));
		tyre3.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 139)));
		tyre3.setBounds(111, 74, 320, 220);
		tyrep.add(tyre3);
		
		JLabel lblVehicalNo_1_1 = new JLabel("Customer Name");
		lblVehicalNo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_1.setForeground(Color.WHITE);
		lblVehicalNo_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_1.setBorder(null);
		lblVehicalNo_1_1.setBounds(28, 314, 202, 26);
		tyrep.add(lblVehicalNo_1_1);
		
		JLabel lblVehicalNo_1_2 = new JLabel("Tyer Brand Name");
		lblVehicalNo_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_2.setForeground(Color.WHITE);
		lblVehicalNo_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_2.setBorder(null);
		lblVehicalNo_1_2.setBounds(28, 356, 202, 26);
		tyrep.add(lblVehicalNo_1_2);
		
		JLabel lblVehicalNo_1_3 = new JLabel("Vehical Name");
		lblVehicalNo_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_3.setForeground(Color.WHITE);
		lblVehicalNo_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_3.setBorder(null);
		lblVehicalNo_1_3.setBounds(28, 405, 202, 26);
		tyrep.add(lblVehicalNo_1_3);
		
		JLabel lblVehicalNo_1_4 = new JLabel("Price");
		lblVehicalNo_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_4.setForeground(Color.WHITE);
		lblVehicalNo_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_4.setBorder(null);
		lblVehicalNo_1_4.setBounds(28, 452, 202, 26);
		tyrep.add(lblVehicalNo_1_4);
		
		JLabel lblVehicalNo_1_5 = new JLabel("Address");
		lblVehicalNo_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo_1_5.setForeground(Color.WHITE);
		lblVehicalNo_1_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo_1_5.setBorder(null);
		lblVehicalNo_1_5.setBounds(28, 502, 202, 26);
		tyrep.add(lblVehicalNo_1_5);
		
		JLabel tcn = new JLabel("Primary Accessories");
		tcn.setHorizontalAlignment(SwingConstants.CENTER);
		tcn.setForeground(Color.WHITE);
		tcn.setFont(new Font("Tahoma", Font.BOLD, 16));
		tcn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		tcn.setBounds(229, 314, 261, 26);
		tyrep.add(tcn);
		
		JLabel tbn = new JLabel("Primary Accessories");
		tbn.setHorizontalAlignment(SwingConstants.CENTER);
		tbn.setForeground(Color.WHITE);
		tbn.setFont(new Font("Tahoma", Font.BOLD, 16));
		tbn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		tbn.setBounds(229, 356, 261, 26);
		tyrep.add(tbn);
		
		JLabel tvn = new JLabel("Primary Accessories");
		tvn.setHorizontalAlignment(SwingConstants.CENTER);
		tvn.setForeground(Color.WHITE);
		tvn.setFont(new Font("Tahoma", Font.BOLD, 16));
		tvn.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		tvn.setBounds(229, 405, 261, 26);
		tyrep.add(tvn);
		
		JLabel tpr = new JLabel("Primary Accessories");
		tpr.setHorizontalAlignment(SwingConstants.CENTER);
		tpr.setForeground(Color.WHITE);
		tpr.setFont(new Font("Tahoma", Font.BOLD, 16));
		tpr.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		tpr.setBounds(229, 452, 261, 26);
		tyrep.add(tpr);
		
		JLabel tadd = new JLabel("Primary Accessories");
		tadd.setHorizontalAlignment(SwingConstants.CENTER);
		tadd.setForeground(Color.WHITE);
		tadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		tadd.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		tadd.setBounds(229, 502, 261, 41);
		tyrep.add(tadd);
		
		JPanel perip = new JPanel();
		perip.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 102)));
		perip.setBackground(new Color(153, 153, 153));
		perip.setBounds(357, 44, 561, 672);
		contentPane.add(perip);
		perip.setLayout(null);
		
		JLabel lblPeriodicServices = new JLabel("Periodic Services");
		lblPeriodicServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeriodicServices.setForeground(Color.WHITE);
		lblPeriodicServices.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPeriodicServices.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblPeriodicServices.setBounds(256, 21, 261, 26);
		perip.add(lblPeriodicServices);
		
		JLabel lblVehicalNo = new JLabel("Vehical No.");
		lblVehicalNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalNo.setForeground(Color.WHITE);
		lblVehicalNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalNo.setBorder(null);
		lblVehicalNo.setBounds(27, 124, 202, 26);
		perip.add(lblVehicalNo);
		
		JLabel lblVehicalBrand = new JLabel("Vehical Brand");
		lblVehicalBrand.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalBrand.setForeground(Color.WHITE);
		lblVehicalBrand.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalBrand.setBorder(null);
		lblVehicalBrand.setBounds(27, 195, 202, 26);
		perip.add(lblVehicalBrand);
		
		JLabel lblVehicalModel = new JLabel("Vehical Model");
		lblVehicalModel.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicalModel.setForeground(Color.WHITE);
		lblVehicalModel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVehicalModel.setBorder(null);
		lblVehicalModel.setBounds(27, 267, 202, 26);
		perip.add(lblVehicalModel);
		
		JLabel lblServiceType = new JLabel("Service Type");
		lblServiceType.setHorizontalAlignment(SwingConstants.CENTER);
		lblServiceType.setForeground(Color.WHITE);
		lblServiceType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblServiceType.setBorder(null);
		lblServiceType.setBounds(27, 344, 202, 26);
		perip.add(lblServiceType);
		
		JLabel lblServicesCities = new JLabel("Services Cities");
		lblServicesCities.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicesCities.setForeground(Color.WHITE);
		lblServicesCities.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblServicesCities.setBorder(null);
		lblServicesCities.setBounds(27, 417, 202, 26);
		perip.add(lblServicesCities);
		
		JLabel lblSelectedNearestCenter = new JLabel("Selected Nearest Center");
		lblSelectedNearestCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectedNearestCenter.setForeground(Color.WHITE);
		lblSelectedNearestCenter.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSelectedNearestCenter.setBorder(null);
		lblSelectedNearestCenter.setBounds(27, 486, 202, 26);
		perip.add(lblSelectedNearestCenter);
		
		JLabel mvno = new JLabel("Periodic Services");
		mvno.setHorizontalAlignment(SwingConstants.CENTER);
		mvno.setForeground(Color.WHITE);
		mvno.setFont(new Font("Tahoma", Font.BOLD, 16));
		mvno.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mvno.setBounds(239, 124, 261, 26);
		perip.add(mvno);
		
		JLabel mvbrand = new JLabel("Periodic Services");
		mvbrand.setHorizontalAlignment(SwingConstants.CENTER);
		mvbrand.setForeground(Color.WHITE);
		mvbrand.setFont(new Font("Tahoma", Font.BOLD, 16));
		mvbrand.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mvbrand.setBounds(239, 195, 261, 26);
		perip.add(mvbrand);
		
		JLabel mvmodel = new JLabel("Periodic Services");
		mvmodel.setHorizontalAlignment(SwingConstants.CENTER);
		mvmodel.setForeground(Color.WHITE);
		mvmodel.setFont(new Font("Tahoma", Font.BOLD, 16));
		mvmodel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mvmodel.setBounds(239, 267, 261, 26);
		perip.add(mvmodel);
		
		JLabel mstype = new JLabel("Periodic Services");
		mstype.setHorizontalAlignment(SwingConstants.CENTER);
		mstype.setForeground(Color.WHITE);
		mstype.setFont(new Font("Tahoma", Font.BOLD, 16));
		mstype.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mstype.setBounds(239, 344, 261, 26);
		perip.add(mstype);
		
		JLabel mscity = new JLabel("Periodic Services");
		mscity.setHorizontalAlignment(SwingConstants.CENTER);
		mscity.setForeground(Color.WHITE);
		mscity.setFont(new Font("Tahoma", Font.BOLD, 16));
		mscity.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mscity.setBounds(239, 417, 261, 26);
		perip.add(mscity);
		
		JLabel mscenter = new JLabel("Periodic Services");
		mscenter.setHorizontalAlignment(SwingConstants.CENTER);
		mscenter.setForeground(Color.WHITE);
		mscenter.setFont(new Font("Tahoma", Font.BOLD, 16));
		mscenter.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		mscenter.setBounds(239, 486, 261, 26);
		perip.add(mscenter);
		
		JLabel lblPeriodicServices_1 = new JLabel("Periodic Services");
		lblPeriodicServices_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\periologo.png"));
		lblPeriodicServices_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeriodicServices_1.setForeground(Color.WHITE);
		lblPeriodicServices_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPeriodicServices_1.setBorder(null);
		lblPeriodicServices_1.setBounds(75, 10, 171, 104);
		perip.add(lblPeriodicServices_1);
		
		perip.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 102)));
		panel.setBackground(new Color(51, 0, 102));
		panel.setBounds(27, 44, 313, 711);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel profwarn = new JLabel("Please Enter Valid Email ID");
		profwarn.setHorizontalAlignment(SwingConstants.CENTER);
		profwarn.setForeground(new Color(255, 0, 0));
		profwarn.setFont(new Font("Tahoma", Font.BOLD, 16));
		profwarn.setBorder(null);
		profwarn.setBounds(24, 190, 259, 26);
		panel.add(profwarn);
		tyrep.setVisible(false);
		otherp.setVisible(false);
		profwarn.setVisible(false);
		carp.setVisible(false);
		insurp.setVisible(false);


		



		JButton btnNewButton = new JButton("Periodic Services");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perip.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					perip.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.manualview(eid.getText());
				
				mvno.setText(or.mvno);
				mvbrand.setText(or.mvbrand);
				mvmodel.setText(or.mvmodel);
				mstype.setText(or.mstype);
				mscity.setText(or.mscity);
				mscenter.setText(or.mscenter);
				
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				perip.setVisible(false);

			}
		});
		
		
		
		eid = new JTextField();
		eid.setFont(new Font("Tahoma", Font.BOLD, 16));
		eid.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 153)));
		eid.setBounds(24, 146, 259, 34);
		panel.add(eid);
		eid.setColumns(10);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 153, 153));
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(47, 273, 215, 34);
		panel.add(btnNewButton);
		
		JButton btnMechanicalsRepairs = new JButton("Mechanicals Repairs");
		btnMechanicalsRepairs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mechp.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					mechp.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.dentalview(eid.getText());
				
				dvno.setText(or.dvno);
				dvbrand.setText(or.dvbrand);
				dvmodel.setText(or.dvmodel);
				dstype.setText(or.dstype);
				dscity.setText(or.dscity);
				dscenter.setText(or.dscenter);
				
			}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				mechp.setVisible(false);

			}
		});
		
		btnMechanicalsRepairs.setForeground(Color.WHITE);
		btnMechanicalsRepairs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMechanicalsRepairs.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnMechanicalsRepairs.setBackground(new Color(0, 0, 153));
		btnMechanicalsRepairs.setBounds(47, 317, 215, 34);
		panel.add(btnMechanicalsRepairs);
		
		JButton btnPrimaryAccessories = new JButton("Primary Accessories");
		btnPrimaryAccessories.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				tyrep.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					tyrep.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.tyreview(eid.getText());
				
				tcn.setText(or.tcn);
				tbn.setText(or.tbn);
				tvn.setText(or.tvn);
				tpr.setText(or.tpr);
				tadd.setText(or.tadd);
				
				
			    }
		  		if(tpr.getText().equals("Rs 2290")) {
		  			tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mrf2290.jpg"));
		  		}
		  		if(tpr.getText().equals("Rs 3750")) {
		  			tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mrf3750.jpg"));
		  		}
		  		if(tpr.getText().equals("Rs 3499")) {
		  			tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\ceat3499.jpg"));
		  		}
		  		if(tpr.getText().equals("Rs 4999")) {
		  			tyre3.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\ceat4999.jpg"));
		  		}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				tyrep.setVisible(false);
			}
		});
		btnPrimaryAccessories.setForeground(Color.WHITE);
		btnPrimaryAccessories.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPrimaryAccessories.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnPrimaryAccessories.setBackground(new Color(153, 0, 255));
		btnPrimaryAccessories.setBounds(47, 430, 215, 34);
		panel.add(btnPrimaryAccessories);
		
		JButton btnOtherAccessories = new JButton("Other Accessories");
		btnOtherAccessories.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				otherp.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					otherp.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.othermview(eid.getText());
				
				ocn.setText(or.ocn);
				opn.setText(or.opn);
				opt.setText(or.opt);
				opr.setText(or.opr);
				oadd.setText(or.oadd);
				
				
			    }
		  		if(opr.getText().equals("Rs 8999")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover8999.jpg"));
		  		}
		  		if(opr.getText().equals("Rs 9999")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover9999.jpg"));
		  		}
		  		if(opr.getText().equals("Rs 11999")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover11999.jpg"));
		  		}
		  		if(opr.getText().equals("Rs 6999")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\cover6999.jpg"));
		  		}
		  		if(opr.getText().equals("Rs 280")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\mhold.jpg"));
		  		}
		  		if(opr.getText().equals("Rs 500")) {
		  			tyre3_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\ghold.jpg"));
		  		}
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				otherp.setVisible(false);
			}
		});
		btnOtherAccessories.setForeground(Color.WHITE);
		btnOtherAccessories.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOtherAccessories.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnOtherAccessories.setBackground(new Color(153, 0, 255));
		btnOtherAccessories.setBounds(47, 474, 215, 34);
		panel.add(btnOtherAccessories);
		
		JButton btnCarBookings = new JButton("Car Bookings");
		btnCarBookings.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				carp.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					carp.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.carview(eid.getText());
				
				ccn.setText(or.ccn);
				cbn.setText(or.cbn);
				cmn.setText(or.cmn);
				cpr.setText(or.cpr);
				cadd.setText(or.cadd);
			    }
		  		if(cmn.getText().equals("Nexon")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\nexon.jpg"));
		  		}
		  		if(cmn.getText().equals("Tiago")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\tiago.jpg"));
		  		}
		  		if(cmn.getText().equals("Harrier")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\harrier.jpg"));
		  		}
		  		if(cmn.getText().equals("Safari")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\safari.jpg"));
		  		}
		  		if(cmn.getText().equals("Thar")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\thar.jpg"));
		  		}
		  		if(cmn.getText().equals("Bolero")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\bolero.jpg"));
		  		}
		  		if(cmn.getText().equals("Scorpio")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\scorpio.jpg"));
		  		}
		  		if(cmn.getText().equals("XUV700")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\xuv700.jpg"));
		  		}
		  		if(cmn.getText().equals("Fortuner")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\fortuner.jpg"));
		  		}
		  		if(cmn.getText().equals("Crysta")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\crysta.jpg"));
		  		}
		  		if(cmn.getText().equals("Hycross")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\hycross.jpeg"));
		  		}
		  		if(cmn.getText().equals("Glanza")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\glanza.jpg"));
		  		}
		  		if(cmn.getText().equals("City")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\city.jpg"));
		  		}
		  		if(cmn.getText().equals("Amaze")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\amaze.jpg"));
		  		}
		  		if(cmn.getText().equals("i20")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\i20.jpg"));
		  		}
		  		if(cmn.getText().equals("Creta")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\creta.jpg"));
		  		}
		  		if(cmn.getText().equals("Verna")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\verna.jpg"));
		  		}
		  		if(cmn.getText().equals("Venue")) {
		  			carimg.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\carshop\\car images\\View Car\\venue.jpg"));
		  		}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				carp.setVisible(false);

			}
		});
		btnCarBookings.setForeground(Color.WHITE);
		btnCarBookings.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCarBookings.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnCarBookings.setBackground(new Color(255, 153, 51));
		btnCarBookings.setBounds(47, 518, 215, 34);
		panel.add(btnCarBookings);
		
		JButton btnNewButton_1 = new JButton("Insurance Policy");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				insurp.setVisible(true);
		  		if(eid.getText().isEmpty())
				{
					profwarn.setVisible(true);
					insurp.setVisible(false);

				}
				else {
					profwarn.setVisible(false);
				Oracon or = new Oracon();
				or.insurview(eid.getText());
				
				iclaim.setText(or.iclaim);
				ipolicy.setText(or.ipolicy);
				iiname.setText(or.iiname);
				iiadd.setText(or.iiadd);
				ipin.setText(or.ipin);
				imob.setText(or.imob);
				iregis.setText(or.iregis);
				imodel.setText(or.imodel);
				ichassis.setText(or.ichassis);
				idriver.setText(or.idriver);
				ilicence.setText(or.ilicence);
				idadd.setText(or.idadd);
				ibrief.setText(or.ibrief);
			}}
			@Override
			public void mouseExited(MouseEvent e) {
				insurp.setVisible(false);

			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnNewButton_1.setBackground(new Color(0, 204, 204));
		btnNewButton_1.setBounds(47, 617, 215, 34);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Services");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblNewLabel.setBounds(10, 226, 150, 26);
		panel.add(lblNewLabel);
		
		JLabel lblShopingAndTradings = new JLabel("Shoping and Tradings");
		lblShopingAndTradings.setHorizontalAlignment(SwingConstants.CENTER);
		lblShopingAndTradings.setForeground(Color.WHITE);
		lblShopingAndTradings.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblShopingAndTradings.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblShopingAndTradings.setBounds(10, 381, 226, 26);
		panel.add(lblShopingAndTradings);
		
		JLabel lblPolycies = new JLabel("Policies");
		lblPolycies.setHorizontalAlignment(SwingConstants.CENTER);
		lblPolycies.setForeground(Color.WHITE);
		lblPolycies.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPolycies.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 255, 255)));
		lblPolycies.setBounds(10, 573, 150, 26);
		panel.add(lblPolycies);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\poplogo.png"));
		lblNewLabel_2.setBounds(10, 15, 286, 121);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("<-- BACK");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 51)));
		btnNewButton_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1.setBounds(47, 661, 215, 34);
		panel.add(btnNewButton_1_1);
		
		JLabel lblEnterEmailId = new JLabel("Enter Email ID");
		lblEnterEmailId.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterEmailId.setForeground(Color.WHITE);
		lblEnterEmailId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterEmailId.setBorder(null);
		lblEnterEmailId.setBounds(10, 117, 150, 26);
		panel.add(lblEnterEmailId);
		
		JLabel manualback = new JLabel("New label");
		manualback.setBounds(5, 5, 1516, 755);
		manualback.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\manualback.jpg"));
		contentPane.add(manualback);
	}
}
