import java.text.DecimalFormat;
public class NestedLoopDemo {
    //nested loop is a loop inside a loop
    //the 1st loop in outside loop. represents number of rows/
    //2nd loop is inside loop. represents number of columns
    //2 ways to think of these nested loops visually would be
    // the time clock or the multiplication table.
//*
//**
//***
//****
//*****

    // *****
    // ****
    // ***
    // **
    // *

public static void main(String[] args){

    for(int i=1;i<=5;i++)// this tells me that there are gonna be 5 rows. outside loops.
    {
        //now decide how many times you want to loop the columns inside
        // for the inside loop. This will represent
        // what happens for each row

        for(int j=1;j<=10;j++)//this says that every row, something will loop ten times.
        {
            System.out.print(i*j+"\t");
            //this will output 10 times.
            // every i value which is the same for each row * each j value which is the columns.

        }
        //still inside the outside loop
        // but now that the inner loop is completed
        // we want to go to the new line
        System.out.println();
    }//closes the outside for loop
    // let's look at the time now

    /*
    hand trace
    i value     test condition      what happens
    1               1<=5 (true)       goes inside other loop

                                        next loop>>>> j value          test condition        what happens
                                                1                           1<=10T              prints 1*1 j goes to 2
                                                2                           2<=10T              prints 1*2 j goes to 3
                                                3                           3<=10T              prints 1*3 j goes to 4
                                                continues until j is 11 11<=10 (FALSE)
   //prints a new line or hits an enter i now goes to 2
   //2         2<=5            repeats loop



     */


    DecimalFormat df=new DecimalFormat("00");
    for(int hours=1;hours<=12;hours++)//for the hours in the clock this is outer loop
        {
            for (int minutes=0;minutes<60;minutes++)
                //for the minutes. each hour has 0 through 59 it is inner loop
                {
        for(int seconds=0; seconds<60;seconds++)//for the seconds.  each minute has 0 through 59 it is inner loop
             {
                 System.out.print(df.format(hours)+":");
        System.out.print(df.format(minutes)+":");
        System.out.println(df.format(seconds));
                }//closes inner most loop
            }//closes the next inner loop
     }//closes the outer loop

/*try to make
    *
    **
    ***
    ****
    *****
 */
    for(int k=1;k<=5;k++)// this tells me that there are gonna be 5 rows. outside loops.
    {

        for (int l = 1; l <= k; l++) {
            System.out.print("*");
        }
        System.out.println();

    }
//*
//**
//***
//****
//*****


    //try opposite now

    for(int k=5;k>=1;k--)// this tells me that there are gonna be 5 rows. outside loops.
    {
        for (int l = 1; l <= k; l++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    /*
     *****
     ****
     ***
     **
     *
     */
}
