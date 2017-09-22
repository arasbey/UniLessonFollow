/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dersprogramı;

import java.io.File;
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

        
        NewJFrame frmana = new NewJFrame();
        frmana.setLocationRelativeTo(null);
        frmana.show();
        FindDayname fnd = new FindDayname();
        fnd.showDayname();
    }

}
