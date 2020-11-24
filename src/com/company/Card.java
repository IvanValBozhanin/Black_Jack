package com.company;

public class Card {
    String suit,name;
    int points;
    Card(int n1, int n2){
        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
    }
    public String toString(){
        return "The " + name + " of " + suit;
    }
    public String getName(int i){
        if(i == 1) return "Ace";
        if(i == 2) return "Two";
        if(i == 3) return "Three";
        if(i == 4) return "Four";
        if(i == 5) return "Five";
        if(i == 6) return "Six";
        if(i == 7) return "Seven";
        if(i == 8) return "Eight";
        if(i == 9) return "Nine";
        if(i == 10) return "Ten";
        if(i == 11) return "Jack";
        if(i == 12) return "Queen";
        if(i == 13) return "King";
        return "error";
    }
    public int getPoints(String n){
        if(n.equals("Jack") || n.equals("Queen") || n.equals("King") || n.equals("Ten"))
            return 10;
        if(n.equals("Two"))
            return 2;
        if(n.equals("Three"))
            return 3;
        if(n.equals("Four"))
            return 4;
        if(n.equals("Five"))
            return 5;
        if(n.equals("Six"))
            return 6;
        if(n.equals("Seven"))
            return 7;
        if(n.equals("Eight"))
            return 8;
        if(n.equals("Nine"))
            return 9;
        if(n.equals("Ace"))
            return 1;
        return -1;
    }

    public String getSuit(int i){
        if(i == 1) return "Diamonds";
        if(i == 2) return "Clubs";
        if(i == 3) return "Spades";
        if(i == 4) return "Hearts";
        return "error";
    }

}
