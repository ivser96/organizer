package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Общий on 05.06.2015.
 */
public class Business extends Event {

    private String contents;
    private Date startDate;

    public Business(String name, int important, int condition, Date deadline, String description,
                    ArrayList<User> contributors, ArrayList<Event> hasEvents, String contents, Date startDate) {
        super(name, important, condition, deadline, description, contributors, hasEvents);
        this.contents = contents;
        this.startDate = startDate;
    }
}
