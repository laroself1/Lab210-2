
public class Main {
    public static void main(String[] args) {
        MyTest test = null;
        try{
    test.test();
    }

catch (MyException e){e.printE();}
        finally {
            System.out.println("Finally block");
        }
    }}
