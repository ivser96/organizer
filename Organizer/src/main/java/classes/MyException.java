package classes;

/**
 * Created by Общий on 07.06.2015.
 */
class MyException extends Exception {
    private String a;
    MyException(String b){a=b;}
    public String toString(){ if(!(a.equals("2")))if(!(a.equals("1")))return "Input action number is wrong";
    return null;}
}