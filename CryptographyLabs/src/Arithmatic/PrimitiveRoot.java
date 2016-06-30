package Arithmatic;

import java.util.Scanner;


public class PrimitiveRoot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a prime number:");
        int p=input.nextInt();

        System.out.println("Which number do you want to check is the primitive root of " + p + " or not?");
        int root=input.nextInt();

        check(p,root);
    }

    static void check(int p, int root){
        int [] arr= new int[p-1];
        for (int i=1; i<p; i++){
            int rem=(int)Math.pow(root, i) % p;
            for (int j=0; j<arr.length; j++){
                if (rem==arr[j]){
                    System.out.println(root + " is not a primitive root!");
                    return;
                }
            }
            arr[i-1]=rem;
        }
        System.out.println(root + " is a primitive root!");
    }
}
