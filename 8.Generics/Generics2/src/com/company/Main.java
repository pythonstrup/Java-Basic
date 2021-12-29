package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer henry = new SoccerPlayer("Henry");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
////        arsenal.addPlayer(joe);
////        arsenal.addPlayer(pat);
//        arsenal.addPlayer(henry);
//
//        System.out.println(arsenal.numPlayers());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("LA Angels");
//        baseballTeam.addPlayer(pat);
//
//        Team<SoccerPlayer> leicester = new Team<>("Leicester");
//        leicester.addPlayer(beckham);
//
//        Team<SoccerPlayer> tottenham = new Team<>("Tottenham Hotspur");
//        SoccerPlayer son = new SoccerPlayer("Son");
//        tottenham.addPlayer(son);
//        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
//
//        tottenham.matchResult(arsenal, 1, 3);
//        tottenham.matchResult(leicester, 2, 0);
//        arsenal.matchResult(tottenham, 3, 1);
//        liverpool.matchResult(arsenal, 4, 4);
//        liverpool.matchResult(leicester, 3, 0);
//        tottenham.matchResult(leicester, 1, 1);
////        arsenal.matchResult(baseballTeam, 1, 1);
//
//        System.out.println("Rankings");
//        System.out.println(arsenal.getName() + ": " + arsenal.ranking());
//        System.out.println(liverpool.getName() + ": " + liverpool.ranking());
//        System.out.println(tottenham.getName() + ": " + tottenham.ranking());
//        System.out.println(leicester.getName() + ": " + leicester.ranking());
//
//        System.out.println(arsenal.compareTo(tottenham));
//        System.out.println(arsenal.compareTo(leicester));
//        System.out.println(liverpool.compareTo(tottenham));
//        System.out.println(tottenham.compareTo(arsenal));

//        ArrayList<Team> teams;
//        Collection.sort(teams);

        League<Team<SoccerPlayer>> premierLeague = new League<>("EPL");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> tottenham = new Team<>("Tottenham Hotspur");
        Team<SoccerPlayer> leicester = new Team<>("Leicester");

        Team<BaseballPlayer> baseballTeam = new Team<>("MLB");
//        premierLeague.add(baseballTeam);

        premierLeague.add(arsenal);
        premierLeague.add(leicester);
        premierLeague.add(liverpool);
        premierLeague.add(tottenham);

        tottenham.matchResult(arsenal, 1, 3);
        tottenham.matchResult(leicester, 2, 0);
        arsenal.matchResult(tottenham, 3, 1);
        liverpool.matchResult(arsenal, 4, 4);
        liverpool.matchResult(leicester, 3, 0);
        tottenham.matchResult(leicester, 1, 1);

        premierLeague.showLeagueTable();
    }
}
