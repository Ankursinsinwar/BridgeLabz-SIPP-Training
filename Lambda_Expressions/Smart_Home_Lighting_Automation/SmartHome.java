package Lambda_Expressions.Smart_Home_Lighting_Automation;

public class SmartHome {
    public static void main(String[] args) {
        // Define light behaviors dynamically using lambdas
        Runnable motionSensor = () -> System.out.println("Lights ON due to motion detected.");
        Runnable nightMode = () -> System.out.println("Lights dimmed for night mode.");
        Runnable voiceCommand = () -> System.out.println("Lights changing color on voice command.");

        // Simulate triggers
        motionSensor.run();
        nightMode.run();
        voiceCommand.run();
    }
}
