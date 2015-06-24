package classes;

import java.io.*;
import java.util.ArrayList;

import java.util.Scanner;




/**
 * Created by Общий on 06.06.2015.
 */
public class Main {

    private static Scanner input = new Scanner(System.in);
    private static User loginUser;
    private static int log = 0;
    private static ArrayList<User> users = new ArrayList<User>();
    static{
        users.add(new User("aaa","aaa","aaa", "aaa"));
        users.add(new User("sss","sss","sss", "sss"));
        System.out.println("Users size: " + users.size());
    }
    public static int maxid;
    public static void main(String[] args) throws Exception{
        String st;


        int a=1;
        int d;

        String action="";
        st=reader("db1.txt");
        d=st.length();
        usf(st);
        do  {

            if(a==1){
                System.out.println("Hello!");
                System.out.println("Choose your variant");
            }
            a=1;
            System.out.println("1. Sign in.");
            System.out.println("2. Sign up.");
            try {
            action = input.next();
            comp(action);
            } catch (Exception e) {
                if (!(action.equals("2"))) if (!(action.equals("1")))
                    System.out.println("Please, choose right variant");
                a = 0;
            }
            switch (action) {
            case "1":
                int s;
                do {
                    System.out.println("Enter login: ");
                    String inputLogin = input.next();
                    System.out.println("Enter password: ");
                    String inputPass = input.next();
                    s=signIn(inputLogin, inputPass);
                }while(s==0);
                    if (!(s==2)) {
                        System.out.println("Testing version");
                        System.out.println("Type 0 to exit the program and click Enter");
                        exit();
                    }
                break;
            case "2":
                signUp(st);
                System.out.println("Testing version");
                System.out.println("Type 0 to exit the program and click Enter");
                exit();
                break;
        }
        }while(a==0);
        String str = input.nextLine();

    }

    public static int signIn(String inputLogin, String inputPass) {

        for (User curUser : users) {
            try {
                exist("db1.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Database error 1");
                return 2;
            }
            if (curUser.getLogin().equals(inputLogin)) {
                if (curUser.getPassword().equals(inputPass)) {
                    log = 1;
                    loginUser = curUser;
                    System.out.println("Welcome, " + curUser.login + "!");
                    break;
                }
            }
        }
        if (log == 0) {
            System.out.println("ERROR. Failed login or password");
            return 0;
        }
        return 1;
    }
    public static User signInUser(String inputLogin, String inputPass) {

        for (User curUser : users) {
//            try {
//                exist("db1.txt");
//            } catch (FileNotFoundException e) {
//                System.out.println("Database error 1");
//                return null;
//            }
            if (curUser.getLogin().equals(inputLogin)) {
                if (curUser.getPassword().equals(inputPass)) {
                    return curUser;
//                    loginUser = curUser;
//                    System.out.println("Welcome, " + curUser.getLogin() + "!");
//                    break;
                }
            }
        }
        if (log == 0) {
            System.out.println("ERROR. Failed login or password");
            return null;
        }
        return loginUser;
    }


    private static void signUp(String st) {
        System.out.println("Enter login: ");
        String login = input.next();
        System.out.println("Enter password: ");
        String pass = input.next();
        db1(login,pass,st);
        signIn(login, pass);
    }
    public static void signUpUser(String name,String surname,String login, String password) {
      users.add(new User(name,surname,login,password));
    }

   private static void exist(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    static void comp(String a) throws MyException {
        if(!(a.equals("2")))if(!(a.equals("1")))
            throw new MyException(a);
    }
    static void comp1(String a) throws MyException1 {
        if (!(a.equals("0")))
            throw new MyException1(a);
    }
    private static void exit()throws Exception{
        int a;
        String action="";
        do {
            a=1;
            try {
                action = input.next();
                comp1(action);
            } catch (Exception e) {
                if (!(action.equals("0")))
                    System.out.println("Please, choose right variant");
                a = 0;
            }
        }while(a==0);
    }
    private static void db1(String login, String password, String st){
        String s;
        s=st+login;
        s=s+" "+password;
        File file = new File("db1.txt");
        try {
            try {
                exist("db1.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Database error 1");
            }
                //PrintWriter обеспечит возможности записи в файл
                PrintWriter out = new PrintWriter(file.getAbsoluteFile());

                try {
                    //Записываем текст у файл
                    out.print(s);
                } finally {
                    //После чего мы должны закрыть файл
                    //Иначе файл не запишется
                    out.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
    public static String reader(String fileName) throws FileNotFoundException {
        //Этот спец. объект для построения строки
        StringBuilder sb = new StringBuilder();

        try {
            exist(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Database error 1");
        }
        File file = new File(fileName);
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //В цикле построчно считываем файл
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Возвращаем полученный текст с файла
        return sb.toString();
    }
    public static void usf(String st) {
        int d=st.length();
        String s="";
        String s1;

        String login="", password;
        for (int i = 0; i < d; i++) {
            switch (st.charAt(i)) {

                case ' ':
                    login = s;
                    s = "";
                    break;
                case '\n':
                    password = s;
                    s = "";
                    break;
                default:
                    s1 = String.valueOf(st.charAt(i));
                    s = s.concat(s1);
                    break;


            }
        }

        }
        }


