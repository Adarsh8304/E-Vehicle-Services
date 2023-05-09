package com.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import com.vehical.HomePage;
//import com.booktickets.LoginPage;

//import com.vms.windows.DashboardPage;
//import com.vms.windows.LoginPage;

public class Oracon {
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static String user = "system";
	private static String pass = "root";

	
	
	public String fname = null;
	public static String mno1 = null;
	// for View Profile
	public static String plname = null;
	public static String pmobile = null;
	public static String peid = null;
	
	// for view manualbook
	public static String mvno = null;
	public static String mvbrand = null;
	public static String mvmodel = null;
	public static String mstype = null;
	public static String mscity = null;
	public static String mscenter = null;
	
	// for view dentalbook
	public static String dvno = null;
	public static String dvbrand = null;
	public static String dvmodel = null;
	public static String dstype = null;
	public static String dscity = null;
	public static String dscenter = null;
	
	// for view tyerbook
		public static String tcn = null;
		public static String tbn = null;
		public static String tvn = null;
		public static String tpr = null;
		public static String tadd = null;
		
	// for view tyerbook
				public static String ocn = null;
				public static String opn = null;
				public static String opt = null;
				public static String opr = null;
				public static String oadd = null;
				
	// for view carrbook
				public static String ccn = null;
				public static String cbn = null;
				public static String cmn = null;
				public static String cpr = null;
				public static String cadd = null;
	
	// for view insurance
				public static String iclaim = null;
				public static String ipolicy = null;
				public static String iiname = null;
				public static String iiadd = null;
				public static String ipin = null;
				public static String imob = null;
				public static String iregis = null;
				public static String imodel = null;
				public static String ichassis = null;
				public static String idriver = null;
				public static String ilicence = null;
				public static String idadd = null;
				public static String ibrief = null;
	



	
	
		public int b=0;
		public int insertIntoDB(ArrayList<?> al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into registerdata VALUES(?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));

			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		public boolean login ( String id , String pass )
		{
			  String driver = "oracle.jdbc.driver.OracleDriver";
			  String url = "jdbc:oracle:thin:@localhost:1521:XE";
			  String user = "system";
			  String passw = "root";
			Connection con = null;
			Statement st = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String pass1 = null;
			String name = null;
			//String eid = null;
			int ab = 0;
			boolean b = false ;
			
			
			String select = null;
			
			try {
				
				Class.forName(driver);
				con = DriverManager.getConnection(url , user , passw);
				st = con.createStatement();
				
				select = "select fname , password from registerdata where eid = ?";//and password = '?'
				
				ps = con.prepareStatement(select);
				ps.setString(1, id);
			  //  ps.setString(2, pass);
				rs = ps.executeQuery();
				
				while(rs.next()) 
				{
					//eid = rs.getString(2);
					name = rs.getString(1);
//					fname =  rs.getString(1);
					pass1 = rs.getString(2);
					
				//	System.out.println(" "+id +" "+pass);
					
					
				}
				if(pass.equals(pass1) ) {
					//JOptionPane.showMessageDialog(null,"your id is : "+pass1);
					JOptionPane.showMessageDialog(null, "Welcome "+name);
					HomePage hp = new HomePage();
					//LoginPage lp = new LoginPage();
					
					hp.setVisible(true);
					//lp.setVisible(false);
				b =true;
				}
				else {
					
					b = false;
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
			} catch (Exception u) {
				u.printStackTrace();
			}
			return b;
			
		}
		
		public void view1(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();
			
			show = "select fname from registerdata where eid=?";
			
			ps1 = con.prepareStatement(show);
			ps1.setString(1, contact);
			
			rs = ps1.executeQuery();
			
			while(rs.next()) {
				fname =  rs.getString(1);				
				mno1 = rs.getString(2);
				 
				
			}
			
			
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

				e1.printStackTrace();

				} catch (SQLException i) {

				// TODO Auto-generated catch block

				i.printStackTrace();

				} catch (Exception u) {

				u.printStackTrace();

				}
			

		}
		public int insertIntomanual(ArrayList<?> al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into manualbook VALUES(?,?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));
			ps1.setString(6, (String) al.get(5));

			ps1.setString(7, (String) al.get(6));


			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		public int insertIntodental(ArrayList<?> al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into dentalbook VALUES(?,?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));
			ps1.setString(6, (String) al.get(5));

			ps1.setString(7, (String) al.get(6));


			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		public int insertIntotyre(ArrayList<?> al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into tyrebook VALUES(?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));
			ps1.setString(6, (String) al.get(5));
			


			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		public int insertIntoother(ArrayList<?> ol) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into otherbook VALUES(?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) ol.get(0));

			ps1.setString(2, (String) ol.get(1));

			ps1.setString(3, (String) ol.get(2));
			ps1.setString(4, (String) ol.get(3));

			ps1.setString(5, (String) ol.get(4));
			ps1.setString(6, (String) ol.get(5));
			


			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		
		public int insertIntocar(ArrayList<?> cl) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName (driver);

			con = DriverManager.getConnection(url, user, pass);
			System.out.println("connection estabilished.....");
			st = con.createStatement();

			insert = "INSERT into carbook VALUES(?,?,?,?,?,?)";

			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) cl.get(0));

			ps1.setString(2, (String) cl.get(1));

			ps1.setString(3, (String) cl.get(2));
			ps1.setString(4, (String) cl.get(3));

			ps1.setString(5, (String) cl.get(4));
			ps1.setString(6, (String) cl.get(5));
			


			//ps1.setString(6, (String) al.get(5));
