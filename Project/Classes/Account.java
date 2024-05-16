package Classes;
import java.io.*;
import java.util.Scanner;

public class Account {

    private String userPass;
    private String user;
	

    private File file;
    private FileWriter fwrite;
    private Scanner sc;

    public Account() {
    }

    public Account(String user, String userPass) {
        this.user = user;
        this.userPass = userPass;
		
    }

    public void addAccount() {
        try {
            file = new File("./Datas/reg.txt");
            file.createNewFile();

            fwrite = new FileWriter(file, true);
            fwrite.write(user + "\t" + userPass + "\n");

            fwrite.flush();
            fwrite.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public boolean checkAccount(String username, String userpass) {
        boolean flag = false;
        file = new File( "./Datas/reg.txt");
        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(username) && value[1].equals(userpass)) {
                    flag = true;
                    break; 
                }
            }
            sc.close(); 
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return flag;
    }
}
