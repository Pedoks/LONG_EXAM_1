import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class PersonalInformation extends MyPortfolio {

	private JPanel contentPane;
	private JLabel Namelabel;
	private JLabel AddressLabel;
	private JLabel POBLabel;
	private JLabel DOBLabel;
	private JLabel AgeLabel;
	private JLabel HeightLabel;
	private JLabel Weightlabel;
	private JLabel NationalityLabel;
	private JLabel StatusLabel;
	private JLabel ReligionLabel;
	private JButton BackButtonPersonalInformation;
	private JLabel DOB;
	private JLabel Age;
	private JLabel Height;
	private JLabel Nationality;
	private JLabel Status;
	private JLabel Religion;
	private JLabel Weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalInformation frame = new PersonalInformation();
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
	public PersonalInformation() {
		setTitle("Personal Information\r\n");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1181, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Namelabel = new JLabel("Alfred Ernest A. Belles");
		Namelabel.setForeground(Color.LIGHT_GRAY);
		Namelabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		Namelabel.setBounds(211, 113, 627, 36);
		contentPane.add(Namelabel);
		
		AddressLabel = new JLabel("153 int 7 Loreto ST. Sampaloc, Manila, Philippines");
		AddressLabel.setForeground(Color.LIGHT_GRAY);
		AddressLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		AddressLabel.setBounds(211, 159, 627, 36);
		contentPane.add(AddressLabel);
		
		POBLabel = new JLabel("Manila");
		POBLabel.setForeground(Color.LIGHT_GRAY);
		POBLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		POBLabel.setBounds(228, 205, 627, 36);
		contentPane.add(POBLabel);
		
		DOBLabel = new JLabel("December 1, 2004");
		DOBLabel.setForeground(Color.LIGHT_GRAY);
		DOBLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		DOBLabel.setBounds(228, 251, 627, 36);
		contentPane.add(DOBLabel);
		
		AgeLabel = new JLabel("18 years old");
		AgeLabel.setForeground(Color.LIGHT_GRAY);
		AgeLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		AgeLabel.setBounds(211, 297, 627, 36);
		contentPane.add(AgeLabel);
		
		HeightLabel = new JLabel("5'8");
		HeightLabel.setForeground(Color.LIGHT_GRAY);
		HeightLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		HeightLabel.setBounds(211, 343, 148, 36);
		contentPane.add(HeightLabel);
		
		Weightlabel = new JLabel("58 kg");
		Weightlabel.setForeground(Color.LIGHT_GRAY);
		Weightlabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		Weightlabel.setBounds(477, 343, 627, 36);
		contentPane.add(Weightlabel);
		
		NationalityLabel = new JLabel("Filipino");
		NationalityLabel.setForeground(Color.LIGHT_GRAY);
		NationalityLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		NationalityLabel.setBounds(211, 389, 627, 36);
		contentPane.add(NationalityLabel);
		
		StatusLabel = new JLabel("Single");
		StatusLabel.setForeground(Color.LIGHT_GRAY);
		StatusLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		StatusLabel.setBounds(211, 435, 627, 36);
		contentPane.add(StatusLabel);
		
		ReligionLabel = new JLabel("Roman Catholic");
		ReligionLabel.setForeground(Color.LIGHT_GRAY);
		ReligionLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		ReligionLabel.setBounds(211, 481, 627, 36);
		contentPane.add(ReligionLabel);
		
		BackButtonPersonalInformation = new JButton("Back");
		BackButtonPersonalInformation.setHorizontalTextPosition(SwingConstants.LEFT);
		BackButtonPersonalInformation.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\Backbutton.png"));
		BackButtonPersonalInformation.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		BackButtonPersonalInformation.setBackground(new Color(255, 192, 203));
		BackButtonPersonalInformation.setBounds(973, 540, 148, 36);
		contentPane.add(BackButtonPersonalInformation);
		
		JLabel PersonalInfromationTab = new JLabel("Personal Information\r\n\r\n");
		PersonalInfromationTab.setHorizontalTextPosition(SwingConstants.CENTER);
		PersonalInfromationTab.setHorizontalAlignment(SwingConstants.CENTER);
		PersonalInfromationTab.setForeground(Color.LIGHT_GRAY);
		PersonalInfromationTab.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\blackblack.png"));
		PersonalInfromationTab.setFont(new Font("Segoe UI Black", Font.BOLD, 35));
		PersonalInfromationTab.setBounds(70, 50, 1041, 54);
		contentPane.add(PersonalInfromationTab);
		
		JLabel Name = new JLabel("Name:");
		Name.setHorizontalTextPosition(SwingConstants.CENTER);
		Name.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Name.setForeground(Color.LIGHT_GRAY);
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		Name.setBounds(70, 113, 131, 36);
		contentPane.add(Name);
		
		JLabel Address = new JLabel("Address:");
		Address.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Address.setHorizontalTextPosition(SwingConstants.CENTER);
		Address.setHorizontalAlignment(SwingConstants.CENTER);
		Address.setForeground(Color.LIGHT_GRAY);
		Address.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		Address.setBounds(70, 159, 131, 36);
		contentPane.add(Address);
		
		JLabel POB = new JLabel("Place of Birth:");
		POB.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		POB.setHorizontalTextPosition(SwingConstants.CENTER);
		POB.setHorizontalAlignment(SwingConstants.CENTER);
		POB.setForeground(Color.LIGHT_GRAY);
		POB.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		POB.setBounds(70, 205, 148, 36);
		contentPane.add(POB);
		
		DOB = new JLabel("Date of Birth:");
		DOB.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		DOB.setHorizontalTextPosition(SwingConstants.CENTER);
		DOB.setHorizontalAlignment(SwingConstants.CENTER);
		DOB.setForeground(Color.LIGHT_GRAY);
		DOB.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		DOB.setBounds(70, 251, 148, 36);
		contentPane.add(DOB);
		
		Age = new JLabel("Age:");
		Age.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Age.setHorizontalTextPosition(SwingConstants.CENTER);
		Age.setHorizontalAlignment(SwingConstants.CENTER);
		Age.setForeground(Color.LIGHT_GRAY);
		Age.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		Age.setBounds(70, 297, 131, 36);
		contentPane.add(Age);
		
		Height = new JLabel("Height:\r\n");
		Height.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Height.setHorizontalTextPosition(SwingConstants.CENTER);
		Height.setHorizontalAlignment(SwingConstants.CENTER);
		Height.setForeground(Color.LIGHT_GRAY);
		Height.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		Height.setBounds(70, 343, 131, 36);
		contentPane.add(Height);
		
		Nationality = new JLabel("Nationality:");
		Nationality.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Nationality.setHorizontalTextPosition(SwingConstants.CENTER);
		Nationality.setHorizontalAlignment(SwingConstants.CENTER);
		Nationality.setForeground(Color.LIGHT_GRAY);
		Nationality.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		Nationality.setBounds(70, 389, 131, 36);
		contentPane.add(Nationality);
		
		Status = new JLabel("Status:\r\n");
		Status.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Status.setHorizontalTextPosition(SwingConstants.CENTER);
		Status.setHorizontalAlignment(SwingConstants.CENTER);
		Status.setForeground(Color.LIGHT_GRAY);
		Status.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Status.setBounds(70, 435, 131, 36);
		contentPane.add(Status);
		
		Religion = new JLabel("Religion:");
		Religion.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Religion.setHorizontalTextPosition(SwingConstants.CENTER);
		Religion.setHorizontalAlignment(SwingConstants.CENTER);
		Religion.setForeground(Color.LIGHT_GRAY);
		Religion.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Religion.setBounds(70, 481, 131, 36);
		contentPane.add(Religion);
		
		Weight = new JLabel("Weight:\r\n");
		Weight.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		Weight.setHorizontalTextPosition(SwingConstants.CENTER);
		Weight.setHorizontalAlignment(SwingConstants.CENTER);
		Weight.setForeground(Color.LIGHT_GRAY);
		Weight.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Weight.setBounds(336, 343, 131, 36);
		contentPane.add(Weight);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\MicrosoftTeams-image.png"));
		lblNewLabel.setBounds(810, 101, 300, 312);
		contentPane.add(lblNewLabel);
		BackButtonPersonalInformation.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // dispose the frame
	}
		});
	}
}
