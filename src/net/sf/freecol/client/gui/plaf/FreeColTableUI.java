package net.sf.freecol.client.gui.plaf;

import         javax.swing.plaf.metal.MetalButtonUI;
import         javax.swing.plaf.basic.*;
import         javax.swing.plaf.*;
import         javax.swing.*;
import         java.awt.*;

import java.io.File;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.ImageIcon;


public class FreeColTableUI extends BasicTableUI {


    public static ComponentUI createUI(JComponent c) {
        return new FreeColTableUI();
    }

    
    public void installUI(JComponent c) {
        super.installUI(c);
        
        c.setOpaque(false);
    }
}
