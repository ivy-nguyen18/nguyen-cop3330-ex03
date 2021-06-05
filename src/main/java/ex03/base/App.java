/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex03.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who is the author? ");
        String author = input.nextLine();

        String quotation = author + " says," + "\""+ quote + "\"";
        System.out.println(quotation);

    }
}
