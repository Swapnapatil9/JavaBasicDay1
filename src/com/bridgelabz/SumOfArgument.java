package com.bridgelabz;

public class SumOfArgument {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        int num;
        for (int i = 0; i < args.length; i++) {

            try {

                System.out.println(args[i]);
                num = Integer.parseInt(args[i]);
                sum = sum + num;

            } catch (NumberFormatException e) {
                count++;
            }
        }
        System.out.println("Total count=" + count);
        System.out.println("Sum=" + sum);
    }
}
