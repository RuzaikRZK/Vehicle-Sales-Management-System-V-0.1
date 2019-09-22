package sad_viva;

//import java.io.IOException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Irosh Ranasinghe
 */
public class Backup {

    boolean status;

    static String exe = "";
    static String source = "D:\\Backup\\db";
    String path = "";

    public boolean Backup() {
        status = false;
        try {
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            path = source.replace('\\', '/');
            path += "_" + date + ".sql";
            Process p = null;

            String username = "root";
            String password = "123";
            String database = "sad_viva";
            int complete;

            path = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysqldump.exe " + "-u" + username + " -p" + password + " --add-drop-database -B " + database + " -r " + path;

            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec(path);
            complete = p.waitFor();
            if (complete == 0) {
                status = true;
                JOptionPane.showMessageDialog(null, "Backup Created", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = false;
                JOptionPane.showMessageDialog(null, "Could not be Create the Backup ", "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return status;

    }
    boolean restore;

    public boolean Restore(JTextField jTextField1) throws IOException, InterruptedException {
        restore = false;
        String database = "sad_viva";//database name
        String username = "root";//username of mysql
        String password = "123";//password of myql
        String filepath = jTextField1.getText();
        int complete;// this variable for verify the process

        String[] executeCmd = new String[]{"mysql", "--user=" + username, "--password=" + password, "-e", " source " + filepath};
        //sava the command in a array
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);// execute the command

        complete = runtimeProcess.waitFor();// get the result to variable

        if (complete == 0) {// if return value equal to 1 then failed the process
            restore = true;
            JOptionPane.showMessageDialog(null, "Restore Completed", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            restore = false;
            JOptionPane.showMessageDialog(null, "Failed", "Error", JOptionPane.ERROR_MESSAGE);

        }

        return restore;

    }
    int x;

    public void GetLatestBackup() {
        try {
            String path = "";

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
