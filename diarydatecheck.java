/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_viva;


import java.awt.Toolkit;
import java.io.InputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.java.balloontip.styles.ToolTipBalloonStyle;


/**
 *
 * @author Inspiron 15
 */
public class diarydatecheck {
    

    public diarydatecheck() {
        String t = new SimpleDateFormat("MMM dd, yyyy").format(new Date());
       
        String d;
        try {
            ResultSet data = Jdbc.getData("select * from diary");
            while (data.next()) {
                
                d = data.getString(3);
                if (t.equals(d)) {
                    
                    JOptionPane.showMessageDialog(null, data.getString(2), t+("  Diary Events Alert"),2);
                    
                    
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
