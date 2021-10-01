# java-project1

## Introduction
This was one of the earlier assignments done in my Java course. Depending on your preference of observing the code that was worked on, I have uploaded two versions of it. You can view either the code in a Word (.doc) file or you can view it in a raw Java (.java) file, the latter of which you can test easily if you have a program that can run them.

## Purpose
The purpose of this assignment was to take a file full of data, in this case student point grades, and import it into a program that could scan every grade inside and seperate them into ranges for the end user to see. This was done in a very similar fashion to a standard grading system, if you have 20 students and are on an A - F system, and you gave this program a file that had all the grades in it, it could tell you how many students were in letter grade ranges.

## Backend Code Details
This program starts out by initializing all required variables needed such as grades and ranges. It then utilizes a Scanner and IOException to reference and import an outside file, in this case "lab2_input.txt", which holds all the student grades. After which a while statement is employed to count through the .txt file until it reaches the end of the data. While that is happening a nested if-else block stops the while loop after every new piece of data and inputs them into respective grade ranges. Lastly the program outputs a list of all the ranges that were set up and prints the number of students that got within that grade range for the user to view.

## What Was Learned From This Assignment
Thanks to this assignment, I learned the value of being able to import data that a company might need to go through. Being able to go through hundreds of lines of data, or in this case grades, not only saves time and money for a company, but also cuts down significantly on how much code is needed to get the job done. As a result, this method of efficiency also optimizes programs make making them smaller and allowing them to stay in peak condition when run.

## What Was Learned From Java
This language has taught me that object oriented languages are built on efficiency. Java may not be as flexible as C++ is, but it is a lot easier to optimize and seperate. Code in Java can be seperated into classes, instances, and most importantly packages. This makes it much easier for us to find out what needs to be fixed, maintained, updated to continue running smoothly into the future.
