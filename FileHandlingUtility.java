import java.io.*;

public class FileHandlingUtility {

    public static void writeFile(String fileName, String content) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write(content);
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modifyFile(String fileName, String newContent) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(newContent);
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String fileName = "sample.txt";

        writeFile(fileName, "Hello, this is a File Handling Utility in Java.\n");
        readFile(fileName);
        modifyFile(fileName, "This line is appended to the file.\n");
        readFile(fileName);
    }
}
