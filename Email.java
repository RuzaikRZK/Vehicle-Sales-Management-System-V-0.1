package sad_viva;

import com.sun.mail.smtp.SMTPTransport;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message.RecipientType;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Naween
 */
public class Email {
    
    
       public static String e_mail_it(String email, String subject, String Message, String pat) throws javax.mail.MessagingException {

        try {
            
            String[] guy = {email};
            String fnm = pat;                              // attatching file path............
            String from ="ruzaikmohomad@gmail.com";
            String pass ="ziffinezigma@123";
            String host ="smtp.gmail.com";


            Properties prop = new Properties();
            prop = System.getProperties();
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.host", host);
            prop.put("mail.smtp.socketFactory.port", 587);
            prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            prop.put("mail.smtp.user", from);
            prop.put("mail.smtp.password", pass);
            prop.put("mail.smtp.port", 587);
            prop.put("mail.smtp.auth", "true");


            //System.out.println("fine ok");
            Session ses = Session.getDefaultInstance(prop, null);

            javax.mail.internet.MimeMessage mm = new MimeMessage(ses);

            mm.setFrom(new InternetAddress(from));

            //System.out.println("fine ok");

            InternetAddress[] ias = new InternetAddress[guy.length];

            for (int i = 0; i < guy.length; i++) {
                ias[i] = new InternetAddress(guy[i]);
            }
            //System.out.println("fine ok");

            for (int i = 0; i < ias.length; i++) {
                mm.addRecipients(RecipientType.TO, ias);
            }
            mm.setSubject(subject);
            mm.setContent("<img src=" + "<h1>" + Message + "</h1>", "text/html");


            MimeBodyPart mbp=new MimeBodyPart();


//            mbp.attachFile(fnm);
//            Multipart mp=new MimeMultipart();
//            mp.addBodyPart(mbp);
//
//            mm.setContent(mp);

          

            SMTPTransport tran = (SMTPTransport) ses.getTransport("smtp");


            tran.connect(host, 587, from, pass);
            tran.sendMessage(mm, mm.getAllRecipients());

            tran.close();

            
            
            return null;
            
    
       } catch (javax.mail.internet.AddressException ex) {
           
            
        
           
            return null;
        }}}
          
      
       
 
    
    

