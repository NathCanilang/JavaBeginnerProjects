package JavaCalculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculator {

	private JFrame Calculator;
	private JTextField Display;
	private RoundedButton DeleteBtn;
	private RoundedButton DivisionBtn;
	private RoundedButton MultiplicationBtn;
	private RoundedButton Seven;
	private RoundedButton Eight;
	private RoundedButton Nine;
	private RoundedButton SubtractionBtn;
	private RoundedButton Four;
	private RoundedButton Five;
	private RoundedButton Six;
	private RoundedButton AdditionBtn;
	private RoundedButton One;
	private RoundedButton Two;
	private RoundedButton Three;
	private RoundedButton EqualsBtn;
	private RoundedButton PercentBtn;
	private RoundedButton Zero;
	private RoundedButton DecimalBtn;
	private double num1;
	private double answer;
	private int operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.Calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculator = new JFrame();
		Calculator.getContentPane().setBackground(new Color(128, 128, 128));
		Calculator.setBounds(100, 100, 445, 684);
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator.getContentPane().setLayout(null);
		Calculator.setLocationRelativeTo(null);
		
		RoundedPanel DisplayResultPnl = new RoundedPanel(50);
		DisplayResultPnl.setOpaque(false);
		DisplayResultPnl.setBackground(new Color(255, 160, 122));
		DisplayResultPnl.setBounds(10, 10, 411, 120);
		Calculator.getContentPane().add(DisplayResultPnl);
		DisplayResultPnl.setLayout(null);
		
		Display = new JTextField();
		Display.setEditable(false);
		Display.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		Display.setHorizontalAlignment(SwingConstants.RIGHT);
		Display.setBorder(null);
		Display.setBackground(new Color(255, 160, 122));
		Display.setForeground(new Color(255, 255, 255));
		Display.setBounds(10, 10, 391, 100);
		DisplayResultPnl.add(Display);
		Display.setColumns(10);
		
		JButton Cancelbtn = new JButton("C");
		Cancelbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText("");
			}
		});
		Cancelbtn.setBackground(new Color(255, 227, 122));
		Cancelbtn.setForeground(new Color(0, 0, 0));
		Cancelbtn.setBounds(10, 139, 90, 90);
		Calculator.getContentPane().add(Cancelbtn);
		

		
		DeleteBtn = new RoundedButton("Del");
		DeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numdis = Display.getText().length();
				int number = Display.getText().length()-1;
				String store;
				
				if (numdis > 0) {
					StringBuilder del = new StringBuilder(Display.getText());
					del.deleteCharAt(number);
					store = del.toString();
					Display.setText(store);
				}
				
				}
		});
		DeleteBtn.setBackground(new Color(255, 227, 122));
		DeleteBtn.setBounds(331, 139, 90, 90);
		Calculator.getContentPane().add(DeleteBtn);
		
		DivisionBtn = new RoundedButton("/");
		DivisionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(Display.getText());
				Display.setText("");
				operations = 3;
			}
		});
		DivisionBtn.setBackground(new Color(255, 227, 122));
		DivisionBtn.setBounds(115, 139, 90, 90);
		Calculator.getContentPane().add(DivisionBtn);
		
		MultiplicationBtn = new RoundedButton("x");
		MultiplicationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(Display.getText());
				Display.setText("");
				operations = 2;
			}
		});
		MultiplicationBtn.setBackground(new Color(255, 227, 122));
		MultiplicationBtn.setBounds(225, 138, 90, 90);
		Calculator.getContentPane().add(MultiplicationBtn);
		
		Seven = new RoundedButton("7");
		Seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"7");
			}
		});
		Seven.setBackground(new Color(255, 227, 122));
		Seven.setBounds(10, 239, 90, 90);
		Calculator.getContentPane().add(Seven);
		
		Eight = new RoundedButton("8");
		Eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"8");
			}
		});
		Eight.setBackground(new Color(255, 227, 122));
		Eight.setBounds(115, 240, 90, 90);
		Calculator.getContentPane().add(Eight);
		
		Nine = new RoundedButton("9");
		Nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"9");
			}
		});
		Nine.setBackground(new Color(255, 227, 122));
		Nine.setBounds(225, 239, 90, 90);
		Calculator.getContentPane().add(Nine);
		
		SubtractionBtn = new RoundedButton("-");
		SubtractionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(Display.getText());
				Display.setText("");
				operations = 1;
			}
		});
		SubtractionBtn.setBackground(new Color(255, 227, 122));
		SubtractionBtn.setBounds(331, 240, 90, 90);
		Calculator.getContentPane().add(SubtractionBtn);
		
		Four = new RoundedButton("4");
		Four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"4");
			}
		});
		Four.setBackground(new Color(255, 227, 122));
		Four.setBounds(10, 341, 90, 90);
		Calculator.getContentPane().add(Four);
		
		Five = new RoundedButton("5");
		Five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"5");
			}
		});
		Five.setBackground(new Color(255, 227, 122));
		Five.setBounds(115, 341, 90, 90);
		Calculator.getContentPane().add(Five);
		
		Six = new RoundedButton("6");
		Six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"6");
			}
		});
		Six.setBackground(new Color(255, 227, 122));
		Six.setBounds(225, 340, 90, 90);
		Calculator.getContentPane().add(Six);
		
		AdditionBtn = new RoundedButton("+");
		AdditionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(Display.getText());
				Display.setText("");
				operations = 0;
			}
		});
		AdditionBtn.setBackground(new Color(255, 227, 122));
		AdditionBtn.setBounds(331, 341, 90, 90);
		Calculator.getContentPane().add(AdditionBtn);
		
		One = new RoundedButton("1");
		One.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+ "1");
			}
		});
		One.setBackground(new Color(255, 227, 122));
		One.setBounds(10, 442, 90, 90);
		Calculator.getContentPane().add(One);
		
		Two = new RoundedButton("2");
		Two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+ "2");
			}
		});
		Two.setBackground(new Color(255, 227, 122));
		Two.setBounds(115, 442, 90, 90);
		Calculator.getContentPane().add(Two);
		
		Three = new RoundedButton("3");
		Three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Display.setText(Display.getText() + "3");
			}
		});
		Three.setBackground(new Color(255, 227, 122));
		Three.setBounds(225, 441, 90, 90);
		Calculator.getContentPane().add(Three);
		
		EqualsBtn = new RoundedButton("=");
		EqualsBtn.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				switch (operations) {
				case 0:
					answer = num1 + Double.parseDouble(Display.getText());
					Display.setText(Double.toString(answer));
					break;
				case 1:
					answer = num1 - Double.parseDouble(Display.getText());
					Display.setText(Double.toString(answer));
					break;
				case 2:
					answer = num1 * Double.parseDouble(Display.getText());
					Display.setText(Double.toString(answer));
					break;
				case 3:
					answer = num1 / Double.parseDouble(Display.getText());
					Display.setText(Double.toString(answer));
					break;
				case 4:
					answer = num1 / 100;
					Display.setText(Double.toString(answer));				
				}
			}
		});
		EqualsBtn.setBackground(new Color(255, 227, 122));
		EqualsBtn.setBounds(331, 442, 90, 191);
		Calculator.getContentPane().add(EqualsBtn);
		
		PercentBtn = new RoundedButton("%");
		PercentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(Display.getText());
				Display.setText("");
				operations = 4;
				
			}
		});
		PercentBtn.setBackground(new Color(255, 227, 122));
		PercentBtn.setBounds(10, 543, 90, 90);
		Calculator.getContentPane().add(PercentBtn);
		
		Zero = new RoundedButton("0");
		Zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+"0");
			}
		});
		Zero.setBackground(new Color(255, 227, 122));
		Zero.setBounds(115, 542, 90, 90);
		Calculator.getContentPane().add(Zero);
		
		DecimalBtn = new RoundedButton(".");
		DecimalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText(Display.getText()+".");
			}
		});
		DecimalBtn.setBackground(new Color(255, 227, 122));
		DecimalBtn.setBounds(225, 542, 90, 90);
		Calculator.getContentPane().add(DecimalBtn);
		
	}
}
