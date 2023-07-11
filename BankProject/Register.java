package BankProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.util.Date;

import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register extends JFrame {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -117365548347710864L;
	private Image img_ShowPass = new ImageIcon(Register.class.getResource("Images/ShowPassword.png")).getImage().getScaledInstance(45, 27,Image.SCALE_SMOOTH);
	private Image img_ClosePass = new ImageIcon(Register.class.getResource("Images/ClosePassword.png")).getImage().getScaledInstance(45, 27,Image.SCALE_SMOOTH);
	private JPanel contentPane;
	private JTextField FIrstNamefld;
	private JTextField LastNamefld;
	private JTextField MiddleNamefld;
	private JTextField ContacyNumfld;
	private JTextField Emailfld;
	private JTextField textField;
	private JTextField Usernamefld;
	private JPasswordField Passwordfld;
	private JPasswordField ConPassfld;
	private JLabel Show;
	private JLabel Close;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("Create Account");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane RegisterInfo = new JLayeredPane();
		RegisterInfo.setBounds(0, 0, 745, 380);
		contentPane.add(RegisterInfo);
		RegisterInfo.setLayout(new CardLayout(0, 0));
		
		JPanel page1 = new JPanel();
		RegisterInfo.add(page1, "name_9441205487100");
		page1.setLayout(null);
		
		JPanel page2 = new JPanel();
		RegisterInfo.add(page2, "name_9740587454600");
		page2.setLayout(null);
		
		JPanel page3 = new JPanel();
		RegisterInfo.add(page3, "name_95641499024600");
		page3.setLayout(null);
		
		JButton NextBtn1 = new JButton("Next");
		NextBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterInfo.removeAll();
				RegisterInfo.add(page2);
				RegisterInfo.repaint();
				RegisterInfo.revalidate();
			}
		});
		NextBtn1.setBounds(624, 343, 111, 27);
		page1.add(NextBtn1);
		
		JButton CancelBtn = new JButton("Cancel");
		CancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to cancel creating account?", "Cancel Operation", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					IntroToLogin.main(null);
					dispose();
				}
				
			}
		});
		CancelBtn.setBounds(10, 343, 111, 27);
		page1.add(CancelBtn);
		
		JLabel PersonalInformationTitle = new JLabel("Personal Information");
		PersonalInformationTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		PersonalInformationTitle.setBounds(10, 10, 272, 38);
		page1.add(PersonalInformationTitle);
		
		JPanel FirstNamepnl = new JPanel();
		FirstNamepnl.setBackground(new Color(128, 128, 128));
		FirstNamepnl.setBounds(10, 93, 213, 27);
		page1.add(FirstNamepnl);
		FirstNamepnl.setLayout(null);
		
		FIrstNamefld = new JTextField();
		FIrstNamefld.setBounds(3, 5, 206, 18);
		FirstNamepnl.add(FIrstNamefld);
		FIrstNamefld.setColumns(10);
		
		JPanel LastNamepnl = new JPanel();
		LastNamepnl.setBackground(new Color(128, 128, 128));
		LastNamepnl.setBounds(233, 93, 213, 27);
		page1.add(LastNamepnl);
		LastNamepnl.setLayout(null);
		
		LastNamefld = new JTextField();
		LastNamefld.setColumns(10);
		LastNamefld.setBounds(4, 4, 206, 18);
		LastNamepnl.add(LastNamefld);
		
		JPanel MIddleNamepnl = new JPanel();
		MIddleNamepnl.setBackground(new Color(128, 128, 128));
		MIddleNamepnl.setBounds(456, 93, 213, 27);
		page1.add(MIddleNamepnl);
		MIddleNamepnl.setLayout(null);
		
		MiddleNamefld = new JTextField();
		MiddleNamefld.setColumns(10);
		MiddleNamefld.setBounds(3, 4, 206, 18);
		MIddleNamepnl.add(MiddleNamefld);
		
		JLabel FirstNamelbl = new JLabel("First Name");
		FirstNamelbl.setBounds(10, 58, 138, 25);
		page1.add(FirstNamelbl);
		
		JLabel LastNamelbl = new JLabel("Last Name");
		LastNamelbl.setBounds(233, 58, 138, 25);
		page1.add(LastNamelbl);
		
		JLabel MiddleNamelbl = new JLabel("Middle Name");
		MiddleNamelbl.setBounds(456, 58, 138, 25);
		page1.add(MiddleNamelbl);
		
		JLabel warninglbl = new JLabel("");
		warninglbl.setBounds(10, 195, 192, 25);
		page1.add(warninglbl);
		
		JDateChooser BrithdayChooser = new JDateChooser();
		BrithdayChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				Date birth = BrithdayChooser.getDate();

		        if (birth != null) {
		            LocalDateTime now = LocalDateTime.now();
		            Date current = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());

		            long difference_In_Time = current.getTime() - birth.getTime();
		            long difference_In_Years = (difference_In_Time / (1000L * 60 * 60 * 24 * 365));

		            if (difference_In_Years < 18) {
		                warninglbl.setText("Not eligible to create an account");
		            } else {
		                warninglbl.setText(null);
		            }
		        } else {
		            warninglbl.setText("No date selected");
		        }
			}
		});
		BrithdayChooser.setOpaque(false);
		BrithdayChooser.setBounds(10, 158, 213, 27);
		page1.add(BrithdayChooser);
		
		
		JLabel Birthdaylbl = new JLabel("Selelct the date of your birth");
		Birthdaylbl.setBounds(10, 130, 162, 25);
		page1.add(Birthdaylbl);
		
		JPanel ContactNumpnl = new JPanel();
		ContactNumpnl.setLayout(null);
		ContactNumpnl.setBackground(Color.GRAY);
		ContactNumpnl.setBounds(233, 158, 213, 27);
		page1.add(ContactNumpnl);
		
		ContacyNumfld = new JTextField();
		ContacyNumfld.setColumns(10);
		ContacyNumfld.setBounds(4, 4, 206, 18);
		ContactNumpnl.add(ContacyNumfld);
		
		JLabel ContactNumlbl = new JLabel("Enter your contact number");
		ContactNumlbl.setBounds(233, 130, 162, 25);
		page1.add(ContactNumlbl);
		
		JPanel Emailpnl = new JPanel();
		Emailpnl.setLayout(null);
		Emailpnl.setBackground(Color.GRAY);
		Emailpnl.setBounds(456, 158, 213, 27);
		page1.add(Emailpnl);
		
		Emailfld = new JTextField();
		Emailfld.setColumns(10);
		Emailfld.setBounds(4, 4, 206, 18);
		Emailpnl.add(Emailfld);
		
		JLabel Emaillbl = new JLabel("Enter your E-mail address");
		Emaillbl.setBounds(456, 130, 162, 25);
		page1.add(Emaillbl);
		
		JButton CreateAccbtn = new JButton("Create");
		CreateAccbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterInfo.removeAll();
				RegisterInfo.add(page3);
				RegisterInfo.repaint();
				RegisterInfo.revalidate();
			}
		});
		CreateAccbtn.setBounds(624, 343, 111, 27);
		page2.add(CreateAccbtn);
		
		JButton Backbtn2 = new JButton("Back");
		Backbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterInfo.removeAll();
				RegisterInfo.add(page1);
				RegisterInfo.repaint();
				RegisterInfo.revalidate();
			}
		});
		Backbtn2.setBounds(10, 343, 111, 27);
		page2.add(Backbtn2);
		
		JLabel AccountCredentialsTitle = new JLabel("Account Credentials");
		AccountCredentialsTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		AccountCredentialsTitle.setBounds(4, 4, 256, 38);
		page2.add(AccountCredentialsTitle);
		
		String[] IDType = {"", "National ID", "Driver's License", "Student ID", "Company ID"};
		JComboBox <String> IDTypeComBox = new JComboBox<>(IDType);
		IDTypeComBox.setBounds(10, 82, 228, 27);
		page2.add(IDTypeComBox);
		
		JLabel IDSelectlbl = new JLabel("Select ID Type");
		IDSelectlbl.setBounds(10, 52, 179, 27);
		page2.add(IDSelectlbl);
		
		JPanel FirstNamepnl_1 = new JPanel();
		FirstNamepnl_1.setLayout(null);
		FirstNamepnl_1.setBackground(Color.GRAY);
		FirstNamepnl_1.setBounds(248, 82, 322, 27);
		page2.add(FirstNamepnl_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(3, 5, 315, 18);
		FirstNamepnl_1.add(textField);
		
		JLabel IDNumberlbl = new JLabel("Enter your ID Number");
		IDNumberlbl.setBounds(248, 52, 179, 27);
		page2.add(IDNumberlbl);
		
		JPanel Usernamepnl = new JPanel();
		Usernamepnl.setLayout(null);
		Usernamepnl.setBackground(Color.GRAY);
		Usernamepnl.setBounds(10, 154, 322, 27);
		page2.add(Usernamepnl);
		
		Usernamefld = new JTextField();
		Usernamefld.setColumns(10);
		Usernamefld.setBounds(3, 5, 315, 18);
		Usernamepnl.add(Usernamefld);
		
		JPanel Passwordpnl = new JPanel();
		Passwordpnl.setLayout(null);
		Passwordpnl.setBackground(Color.GRAY);
		Passwordpnl.setBounds(342, 154, 322, 27);
		page2.add(Passwordpnl);
		
		
		Passwordfld = new JPasswordField();
		Passwordfld.setEchoChar('*');
		Passwordfld.setBounds(2, 2, 316, 22);
		Passwordpnl.add(Passwordfld);
		
		JLabel Usernamelbl = new JLabel("Enter Username");
		Usernamelbl.setBounds(10, 127, 179, 27);
		page2.add(Usernamelbl);
		
		JLabel Passwordlbl = new JLabel("Enter Password");
		Passwordlbl.setBounds(342, 125, 179, 27);
		page2.add(Passwordlbl);
		
		JPanel Passwordpnl_1 = new JPanel();
		Passwordpnl_1.setLayout(null);
		Passwordpnl_1.setBackground(Color.GRAY);
		Passwordpnl_1.setBounds(342, 213, 322, 27);
		page2.add(Passwordpnl_1);
		
		ConPassfld = new JPasswordField();
		ConPassfld.setEchoChar('*');
		ConPassfld.setBounds(2, 3, 316, 22);
		Passwordpnl_1.add(ConPassfld);
		
		JLabel ConfirmPasswordpnl = new JLabel("Confirm Password");
		ConfirmPasswordpnl.setBounds(343, 185, 179, 27);
		page2.add(ConfirmPasswordpnl);
		
		JRadioButton TOCradiobtn = new JRadioButton("I have read the Terms and Condition");
		TOCradiobtn.setBounds(6, 296, 243, 21);
		page2.add(TOCradiobtn);
		
		Show = new JLabel("");
		Show.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Close.setVisible(true);
				
				if (Show.isVisible()) {
					Passwordfld.setEchoChar((char)0);
					Show.setVisible(false);
				}else {
					
				}
			}
		});
		Show.setBounds(665, 154, 45, 27);
		Show.setIcon(new ImageIcon(img_ShowPass));
		page2.add(Show);
		
		Close = new JLabel("");
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Show.setVisible(true);
				
				if(Close.isVisible()) {
					Passwordfld.setEchoChar('*');
					Close.setVisible(false);
				}
			}
		});
		Close.setBounds(665, 154, 45, 27);
		Close.setIcon(new ImageIcon(img_ClosePass));
		Close.setVisible(false);
		page2.add(Close);
		
		JButton backbtn = new JButton("Back to Login");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntroToLogin.main(null);
				dispose();
			}
		});
		backbtn.setBounds(287, 320, 176, 31);
		page3.add(backbtn);
		
	}
}

