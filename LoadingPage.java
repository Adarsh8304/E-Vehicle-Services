package com.vehical;


import javax.swing.JFrame; 
import javax.swing.JPanel;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;


public class LoadingPage extends JFrame {

	private JPanel contentPane;
//	static JProgressBar progressBar;
	static JProgressBar progressBar;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public LoadingPage() {
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowActivated(WindowEvent e) {
//				fill();
//			}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 802);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(progressBar);

		
		 
		
		
		
		//progressBar.setSleep(10);
		
	     
	    
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\loadlogo.png"));
		lblNewLabel_1.setBounds(480, 154, 613, 291);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\information technology\\6th sem\\cpe images\\images\\loadback.jpg"));
		lblNewLabel.setBounds(0, 0, 1540, 802);
		contentPane.add(lblNewLabel);
	}


public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				LoadingPage frame = new LoadingPage();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	
	progressBar = new JProgressBar();
	progressBar.setForeground(Color.BLUE);
	progressBar.setBackground(Color.WHITE);
	progressBar.setBounds(506, 419, 566, 35);
	fill();

}
	public static void fill() {
		int i = 0;
		try {
			while (i <= 100) {
				
				progressBar.setValue(i+10);
				System.out.println(i);
				
				Thread.sleep(40);
				i+=1;
				if(i==100) {
					HomePage hp=new HomePage();
					hp.setVisible(true);
					
				}
//				LoadingPage lp=new LoadingPage();
//				lp.setVisible(false);
			}
		}
		catch (Exception e) {
		}
		}
	
}