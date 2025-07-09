package Stack_Queue_HashMap_Hashing_Function.StacksAndQueues;

public class CircularTour {

    static class PetrolPump {
        int petrol, distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStart(PetrolPump[] pumps) {
        int start = 0, balance = 0, deficit = 0;

        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int startIndex = findStart(pumps);
        if (startIndex != -1)
            System.out.println("Start at pump: " + startIndex);
        else
            System.out.println("No feasible tour possible");
    }
}
