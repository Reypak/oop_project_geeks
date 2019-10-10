package org.iuea.oop;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.iuea.oop.view.LoginView;

public class Main {

	public static void main(String[] args) {
	
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            UIDefaults defaults = UIManager.getLookAndFeelDefaults();
		            defaults.put("Table.gridColor", new Color (214,217,223));
		            defaults.put("Table.disabled", false);
		            defaults.put("Table.showGrid", true);
		            defaults.put("Table.intercellSpacing", new Dimension(1, 1));
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		


		LoginView window = new LoginView();
		
		
	}
}
