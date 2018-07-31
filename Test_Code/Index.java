// package Randomiser;
import rnd.*;

class Index {
    public static void main (String args[]) {
        String input = "Hello world!";
        try {
            input = args[0];
        } catch (Exception e) {
            input = "Hello world!";
        }
        System.out.println(new Random().random(input));
    }
}
