//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Greeting {
    public Greeting() {
    }

    public static void main(String[] args) {

       greetingInput();

    }
    public static String greetingInput(){
        Scanner var1 = new Scanner(System.in);
        System.out.println("What's your name?");
        String var2 = var1.nextLine();
        System.out.println("Hi " + var2);
        return "Hi " + var2;
    }
}
