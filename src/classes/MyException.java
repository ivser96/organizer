package classes;

/**
 * Created by Общий on 07.06.2015.
 */
public class MyException extends Exception {
    private int a;
    public String toString(){ return "Input action number:"+ a + ">2"; }
}