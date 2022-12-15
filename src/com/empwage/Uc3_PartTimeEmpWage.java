package com.employeewage;

import java.util.Random;

public class Uc3_PartTimeEmpWage {

    // UC3 = Calculate Part time Employee Wage.
    public static void main(String[] args) {
        int partTimeHours = 4;
        int wagePerHour = 20;
        int partTimeWage = 0;

        partTimeWage = partTimeHours * wagePerHour;

        Random random = new Random();
        boolean b = random.nextBoolean();

        if (b == true) { // Employee is present.
            System.out.println("Part time Employee Wage is = " + partTimeWage);
        } else { // Employee is absent.
            System.out.println("Part time Employee Wage is = 0");
        }
    }
}

