import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<String> generalSchedule = new ArrayList<>();
        generalSchedule.add("Monday 10am-12pm");
        generalSchedule.add("Wednesday 4pm-9pm");
        
        GeneralPractitioner generalDoctor = new GeneralPractitioner("Dr. Abul", generalSchedule);

        List<String> specialistSchedule = new ArrayList<>();
        specialistSchedule.add("Tuesday 10am-4pm");
        specialistSchedule.add("Thursday 1pm-8pm");
        
        Specialist specialDoctor = new Specialist("Dr. Rahim", specialistSchedule);

        
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(generalDoctor);
        doctors.add(specialDoctor);

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String patientName = scanner.nextLine();
        
        System.out.print("Enter Patient Age: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine();  

        Patient patient = new Patient(patientName, patientAge);

        System.out.println("Available Doctors:");
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            System.out.println((i + 1) + ". " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        }

        System.out.print("Choose doctor by number: ");
        int doctorChoice = scanner.nextInt();
        Doctor chosenDoctor = doctors.get(doctorChoice - 1);

        chosenDoctor.displayAvailability();

        System.out.print("Enter appointment date: ");
        scanner.nextLine(); 
        String appointmentDate = scanner.nextLine();

        Appointment appointment = new Appointment(chosenDoctor, patient, appointmentDate);

        try {
            appointment.saveToFile();
            System.out.println("Appointment booked successfully!");
        } catch (IOException e) {
            System.out.println("Failed save appointment.");
        }

        scanner.close();
    }
    
}
