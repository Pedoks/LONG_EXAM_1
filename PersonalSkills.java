import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PersonalSkills extends MyPortfolio {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalSkills frame = new PersonalSkills();
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
	public PersonalSkills() {
		setTitle("PersonalSkills");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1181, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PersonalSkillsLabel1 = new JLabel("❖ Motivated and always willing to learn new things.\r");
		PersonalSkillsLabel1.setForeground(Color.LIGHT_GRAY);
		PersonalSkillsLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		PersonalSkillsLabel1.setBounds(56, 122, 1051, 36);
		contentPane.add(PersonalSkillsLabel1);
		
		JLabel PersonalSkillsLabel2 = new JLabel("❖ Well-organized when it comes to work");
		PersonalSkillsLabel2.setForeground(Color.LIGHT_GRAY);
		PersonalSkillsLabel2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		PersonalSkillsLabel2.setBounds(56, 151, 1051, 36);
		contentPane.add(PersonalSkillsLabel2);
		
		JLabel PersonalSkillsLabel3 = new JLabel("❖ Ability to work independently or as part of a team.");
		PersonalSkillsLabel3.setForeground(Color.LIGHT_GRAY);
		PersonalSkillsLabel3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		PersonalSkillsLabel3.setBounds(56, 180, 1051, 36);
		contentPane.add(PersonalSkillsLabel3);
		
		JLabel PersonalSkillsLabel4 = new JLabel("❖ Collaborative and able to work in team and group");
		PersonalSkillsLabel4.setForeground(Color.LIGHT_GRAY);
		PersonalSkillsLabel4.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		PersonalSkillsLabel4.setBounds(56, 209, 1051, 36);
		contentPane.add(PersonalSkillsLabel4);
		
		JLabel CareerObjectiveslaabel1 = new JLabel("To be a part of an organization where I get a chance to use my knowledge and skills");
		CareerObjectiveslaabel1.setVerticalAlignment(SwingConstants.TOP);
		CareerObjectiveslaabel1.setForeground(Color.LIGHT_GRAY);
		CareerObjectiveslaabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		CareerObjectiveslaabel1.setBounds(90, 369, 1545, 41);
		contentPane.add(CareerObjectiveslaabel1);
		
		JLabel CareerObjectivesLabel2 = new JLabel("to contribute in the progress of the organization as well as myself.");
		CareerObjectivesLabel2.setVerticalAlignment(SwingConstants.TOP);
		CareerObjectivesLabel2.setForeground(Color.LIGHT_GRAY);
		CareerObjectivesLabel2.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		CareerObjectivesLabel2.setBounds(169, 398, 1545, 41);
		contentPane.add(CareerObjectivesLabel2);
		
		JButton PersonalSkillBackBtn = new JButton("Back\r\n");
		PersonalSkillBackBtn.setHorizontalTextPosition(SwingConstants.LEFT);
		PersonalSkillBackBtn.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\Backbutton.png"));
		PersonalSkillBackBtn.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		PersonalSkillBackBtn.setBackground(new Color(255, 192, 203));
		PersonalSkillBackBtn.setBounds(959, 527, 148, 36);
		contentPane.add(PersonalSkillBackBtn);
		
		JLabel PersonalSkillsTab = new JLabel("Personal Skills");
		PersonalSkillsTab.setHorizontalTextPosition(SwingConstants.CENTER);
		PersonalSkillsTab.setHorizontalAlignment(SwingConstants.CENTER);
		PersonalSkillsTab.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\blackblack.png"));
		PersonalSkillsTab.setForeground(Color.LIGHT_GRAY);
		PersonalSkillsTab.setFont(new Font("Segoe UI Black", Font.BOLD, 34));
		PersonalSkillsTab.setBounds(56, 71, 1051, 53);
		contentPane.add(PersonalSkillsTab);
		
		JLabel CareerObjectivesLabel = new JLabel("Career Objectives");
		CareerObjectivesLabel.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\blackblack.png"));
		CareerObjectivesLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		CareerObjectivesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CareerObjectivesLabel.setForeground(Color.LIGHT_GRAY);
		CareerObjectivesLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 34));
		CareerObjectivesLabel.setBounds(56, 306, 1051, 53);
		contentPane.add(CareerObjectivesLabel);
		PersonalSkillBackBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // dispose the frame
	}
		});
	}

}