//
//			ps1.setString(7, (String) al.get(6));

		//	ps1.setString(8, (String) al.get(7));

			b=ps1.executeUpdate();

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}

			return b;

			}
		// b=0;
		public int insertIntoInsure(ArrayList al) {
			String insert ;

			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			

			
			try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);
			
			System.out.println("connection estabilished.....");
			System.out.println(al);
			st = con.createStatement();

			insert = "INSERT into insur VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			
			
			ps1 = con.prepareStatement(insert);
			
			ps1.setString(1, (String) al.get(0));

			ps1.setString(2, (String) al.get(1));

			ps1.setString(3, (String) al.get(2));
			
			ps1.setString(4, (String) al.get(3));

			ps1.setString(5, (String) al.get(4));

			ps1.setString(6, (String) al.get(5));

			ps1.setString(7, (String) al.get(6));

			ps1.setString(8, (String) al.get(7));
			
			ps1.setString(9, (String) al.get(8));
			
			ps1.setString(10, (String) al.get(9));
			
			ps1.setString(11, (String) al.get(10));
			
			ps1.setString(12, (String) al.get(11));
			
			ps1.setString(13, (String) al.get(12));
			
			ps1.setString(14, (String) al.get(13));
			
			System.out.println("before insert");

			b=ps1.executeUpdate();
			
			System.out.println("inserted values");

			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block

			e1.printStackTrace();

			} catch (SQLException i) {

			// TODO Auto-generated catch block

			i.printStackTrace();

			} catch (Exception u) {

			u.printStackTrace();

			}
			System.out.println("Registration Hogaya");
			return b;
			

		}
		public void profileview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select lname , mobile , eid from registerdata where fname=?";
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					plname =  rs.getString(1);				
					pmobile = rs.getString(2);
					peid = rs.getString(3);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void manualview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select vno, vbrand, vmodel, stype, scity, scenter from manualbook where eid=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					mvno =  rs.getString(1);				
					mvbrand = rs.getString(2);
					mvmodel = rs.getString(3);
					mstype =  rs.getString(4);				
					mscity = rs.getString(5);
					mscenter = rs.getString(6);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void dentalview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select vno, vbrand, vmodel, stype, scity, scenter from dentalbook where eid=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					dvno =  rs.getString(1);				
					dvbrand = rs.getString(2);
					dvmodel = rs.getString(3);
					dstype =  rs.getString(4);				
					dscity = rs.getString(5);
					dscenter = rs.getString(6);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void tyreview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select cname, tbrand, vbname, price, address from tyrebook where eid=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					tcn =  rs.getString(1);				
					tbn = rs.getString(2);
					tvn = rs.getString(3);
					tpr =  rs.getString(4);				
					tadd = rs.getString(5);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void othermview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select ocname, opname, optype, price, address from otherbook where eid=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					ocn =  rs.getString(1);				
					opn = rs.getString(2);
					opt = rs.getString(3);
					opr =  rs.getString(4);				
					oadd = rs.getString(5);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void carview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select ccname, cbname, cmname, cprice, caddress from carbook where ceid=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					ccn =  rs.getString(1);				
					cbn = rs.getString(2);
					cmn = rs.getString(3);
					cpr =  rs.getString(4);				
					cadd = rs.getString(5);
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
		public void insurview(String contact)
		{
			String show ;
			Connection con = null; 
			Statement st = null;
			PreparedStatement ps1 =null;
			ResultSet rs = null;
			
			try {
				
				Class.forName (driver);
				
				con = DriverManager.getConnection(url, user, pass);
				System.out.println("connection estabilished.....");
				st = con.createStatement();
				
				show = "select claimno, policyno, insurname, insuradd, pin, mob, regisno, modelno, chassisno, drivername, licenceno, drivadd, brief from insur where mail=?";
				
				
				ps1 = con.prepareStatement(show);
				ps1.setString(1, contact);
				
				rs = ps1.executeQuery();
				
				while(rs.next()) {
					
					
					
					iclaim =  rs.getString(1);				
					ipolicy = rs.getString(2);
					iiname = rs.getString(3);
					iiadd =  rs.getString(4);				
					ipin = rs.getString(5);
					imob =  rs.getString(6);				
					iregis = rs.getString(7);
					imodel = rs.getString(8);
					ichassis =  rs.getString(9);				
					idriver = rs.getString(10);
					ilicence =  rs.getString(11);				
					idadd = rs.getString(12);
					ibrief = rs.getString(13);
					
					
				}
				
				
			} catch (ClassNotFoundException e1) { // TODO Auto-generated catch block
				
				e1.printStackTrace();
				
			} catch (SQLException i) {
				
				// TODO Auto-generated catch block
				
				i.printStackTrace();
				
			} catch (Exception u) {
				
				u.printStackTrace();
				
			}
			
			
		}
}
	


