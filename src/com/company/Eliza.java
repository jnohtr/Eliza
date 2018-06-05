package com.company;

import java.util.Random;
import java.util.Scanner;
public class Eliza {

    public static void main(String[] args) {
	// write your code here as long as every body is happay job pottential
        Scanner keyboard = new Scanner(System.in);
        /*input
                qualifier

                if equalsignore case("me")*/
        //
        /*String input = "My teacher hates me";
        String qualifier = "Why do you say that ";
        String output = "";

        String[] inputarray = input.split(" "); //a

        for (int i = 0; i < inputarray.length; i ++) {
            if (inputarray[i].equalsIgnoreCase("me")) { //equals
                inputarray[i ] = "you";
            }
            if (inputarray[i].equalsIgnoreCase("my")) {
                inputarray[i] = "your";
            }
        }

        for (int i = 0; i < inputarray.length; i++) {
            output += inputarray[i] + " ";
        }
        System.out.print(qualifier + output + "?");*/

        //SplitExample{
        /*String Str = new String("I really like this Java course");
              System.out.println("Return Value :" );

              for (String retval: Str.split(" ")) {
                System.out.println(","+retval+'.');
              }*/

        //funny?
        /*Random random = new Random();
        int x = 1 + random.nextInt(3);
        //System.out.print(x);

        if(x == 1)
            System.out.print("first");
        if(x == 2)
            System.out.print("second");
        else
            System.out.print("out of bound");*///out of scope exactly 10

        //randomness qualifier
        /*Random random = new Random();
        int x = 1 + random.nextInt(3);

        if (x ==1 )
            System.out.print("Why do you say that");
        else if ( x == 2)
            System.out.print("You seem to think that");
        else
            System.out.print("So, you are concerned that");*/

        //getting user input domne!
        /*String output = ""; //reformat

        System.out.print("good day. any problem?: ");
        String answer = keyboard.nextLine();
        //System.out.print(answer);

        String[] answerarray = answer.split(" ");
        for (int i = 0; i < answerarray.length; i++) {
            if (answerarray[i].equalsIgnoreCase("me")) { //equals
                answerarray[i] = "you";
            }
            if (answerarray[i].equalsIgnoreCase("my")) {
                answerarray[i] = "your";
            }
            if (answerarray[i].equalsIgnoreCase("i")) {
                answerarray[i] = "you";
            }
            if (answerarray[i].equalsIgnoreCase("am")) {
                answerarray[i] = "are";
            }
        }
        for (int i = 0; i < answerarray.length; i++) {
            output += answerarray[i] + " ";
        }
        System.out.print(output + " ");*/

        //random arry
        /*String[] strings = {"Hello", "my", "name", "is", "World", "and", "I", "love", "Java", "Language"};
        System.out.print("how many?: ");
        int num = keyboard.nextInt();

        for (int i = 0; i < num; i ++) { //I
            int index = (int) (Math.random() * 10);
            System.out.print(strings[index]);*/
        /*String[] strings = {"Hello", "my", "name", "is", "World", "and", "I", "love", "Java", "Language"};
        //System.out.print("how many?: ");
        int num = 1;

        for (int i = 0; i < num; i ++) { //I
            int index = (int) (Math.random() * 10);
            System.out.print(strings[index]);*/
        /*String[] strings = {"Why do you say that", "You seem to think that", "So, you are concerned that" };
        //System.out.print("how many?: "); S//
        int num = 1;

        for (int i = 0; i < num; i ++) { //I
            int index = (int) (Math.random() * 3); //10
            System.out.print(strings[index]);*/

            //random qualifier
        /*String[] qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that" };
        //System.out.print("how many?: "); S//
        int num = 1;

        for (int i = 0; i < num; i ++) { //I
            int index = (int) (Math.random() * 3); //10
            //System.out.println(qualifier[index]);
        }*/

        //random hedges
        /*String[] hedges = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit."};
        int index2 = (int) (Math.random() * 3);*/
        //System.out.println(hedges[index2]);

        //
        //System.out.println(qualifier[index]);
        ///System.out.println(hedges[index2]);

        //qualifier
        /*String[] qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that" };
        int index = (int) (Math.random() * 3); //10*/

        ///System.out.println(qualifier[index]);

        //
        /*String output = ""; //reformat

        System.out.print("good day. any problem?: ");
        String answer = keyboard.nextLine();
        //System.out.print(answer);

        String[] answerarray = answer.split(" ");
        for (int i = 0; i < answerarray.length; i++) {
            if (answerarray[i].equalsIgnoreCase("me")) { //equals
                answerarray[i] = "you";
            }
            if (answerarray[i].equalsIgnoreCase("my")) {
                answerarray[i] = "your";
            }
            if (answerarray[i].equalsIgnoreCase("i")) {
                answerarray[i] = "you";
            }
            if (answerarray[i].equalsIgnoreCase("am")) {
                answerarray[i] = "are";
            }
        }
        for (int i = 0; i < answerarray.length; i++) {
            output += answerarray[i] + " ";
        }
        System.out.print(qualifier[index] +" "+ output + " ");*/

        //loop
        /*boolean quit = false;
        String output = ""; //reformat
        System.out.print("good day. any problem? ");

        do {
            //System.out.print(qualifier[index]);
            System.out.print("\n enter response. q-quit: "); //cause outside right?
            String answer = keyboard.nextLine();
            //System.out.print(answer);

            if (answer.equals("q")) {
                quit = true;
            }

            String[] answerarray = answer.split(" ");
            for (int i = 0; i < answerarray.length; i++) {
                if (answerarray[i].equalsIgnoreCase("me")) { //equals
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("my")) {
                    answerarray[i] = "your";
                }
                if (answerarray[i].equalsIgnoreCase("i")) {
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("am")) {
                    answerarray[i] = "are";
                }
            }
            for (int i = 0; i < answerarray.length; i++) {
                output += answerarray[i] + " ";
            }
            //if (answer.equals("q")) {
            //    quit = true;
            //}

            String[] hedges = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit."};
            int index2 = (int) (Math.random() * 3);

            String[] qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that" };
            int index = (int) (Math.random() * 3); //10

            System.out.print(qualifier[index] + " " + output + " ");
        } while (quit == false); //if print outside of..*/

        //loop
        /*boolean quit = false;
        String output = ""; //reformat
        System.out.print("good day. any problem? ");

        do {
            //System.out.print(qualifier[index]);
            System.out.print("\n enter response. q-quit: "); //cause outside right?
            String answer = keyboard.nextLine();
            //System.out.print(answer);

            if (answer.equals("q")) {
                quit = true;
            }

            String[] answerarray = answer.split(" "); //String how are you feeling today? i am sad
            for (int i = 0; i < answerarray.length; i++) {
                if (answerarray[i].equalsIgnoreCase("me")) { //equals
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("my")) {
                    answerarray[i] = "your";
                }
                if (answerarray[i].equalsIgnoreCase("i")) {
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("am")) {
                    answerarray[i] = "are";
                }
            }
            for (int i = 0; i < answerarray.length; i++) {
                output += answerarray[i] + " ";
            }
            /*if (answer.equals("q")) {
                quit = true;  //i am sad, i am happy, i am kind of happy, you are sad you are happy you are kind of happy  Please tell me more
            }*/
            /*String[] hedges = {"Please tell me more","Many of my patients tell me the same thing","It is getting late, maybe we had better quit."};
            int index2 = (int) (Math.random() * 3);

            String[] qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that" };
            int index = (int) (Math.random() * 3); //10
            System.out.print(qualifier[index] + " " + output + " ");

        } while (quit == false); //if print outside of..charger for?*/
    //
        boolean quit = false;
        String output = ""; //reformat
        System.out.print("good day. any problem? ");

        do {
            //System.out.print(qualifier[index]);
            System.out.print("\n enter response. q-quit: "); //cause outside right?
            String answer = keyboard.nextLine();
            //System.out.print(answer);

            if (answer.equals("q")) {
                quit = true;
            }



            String[] answerarray = answer.split(" "); //String how are you feeling today? i am sad
            for (int i = 0; i < answerarray.length; i++) {
                if (answerarray[i].equalsIgnoreCase("me")) { //equals
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("my")) {
                    answerarray[i] = "your";
                }
                if (answerarray[i].equalsIgnoreCase("i")) {
                    answerarray[i] = "you";
                }
                if (answerarray[i].equalsIgnoreCase("am")) {
                    answerarray[i] = "are";
                }
            }
            for (int i = 0; i < answerarray.length; i++) {
                output += answerarray[i] + " "; //how to fix? just=?
            }
            /*if (answer.equals("q")) {
                quit = true;
            }*/
            String[] hedges = {"Please tell me more", "Many of my patients tell me the same thing", "It is getting late, maybe we had better quit."};
            int index2 = (int) (Math.random() * 3);

            String[] qualifier = {"Why do you say that", "You seem to think that", "So, you are concerned that"};
            int index = (int) (Math.random() * 3); //10

            System.out.print(qualifier[index] + " " + output + " "); //with help
            output = ""; //clear  i am happy heelp~

            System.out.print(hedges[index2]);

        } while (quit == false); //if print outside of..charger for?

    }
}
