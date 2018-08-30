/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import javax.swing.JOptionPane;
import multi.server.Home;

/**
 *
 * @author Asus A455L
 */

public class akses {

    public void check(String user,String pass) {
        if (user.equals("doscom") && pass.equals("opensource"))
        {
        new Home().setVisible(true);
        }
        else
        {
        JOptionPane.showMessageDialog(null,"User Or Password Salah","System",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
