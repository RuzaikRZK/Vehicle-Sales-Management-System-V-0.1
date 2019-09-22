/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_viva;

import com.sun.crypto.provider.HmacMD5;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Inspiron 15
 */
public class timer {
       
     
        
        
    public void startt() {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                new diarydatecheck();
            }
        }, 50);
    }

}
