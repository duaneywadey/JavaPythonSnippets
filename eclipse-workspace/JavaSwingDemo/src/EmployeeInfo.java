import java.awt.BorderLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JTable;
import java.sql.*;
import java.util.Date;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EmployeeInfo extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JFrame frame;
  
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInfo frame = new EmployeeInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection connection = null;
	PreparedStatement pst = null;
	ResultSet resultSet = null;

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblTransactionType;
	private JLabel lblSimpleAtm;
	private JTextArea ReceiptField;


	/**
	 * Create the frame.
	 */
	public EmployeeInfo() {
		connection = sqliteConnection.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1295, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					String queryForSearch = "SELECT Depositor from ATMTable where AcctNo = " 
									+  textField.getText();
					System.out.println(queryForSearch);
					PreparedStatement pstSearch = connection.prepareStatement(queryForSearch);
					ResultSet rsSearch = pstSearch.executeQuery();
					while(rsSearch.next()) {
						String person = rsSearch.getString(1);
						textField_4.setText(person);	
					}
					
//					ResultSet rs = pstWith.executeQuery();
				
					
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid PIN");
				}
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField.setBounds(93, 34, 206, 58);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setDocument(new JTextFieldLimit(7));
		
		
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setColumns(10);
		textField_1.setBounds(157, 265, 264, 58);
		contentPane.add(textField_1);
		textField_1.setDocument(new JTextFieldLimit(12));
		
		
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
				String acctNo = textField.getText();
				
				
				if ("Deposit".equals(comboBox_1.getSelectedItem())){
					try {
						int dep = Integer.parseInt(textField_1.getText());			
						String query = "UPDATE ATMTable SET Balance = Balance + "+ dep
						+ " WHERE AcctNo = " + textField.getText();
						PreparedStatement pst = connection.prepareStatement(query);	
						pst.execute();
						JOptionPane.showMessageDialog(null, "Data Updated!");
						String queryDep = "SELECT Balance, Depositor from ATMTable "
								+ "where AcctNo= " + textField.getText();
						PreparedStatement pstDep = connection.prepareStatement(queryDep);
						ResultSet rs = pstDep.executeQuery();
						String balance = rs.getString(1);
						String name = rs.getString(2);
						int balDep = Integer.parseInt(balance);
						int finalDep = balDep-dep;
						textField_3.setText(balance);
						textField_4.setText(name);
						textField_2.setText(String.valueOf(finalDep));
						
						
					} 
					
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Invalid PIN");
					}
	                
	            }
				else if ("Withdrawal".equals(comboBox_1.getSelectedItem())){
					
					try {
						int dep = Integer.parseInt(textField_1.getText());		
						String query = "UPDATE ATMTable SET Balance = Balance - "+ dep
						+ " WHERE AcctNo = " + textField.getText();
						PreparedStatement pst = connection.prepareStatement(query);				
						pst.execute();
						String queryWith = "SELECT Balance, Depositor from ATMTable "
								+ "where AcctNo= " + textField.getText();
						PreparedStatement pstWith = connection.prepareStatement(queryWith);
						ResultSet rs = pstWith.executeQuery();
						String balance = rs.getString(1);
						String name = rs.getString(2);
						int balDep = Integer.parseInt(balance);
						int finalDep = balDep+dep;
						textField_3.setText(balance);
						textField_4.setText(name);
						textField_2.setText(String.valueOf(finalDep));
						JOptionPane.showMessageDialog(null, "Data Updated!");
						
						
					} 
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Invalid PIN");
					}
				}
		
					else if("Balance Inquiry".equals(comboBox_1.getSelectedItem())) {
						try {
							String query = "SELECT Balance, Depositor from ATMTable "
									+ "where AcctNo= " + textField.getText();
							PreparedStatement pst = connection.prepareStatement(query);				
							resultSet = pst.executeQuery();
							textField_1.setText("");
							textField_2.setText("");
					
							
							while(resultSet.next()) {
								
								String balance = resultSet.getString(1);
								String name = resultSet.getString(2);
								textField_3.setText(balance);
								textField_4.setText(name);
								textField_2.setText(balance);
								System.out.println(name + " " + balance);
							
								
							}
						}
							
						
						catch (Exception e) {
							JOptionPane.showMessageDialog(null, "Invalid PIN");
						}
					}
	                
	            
			}
		
	
		});
	
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUpdate.setBounds(483, 285, 165, 55);
		contentPane.add(btnUpdate);
		
		JComboBox comboBox = new JComboBox();
		String s1[] = {"Deposit", "Withdrawal", "Balance Inquiry"};
		comboBox_1 = new JComboBox(s1);
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
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 45));
		textField_4.setBounds(130, 103, 466, 86);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblTransactionType = new JLabel("Transaction Type");
		lblTransactionType.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTransactionType.setBounds(10, 218, 198, 23);
		contentPane.add(lblTransactionType);
		
		lblSimpleAtm = new JLabel("Simple ATM Emulator Program");
		lblSimpleAtm.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSimpleAtm.setBounds(10, 0, 242, 23);
		contentPane.add(lblSimpleAtm);
		
		JButton btnNewButton = new JButton("Issue receipt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date obj  = new Date();
				String date = obj.toString();
				if ("Deposit".equals(comboBox_1.getSelectedItem())){
					ReceiptField.setText(ReceiptField.getText() + "*****Simple ATM Emulator Program**********\n");
					ReceiptField.setText(ReceiptField.getText() + "\nMakawao, Hawaii(HI), 96768");
					ReceiptField.setText(ReceiptField.getText() + "\n\nAccount name: " + textField_4.getText());
					ReceiptField.setText(ReceiptField.getText() + "\nMode of transaction: DEPOSIT");
					ReceiptField.setText(ReceiptField.getText() + "\nAmount: PHP " + textField_1.getText());
					ReceiptField.setText(ReceiptField.getText() + "\nCurrent Balance: PHP " +  textField_3.getText() + "\n\n");
					ReceiptField.setText(ReceiptField.getText() + "\n" +  date);
					ReceiptField.setText(ReceiptField.getText() + "\n\n*******************************************");
					ReceiptField.setText(ReceiptField.getText() + "\n*******************************************");
				}
				
				else if ("Withdrawal".equals(comboBox_1.getSelectedItem())){
					ReceiptField.setText(ReceiptField.getText() + "*****Simple ATM Emulator Program************\n");
					ReceiptField.setText(ReceiptField.getText() + "\n(Makawao, Hawaii(HI), 96768");
					ReceiptField.setText(ReceiptField.getText() + "\n\nAccount name: " + textField_4.getText());
					ReceiptField.setText(ReceiptField.getText() + "\nMode of transaction: WITHDRAWAL");
					ReceiptField.setText(ReceiptField.getText() + "\nAmount: PHP " + textField_1.getText());
					ReceiptField.setText(ReceiptField.getText() + "\nCurrent Balance: PHP " +  textField_3.getText() + "\n\n");
					ReceiptField.setText(ReceiptField.getText() + "\n" +  date);
					ReceiptField.setText(ReceiptField.getText() + "\n\n******************************************");
					ReceiptField.setText(ReceiptField.getText() + "\n*******************************************");
				}
				
				else if("Balance Inquiry".equals(comboBox_1.getSelectedItem())) {
					ReceiptField.setText(ReceiptField.getText() + "*****Simple ATM Emulator Program********\n");
					ReceiptField.setText(ReceiptField.getText() + "\n(Makawao, Hawaii(HI), 96768");
					ReceiptField.setText(ReceiptField.getText() + "\n\nAccount name: " + textField_4.getText());
					ReceiptField.setText(ReceiptField.getText() + "\nMode of transaction: Balance Inquiry");
					ReceiptField.setText(ReceiptField.getText() + "\nCurrent Balance: PHP " +  textField_3.getText() + "\n\n");
					ReceiptField.setText(ReceiptField.getText() + "\n" +  date);
					ReceiptField.setText(ReceiptField.getText() + "\n\n\n*****************************************");
				
				}
				
				
				
				
				
			}
			
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(742, 444, 206, 58);
		contentPane.add(btnNewButton);
		
		ReceiptField = new JTextArea();
		ReceiptField.setFont(new Font("Monospaced", Font.PLAIN, 21));
		ReceiptField.setBounds(719, 53, 507, 367);
		contentPane.add(ReceiptField);
		
		JButton btnNewButton_1 = new JButton("Get Final Receipt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReceiptField.setText("");
				textField.setText("");
				textField_4.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				JOptionPane.showMessageDialog(null, "Thanks for your time!");
				
				
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1012, 435, 208, 81);
		contentPane.add(btnNewButton_1);
		
		
		
	
	
		}
	}

		
		
		
	



