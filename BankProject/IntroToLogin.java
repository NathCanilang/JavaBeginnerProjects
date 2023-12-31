package BankProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class IntroToLogin {

	public JFrame frmHarmonyBank;
	private RoundedJTextField Usernamefld;
	private RoundedJPasswordField Passwordfld;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroToLogin window = new IntroToLogin();
					window.frmHarmonyBank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IntroToLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize () {
		frmHarmonyBank = new JFrame();
		frmHarmonyBank.setTitle("Harmony Bank");
		frmHarmonyBank.setBounds(100, 100, 451, 507);
		frmHarmonyBank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHarmonyBank.setLocationRelativeTo(null);
		frmHarmonyBank.getContentPane().setLayout(null);
		
		JLayeredPane IntroAndLogin = new JLayeredPane();
		IntroAndLogin.setBounds(0, 0, 437, 470);
		frmHarmonyBank.getContentPane().add(IntroAndLogin);
		IntroAndLogin.setLayout(new CardLayout(0, 0));
		
		JPanel Introduction = new JPanel();
		IntroAndLogin.add(Introduction, "name_69796171730799");
		Introduction.setLayout(null);
		
		JPanel Login = new JPanel();
		Login.setBackground(new Color(128, 128, 128));
		IntroAndLogin.add(Login, "name_69800733726000");
		Login.setLayout(null);
		
		JButton LoginBtn = new JButton("Login");
		LoginBtn.setBounds(107, 341, 226, 38);
		Login.add(LoginBtn);
		
		JButton SignUpbtn = new JButton("Create Account");
		SignUpbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Register a = new Register();
				a.setVisible(true);
				frmHarmonyBank.dispose();
				
			}
		});
		SignUpbtn.setBounds(107, 397, 226, 38);
		Login.add(SignUpbtn);
		
		Usernamefld = new RoundedJTextField(20);
		Usernamefld.setBorder(null);
		Usernamefld.setBounds(71, 162, 306, 44);
		Usernamefld.setOpaque(false);
		Login.add(Usernamefld);
		Usernamefld.setColumns(10);
		
		Passwordfld = new RoundedJPasswordField(20);
		Passwordfld.setBorder(null);
		Passwordfld.setEchoChar('*');
		Passwordfld.setBounds(71, 216, 303, 44);
		Passwordfld.setOpaque(false);
		Login.add(Passwordfld);
		
		JLabel NextBtn = new JLabel("Next");
		NextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IntroAndLogin.removeAll();
				IntroAndLogin.add(Login);
				IntroAndLogin.repaint();
				IntroAndLogin.revalidate();
			}
		});
		NextBtn.setHorizontalAlignment(SwingConstants.CENTER);
		NextBtn.setBounds(173, 390, 80, 31);
		Introduction.add(NextBtn);
		
		frmHarmonyBank.setVisible(true);
	
	}
}
