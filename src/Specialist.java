import java.util.List;

public class Specialist extends Doctor {
    public Specialist(String name, List<String> schedule) {
        super(name, "Specialist", schedule);
    }

    @Override
    public void displayAvailability() {
        System.out.println("Specialist " + getName() + " needs appointment confirmation.");
        System.out.println("Available for appointments : ");
        for (String time : getSchedule()) {
            System.out.println(time);
        }
    }

}
