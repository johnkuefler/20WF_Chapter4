
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException  {
        
        // random numbers
        Random rand = new Random();
        int myRandomNumber = rand.nextInt(4000);
        
        for (int i=0; i<=myRandomNumber; i++) {
            System.out.println(i);
        }
        
        
        // random number between 5 and 10
        Random r = new Random();
        int low = 5;
        int high = 10;
        int result = r.nextInt(high-low) + low;
        
        System.out.println(result);
        
        
        // write files
        PrintWriter outputFile = new PrintWriter("C:\\users\\johnk\\Desktop\\Names.txt");
        outputFile.println("Chris");
        outputFile.println("Kathryn");
        outputFile.println("Jean");
        outputFile.close(); 

        File file = new File("C:\\users\\johnk\\Desktop\\Names.txt");
        Scanner inputFile = new Scanner(file);
        
        while (inputFile.hasNext()) {
             String str = inputFile.nextLine();
             System.out.println(str);
        }
        // Close the file.
        inputFile.close();

        
        Scanner keyboard = new Scanner(System.in);
        
        int number = 1;

        number = number + 1;
        number += 1;
        number++;
        --number;

        // running total
        System.out.println("Enter the ledger amounts");
        System.out.println("When done, press 999");
        
        double runningTotal = 0;
        double input = 0;
        
        while(input != 999) {
            input = keyboard.nextDouble();
            runningTotal += input;
        }
        System.out.println(runningTotal);
        
        
        // input validation
        System.out.println("Enter a grade (1-12)");

        int grade = keyboard.nextInt();

        while (grade < 1 || grade > 12) {
            System.out.println("Invalid grade, try again:");
            grade = keyboard.nextInt();
        }

        // pretest       
        boolean isRaining = true;
        
        int loopFailsafe = 10000;
        
        while (isRaining) 
        {
            System.out.println("It is raining!");
                        
            loopFailsafe--;
            if (loopFailsafe == 0) {
                break;
            }
            System.out.println(loopFailsafe);
        }
        
// post test
        //boolean isRaining = false;

        do {
            System.out.println("It is raining!");
        } while (isRaining);

// for loop
        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j<=10; j++) {
                System.out.println(j);
            }
            
            System.out.println(i);
        }   
    }

}
