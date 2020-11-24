package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfGivenCards = 0, sumOfPoints = 0;
        String giveNext;
        do {
            int suitNumber = (int) (Math.random() * 4.0 + 1);
            int faceNumber = (int) (Math.random() * 13.0 + 1);
            Card newCard = new Card(suitNumber, faceNumber);
            System.out.println(newCard);

            ++numOfGivenCards;
            sumOfPoints += newCard.points;
            if(numOfGivenCards == 5 || sumOfPoints > 21) break;
            System.out.println("Current sum of points: " + sumOfPoints);
            System.out.println("Take next card (yes/no)");
            giveNext = in.next();
        }   while(giveNext.toLowerCase().equals("yes"));
        System.out.println("Total number of cards: " + numOfGivenCards);
        System.out.println("Total sum of points: " + sumOfPoints);
    }
}
