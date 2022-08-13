package M4_GameCouples.M4_GameCouples;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JToggleButton;

public class EventManager implements ActionListener{
	
	GameInterface gi;
	Random r = new Random();
	int[] keys = {1,2,3,4,5,6,7,8,
			1,2,3,4,5,6,7,8};
	int[]colorKey = new int[16];

	/**
	 * @param gi
	 */
	public EventManager(GameInterface gi) {
        //INITIALICE OBJECT
		this.gi = gi;
	}
	
	public int[] colorPositioner(){
        for (int i=0; i<keys.length; i++) {
            int posAleatoria = r.nextInt(keys.length);
            int temp = keys[i];
            keys[i] = keys[posAleatoria];
            keys[posAleatoria] = temp;
        }
        //System.out.println(Arrays.toString(keys));
		this.colorKey = keys;
		System.out.println(colorKey[1]);
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
		if(e.getActionCommand() == "RESTART") {
			colorSwitcher(gi.tg1, colorPositioner()[0]);
			colorSwitcher(gi.tg2, colorPositioner()[1]);
			colorSwitcher(gi.tg3, colorPositioner()[2]);
			colorSwitcher(gi.tg4, colorPositioner()[3]);
			colorSwitcher(gi.tg5, colorPositioner()[4]);
			colorSwitcher(gi.tg6, colorPositioner()[5]);
			colorSwitcher(gi.tg7, colorPositioner()[6]);
			colorSwitcher(gi.tg8, colorPositioner()[7]);
			colorSwitcher(gi.tg9, colorPositioner()[8]);
			colorSwitcher(gi.tg10, colorPositioner()[9]);
			colorSwitcher(gi.tg11, colorPositioner()[10]);
			colorSwitcher(gi.tg12, colorPositioner()[11]);
			colorSwitcher(gi.tg13, colorPositioner()[12]);
			colorSwitcher(gi.tg14, colorPositioner()[13]);
			colorSwitcher(gi.tg15, colorPositioner()[14]);
			colorSwitcher(gi.tg16, colorPositioner()[15]);
	
		}
		
	}
	
	
	
	

}
