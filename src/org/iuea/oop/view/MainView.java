package org.iuea.oop.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;



public class MainView {

	private JFrame frmTitle;
	private JTextField fname;
	private JTextField lname;
	private JTextField textField;
	private JTextField course;
	private JTextField reg;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTitle = new JFrame();
		frmTitle.setVisible(true);
		frmTitle.getContentPane().setBackground(Color.WHITE);
		frmTitle.setTitle("Geeks");
		frmTitle.setSize(713, 511);
		frmTitle.setLocationRelativeTo(null);
		frmTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTitle.getContentPane().setLayout(null);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.setBounds(-5, -2, 115, 32);
		frmTitle.getContentPane().add(btnStudents);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.setBounds(-5, 25, 115, 32);
		frmTitle.getContentPane().add(btnCourse);
		
		JButton btnCourseUnits = new JButton("Course Units");
		btnCourseUnits.setBounds(-5, 52, 115, 32);
		frmTitle.getContentPane().add(btnCourseUnits);
		
		JButton btnLectures = new JButton("Lectures");
		btnLectures.setBounds(-5, 79, 115, 32);
		frmTitle.getContentPane().add(btnLectures);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(0, 424, 697, 2);
		frmTitle.getContentPane().add(separator_2);
		
		JPanel panel_main = new JPanel();
		panel_main.setBackground(Color.WHITE);
		panel_main.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		panel_main.setBounds(107, 23, 581, 404);
		frmTitle.getContentPane().add(panel_main);
		panel_main.setLayout(null);
		
		JPanel panel_students = new JPanel();
		panel_students.setVisible(false);
		panel_students.setLayout(null);
		panel_students.setBounds(1, 1, 578, 401);
		
		JPanel panel_register = new JPanel();
		panel_register.setVisible(false);
		panel_register.setBounds(1, 1, 578, 401);
		panel_main.add(panel_register);
		panel_register.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSubmit.setBackground(new Color(0, 153, 51));
		btnSubmit.setBounds(144, 327, 78, 34);
		panel_register.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancel.setBackground(new Color(153, 0, 0));
		btnCancel.setBounds(334, 327, 78, 34);
		panel_register.add(btnCancel);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setVisible(false);
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Dialog", Font.BOLD, 12));
		btnUpdate.setBackground(new Color(0, 153, 51));
		btnUpdate.setBounds(144, 327, 78, 34);
		panel_register.add(btnUpdate);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFirstName.setBounds(32, 48, 85, 22);
		panel_register.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(32, 100, 85, 22);
		panel_register.add(lblLastName);
		
		fname = new JTextField();
		fname.setBounds(118, 45, 408, 30);
		panel_register.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(118, 97, 408, 30);
		panel_register.add(lname);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSex.setBounds(32, 149, 85, 22);
		panel_register.add(lblSex);
		
		JComboBox sexbox = new JComboBox();
		sexbox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		sexbox.setBackground(SystemColor.text);
		sexbox.setBounds(118, 146, 164, 30);
		panel_register.add(sexbox);
		
		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCourse.setBounds(32, 195, 85, 22);
		panel_register.add(lblCourse);
		
		course = new JTextField();
		course.setColumns(10);
		course.setBounds(118, 192, 408, 30);
		panel_register.add(course);
		
		JLabel lblRegistration = new JLabel("Registration:");
		lblRegistration.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRegistration.setBounds(32, 248, 85, 22);
		panel_register.add(lblRegistration);
		
