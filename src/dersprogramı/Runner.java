/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dersprogramı;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author aras
 */
public class Runner {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case (0): {
                JOptionPane.showMessageDialog(null, "Bugün Pazartesi");
            }
            ;
            break;
            case (1): {
                JOptionPane.showMessageDialog(null, "Bugün Sali");
            }
            ;
            break;
            case (2): {
                JOptionPane.showMessageDialog(null, "Bugün Carsamba");
            }
            ;
            break;
            case (3): {
                JOptionPane.showMessageDialog(null, "Bugün Perşembe");
            }
            ;
            break;
            case (4): {
                JOptionPane.showMessageDialog(null, "Bugün Cuma");
            }
            ;
            break;
            case (5): {
                JOptionPane.showMessageDialog(null, "Bugün Cumartesi");
            }
            ;
            break;
            case (6): {
                JOptionPane.showMessageDialog(null, "Bugün Pazar");
            }
            ;
            break;

        }
        NewJFrame frmana = new NewJFrame();
        frmana.setLocationRelativeTo(null);
        frmana.show();

    }

}
