
import java.io.FileWriter;
import java.io.IOException;


public class Appointment {
    
   private Doctor doctor;
    private Patient patient;
    private String date;


    public Appointment(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void saveToFile() throws IOException {
        FileWriter writer = new FileWriter("appointments.txt", true);
        writer.write("Appointment: " + patient.getName() + " with Doctor " + doctor.getName() + " on " + date + "\n");
        writer.close();
    }

}
