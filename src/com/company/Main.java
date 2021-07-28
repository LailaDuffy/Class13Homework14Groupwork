package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol", "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};

        // Task 1: how many cities start with letter C?
        int startsWithC = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].charAt(0) == 'C') {
                startsWithC++;
            }
        }
        System.out.println("The number of cities that start with letter 'C': " + startsWithC);

        // Task 2: cities that end with i
        int endsWithI = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].charAt(cities[i].length() - 1) == 'i') {
                endsWithI++;
            }
        }
        System.out.println("The number of cities that end with letter 'i': " + endsWithI);

        // Task 3: Cities with length of 5
        int citiesWith5Letters = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].length() == 5) {
                citiesWith5Letters++;
            }
        }
        System.out.println("The number of cities with 5 characters: " + citiesWith5Letters);


        // Task 4: cities that contain letter e
        int containsE = 0;
        for (int i = 0; i < cities.length; i++) {
            String textValue = cities[i];
            for (int j = 0; j < cities[i].length(); j++) {
                if (textValue.charAt(j) == 'e') {
                    containsE++;
                    break;
                }
            }
        }
        System.out.println("The number of cities that contain letter 'e': " + containsE);

        // Task 5: which cities hold 'en' inside?
        int holdsEN = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].matches("(.*en.*)")) {
                holdsEN++;
            }
        }
        System.out.println("The number of cities containing 'en': " + holdsEN);

        // Task 6: print out the cities and length of the city's name
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " = " + cities[i].length() + " ");
        }
        System.out.println();


        // REGEX
        // A*s -- Ananass
        // A.*s -- A1234ghvgugys
        // ^StartsWith -- match StartsWithThisSentence
        // Contains only from alphanumeric a .. z (lower case only)
        // [a-z]+
        // [a-zA-Z]
        // \d -- match [0-9]

        // Task 7 print out cities that start with chosen letter
        //Case insensitive method
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first letter of a city: ");
        String firstLetter = scan.next();

        for (String city : cities) {
            if (city.toLowerCase().matches(".*" + firstLetter.toLowerCase() + ".*"))
                System.out.println("This city starts with: \"" + firstLetter + "\" | " + city);
        }

        // Task: print out cities that end with the chosen letter
        System.out.println("Please enter the last letter of a city: ");
        String lastLetter = scan.next();

        for (String city : cities) {
            if (city.matches(".*" + lastLetter + ".*"))
                System.out.println("This city ends with: \"" + lastLetter + "\" | " + city);
        }


        System.out.println();
        // Task 8: validate this range: 1900 - 2100
        String validInput = "2020";
        String invalidInput = "99999";

        if ("2020".matches("((19|20)\\d\\d|2100)")) { //always use \\ when regex has "", (19|20) means 19 or 20, (19|20)\d\d|2100) means year starting with 19 or 20 with other 2 digits OR year 2100
            System.out.println("Valid input is a valid year. All the rules implied.");
        } else {
            System.out.println("Valid input is not a valid year.");
        }

        if ("2920".matches("[1-2][019]\\d\\d")) { // [1-2] means 1 to 2, [019] means 0 or 1 or 9
            System.out.println("Invalid input is a valid year. And this is not correct");
        } else {
            System.out.println("Invalid input is not a valid year.");
        }
    }
}


