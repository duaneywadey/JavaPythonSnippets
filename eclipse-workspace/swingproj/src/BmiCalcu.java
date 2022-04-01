import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BmiCalcu {

	private JFrame frame;
	private JTextField weightInput;
	private JTextField getFeet;
	private JTextField getInches;
	private JTextField bmitextfield;
	private JTextField bmiStatusField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BmiCalcu window = new BmiCalcu();
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
	public BmiCalcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ivan Duane\\Downloads\\img1.jpg"));
		frame.setBounds(500, 500, 850, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DUANEY WADEY'S BMI CALCULATOR");
		lblNewLabel.setBounds(49, 11, 511, 38);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("wow very nice");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(679, 512, 145, 38);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Ivan Duane\\Downloads\\Big_Schwarzenegger_01 (1).jpg"));
		lblNewLabel_2.setBounds(605, 355, 219, 146);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ENTER YOUR WEIGHT (in pounds)");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(49, 93, 302, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		weightInput = new JTextField();
		weightInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getFeet.requestFocusInWindow();
			}
		});
		weightInput.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		weightInput.setBounds(96, 126, 53, 38);
		frame.getContentPane().add(weightInput);
		weightInput.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER YOUR HEIGHT");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(49, 214, 219, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Feet");
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(59, 247, 53, 32);
		frame.getContentPane().add(lblNewLabel_5);
		
		getFeet = new JTextField();
		getFeet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getInches.requestFocusInWindow();
			}
		});
		getFeet.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		getFeet.setBounds(96, 280, 26, 38);
		frame.getContentPane().add(getFeet);
		getFeet.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Inches");
		lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(59, 343, 63, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		getInches = new JTextField();
		getInches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		getInches.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		getInches.setBounds(96, 383, 28, 38);
		frame.getContentPane().add(getInches);
		getInches.setColumns(10);
		
		JButton getMyBMI = new JButton("GET MY BMI!!");
		getMyBMI.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ee) {
				  
				
			}
		});
		getMyBMI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int weight, feet, inches, finalInches, bmi1, bmi2;
				double bmi;
				try {
					weight = Integer.parseInt(weightInput.getText());
					feet = Integer.parseInt(getFeet.getText());
					inches = Integer.parseInt(getInches.getText());
					finalInches = (feet * 12) + inches;
					bmi1 = (weight * 703);
					bmi2 = (finalInches)*(finalInches);
					bmi = bmi1/ bmi2;
					bmitextfield.setText(Double.toString(bmi));
					if (bmi < 18.5) {
						bmiStatusField.setText("Underweight, " + "\n" + "u r thin");
					}
					else if (bmi >= 18.5 && bmi <=24.9) {
						bmiStatusField.setText("Normal, " + "\n" + "very healthy");
					}
					else if (bmi >= 25.0 && bmi <=29.9) {
						bmiStatusField.setText("Overweight, " + "\n" + "u r fat");
						
					}
					else if (bmi >= 30.0) {
						bmiStatusField.setText("Obese, " +  "\n" + "not very good");
						
					}
				
				
					
				} 
				catch(Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
				}
			}
		});
		getMyBMI.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		getMyBMI.setBounds(49, 459, 161, 49);
		frame.getContentPane().add(getMyBMI);
		
		JTextArea displayBMI = new JTextArea();
		displayBMI.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		displayBMI.setBounds(430, 80, 382, 252);
		frame.getContentPane().add(displayBMI);
		
		JLabel bmilabel = new JLabel("Final BMI");
		bmilabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		bmilabel.setBounds(221, 251, 111, 22);
		frame.getContentPane().add(bmilabel);
		
		bmitextfield = new JTextField();
		bmitextfield.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		bmitextfield.setBounds(221, 287, 80, 45);
		frame.getContentPane().add(bmitextfield);
		bmitextfield.setColumns(10);
		
		JButton finalResultButton = new JButton("GET THE FINAL BMI!!");
		finalResultButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBMI.setText(displayBMI.getText() + "********HERE'S THE RECORD******\n");
				Date obj  = new Date();
				String date = obj.toString();
				displayBMI.setText(displayBMI.getText() + "\nBMI: " + bmitextfield.getText());
				displayBMI.setText(displayBMI.getText() + "\nSTATUS: " +  bmiStatusField.getText() + "\n\n");
				displayBMI.setText(displayBMI.getText() + "\n\n" +  date + "\n\n");
				
			}
		});
		finalResultButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
		finalResultButton.setBounds(272, 448, 248, 69);
		frame.getContentPane().add(finalResultButton);
		
		JButton btnNewButton = new JButton("Clear all");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getInches.setText("");
				getFeet.setText("");
				weightInput.setText("");
				bmitextfield.setText("");
				bmiStatusField.setText("");
				bmilabel.setText("");
				displayBMI.setText("");
				
				
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton.setBounds(331, 527, 129, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Comment");
		lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(221, 349, 63, 32);
		frame.getContentPane().add(lblNewLabel_7);
		
		bmiStatusField = new JTextField();
		bmiStatusField.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		bmiStatusField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		bmiStatusField.setBounds(217, 385, 271, 49);
		frame.getContentPane().add(bmiStatusField);
		bmiStatusField.setColumns(10);
	}
}
