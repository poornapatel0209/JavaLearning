package homework;

public class LabWork {

    double scanner;
    String computer;

    //sentence

    int no_table;
    char m;
    //medicine
    long result;

    public static void main(String[] args) {

        LabWork obj1 = new LabWork();

        obj1.scanner = 3.2;
        obj1.computer = "Microsoft Office";
        obj1.no_table = 6;
        obj1.m = 'C';
        obj1.result = 123456;

        System.out.println("Scanner model number is :" + obj1.scanner);
        System.out.println("Computer needs to install " + obj1.computer);
        System.out.println("there are total :" + obj1.no_table + "available");
        System.out.println("vitamin tablets available name is :" + obj1.m);
        System.out.println("result in code is :" + obj1.result);
    }
}
