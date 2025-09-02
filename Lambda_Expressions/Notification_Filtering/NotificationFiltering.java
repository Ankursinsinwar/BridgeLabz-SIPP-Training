package Lambda_Expressions.Notification_Filtering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Patient heart rate abnormal!"),
                new Alert("Info", "Routine checkup scheduled."),
                new Alert("Warning", "Low medicine stock.")
        );

        // Filter only Critical alerts using lambda with Predicate
        Predicate<Alert> criticalFilter1 = a -> a.type.equals("Critical");
        Predicate<Alert> criticalFilter2 = a -> a.type.equals("Info");
        Predicate<Alert> criticalFilter3 = a -> a.type.equals("Warning");

        alerts.stream().filter(criticalFilter1).forEach(System.out::println);
        alerts.stream().filter(criticalFilter2).forEach(System.out::println);
        alerts.stream().filter(criticalFilter3).forEach(System.out::println);
    }
}