// Time class
public class Time {
    // Data members (attributes)
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize time
     public Time(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds); // Use setTime method to validate values
    }

    // Method to set time (with validation)
    public void setTime(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0; // Default to 0 if invalid
        }

        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }

        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    // Method to get time in 24-hour format
    public String getTime() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Method to convert and get time in 12-hour format
    public String getTime12HourFormat() {
        int hour12 = (hours == 0 || hours == 12) ? 12 : hours % 12;
        String amPm = (hours < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hour12, minutes, seconds, amPm);
    }

    // Method to increment time by 1 second
    public void incrementTime() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0; // Reset to 00:00:00 after 23:59:59
                }
            }
        }
    }

    // Method to display time
    public void displayTime() {
        System.out.println("24-hour format: " + getTime());
        System.out.println("12-hour format: " + getTime12HourFormat());
    }

    // Main method to test the Time class
    public static void main(String[] args) {
        // Creating a Time object
        Time time = new Time(23, 59, 58);

        // Display initial time
        System.out.println("Initial Time:");
        time.displayTime();

        // Increment time twice
        time.incrementTime();
        time.incrementTime();

        // Display updated time
        System.out.println("\nUpdated Time:");
        time.displayTime();
    }
}
