package com.globant.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Welcome to our App.\nPlease write down your name and you´ll get a greeting message!");
    	Scanner sc = new Scanner(Syste.in);
    	String name = sc.nextLine();
    	System.out.println("Hello "+name+"!!!");
    }
}
