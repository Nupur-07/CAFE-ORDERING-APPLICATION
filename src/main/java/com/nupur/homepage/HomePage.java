package com.nupur.homepage;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

/**
 *
 * @author ACER
 */
public class HomePage {

    public static void main(String[] args) {
        FlatMacLightLaf.registerCustomDefaultsSource("style");
        FlatMacLightLaf.setup();
        
        DesignLoginPage login = new DesignLoginPage();
        login.setVisible(true);
        
//        DesignHomepage home = new DesignHomepage();
//        home.setVisible(false);
        
    }
}
