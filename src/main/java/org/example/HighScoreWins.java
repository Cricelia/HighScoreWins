package org.example;

import java.util.Scanner;

public class HighScoreWins {
    static Scanner asking = new Scanner(System.in);
    static String input;
    static int homeScore;
    static int visitorScore;
    static String winningTeam;
    static String[] teamsAndScores;
    static String[] teams;
    static String[] scores;
    public static void TheGame() {
        System.out.println("Enter game score: " + "(Format = Home:Visitor|21:9");
        input = asking.nextLine().trim();

        teamsAndScores = input.split("\\|");
        teams = teamsAndScores[0].split(":");
        scores = teamsAndScores[1].split(":");
        homeScore = Integer.parseInt(scores[0]);
        visitorScore = Integer.parseInt(scores[1]);

        //winningTeam;
        if (homeScore > visitorScore) {
            winningTeam = teams[0];
        } else if (visitorScore > homeScore) {
            winningTeam = teams[1];
        } else {
            winningTeam = "It's a tie! Rematch Time!🥳 ";
        }
        System.out.println("Winner: " + winningTeam);
    }
}
