package com.bridgelabz.Inputs;

import java.util.Scanner;

public class Inputs {
	private final static Scanner sc = new Scanner(System.in);
    public static int getIntValue()
    {
        return sc.nextInt();
    }
    public static String getStringValue()
    {
        return sc.next();
    }
}
