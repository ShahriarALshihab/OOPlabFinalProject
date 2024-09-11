import java.util.List;

public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String name, List<String> schedule) {
        super(name, "General Practitioner", schedule);
    }

    @Override
    public void displayAvailability() {
        System.out.println("General Practitioner " + getName() + " is available for walk-in patients on: ");
        for (String time : getSchedule()) {
            System.out.println(time);
        }
    }
}
