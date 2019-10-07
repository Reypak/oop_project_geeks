package org.iuea.oop.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginView {

	JFrame Login;

//	Launch the application
	public static void main(String[] args) {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		
		
					LoginView window = new LoginView();
					window.Login.setVisible(true);
					
	}

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Login = new JFrame();
		Login.setTitle("Login View");
		Login.setSize(460, 300);
//		Login.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel  panel; 
		  panel = new JPanel();
		  panel.setPreferredSize(new Dimension(50,50));
		  panel.setBackground(Color.GRAY);
		  Login.getContentPane().add(panel, BorderLayout.CENTER);
		  panel.setLayout(null);
		  
	  
		JLabel lblTitle = new JLabel("LOGIN PAGE");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setBounds(140, 22, 153, 29);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblTitle);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 71, 80, 22);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 128, 77, 22);
		panel.add(lblPassword);
		
		JTextField textField = new JTextField();
		textField.setBounds(97, 70, 312, 29);
		panel.add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(10, 182, 414, 7);
		panel.add(separator);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(20, 200, 153, 34);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBounds(255, 200, 153, 34);
		panel.add(btnCancel);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(97, 127, 311, 29);
		panel.add(password);
		
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
				JOptionPane.showMessageDialog(null, "You must fill all fields !", "Login Page", JOptionPane.INFORMATION_MESSAGE);
			}else if(textField.getText().equals("Darty") && password.getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "Successfully logged in. Welcome "
				+textField.getText()+"", "Login Page", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Error while login", "Login Page", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		});
	}
}
