package BankProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.util.Date;

import java.awt.CardLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.awt.event.ActionEvent;
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
	private Image img_ShowPass = new ImageIcon(Register.class.getResource("Images/ShowPassword.png")).getImage().getScaledInstance(31,21,Image.SCALE_SMOOTH);
	private Image img_ClosePass = new ImageIcon(Register.class.getResource("Images/ClosePassword.png")).getImage().getScaledInstance(31,21,Image.SCALE_SMOOTH);
	private JPanel RegisterPane;
	private JTextField FIrstNamefld, LastNamefld, MiddleNamefld, ContacyNumfld, Emailfld, textField, Usernamefld ;
	private JLabel FirstNamelbl, LastNamelbl, MiddleNamelbl, warninglbl, Birthdaylbl, ContactNumlbl, Emaillbl, Genderlbl,IDSelectlbl,
	IDNumberlbl, Usernamelbl, Passwordlbl, ConfirmPasswordpnl, PersonalInformationTitle, AccountCredentialsTitle, Show_1;
	private JPasswordField Passwordfld, ConPassfld;
	private JLabel Show, Close, IDlbl;
	private JRadioButton MaleOption, FemaleOption
;	
	private JLabel Close_1;

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
		RegisterPane = new JPanel();
		RegisterPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(RegisterPane);
		RegisterPane.setLayout(null);
		
		JLayeredPane RegisterInfo = new JLayeredPane();
		RegisterInfo.setBounds(0, 0, 745, 380);
		RegisterPane.add(RegisterInfo);
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
		
		PersonalInformationTitle = new JLabel("Personal Information");
		PersonalInformationTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		PersonalInformationTitle.setBounds(10, 10, 272, 38);
		page1.add(PersonalInformationTitle);
		
		FirstNamelbl = new JLabel("First Name");
		FirstNamelbl.setBounds(10, 58, 138, 25);
		page1.add(FirstNamelbl);
		
		LastNamelbl = new JLabel("Last Name");
		LastNamelbl.setBounds(243, 58, 138, 25);
		page1.add(LastNamelbl);
		
		MiddleNamelbl = new JLabel("Middle Name");
		MiddleNamelbl.setBounds(466, 58, 138, 25);
		page1.add(MiddleNamelbl);
		
		warninglbl = new JLabel("");
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
		BrithdayChooser.setBounds(10, 158, 206, 27);
		page1.add(BrithdayChooser);
		
		
		Birthdaylbl = new JLabel("Selelct the date of your birth");
		Birthdaylbl.setBounds(10, 130, 162, 25);
		page1.add(Birthdaylbl);
		
		ContactNumlbl = new JLabel("Enter your contact number");
		ContactNumlbl.setBounds(243, 130, 162, 25);
		page1.add(ContactNumlbl);
		
		Emaillbl = new JLabel("Enter your E-mail address");
		Emaillbl.setBounds(466, 130, 162, 25);
		page1.add(Emaillbl);
		
		Genderlbl = new JLabel("Choose your gender");
		Genderlbl.setBounds(10, 233, 138, 27);
		page1.add(Genderlbl);
		
		MaleOption = new JRadioButton("Male");
		MaleOption.setBounds(10, 266, 60, 21);
		page1.add(MaleOption);
		
		FemaleOption = new JRadioButton("Female");
		FemaleOption.setBounds(72, 266, 76, 21);
		page1.add(FemaleOption);
		
		ButtonGroup RadioButton = new ButtonGroup();
		RadioButton.add(MaleOption);
		RadioButton.add(FemaleOption);
		
		FIrstNamefld = new JTextField();
		FIrstNamefld.setBounds(10, 93, 206, 27);
		page1.add(FIrstNamefld);
		FIrstNamefld.setColumns(10);
		
		LastNamefld = new JTextField();
		LastNamefld.setBounds(243, 93, 206, 27);
		page1.add(LastNamefld);
		LastNamefld.setColumns(10);
		
		MiddleNamefld = new JTextField();
		MiddleNamefld.setBounds(466, 93, 206, 27);
		page1.add(MiddleNamefld);
		MiddleNamefld.setColumns(10);
		
		ContacyNumfld = new JTextField();
		ContacyNumfld.setBounds(243, 158, 206, 27);
		page1.add(ContacyNumfld);
		ContacyNumfld.setColumns(10);
		
		Emailfld = new JTextField();
		Emailfld.setBounds(466, 158, 206, 27);
		page1.add(Emailfld);
		Emailfld.setColumns(10);
		
		
		JButton CreateAccbtn = new JButton("Create");
		CreateAccbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice = JOptionPane.showConfirmDialog(null, "Are the information that you input are finalized?", "Confirmation", JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					RegisterInfo.removeAll();
					RegisterInfo.add(page3);
					RegisterInfo.repaint();
					RegisterInfo.revalidate();
					
				}
				
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
		
		AccountCredentialsTitle = new JLabel("Account Credentials");
		AccountCredentialsTitle.setFont(new Font("Tahoma", Font.PLAIN, 28));
		AccountCredentialsTitle.setBounds(4, 4, 256, 38);
		page2.add(AccountCredentialsTitle);
		
		IDlbl = new JLabel("No ID Type selected");
		IDlbl.setBounds(12, 109, 111, 27);
		page2.add(IDlbl);
		
		String[] IDType = {"", "National ID", "Driver's License", "Student ID", "Company ID"};
		JComboBox<String> IDTypeComBox = new JComboBox<>(IDType);

		IDTypeComBox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            String selectedIDType = (String) IDTypeComBox.getSelectedItem();
		            if (selectedIDType.equals("")) {
		                IDlbl.setText("No ID type selected");
		            } else {
		                IDlbl.setText("");
		            }
		        }
		    }
		});

		IDTypeComBox.setBounds(10, 82, 228, 27);
		page2.add(IDTypeComBox);
		
		IDSelectlbl = new JLabel("Select ID Type");
		IDSelectlbl.setBounds(10, 52, 179, 27);
		page2.add(IDSelectlbl);
		
		IDNumberlbl = new JLabel("Enter your ID Number");
		IDNumberlbl.setBounds(248, 52, 179, 27);
		page2.add(IDNumberlbl);
		
		 Usernamelbl = new JLabel("Enter Username");
		Usernamelbl.setBounds(12, 156, 179, 27);
		page2.add(Usernamelbl);
		
		Passwordlbl = new JLabel("Enter Password");
		Passwordlbl.setBounds(250, 156, 179, 27);
		page2.add(Passwordlbl);
		
		ConfirmPasswordpnl = new JLabel("Confirm Password");
		ConfirmPasswordpnl.setBounds(250, 205, 179, 27);
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
		Show.setBounds(483, 183, 31, 21);
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
		Close.setBounds(483, 183, 31, 21);
		Close.setIcon(new ImageIcon(img_ClosePass));
		Close.setVisible(false);
		page2.add(Close);
		
		textField = new JTextField();
		textField.setBounds(248, 86, 315, 23);
		page2.add(textField);
		textField.setColumns(10);
		
		Usernamefld = new JTextField();
		Usernamefld.setBounds(12, 183, 228, 21);
		page2.add(Usernamefld);
		Usernamefld.setColumns(10);
		
		
		Passwordfld = new JPasswordField();
		Passwordfld.setBounds(250, 183, 228, 21);
		page2.add(Passwordfld);
		Passwordfld.setEchoChar('*');
		
		ConPassfld = new JPasswordField();
		ConPassfld.setBounds(250, 231, 228, 22);
		page2.add(ConPassfld);
		ConPassfld.setEchoChar('*');
		
		Show_1 = new JLabel("");
		Show_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Close_1.setVisible(true);
			
				if (Show_1.isVisible()) {
					ConPassfld.setEchoChar((char)0);
					Show_1.setVisible(false);
				}else {	
				}
			}
		});
		Show_1.setIcon(new ImageIcon(img_ShowPass));
		Show_1.setBounds(483, 232, 31, 21);
		page2.add(Show_1);
		
		Close_1 = new JLabel("");
		Close_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Show_1.setVisible(true);
				
				if(Close_1.isVisible()) {
					ConPassfld.setEchoChar('*');
					Close_1.setVisible(false);
				}
			}
		});
		Close_1.setBounds(483, 231, 31, 21);
		Close_1.setIcon(new ImageIcon(img_ClosePass));
		Close_1.setVisible(false);
		page2.add(Close_1);
		
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