		reg = new JTextField();
		reg.setColumns(10);
		reg.setBounds(118, 245, 408, 30);
		panel_register.add(reg);
		panel_main.add(panel_students);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_register.setVisible(true);
				panel_students.setVisible(false);
				btnSubmit.setVisible(true);
				btnUpdate.setVisible(false);
			}
		});
		btnAdd.setBounds(47, 24, 70, 34);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAdd.setBackground(new Color(34, 139, 34));
		panel_students.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(251, 24, 70, 34);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEdit.setBackground(new Color(204, 51, 0));
		panel_students.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(450, 24, 70, 34);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 12));
		btnDelete.setBackground(new Color(153, 0, 0));
		panel_students.add(btnDelete);
		

		//table formation
		
		String[] tblHead= {"▼ First Name","▼ Last Name","▼ Sex","▼ Registration","▼ Course"};
		
		String [][] data= {{"Matt","Mwesigwa","Male","18/UG","BIT"},
				{"Aisha","Akiah","Female","19/456","BIT"},
				{"Pete","Joseph","Male","19/345","BCS"},
				{"Paul","Johns","Male","18/995","BCS"},
				{"Darty","Malima","Male","18/UG","BIT"},
				{"Matt","Junior","Male","19/345","BCS"},
				{"Jane","Tiba","Female","18/995","BCS"}};
		
		DefaultTableModel dtm = new DefaultTableModel(data,tblHead);
		JTable table = new JTable(dtm);
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 85, 541, 179);
		panel_students.add(scrollPane);
		scrollPane.setViewportView(table);
		
		JLabel lblGeeks = new JLabel("\u00A9 Geeks 2019");
		lblGeeks.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeeks.setBounds(0, 424, 684, 27);
		frmTitle.getContentPane().add(lblGeeks);
		
		JMenuBar menuBar = new JMenuBar();
		frmTitle.setJMenuBar(menuBar);
		
		JMenu mnAction = new JMenu("          Action        ");
		menuBar.add(mnAction);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTitle.dispose();
				LoginView loginwindow = new LoginView();
			}
		});
		mnAction.add(mntmLogout);
		
		JMenu mnl = new JMenu("|");
		mnl.setEnabled(false);
		menuBar.add(mnl);
		
		JMenu mnHelp = new JMenu("          Help        ");
		menuBar.add(mnHelp);
		
		JMenuItem mntmContacts = new JMenuItem("Contacts");
		mnHelp.add(mntmContacts);
		
		JMenuItem mntmAboutUs = new JMenuItem("About Us");
		mnHelp.add(mntmAboutUs);
		
		JMenu menu_1 = new JMenu("|");
		menu_1.setEnabled(false);
		menuBar.add(menu_1);
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fn = fname.getText();
				String ln = lname.getText();
				String s = (String)sexbox.getSelectedItem();
				String cr = course.getText();
				String rg = reg.getText();
				
				if(fn.isEmpty() || ln.isEmpty()) {
					JOptionPane.showMessageDialog(
					null, "You must fill all fields !", "Geeks", 
					JOptionPane.INFORMATION_MESSAGE);
				} else {
					String [] item= {fn,ln,s,rg,cr};
					dtm.addRow(item);
					panel_register.setVisible(false);
					panel_students.setVisible(true);
				};
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// hide registration panel
				// load student table
				panel_students.setVisible(true);
				panel_register.setVisible(false);
			}
		});
		
		btnStudents.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent ae) {
				btnStudents.setBackground(Color.BLUE);
				btnStudents.setForeground(Color.WHITE);
				panel_students.setVisible(true);
				panel_register.setVisible(false);
			}
			
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No Data");
					} else {
						JOptionPane.showMessageDialog(null, "Select Row to Delete");
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No Data");
					} else {
						JOptionPane.showMessageDialog(null, "Select Row to Edit");
					}
				} else {
			
					
					int row = table.getSelectedRow();
					fname.setText((String)table.getValueAt(row, 0));
					lname.setText((String) table.getValueAt(row, 1));
					sexbox.setSelectedItem((String)table.getValueAt(row, 2));
					reg.setText((String) table.getValueAt(row, 3));
					course.setText((String) table.getValueAt(row, 4));
					btnUpdate.setVisible(true);
					btnSubmit.setVisible(false);
					panel_students.setVisible(false);
					panel_register.setVisible(true);
				}
				
			}
		});

		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row = table.getSelectedRow();
				table.setValueAt(fname.getText(), row, 0);
				table.setValueAt(lname.getText(), row, 1);
				table.setValueAt(sexbox.getSelectedItem(), row, 2);
				table.setValueAt(reg.getText(), row, 3);
				table.setValueAt(course.getText(), row, 4);
				panel_students.setVisible(true);
				panel_register.setVisible(false);
			}
		});
	}
}
