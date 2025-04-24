package Loggers;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {
    private String filePath;

    public FileLogger(int level, String filePath) {
        this.level = level;
        this.filePath = filePath;
    }

    @Override
    protected void write(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("File: " + message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
