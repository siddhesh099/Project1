import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;


public class Lib {

	private JFrame frame;
	private JTextField txtLibraryManagement;
	private JTextField textField;
	private JLabel lblUsername;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblPassword;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JTextField textField_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lib window = new Lib();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lib() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLibraryManagement = new JTextField();
		txtLibraryManagement.setBounds(0, 0, 450, 19);
		txtLibraryManagement.setText("Library Management");
		txtLibraryManagement.setEditable(false);
		frame.getContentPane().add(txtLibraryManagement);
		txtLibraryManagement.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(119, 45, 152, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmailid = new JLabel("Email-id:");
		lblEmailid.setBounds(30, 114, 70, 15);
		frame.getContentPane().add(lblEmailid);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setBounds(30, 47, 82, 15);
		frame.getContentPane().add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 112, 152, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("Phone No:");
		lblPhoneNo.setBounds(30, 159, 82, 15);
		frame.getContentPane().add(lblPhoneNo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 157, 152, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 204, 82, 15);
		frame.getContentPane().add(lblPassword);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 202, 152, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel = new JLabel("confirm password:");
		lblNewLabel.setBounds(30, 231, 82, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(129, 235, 114, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(105, 269, 117, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
