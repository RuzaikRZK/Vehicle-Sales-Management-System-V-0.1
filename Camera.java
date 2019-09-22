package sad_viva;


import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.ds.buildin.natives.OpenIMAJGrabber;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruzaik Mohomed
 */
public class Camera {
     public  static void Cam(){
        try {
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss a");
            String s=ft.format(dNow);

        
            

            Webcam webcam = Webcam.getDefault();
            webcam.open();

            BufferedImage image = webcam.getImage();

            String d ="D:\\Loging capthure\\";
           
           ImageIO.write(image, "png",new File(d+s));
            
           
            webcam.getLock();
            webcam.close();
            
            

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
}
