package classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Общий on 05.06.2015.
 */
 public class User {

    private static Scanner input = new Scanner(System.in);

    public int id;
    public String login;
    public String name;
    public String surname;
    private String password;

    public ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Event> events = new ArrayList<Event>();
    private ArrayList<Business> businesses = new ArrayList<Business>();

    public User(String name, String password) {
        this.login = name;
        this.password = password;
    }

    public String changeName() {
        return null;
    }

    public void addFriend(User user) {
        users.add(user);
    }
    public void addEvent(Event event) {
        String name= input.nextLine();
        int important = input.nextInt();
        int condition = input.nextInt();
        String  description = input.nextLine();
        Date deadline = new Date();
        ArrayList<User> contributors = new ArrayList<User>();
        ArrayList<Event> hasEvets = new ArrayList<Event>();

        events.add(new Event(name, important,condition, deadline,description,contributors,hasEvets));
    }
    public void addBusiness(Business business) {
        String name= input.nextLine();
        int important = input.nextInt();
        int condition = input.nextInt();
        String  description = input.nextLine();
        Date deadline = new Date();
        ArrayList<User> contributors = new ArrayList<User>();
        ArrayList<Event> hasEvets = new ArrayList<Event>();

        new Business(name, important,condition, deadline,description,contributors,hasEvets,"",new Date());
        businesses.add(business);
    }

    public void changePass(String newPass) {
        this.password = newPass;
    }

    public void changeSurName() {
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkPass(String inputPass) {
        if(inputPass.equals(password))
            return true;
        return false;
    }

}
