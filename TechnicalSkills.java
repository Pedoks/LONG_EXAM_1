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

public class TechnicalSkills extends MyPortfolio {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TechnicalSkills frame = new TechnicalSkills();
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
	public TechnicalSkills() {
		setTitle("Technical Skills");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1181, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TechnicalSkillsLabel1 = new JLabel("❖ Install Windows operating systems such as Windows 7,8,10 and\r\nserver 200 R2");
		TechnicalSkillsLabel1.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel1.setBounds(65, 136, 1051, 36);
		contentPane.add(TechnicalSkillsLabel1);
		
		JLabel TechnicalSkillsLabel2 = new JLabel("❖ Install and configure device drivers using Driver pack and manual\r\ndriver.");
		TechnicalSkillsLabel2.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel2.setBounds(65, 168, 1051, 36);
		contentPane.add(TechnicalSkillsLabel2);
		
		JLabel TechnicalSkillsLabel3 = new JLabel("❖ Terminate and connect UTP cable using T568A, T568B and\r\ncrossover");
		TechnicalSkillsLabel3.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel3.setBounds(65, 198, 1051, 36);
		contentPane.add(TechnicalSkillsLabel3);
		
		JLabel TechnicalSkillsLabel4 = new JLabel("❖ Set up and configure network services in Windows Server\r\n2008 R2.");
		TechnicalSkillsLabel4.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel4.setBounds(65, 227, 1051, 36);
		contentPane.add(TechnicalSkillsLabel4);
		
		JLabel TechnicalSkillsLabel5 = new JLabel("❖ Install an operating system using Optical Disc Drive and flash\r\ndrive");
		TechnicalSkillsLabel5.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel5.setBounds(65, 256, 1051, 36);
		contentPane.add(TechnicalSkillsLabel5);
		
		JLabel TechnicalSkillsLabel6 = new JLabel("❖ Set up and configure network services in Windows Server 2008\r\nR2.");
		TechnicalSkillsLabel6.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel6.setBounds(65, 286, 1051, 36);
		contentPane.add(TechnicalSkillsLabel6);
		
		JLabel TechnicalSkillsLabel7 = new JLabel("❖ Set up router/ Wi-Fi/ WAP configuration\r");
		TechnicalSkillsLabel7.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel7.setBounds(65, 316, 1051, 36);
		contentPane.add(TechnicalSkillsLabel7);
		
		JLabel TechnicalSkillsLabel8 = new JLabel("❖ Set up user access in Windows Server 2008 R2.");
		TechnicalSkillsLabel8.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel8.setBounds(65, 345, 1051, 36);
		contentPane.add(TechnicalSkillsLabel8);
		
		JLabel TechnicalSkillsLabel9 = new JLabel("❖ Plan and prepare for maintenance and repair");
		TechnicalSkillsLabel9.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel9.setBounds(65, 375, 1051, 36);
		contentPane.add(TechnicalSkillsLabel9);
		
		JLabel TechnicalSkillsLabel10 = new JLabel("❖ Set up and configure Local Area Network, Wide Area Network and Wireless Area Network. ");
		TechnicalSkillsLabel10.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel10.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel10.setBounds(65, 403, 1051, 36);
		contentPane.add(TechnicalSkillsLabel10);
		
		JLabel TechnicalSkillsLabel11 = new JLabel("❖ Knowledgeable in developing creative Personal blog and\r\nwebsite using wix, Jimdo and Wordpress");
		TechnicalSkillsLabel11.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel11.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel11.setBounds(65, 431, 1051, 36);
		contentPane.add(TechnicalSkillsLabel11);
		
		JLabel TechnicalSkillsLabel12 = new JLabel("❖ Knowledgeable in MS office such as MS word, MS excel\r\nand MS PowerPoint.");
		TechnicalSkillsLabel12.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel12.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel12.setBounds(65, 459, 1051, 36);
		contentPane.add(TechnicalSkillsLabel12);
		
		JLabel TechnicalSkillsLabel13 = new JLabel("❖ Create a bootable device using cmd and rufus.");
		TechnicalSkillsLabel13.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsLabel13.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		TechnicalSkillsLabel13.setBounds(65, 489, 1051, 36);
		contentPane.add(TechnicalSkillsLabel13);
		
		JButton TechnicalSkillsbackbtn = new JButton("Back");
		TechnicalSkillsbackbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		TechnicalSkillsbackbtn.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\Backbutton.png"));
		TechnicalSkillsbackbtn.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		TechnicalSkillsbackbtn.setBackground(new Color(255, 192, 203));
		TechnicalSkillsbackbtn.setBounds(968, 535, 148, 36);
		contentPane.add(TechnicalSkillsbackbtn);
		
		JLabel TechnicalSkillsTab = new JLabel("Technical Skills");
		TechnicalSkillsTab.setIcon(new ImageIcon("C:\\Users\\Beth\\Downloads\\blackblack.png"));
		TechnicalSkillsTab.setHorizontalTextPosition(SwingConstants.CENTER);
		TechnicalSkillsTab.setHorizontalAlignment(SwingConstants.CENTER);
		TechnicalSkillsTab.setForeground(Color.LIGHT_GRAY);
		TechnicalSkillsTab.setFont(new Font("Segoe UI Black", Font.BOLD, 34));
		TechnicalSkillsTab.setBounds(49, 53, 1051, 53);
		contentPane.add(TechnicalSkillsTab);
		TechnicalSkillsbackbtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose(); // dispose the frame
	}
		});
	}

}
