import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;

public class calcuswing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcuswing window = new calcuswing();
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
	public calcuswing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 850, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DUANEY WADEY'S CALCULATOR");
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblNewLabel.setBounds(52, 11, 360, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  textField_1.requestFocusInWindow();
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(52, 85, 166, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(341, 85, 165, 63);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("SUM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					ans = num1 + num2;
					textField_2.setText(Integer.toString(ans));
				} 
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButton.setBounds(82, 180, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DIFF.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, ans;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					ans = num1 - num2;
					textField_2.setText(Integer.toString(ans));
				} 
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		btnNewButton_1.setBounds(376, 180, 108, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("THE ANSWER IS ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(52, 285, 173, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(235, 246, 249, 104);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JTextArea showRecord = new JTextArea();
		showRecord.setFont(new Font("Monospaced", Font.BOLD, 13));
		showRecord.setBounds(555, 20, 249, 393);
		frame.getContentPane().add(showRecord);
		
		JButton getRecordButton = new JButton("Get a Record");
		getRecordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showRecord.setText(showRecord.getText() + "********HERE'S THE RECORD******\n");
				Date obj  = new Date();
				String date = obj.toString();
				showRecord.setText(showRecord.getText() + "\nNUM 1: " + textField.getText());
				showRecord.setText(showRecord.getText() + "\nNUM 2: " + textField_1.getText());
				showRecord.setText(showRecord.getText() + "\n\nANSWER: " + textField_2.getText());
				showRecord.setText(showRecord.getText() + "\n\n" +  date + "\n\n");
				
				
			}
		});
		getRecordButton.setBounds(179, 371, 128, 42);
		frame.getContentPane().add(getRecordButton);
		
		JButton clearButton = new JButton("Clear all");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				showRecord.setText("");
				
				
			}
		});
		clearButton.setBounds(390, 372, 116, 40);
		frame.getContentPane().add(clearButton);
		
		
		
	}
}
