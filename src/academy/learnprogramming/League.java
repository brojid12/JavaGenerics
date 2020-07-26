package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Player>{ //Jadi declare T extends dari team, trus pake tanda tanya jadi emg harus define lagi di main, cangkupannya apa yg dipengen
    private String leagueName;
    ArrayList<Team<T>> arrayTeam = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
//        sort();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addTeam(Team <T> team){
        if(arrayTeam.contains(team)){
            System.out.println("The team already in the league");
            return false;
        }
        else{
            arrayTeam.add(team);
            System.out.println(team.getName() + " has been added to " + getLeagueName());
            return true;
        }
    }

    public void showLeague(){
        System.out.println("------- " + getLeagueName() + " -------" );
        Collections.sort(arrayTeam);
        for(int i=0;i<arrayTeam.size();i++){
            Team team = arrayTeam.get(i);
            System.out.println("#" + (i+1) + " " + team.getName() + " || Play:" + team.getMatch() + " W:" + team.getWin() + " D:" + team.getTied() + " L:" + team.getLose() + " --- POINT: " + arrayTeam.get(i).point );
        }
    }

    public void position(T team){
        System.out.println(team + " poisition is in numer #" + (arrayTeam.indexOf(team)+1));
    }




}
