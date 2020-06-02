package java8Tasks.DateTime;


import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DateTimeTasks {
    public static void main(String args[]) {
        //1. Write a predicate to check if the given date is yesterday date.
        Predicate<LocalDate> yesterdayTest = givenDate -> !LocalDate.now().minusDays(1).equals(givenDate);
        System.out.println("Give Date is Yesterday--->" + yesterdayTest.test(LocalDate.now()));

        //2. Write a java8Tasks.Supplier to get Date for next Thursday.
        Supplier<LocalDate> getNextThursdayDate
                = () -> LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Next Thursday's date: " + getNextThursdayDate.get());

        //3. Write a java8Tasks.Supplier to get CurrentTime in EST timezone
        Supplier<LocalTime> getCurrentEstTimeZone = () -> LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Time in EST: " + getCurrentEstTimeZone.get());

        //4. Write a Function to calculate the age of a person given date of birth.
        Function<LocalDate, Integer> calculateAge = dateOfBirth -> Period.between(dateOfBirth, LocalDate.now()).getYears();
        LocalDate dob = LocalDate.of(2000, 3, 11);
        LocalDate currentDate = LocalDate.now();
        Period calcDob = Period.between(currentDate, dob);
        System.out.println("Total Number of Years---->" + calcDob.getYears());
    }
}
