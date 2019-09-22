/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_viva;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.Timer;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;

/**
 *
 * @author Inspiron 15
 */
public class BTip {

    public static void viewToolTip(JComponent ballonComponent, String txt) {
        BalloonTipStyle style = new MinimalBalloonStyle(Color.YELLOW.brighter(), 10);
        JLabel include = new JLabel(txt, 0);
        final BalloonTip tip = new BalloonTip(ballonComponent,
                include,
                style,
                BalloonTip.Orientation.LEFT_ABOVE,
                BalloonTip.AttachLocation.NORTH,
                20, 10,
                false);
        tip.setOpacity(0.0F);
        FadingUtils.fadeInBalloon(tip, null, 5000, 40);
        new Timer(100, new ActionListener() {
            int sec = 6;

            @Override
            public void actionPerformed(ActionEvent e) {
                --sec;
                if (sec == 0) {
                    FadingUtils.fadeOutBalloon(tip, null, 5000, 40);
                }
            }
        }).start();
    }
}
