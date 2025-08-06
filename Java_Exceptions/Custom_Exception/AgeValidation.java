package Java_Exceptions.Custom_Exception;

    public class AgeValidation {
        public static void validateAge(int age) throws InvalidAgeException {
        if (age >= 18) {
              System.out.println("Access granted!");
        }
        else{
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
