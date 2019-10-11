package org.iuea.oop.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//creating the loginview interface using jframe
public class LoginView extends JFrame {

	JFrame Login = new JFrame();

	/**
	 * Create the application.
	 */
	public LoginView() {
		
		initialize();
		
	}

	/**
	 * Initializing the contents of the frame.
	 */
	public void initialize() {
		
		Login = new JFrame();
		Login.setVisible(true);
		Login.setTitle("Login View");
		Login.setSize(450, 300);
		Login.setLocationRelativeTo(null);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panel properties, color and layout
		JPanel  panel; 
		  panel = new JPanel();
		  panel.setBackground(Color.GRAY);
		  Login.getContentPane().add(panel, BorderLayout.CENTER);
		  panel.setLayout(null);
		  
	  //login page using the jlable, settings bounds, color and appearance
		JLabel lblTitle = new JLabel("LOGIN PAGE");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(140, 22, 153, 29);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblTitle);
		
		//Username font and boundaries 
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 71, 80, 22);
		panel.add(lblUsername);
		
		//password field properties and interface
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 128, 77, 22);
		panel.add(lblPassword);
		
		JTextField textField = new JTextField();
		panel.add(textField);
		textField.setBounds(97, 70, 312, 29);
		
		
		JSeparator separator = new JSeparator();
		panel.add(separator);
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(10, 182, 414, 7);
		
		
		JButton btnLogin = new JButton("Login");
		panel.add(btnLogin);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(20, 200, 153, 34);
		
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(255, 200, 153, 34);
		
		
		JPasswordField password = new JPasswordField();
		panel.add(password);
		password.setBounds(97, 127, 311, 29);
		
		
		btnCancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				Login.dispose();	
			}
			
		});
		
		btnLogin.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if(textField.getText().isEmpty() || password.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "You must fill all fields !", "Login Page", 
				JOptionPane.INFORMATION_MESSAGE);
			//using events for login preferences password and username
			}else if(textField.getText().equals("Darty") || 
					 textField.getText().equals("Aisha") ||
					 textField.getText().equals("Matt") ||
					 textField.getText().equals("Paul") && password.getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "Successfully logged in. Welcome "
				+textField.getText()+"", "Login Page", JOptionPane.INFORMATION_MESSAGE);
				
				Login.dispose();
				new MainView();
			//setting dialog message for wrong login credentials
			}else {
				JOptionPane.showMessageDialog(null, "Error while login", "Login Page", 
				JOptionPane.INFORMATION_MESSAGE);
			}
		}
		});
	}
}
