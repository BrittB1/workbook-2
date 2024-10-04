package com.pluralsight.logic;

public class LogicExamples {

    public static void main(String[] args) {
        System.out.println("Hello");

        double area = 10 / 3;  //integer division
        double remainder = 10.0 % 3.0; // floating point modulo (remainder)

        area = (double) 10 / 3; // fp division

        System.out.println(area);
        System.out.println(remainder);

        // Arithmetic operators
        // + - / * %
        //Increment/decrement operators - PREFIX and POSTFIX versions
        // ++ --

        area = area + 1;
        System.out.println(area);

        area++; //postfix increment
        System.out.println(area);

        System.out.println(area++); // 6.33

        System.out.println(++area + area++ + remainder++); // area gets incremented first

        System.out.println(area); // 8.33
        System.out.println(remainder); //2.0

        float x = (float) remainder; // float is a 32-bit number it throws away thr last 8 digits of the remainder
        System.out.println(x); //

        float y = 7.99f;
        System.out.println(y); //what value prints here?

        double z = 8.33f;
        System.out.println(z); //

        System.out.printf("%.2f\n", z);
        System.out.println(z); //what value prints here?

// comparison operators
        // == != < > >= <=
        boolean amIDone = false;
        int counter = 0;
        do {
            System.out.println("talking.... words....");
            counter++;
            if (counter == 5) amIDone = true;
        } while (!amIDone);

        System.out.println(counter);

        counter = 0;
        while (counter != 5) {  // the while loop
            System.out.println("talking.... words....");
            counter++;
        }
        for (int 5 = 0; 5 <
        i++)
        {

        }

    }


