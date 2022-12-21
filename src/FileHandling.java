import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static String returnFileContents(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        String fileData = stringBuilder.toString();
        return fileData;
    }
    public static int countFrequency(String string, String searchWord){
        int frequencyOfSearchWord = 0;
        int lastIndex = 0;
        while (lastIndex != -1) {

            lastIndex = string.indexOf(searchWord, lastIndex);

            if (lastIndex != -1) {
                frequencyOfSearchWord++;
                lastIndex += searchWord.length();
            }
        }
        return frequencyOfSearchWord;
    }
    public static void main(String[] args) throws IOException {
        final String BASE_PATH = "src/"; //Please change it accordingly
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name :");
        String fileName = BASE_PATH + scanner.nextLine();
        System.out.println("Enter word to search :");
        String searchWord = scanner.nextLine();
        String fileData = returnFileContents(fileName);
        int count = countFrequency(fileData, searchWord);
        System.out.println(searchWord+" appears "+count+" times in the file");
    }
}
