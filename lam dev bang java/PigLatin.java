import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        switch (s.charAt(0)) {
            case 'u': case 'e': case 'o': case 'a': case 'i':
                s = s + "way";
                System.out.println(s);
                break;
        
            default:
                char first = s.charAt(0);
                s = s.substring(1);
                s = s + first + "ay";
                System.out.println(s);
                break;
        }

        sc.close();
    }
}
