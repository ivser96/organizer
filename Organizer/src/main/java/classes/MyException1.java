package classes;

/**
 * Created by Общий on 07.06.2015.
 */
class MyException1 extends Exception {
    private String a;
    MyException1(String b){a=b;}
    public String toString(){ if(!(a.equals("0")))return "Wrong typping";
    return null;}
}