/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Principal;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.skin.NebulaSkin;
import org.jvnet.substance.skin.SubstanceNebulaLookAndFeel;

/**
 *
 * @author angelica.arroyavem
 */
public class ControladorStart {
    
    public static void main(String args[]) {
//        
//        JFrame.setDefaultLookAndFeelDecorated(true);
//		SubstanceLookAndFeel.setSkin(new NebulaSkin());
//		SubstanceLookAndFeel.setSkin("org.pushingpixels.substance.api.skin.SubstanceNebulaLookAndFeel");
//		try {			
//			UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
//		} catch (UnsupportedLookAndFeelException e) {
//				e.printStackTrace();
//		}	
        Principal pi = new Principal();
        pi.setVisible(true);
    }
}
