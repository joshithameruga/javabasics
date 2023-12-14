package java_class_work;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Event {
    private String eventName;
    private LocalDate eventDate;

    public Event(String eventName, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}

public class Eventlist {
    public static void main(String[] args) {
        // Create events with dates
        Event music1 = new Event("Music1", LocalDate.of(2024, 1, 1)); 
        Event music2 = new Event("Music2", LocalDate.of(2024, 1, 2));    
        Event concert1 = new Event("Concert1", LocalDate.of(2024, 1, 3)); 
        Event sports1 = new Event("Sports1", LocalDate.of(2024, 1, 4)); 

        // Create ArrayList and add events
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(music1);
        eventList.add(music2);
        eventList.add(concert1);
        eventList.add(sports1);

        // Sort events based on dates in descending order
        Collections.sort(eventList, Comparator.comparing(Event::getEventDate).reversed());

        // Print events
        System.out.println("Events in Descending Order of Dates:");
        for (Event event : eventList) {
            System.out.println(event.toString());
        }
    }
}
