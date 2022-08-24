package M4_GameCouples.M4_GameCouples;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class GameInterface extends JFrame {

	private EventManager em = new EventManager(this);
	private JPanel contentPane;
	public JToggleButton tg1;
	public JToggleButton tg2;
	public JToggleButton tg3;
	public JToggleButton tg4;
	public JToggleButton tg5;
	public JToggleButton tg6;
	public JToggleButton tg7;
	public JToggleButton tg8;
	public JToggleButton tg9;
	public JToggleButton tg10;
	public JToggleButton tg11;
	public JToggleButton tg12;
	public JToggleButton tg13;
	public JToggleButton tg14;
	public JToggleButton tg15;
	public JToggleButton tg16;

	/**
	 * Create the frame.
	 */
	public GameInterface() {
		setTitle("GAME COUPLES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 552);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 645, 589);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tg1 = new JToggleButton("");
		tg1.setBackground(Color.MAGENTA);
		tg1.setBounds(10, 10, 100, 100);
		tg1.setSelected(true);
		tg1.addActionListener(em);
		panel.add(tg1);
		
		tg2 = new JToggleButton("");
		tg2.setBackground(Color.WHITE);
		tg2.setBounds(120, 10, 100, 100);
		tg2.setSelected(true);
		tg2.addActionListener(em);
		panel.add(tg2);
		
		tg3 = new JToggleButton("");
		tg3.setBackground(Color.BLUE);
		tg3.setBounds(230, 10, 100, 100);
		tg3.setSelected(true);
		tg3.addActionListener(em);
		panel.add(tg3);
		
		tg4 = new JToggleButton("");
		tg4.setBackground(Color.BLACK);
		tg4.setBounds(340, 10, 100, 100);
		tg4.setSelected(true);
		tg4.addActionListener(em);
		panel.add(tg4);
		
		tg5 = new JToggleButton("");
		tg5.setBackground(Color.ORANGE);
		tg5.setBounds(10, 120, 100, 100);
		tg5.setSelected(true);
		tg5.addActionListener(em);
		panel.add(tg5);
		
		tg6 = new JToggleButton("");
		tg6.setBackground(Color.RED);
		tg6.setBounds(120, 120, 100, 100);
		tg6.setSelected(true);
		tg6.addActionListener(em);
		panel.add(tg6);
		
		tg7 = new JToggleButton("");
		tg7.setBackground(Color.CYAN);
		tg7.setBounds(230, 120, 100, 100);
		tg7.setSelected(true);
		tg7.addActionListener(em);
		panel.add(tg7);
		
		tg8 = new JToggleButton("");
		tg8.setBackground(Color.YELLOW);
		tg8.setBounds(340, 120, 100, 100);
		tg8.setSelected(true);
		tg8.addActionListener(em);
		panel.add(tg8);
		
		tg9 = new JToggleButton("");
		tg9.setBackground(Color.MAGENTA);
		tg9.setBounds(10, 230, 100, 100);
		tg9.setSelected(true);
		tg9.addActionListener(em);
		panel.add(tg9);
		
		tg10 = new JToggleButton("");
		tg10.setBackground(Color.WHITE);
		tg10.setBounds(120, 230, 100, 100);
		tg10.setSelected(true);
		tg10.addActionListener(em);
		panel.add(tg10);
		
		tg11 = new JToggleButton("");
		tg11.setBackground(Color.BLUE);
		tg11.setBounds(230, 230, 100, 100);
		tg11.setSelected(true);
		tg11.addActionListener(em);
		panel.add(tg11);
		
		tg12 = new JToggleButton("");
		tg12.setBackground(Color.BLACK);
		tg12.setBounds(340, 230, 100, 100);
		tg12.setSelected(true);
		tg12.addActionListener(em);
		panel.add(tg12);
		
		tg13 = new JToggleButton("");
		tg13.setBackground(Color.ORANGE);
		tg13.setBounds(10, 340, 100, 100);
		tg13.setSelected(true);
		tg13.addActionListener(em);
		panel.add(tg13);
		
		tg14 = new JToggleButton("");
		tg14.setBackground(Color.RED);
		tg14.setBounds(120, 340, 100, 100);
		tg14.setSelected(true);
		tg14.addActionListener(em);
		panel.add(tg14);
		
		tg15 = new JToggleButton("");
		tg15.setBackground(Color.CYAN);
		tg15.setBounds(230, 340, 100, 100);
		tg15.setSelected(true);
		tg15.addActionListener(em);
		panel.add(tg15);
		
		tg16 = new JToggleButton("");
		tg16.setBackground(Color.YELLOW);
		tg16.setBounds(340, 340, 100, 100);
		tg16.setSelected(true);
		tg16.addActionListener(em);
		panel.add(tg16);
		
		JButton btnRestart = new JButton("RESTART");
		btnRestart.setBounds(120, 462, 210, 21);
		btnRestart.addActionListener(em);
		panel.add(btnRestart);
	}
}
