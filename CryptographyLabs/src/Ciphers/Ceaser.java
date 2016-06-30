package Ciphers;

import java.util.Scanner;

/**
 * Created by Dipesh on 6/30/2016.
 */
public class Ceaser {
    public static void main(String[] args) {
        String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner scanner=new Scanner(System.in);

//            System.out.println("Enter the message");
//            String message=scanner.nextLine();
//            String umessage=message.toUpperCase();
//            String cipher=encrypt(umessage,alphabets);
//            System.out.println(cipher);

            System.out.println("Enter the cipher text: ");
            String cipher=scanner.nextLine();
            String ucipher=cipher.toUpperCase();
            String message=decrypt(ucipher,alphabets);
            System.out.println(message);


    }

    private static String encrypt(String message, String alphabets) {
        int len=message.length();
        String cipher="";
        for (int i = 0; i <len ; i++) {
            int position=(alphabets.indexOf(message.charAt(i)+3)%26);
            cipher+=alphabets.charAt(position);

        }
        return cipher;
    }
    private static String decrypt(String cipher, String alphabets) {
        int len=cipher.length();
        String text="";
        for (int i = 0; i <len ; i++) {
            int position=(alphabets.indexOf(cipher.charAt(i)-3)%26);
            text+=alphabets.charAt(position);

        }
        return text;
    }
}
