package notePad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Event extends Controller {
    private BufferedReader reader = null;
    private String fileName = null;
    private List<String> fileContains = null;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getFileContains() {
        if(fileContains == null) {
            return fileContains = new ArrayList<>();
        }
        return fileContains;
    }

    public void eventMain() {
        try{
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(getFileName())));
        } catch(FileNotFoundException e) {
            AlertBox.alert();
        }

        fileContains = getFileContains();

        try {
            String line = null;
            while ((line = reader.readLine()) != null) {
                fileContains.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

           // for (String mass : fileContains) System.out.println(mass);

    }
}
