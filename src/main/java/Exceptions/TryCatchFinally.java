package Exceptions;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        try {
            int number = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Exception occured " + e);
        }finally {
            System.out.println("Execute no matter what");
        }
    }
}
