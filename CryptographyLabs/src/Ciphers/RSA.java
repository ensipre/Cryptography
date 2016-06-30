package Ciphers;

import java.util.Scanner;

/**
 * Created by Ruby on 5/21/2016.
 */
public class RSA {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a large random prime number:");
        int p=input.nextInt();
        System.out.println("Enter another large random prime number:");
        int q=input.nextInt();

        int n=p*q;
        int totient=(p-1)*(q-1);
        int e=findE(totient);
        int d=findD(e, totient);

        System.out.println("Enter your message: ");
        int msg=input.nextInt();
        System.out.println("Encryption in progress....");
        System.out.println("Encrypted message: " + encrypt(msg, n, e));
        System.out.println("Decryption in progress....");
        System.out.println("Decrypted message: " + decrypt(encrypt(msg, n, e), n, d));
    }

    static int getGCD(int a, int b){
        int A=a, B=b, R;
        while (B!=0){
            R=A%B;
            A=B;
            B=R;
        }
        return A;
    }
    static  int findE(int totient){
        int e=0;
        for (int i=2; i<totient; i++){
            if (getGCD(totient, i)==1){
                e=i;
                break;
            }
        }
        return e;
    }
    static int findD(int e, int totient){
        int val=1, d=0;
        while (true){
            if ((e*val) % totient==1){
                d=val;
                break;
            }
            val++;
        }
        return val;
    }

    static int encrypt(int msg, int n, int e){
        return (int)Math.pow(msg, e) % n;
    }

    static int decrypt(int entxt, int n, int d){
        return (int)Math.pow(entxt, d) % n;
    }
}
