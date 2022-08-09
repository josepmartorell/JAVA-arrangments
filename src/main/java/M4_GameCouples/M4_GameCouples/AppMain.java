package M4_GameCouples.M4_GameCouples;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class AppMain 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameInterface frame = new GameInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
