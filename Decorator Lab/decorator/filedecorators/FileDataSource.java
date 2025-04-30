package decorator.filedecorators;

import java.io.*;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(data.getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(filename);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return new String(buffer);
    }
}
