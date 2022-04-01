import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;

public class AccountInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountInfo frame = new AccountInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblTransactionType;
	private JLabel lblSimpleAtm;

	/**
	 * Create the frame.
	 */
	public AccountInfo() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField.setBounds(93, 34, 206, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 265, 264, 58);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(66, 414, 198, 72);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("PIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(22, 46, 61, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Amount");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblName.setBounds(22, 282, 131, 23);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Balance (in PHP)");
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSurname.setBounds(358, 351, 272, 58);
		contentPane.add(lblSurname);
		
		
		JButton btnUpdate = new JButton("Confirm");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
								
			
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUpdate.setBounds(483, 285, 165, 55);
		contentPane.add(btnUpdate);
		
		
		String s1[] = {"Deposit", "Withdrawal", "Balance Inquiry"};
		JComboBox comboBox_1 = new JComboBox(s1);
		comboBox_1.addActionListener(new ActionListener() {
			String acctNo = textField.getText();
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		comboBox_1.setBounds(216, 211, 466, 43);
		contentPane.add(comboBox_1);

		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setBounds(368, 414, 249, 72);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Deposit");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(91, 351, 149, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(24, 135, 96, 28);
		contentPane.add(lblNewLabel_2);
		
		JTextField textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 45));
		textField_4.setBounds(130, 103, 466, 86);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTransactionType = new JLabel("Transaction Type");
		lblTransactionType.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTransactionType.setBounds(10, 218, 198, 23);
		contentPane.add(lblTransactionType);
		
		JLabel lblSimpleAtm = new JLabel("Simple ATM Emulator Program");
		lblSimpleAtm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimpleAtm.setBounds(10, 0, 242, 23);
		contentPane.add(lblSimpleAtm);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query = "SELECT  * from ATMTable";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton.setBounds(827, 39, 226, 46);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(721, 91, 433, 299);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
	}
}
