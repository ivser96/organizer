package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Общий on 06.06.2015.
 */
public class Event {

    public String name;
    public int important;
    public int condition;
    public Date deadline;
    public String description;
    public ArrayList<User> contributors = new ArrayList<User>();
    public ArrayList<Event> hasEvents = new ArrayList<Event>();


    public Event(String name, int important, int condition, Date deadline, String description, ArrayList<User> contributors, ArrayList<Event> hasEvents) {
        this.name = name;
        this.important = important;
        this.condition = condition;
        this.deadline = deadline;
        this.description = description;
        this.contributors = contributors;
        this.hasEvents = hasEvents;
    }

    public void setName(String name) {

        this.name = name;
    }

}
