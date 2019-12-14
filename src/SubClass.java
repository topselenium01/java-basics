import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubClass {
    private static float area;
    private static String shape;

    SubClass() {
    }

    SubClass(String strShape) {
        shape = strShape;
    }

    public float calcArea(int r, String strShape) {
        float area = 0;
        if (strShape.equals("Square")) {
            area = r*r;
        } else if (strShape.equals("Circle")) {
            area = (float) (3.14 * r * r);
        }
        return area;
    }

    protected float calcArea(int l, int b) {
        float area = 0;
        area = l * b;
        return area;
    }

    public void fileHandling(String path, String fileName) {
        String strPath = path + "\\" + fileName;
        try {
            FileOutputStream file = new FileOutputStream(strPath);
            String strText = "\nI returned from the City about three o'clock on that \n" +
                    "May afternoon pretty well disgusted with life. \n" +
                    "I had been three months in the Old Country, and was \n" +
                    "fed up with it. \n" +
                    "If anyone had told me a year ago that I would have \n" +
                    "been feeling like that I should have laughed at him; \n" +
                    "but there was the fact. \n" +
                    "The weather made me liverish, \n" +
                    "the talk of the ordinary Englishman made me sick, \n" +
                    "I couldn't get enough exercise, and the amusements \n" +
                    "of London seemed as flat as soda-water that \n" +
                    "has been standing in the sun. \n" +
                    "'Richard Hannay,' I kept telling myself, 'you \n" +
                    "have got into the wrong ditch, my friend, and \n" +
                    "you had better climb out.";

            for (int i = 0; i < strText.length(); i++) {
                file.write(strText.charAt(i));
            }

            System.out.println(strText.codePointAt(5));
            System.out.println("File writing is successful.\n");

            String line = null;
            FileReader fRead = new FileReader(strPath);
            BufferedReader buff = new BufferedReader(fRead);

            while((line = buff.readLine()) != null) {
                System.out.println(line);
            }
            // Always close files.
            buff.close();
            file.close();

        } catch (IOException e) {
            System.out.println(e.hashCode());
            System.out.println("File not found at location: " + strPath);
        } catch (NullPointerException n) {
            System.out.println("No value in file at location: " + strPath);
        } finally {
            System.out.println("\n\nThis is going to run everytime!");
        }
    }

    public static List<String> getStringList() {
        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            outputList.add(i, "Property of Index: " + i + " = " + i*15);
        }

        return outputList;
    }

    public static void addValues (String val1, String val2) {
        String
    }

}
