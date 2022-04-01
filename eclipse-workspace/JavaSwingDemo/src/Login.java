import java.awt.EventQueue;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Connection connection = null;
	private JTextField textField_1;
	private JPasswordField passwordField;
	
	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		connection = sqliteConnection.dbConnector();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.setBounds(100, 100, 573, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(370, 68, 177, 45);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(282, 76, 78, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(282, 148, 78, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select * from EmployeeInfo where username=? and password=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_1.getText());
					pst.setString(2, passwordField.getText());
					
					ResultSet rs=pst.executeQuery();
					int count = 0;
					
					while(rs.next()) {
						count = count+1;
						
					}
					
					if(count == 1) {
						JOptionPane.showMessageDialog(null, "Username and password is correct!");
						frame.dispose();
						AccountInfo emplInfo= new AccountInfo();
						emplInfo.setVisible(true);
					}
					else if(count >1) {
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "Username and password is not correct! Try again!");
					}
					
					rs.close();
					pst.close();
					
					
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}
				
				finally {
					try {
						
					} catch (Exception e3) {
						JOptionPane.showMessageDialog(null, e3);
	
					}
				}
			}
		});
		btnLogin.setBounds(386, 213, 161, 45);
		frame.getContentPane().add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(370, 136, 177, 45);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		Image img =new ImageIcon(this.getClass().getResource("/computer-icon-1021.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(10, 11, 262, 247);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
