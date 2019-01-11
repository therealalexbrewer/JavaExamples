

public class InputAndCompile {

    public static void main(String args[]) {
        System.out.println("Give me a number!");
        int someNum = TextIO.getInt();
        System.out.println("Give me another number!");
        int anotherNum = TextIO.getInt();
        System.out.println("Give me one more!");
        int oneMore = TextIO.getInt();
        System.out.println("Ok ok, give me one more biiiiig number! Like... 4 digits!");
        int bigNum = TextIO.getInt();
        System.out.println("Now I'm gonna multiply all of these right before your eyes!");
        int multMe = someNum * anotherNum * oneMore * bigNum;
        System.out.println(multMe);

    }
}