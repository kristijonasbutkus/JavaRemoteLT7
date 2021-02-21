package advanced.input_output.file_read.scanner_reader;

import advanced.input_output.InputOutputUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderExample {

    //private static final String DATA_FILE_LOCATION = "E:\\Java stuff\\src\\advanced\\input_output\\Data.txt";
    //failas perkeltas i advanced.input_output.InputOutputUtils.java

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File(InputOutputUtils.DATA_FILE_LOCATION))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException exception) {
            System.out.println("Blogas failo formatas arba failas nerastas");
            System.out.println(exception.getMessage());
        }
    }
}
