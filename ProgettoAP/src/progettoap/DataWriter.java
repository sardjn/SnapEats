package progettoap;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class DataWriter {
    private String fileName;

    public DataWriter(String fileName) {
        this.fileName = fileName;
    }

    public void writeIntToFile(int value) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));
        dataOut.writeInt(value);
        dataOut.close();
    }
}
