package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Общий on 06.06.2015.
 */
public class Main {

    private static Scanner input = new Scanner(System.in);
    private static User loginUser;
    private static ArrayList<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        users.add(new User("Ivan", "12345"));
        users.add(new User("Dima", "dimadima"));
        users.add(new User("Nikita", "negr"));
        users.add(new User("admin", "admin"));

        System.out.println("Hello!");
        System.out.println("What do you want?");
        System.out.println("1. Sign in.");
        System.out.println("2. Sign up.");
        int action = input.nextInt();

        switch(action) {
            case 1:
                System.out.println("Enter name: ");
                String inputLogin=input.nextLine();
                System.out.println("Enter password: ");
                String inputPass=input.nextLine();
                signIn(inputLogin, inputPass);
                break;
            case 2:
                signUp();
                break;
        }

        String str = input.nextLine();

    }

    private static void signIn(String inputLogin, String inputPass) {

        for(User curUser : users) {
            if(curUser.getLogin().equals(inputLogin)) {
                if(curUser.getPassword().equals(inputPass)) {
                    loginUser = curUser;
                    System.out.println("Welcome, " + curUser.name + "!");
                    break;
                }
                else {
                    System.out.println("ERROR. Failed password");
                    break;
                }
            }
        }
    }

    private static void signUp() {
        String login = input.nextLine();
        String pass = input.nextLine();
        new User(login, pass);
        signIn(login, pass);
    }
}
