import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MainClass extends SubClass {

//    MainClass(String strShape) {
//        super(strShape);
//    }

    public static void main(String[] args) throws IOException {

//        int a[] = new int[10];
//        int[][] b = {{10,12},{22,25},{100,125}};
//
//        for (int i = 0; i < b.length; i++) {
//            for(int j = 0; j < b[i].length ; j++) {
//                System.out.println("Current value is: " + b[i][j]);
//            }
//        }
//
//        int k = 0;
//        while(k < b.length) {
//            int l = 0;
//            while (l < b[k].length) {
//                System.out.println("Multiplication: " + b[k][l] * 10);
//                l++;
//            }
//            k++;
//        }
//
//        String strTest = "This is a test string. Should be deleted";
//        System.out.println(strTest);
//        System.out.println(strTest.replace("Should", "Must"));
//
//        if (strTest.equalsIgnoreCase("this is a test string. should be deleted")) {
//            System.out.println(strTest + ": Passed");
//        }
//
//        if (strTest.contains("test")) {
//            System.out.println(strTest + ": Nothing");
//        } else {
//            System.out.println("Nothing passed");
//        }

        String shape = "Square";

        SubClass obj = new SubClass(shape);

        String path = "C:\\Users\\TOPS\\workspace\\java-basica";
        String fileName = "TestBase.txt";
        System.out.println("Area of Circle is: " + obj.calcArea(15, shape));
        System.out.println("Area of Rectangle is: " + obj.calcArea(15, 25));
        SubClass fOut = new SubClass();
//        fOut.fileHandling();
        SubClass.addValues("12093", 102381);
        List<String> newList = getStringList();
//        System.out.println("List is: \n" + newList);

//        for (int i = 0 ; i < newList.size() ; i++) {
//            System.out.println(newList.get(i));
//        }

//        System.out.println("\n\n" + newList.get(8) + "\n\n");
//        newList.remove(8);
//        System.out.println(newList.size());
//        System.out.println(newList.get(8));
        System.out.println(newList.indexOf("Property of Index: 1 = 15"));
    }
}
