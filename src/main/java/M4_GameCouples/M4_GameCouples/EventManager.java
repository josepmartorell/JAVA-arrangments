package M4_GameCouples.M4_GameCouples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JToggleButton;

public class EventManager implements ActionListener{
	
	GameInterface gi;
	Integer[]random = new Integer[16];

	/**
	 * @param gi
	 */
	public EventManager(GameInterface gi) {
        //INITIALICE OBJECT
		this.gi = gi;
	}
	
	public Integer[] colorPositioner(){
        Random r = new Random();
        Integer[] colorKey = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};

        for (int i=0; i<colorKey.length; i++) {
            int posAleatoria = r.nextInt(colorKey.length);
            int temp = colorKey[i];
            colorKey[i] = colorKey[posAleatoria];
            colorKey[posAleatoria] = temp;
        }
 
        return colorKey;
	}
	
	public void colorSwitcher(JToggleButton tg, int key) {
		
		switch (key) {
		case 1:
			tg.setBackground(Color.MAGENTA);
			break;
		case 2:
			tg.setBackground(Color.WHITE);
			break;
		case 3:
			tg.setBackground(Color.BLUE);
			break;
		case 4:
			tg.setBackground(Color.BLACK);
			break;
		case 5:
			tg.setBackground(Color.ORANGE);
			break;
		case 6:
			tg.setBackground(Color.RED);
			break;
		case 7:
			tg.setBackground(Color.CYAN);
			break;
		case 8:
			tg.setBackground(Color.YELLOW);
			break;
		default:
			break;
		}
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		random = colorPositioner();
		if(e.getActionCommand() == "RESTART") {
			colorSwitcher(gi.tg1, random[0]);
			colorSwitcher(gi.tg2, random[1]);
			colorSwitcher(gi.tg3, random[2]);
			colorSwitcher(gi.tg4, random[3]);
			colorSwitcher(gi.tg5, random[4]);
			colorSwitcher(gi.tg6, random[5]);
			colorSwitcher(gi.tg7, random[6]);
			colorSwitcher(gi.tg8, random[7]);
			colorSwitcher(gi.tg9, random[8]);
			colorSwitcher(gi.tg10, random[9]);
			colorSwitcher(gi.tg11, random[10]);
			colorSwitcher(gi.tg12, random[11]);
			colorSwitcher(gi.tg13, random[12]);
			colorSwitcher(gi.tg14, random[13]);
			colorSwitcher(gi.tg15, random[14]);
			colorSwitcher(gi.tg16, random[15]);
	
		}
		
	}
	
	
	
	

}
