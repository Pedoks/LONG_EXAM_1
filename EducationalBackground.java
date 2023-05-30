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

public class EducationalBackground extends MyPortfolio {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationalBackground frame = new EducationalBackground();
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
	public EducationalBackground() {
		setTitle("Educational Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1181, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel GradeSchoolLabel1 = new JLabel("Trinidad Tecson Elementary school\r (2009-2015)");
		GradeSchoolLabel1.setVerticalAlignment(SwingConstants.TOP);
		GradeSchoolLabel1.setForeground(Color.LIGHT_GRAY);
		GradeSchoolLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		GradeSchoolLabel1.setBounds(265, 127, 627, 40);
		contentPane.add(GradeSchoolLabel1);
		
		JLabel GradeSchoolLabel2 = new JLabel("Geronimo Street , Sampaloc , Manila\r\n");
		GradeSchoolLabel2.setVerticalAlignment(SwingConstants.TOP);
		GradeSchoolLabel2.setForeground(Color.LIGHT_GRAY);
		GradeSchoolLabel2.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		GradeSchoolLabel2.setBounds(265, 163, 627, 40);
		contentPane.add(GradeSchoolLabel2);
		
		JLabel JuniorHighLabel1 = new JLabel("Nazareth School of National University (2015-2020)");
		JuniorHighLabel1.setVerticalAlignment(SwingConstants.TOP);
		JuniorHighLabel1.setForeground(Color.LIGHT_GRAY);
		JuniorHighLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		JuniorHighLabel1.setBounds(303, 243, 627, 40);
		contentPane.add(JuniorHighLabel1);
		
		JLabel JuniorHighLabel2 = new JLabel("272 Sta, Teresita Street, Sampaloc, Manila\r");
		JuniorHighLabel2.setVerticalAlignment(SwingConstants.TOP);
		JuniorHighLabel2.setForeground(Color.LIGHT_GRAY);
		JuniorHighLabel2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		JuniorHighLabel2.setBounds(303, 280, 627, 40);
		contentPane.add(JuniorHighLabel2);
		
		JLabel SeniorHighLabel1 = new JLabel("Mary Chiles College (2020 - 2022)");
		SeniorHighLabel1.setVerticalAlignment(SwingConstants.TOP);
		SeniorHighLabel1.setForeground(Color.LIGHT_GRAY);
		SeniorHighLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		SeniorHighLabel1.setBounds(303, 352, 627, 40);
		contentPane.add(SeniorHighLabel1);
		
		JLabel SeniorHighLabel2 = new JLabel("667 Dalupan St, Sampaloc, Manila, 1008 Metro Manila\r");
		SeniorHighLabel2.setVerticalAlignment(SwingConstants.TOP);
		SeniorHighLabel2.setForeground(Color.LIGHT_GRAY);
		SeniorHighLabel2.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		SeniorHighLabel2.setBounds(303, 386, 627, 40);
		contentPane.add(SeniorHighLabel2);
		
		JButton EducationalBackgroundBackbtn = new JButton("Back");
		EducationalBackgroundBackbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		EducationalBackgroundBackbtn.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\Backbutton.png"));
		EducationalBackgroundBackbtn.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		EducationalBackgroundBackbtn.setBackground(new Color(255, 192, 203));
		EducationalBackgroundBackbtn.setBounds(965, 530, 148, 36);
		contentPane.add(EducationalBackgroundBackbtn);
		
		JLabel GradeSchool = new JLabel("Grade School:");
		GradeSchool.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		GradeSchool.setHorizontalTextPosition(SwingConstants.CENTER);
		GradeSchool.setHorizontalAlignment(SwingConstants.CENTER);
		GradeSchool.setForeground(Color.LIGHT_GRAY);
		GradeSchool.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		GradeSchool.setBounds(62, 125, 189, 36);
		contentPane.add(GradeSchool);
		
		JLabel JuniorHighSchool = new JLabel("Junior High School:");
		JuniorHighSchool.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		JuniorHighSchool.setHorizontalTextPosition(SwingConstants.CENTER);
		JuniorHighSchool.setHorizontalAlignment(SwingConstants.CENTER);
		JuniorHighSchool.setForeground(Color.LIGHT_GRAY);
		JuniorHighSchool.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		JuniorHighSchool.setBounds(62, 241, 227, 36);
		contentPane.add(JuniorHighSchool);
		
		JLabel SeniorHigh = new JLabel("Senior High School:");
		SeniorHigh.setIcon(new ImageIcon("D:\\Alfred\\Code\\Blackbg.png"));
		SeniorHigh.setHorizontalTextPosition(SwingConstants.CENTER);
		SeniorHigh.setHorizontalAlignment(SwingConstants.CENTER);
		SeniorHigh.setForeground(Color.LIGHT_GRAY);
		SeniorHigh.setFont(new Font("Segoe UI Black", Font.BOLD, 21));
		SeniorHigh.setBounds(62, 352, 227, 36);
		contentPane.add(SeniorHigh);
		
		JLabel EducationalBackgroundTab = new JLabel("Educational Background");
		EducationalBackgroundTab.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\blackblack.png"));
		EducationalBackgroundTab.setHorizontalTextPosition(SwingConstants.CENTER);
		EducationalBackgroundTab.setHorizontalAlignment(SwingConstants.CENTER);
		EducationalBackgroundTab.setForeground(Color.LIGHT_GRAY);
		EducationalBackgroundTab.setFont(new Font("Segoe UI Black", Font.BOLD, 34));
		EducationalBackgroundTab.setBounds(38, 48, 1051, 53);
		contentPane.add(EducationalBackgroundTab);
		EducationalBackgroundBackbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // dispose the frame
	}
		});
	}

}
