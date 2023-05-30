import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MyPortfolio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmMyPortfolio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPortfolio window = new MyPortfolio();
					window.frmMyPortfolio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyPortfolio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyPortfolio = new JFrame();
		frmMyPortfolio.getContentPane().setForeground(new Color(255, 255, 255));
		frmMyPortfolio.setTitle("My Portfolio");
		frmMyPortfolio.getContentPane().setBackground(Color.DARK_GRAY);
		frmMyPortfolio.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Portfolio");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\sigesige.png"));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 60));
		lblNewLabel.setBounds(231, 10, 575, 142);
		frmMyPortfolio.getContentPane().add(lblNewLabel);
		
		JButton btnPersonalInfo = new JButton("Personal Information        ");
		btnPersonalInfo.setHorizontalAlignment(SwingConstants.LEFT);
		btnPersonalInfo.setHorizontalTextPosition(SwingConstants.LEFT);
		btnPersonalInfo.setIcon(new ImageIcon("D:\\Alfred\\Code\\PersonalInfo logo.png"));
		btnPersonalInfo.setForeground(Color.BLACK);
		btnPersonalInfo.setBackground(Color.LIGHT_GRAY);
		btnPersonalInfo.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnPersonalInfo.setBounds(301, 156, 446, 94);
		frmMyPortfolio.getContentPane().add(btnPersonalInfo);
		btnPersonalInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					PersonalInformation PersonalInformationFrame = new PersonalInformation();
					PersonalInformationFrame.setVisible(true);
						
			
			}
		});
		
		JButton btnSkills = new JButton("Educational Background");
		btnSkills.setHorizontalTextPosition(SwingConstants.LEFT);
		btnSkills.setIcon(new ImageIcon("D:\\Alfred\\Code\\Education icon.png"));
		btnSkills.setForeground(Color.BLACK);
		btnSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EducationalBackground EducationalBackgroundFrame =  new EducationalBackground();
				EducationalBackgroundFrame.setVisible(true);

				
			}
		});
		btnSkills.setBackground(Color.LIGHT_GRAY);
		btnSkills.setFont(new Font("Arial Black", Font.BOLD, 19));
		btnSkills.setBounds(301, 260, 446, 94);
		frmMyPortfolio.getContentPane().add(btnSkills);
		
		JButton btnSkills_1 = new JButton("Technical Skills           ");
		btnSkills_1.setHorizontalTextPosition(SwingConstants.LEFT);
		btnSkills_1.setIcon(new ImageIcon("D:\\Alfred\\Code\\TechnicalSkills icon.png"));
		btnSkills_1.setForeground(Color.BLACK);
		btnSkills_1.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnSkills_1.setBackground(Color.LIGHT_GRAY);
		btnSkills_1.setBounds(301, 364, 446, 94);
		frmMyPortfolio.getContentPane().add(btnSkills_1);
		btnSkills_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TechnicalSkills TechnicalSkillsFrame =  new TechnicalSkills();
				TechnicalSkillsFrame.setVisible(true);

				
			}
		});
		
		JButton btnSkills_1_1 = new JButton("Personal Skills            ");
		btnSkills_1_1.setHorizontalTextPosition(SwingConstants.LEFT);
		btnSkills_1_1.setIcon(new ImageIcon("D:\\Alfred\\Code\\Personal Skills icon.png"));
		btnSkills_1_1.setForeground(Color.BLACK);
		btnSkills_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalSkills PersonalSkillsFrame =  new PersonalSkills();
				PersonalSkillsFrame.setVisible(true);

			}
		});
		btnSkills_1_1.setFont(new Font("Arial Black", Font.BOLD, 21));
		btnSkills_1_1.setBackground(Color.LIGHT_GRAY);
		btnSkills_1_1.setBounds(301, 468, 446, 94);
		frmMyPortfolio.getContentPane().add(btnSkills_1_1);
		frmMyPortfolio.setBounds(100, 100, 1049, 640);
		frmMyPortfolio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}