package day27_Access_Modifier;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

    // public static ExcelSheet sheet; // will take mor ethan one step to set them
    // reading ecxell file, getting the sheet, and assigning the excel sheet


    static{ // static block!!!!
        a = 100;
        b = 2.4;
        c = "Java";

    }
}
