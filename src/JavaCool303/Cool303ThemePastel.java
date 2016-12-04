package JavaCool303;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;

public class Cool303ThemePastel extends Cool303Theme {
	
	public Cool303ThemePastel(){
		buttonTextColor = new Color(100,100,100);
		buttonBackground = new Color(255,255,255);
		buttonFont = new Font("Courier New", Font.ITALIC, 12);
		buttonIcon = new ImageIcon("/home/emol/cs/Practice/Cool303/icon/icon2.png");
		buttonSelectedIcon = new ImageIcon("/home/emol/cs/Practice/Cool303/icon/icon3.png");
		buttonDimension = new Dimension(30,buttonIcon.getIconHeight());
		buttonIsToolTipText = true;
		
		containerLayout = new GridLayout(4,5);

		

		
	}
}