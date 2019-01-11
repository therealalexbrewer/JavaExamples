public class AgeBusinessBetter {

    public static void main(String args[]) {
        System.out.println("Enter an age for Gary:");
        // Gary's age
        int age = TextIO.getInt();
        System.out.println("Enter an age for Alex:");
        // Alex's age
        int anotherAge = TextIO.getInt();
        System.out.println("Enter an age for Neil:");
        // Neil's age
        int yetAnotherAge = TextIO.getInt();

        System.out.println("Gary is " + age);
        System.out.println("Alex is " + anotherAge);
        System.out.println("Neil is " + yetAnotherAge);
        System.out.println("We are the priests...");
    }


}

