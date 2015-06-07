package classes;

import java.io.File;
import java.io.FileNotFoundException;
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

    public static void main(String[] args) throws FileNotFoundException, MyException {
        users.add(new User("Ivan", "12345"));
        users.add(new User("Dima", "dimadima"));
        users.add(new User("Nikita", "432333"));

        System.out.println("Hello!");
        System.out.println("What do you want?");
        System.out.println("1. Sign in.");
        System.out.println("2. Sign up.");
        int action = input.nextInt();
        try {
            comp(action);
        } catch (MyException e) {
            if(action>2){
                System.out.println(action + ">2");}
            if(action<1){
                System.out.println(action + "<1");}

            System.out.println("Exit");
        }


        switch (action) {
            case 1:
                System.out.println("Enter login: ");
                String inputLogin = input.next();
                System.out.println("Enter password: ");
                String inputPass = input.next();
                signIn(inputLogin, inputPass);
                break;
            case 2:
                signUp();
                break;
        }

        String str = input.nextLine();

    }

    private static void signIn(String inputLogin, String inputPass) {
        int f = 0;
        for (User curUser : users) {

            try {
                exist("db.txt");
            } catch (FileNotFoundException e) {
                System.out.println("Database file isn't found");
                f = 0;
                break;
            }
            f = 1;
            if (curUser.getLogin().equals(inputLogin)) {
                if (curUser.getPassword().equals(inputPass)) {
                    log = 1;
                    loginUser = curUser;
                    System.out.println("Welcome, " + curUser.login + "!");
                    break;
                }
            }
        }
        if (f == 0) {
            return;
        }
        if (log == 0) {
            System.out.println("ERROR. Failed login or password");
            return;
        }


    }


    private static void signUp() {
        System.out.println("Enter login: ");
        String login = input.next();
        System.out.println("Enter password: ");
        String pass = input.next();
        new User(login, pass);
        users.add(new User(login, pass));
        signIn(login, pass);
    }

    private static void exist(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }

    static void comp(int a) throws MyException {
        if (a > 2)
            throw new MyException(a);
        if (a < 1)
            throw new MyException(a);
    }
}
