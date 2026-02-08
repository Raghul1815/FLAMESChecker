package Ds;
import java.util.*;
public class FLAMES {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of the boy: ");
    String boy = sc.nextLine();

    System.out.println("Enter the name of the girl: ");
    String girl = sc.nextLine();

        StringBuilder r1 = new StringBuilder();
        StringBuilder r2 = new StringBuilder();

    for (int i = 0; i < boy.length(); i++) {
        char c = boy.charAt(i);
        if (girl.indexOf(c) == -1) {
            r1.append(c);
        }
    }

    for (int i = 0; i < girl.length(); i++) {
        char c = girl.charAt(i);
        if (boy.indexOf(c) == -1) {
            r2.append(c);
        }
    }
    int count = r1.length() + r2.length();
    String flames = "FLAMES";
    while (flames.length() > 1) {
        int index = (count % flames.length()) - 1;
        if (index >= 0) {
            flames = flames.substring(0, index) + flames.substring(index + 1);
        } else {
            flames = flames.substring(0, flames.length() - 1);
        }
}
    char result = flames.charAt(0);
    String relationship = "";
    switch (result) {
        case 'F':
            relationship = "Friends";
            break;
        case 'L':
            relationship = "Love";
            break;
        case 'A':
            relationship = "Affection";
            break;
        case 'M':
            relationship = "Marriage";
            break;
        case 'E':
            relationship = "Enemy";
            break;
        case 'S':
            relationship = "Siblings";
            break;
    }
    System.out.println("The relationship between " +boy+ " and " +girl+ " is: " + relationship);    
}
}
