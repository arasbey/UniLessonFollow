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
 * @author Calisma
 */
public class FindDayname {
public void showDayname() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar(2013, 1, 28, 13, 24, 56);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case (1): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Pazartesi !");
            }
            ;
            break;
            case (2): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Sali !");
            }
            ;
            break;
            case (3): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Carsamba !");
            }
            ;
            break;
            case (4): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Perşembe !");
            }
            ;
            break;
            case (5): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Cuma !");
            }
            ;
            break;
            case (6): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Cumartesi!");
            }
            ;
            break;
            case (7): {
                JOptionPane.showMessageDialog(null, "Hatirlatma : Bugün Pazar !");
            }
            ;
            break;

}}

}
