import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private List<String> schedule;

    public Doctor(String name, String specialization, List<String> schedule) {
        this.name = name;
        this.specialization = specialization;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    public void displayAvailability() {
        System.out.println("Doctor " + name + " is available on: ");
        for (String time : schedule) {
            System.out.println(time);
        }
    }
}
