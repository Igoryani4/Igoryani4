package Seminare_05.PhoneBook;
import java.io.FileInputStream;
import java.util.logging.*;
import java.util.Scanner;

import static Seminare_05.PhoneBook.Log.LOGGER;



public class Menu {
//    static Logger LOGGER;
//    static {
//        try(FileInputStream ins = new FileInputStream("src/Seminare_05/PhoneBook/log.config")){
//            LogManager.getLogManager().readConfiguration(ins);
//            LOGGER = Logger.getLogger(Log.class.getName());
//        }catch (Exception ignore){
//            ignore.printStackTrace();
//        }
//    }

    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        LOGGER.log(Level.INFO,"Start program ");
        AddressBook ab = new AddressBook();
        FileManager fm = new FileManager();

        while (true){
            LOGGER.log(Level.INFO,"Main menu");
            System.out.println("""
                    Main menu:\s
                    1. Show all contacts.             
                    2. Import contacts.
                    3. Export contacts.
                    4. Exit.               
                    Please input number\s""");
            int numMenu = sc.nextInt();
            if (numMenu == 1) {
                LOGGER.log(Level.INFO,"Input menu item  Show all contact");
                ab.AddresBook();
                ab.display();

            }
            if (numMenu == 2){
                LOGGER.log(Level.INFO,"Input menu item  import contact");
                fm.importFile(ab.pb);
                ab.display();

            }
            if (numMenu == 3){
                LOGGER.log(Level.INFO,"Input menu item  import contact");
                fm.importFile(ab.pb);
                ab.display();
            }
            if (numMenu == 4){
                LOGGER.log(Level.INFO,"Input menu item  exit");
                return;
            }
        }


    }
}
