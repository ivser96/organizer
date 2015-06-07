package classes;

/**
 * Created by Общий on 07.06.2015.
 */
class MyException extends Exception {
    private int a;
    MyException(int b){a=b;}
    public String toString(){ if(a>2)return "Input action number:"+ a + ">2";
        if(a<1) return "Input action number:"+ a + "<1";
    return null;}
}