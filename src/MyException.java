
public class MyException extends Exception {
    String z;


    public MyException(String a){
        this.z = a;
    }

    public void printE (){ System.out.println(z);}
}
