import java.util.Scanner;

public class MiddleChar {
    public static void middleChar(){

        String s = "hasnainn";
        int index = s.length()/2;
        if (s.length() % 2 == 0)
            System.out.println(s.charAt(s.length()/2)+" "+(s.charAt((s.length()/2)-1)));
        else System.out.println(s.charAt((s.length()-1)/2));
    }

    public static void main(String[] args) {
        middleChar();
    }
}
