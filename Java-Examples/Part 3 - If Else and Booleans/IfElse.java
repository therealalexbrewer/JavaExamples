public class IfElse {

    // if (something that checks for truth) {
    //     Do stuff here
    //     Do this as well
    //     And maybe a little bit-o-dis
    // }
    // Execute this regardless of the outcome of the if statement

    // if (something that checks for truth) {
    //     Do this stuff if the statement was true
    //     Also do this if true
    // }
    // else {
    //     Do this stuff if the statement was false
    //     Also do this stuff if false
    // }
    // Execute regardless of the outcome of the if statement

    public static void main(String args[]) {
    double coupon = 0.25;
    double priceOfBananas = 3.99;
    System.out.println("Thanks for shopping! Do you have a coupon? (true/false)");
    boolean hasCoupon = TextIO.getBoolean();
    double total = 0.0;
    
    if (hasCoupon == true) {
        total = priceOfBananas * (1 - coupon);
        System.out.println("Nice! With the coupon, your total comes to...");
        System.out.println(total);
    }
    else {
        System.out.println("Bummer! Maybe you should've checked the papers, we had a great discount. Anyways, the total is...");
        total = priceOfBananas;
        System.out.println(total);
    }
    System.out.println("Have a great day!");
    }
}
