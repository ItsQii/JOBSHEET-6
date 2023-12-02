import java.util.Scanner;

public class LatihanMandiri103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1 = 28;
        int bil2 = 54; 
        int bil3 = 15;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan Terbesar = " + bil1);
            } else {
                System.out.println("Bilangan Terbesar = " + bil3);
            }            
        } else {
           if (bil2 > bil3) {
                System.out.println("Bilangan Terbesar = " + bil2);
           } else {
                System.out.println("Bilangan Terbesar = " + bil3);
           } 
        }
    }
}