package most;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import sun.applet.Main;

public class Helper {

    private final String TEXT_FIELD_SOURCE = "most.txt";

    //MARK: Array = [SEMAFOR, EAST, WEST]
    private final int[] array = {0,0,0};

    Helper() {
        array[0] = 0;
        array[1] = 0;
        array[2] = 0;
        writeFile();
    }

    private void readFile() {

        try (BufferedReader file = new BufferedReader(new FileReader(TEXT_FIELD_SOURCE))) {
            String line = file.readLine();

            int i = 0;
            while ((i < 3) && (line != null)) {
                try {
                    array[i] = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    System.out.println("Error with parse Int");
                }

                i++;
                line = file.readLine();
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found.");
            writeFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void writeFile() {
        System.out.println("call writeFile");

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            strBuilder.append(array[i]);
            strBuilder.append("\r\n");
        }

        try (FileOutputStream fileOut = new FileOutputStream(TEXT_FIELD_SOURCE)) {
            fileOut.write((strBuilder.toString()).getBytes());
            fileOut.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//MARK: setters
    public void setSemafor(int semafor) {
        array[0] = semafor;
        writeFile();
    }

    public void setEast(int delta) {
        array[1] += delta;
        writeFile();
    }

    public void setWest(int delta) {
        array[2] += delta;
        writeFile();
    }

//MARK: getters
    public int getSemafor(){
        readFile();
        return array[0];
    }

    public int getEast(){
        readFile();
        return array[1];
    }

    public int getWest(){
        readFile();
        return array[2];
    }

}
