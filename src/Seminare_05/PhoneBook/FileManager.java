package Seminare_05.PhoneBook;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;

import static Seminare_05.PhoneBook.Log.LOGGER;


public class FileManager {
    String FILE_PATH = "src/Seminare_05/PhoneBook";
    String FILE_NAME_EXPORT = "export.csv";
    String FILE_FULL_NAME = FILE_PATH + FILE_NAME_EXPORT;

    public void exportFile(ArrayList<PhoneBook> title){
        LOGGER.log(Level.INFO,"Start Export files");
        try(FileWriter writer = new FileWriter(FILE_PATH + FILE_NAME_EXPORT, false))
        {
            for (PhoneBook i : title) {
                // запись всей строки
                String text = i.getName() + ";" + i.getPhone() + ";" + i.getCity();
                writer.write(text);
                // запись по символам
                writer.append('\n');
//                writer.append('E');

            writer.flush();
            }
        }
        catch(IOException ex){
            LOGGER.log(Level.WARNING,"Exception export file");
            System.out.println(ex.getMessage());
        }
        LOGGER.log(Level.INFO,"Finish Export files");
    }

    public void importFile(ArrayList<PhoneBook> pb){
        LOGGER.log(Level.INFO,"Start Import files");
        try {
            File file = new File(FILE_FULL_NAME);
//создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
//создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
// считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {

                String [] temp = line.split(";");
                pb.add(new PhoneBook(temp[0],temp[1],temp[2]));
//                System.out.println(line);

// считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }
        LOGGER.log(Level.INFO,"Finish Import files");
    }
}
