
package lab2grades;

/*
 Jared Edwards

 CS232-001

 lab2grades.java
 
 The purpose of this program is to call upon an outside txt file full of student
 grades. The program will then aceept all the numbers within that txt and seperate
 them into grade ranges, afterwords it will take the total number of students and
 seperate them into how many got within each range, printing this information out
 to the end user.
 
 Sunday, September 5, 2021 at 11:59 PM
 */


//standard import java procedures

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Lab2Grades 
{

    //'throws IOException' addition to the 'public static void' to make use of the outside file
   
    public static void main(String[] args) throws IOException
    {
        //declaring all variables necessary to perform grade and range calculation
        
        int grade;
        int totalGrades;
        int rangeOne, rangeTwo, rangeThree, rangeFour, rangeFive, rangeSix, rangeSeven, rangeEight;
        
        rangeOne = rangeTwo = rangeThree = rangeFour = rangeFive = rangeSix = rangeSeven = rangeEight = 0;
        
        //referring the scanner to the root folder for the txt file
        
        Scanner in = new Scanner(Paths.get("lab2_input.txt"), "UTF-8");
        
        //telling the code to go past the total number '26' so it doesn't confuse it with grades
        
        totalGrades = in.nextInt();
        
        //calculation phase utilizing 'while' and 'if' code
        
        while (in.hasNext()) 
        {
            grade = in.nextInt();
                  
            if(grade >= 0 && grade <= 24)
            {
                rangeOne += 1;
            }
            else if(grade >= 25 && grade <= 49)
            {
                rangeTwo += 1;
            }
            else if(grade >= 50 && grade <= 74)
            {
                rangeThree += 1;
            }
            else if(grade >= 75 && grade <= 99)
            {
                rangeFour += 1;
            }
            else if(grade >= 100 && grade <= 124)
            {
                rangeFive += 1;
            }
            else if(grade >= 125 && grade <= 149)
            {
                rangeSix += 1;
            }
            else if(grade >= 150 && grade <= 174)
            {
                rangeSeven += 1;
            }
            else
            {
                rangeEight += 1;
            }
        }
        
        //Output phase after calculations
        
        System.out.println("[0 - 24]: " + rangeOne);
        System.out.println("[25 - 49]: " + rangeTwo);
        System.out.println("[50 - 74]: " + rangeThree);
        System.out.println("[75 - 99]: " + rangeFour);
        System.out.println("[100 - 124]: " + rangeFive);
        System.out.println("[125 - 149]: " + rangeSix);
        System.out.println("[150 - 174]: " + rangeSeven);
        System.out.println("[175 - 200]: " + rangeEight);

        
    }
    
}
