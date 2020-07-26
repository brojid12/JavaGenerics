package academy.learnprogramming;


import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team <T>>  {
    private String name;
    private ArrayList<T> arrayPlayer = new ArrayList<T>();
    int win = 0;
    int lose = 0;
    int tied = 0;
    int match = 0;
    int point = 0;

    public Team(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getTied() {
        return tied;
    }

    public int getMatch() {
        return match;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(arrayPlayer.contains(player)){
            System.out.println("The player already in the team " );
            return false;
        }
        else{
            System.out.println(player.getName() + " has been added to " + getName());
            arrayPlayer.add(player);
            return true;
        }
    }

    public int countPlayer(){
        System.out.println("The size of " + getName() + " is: ");
        return arrayPlayer.size();
    }

    public void matchResult(Team <T> opponent,int our, int enemy){
        String message;
        if(our>enemy){
            message = " team has beaten ";
            win++;
            point = point +3;
        }
        else if (enemy>our){
            message = " team has lose to ";
            lose++;
        }
        else{
            message = " team has tied with ";
            tied++;
            tied = tied + 1;
        }
        match++;
        if(opponent != null){
            System.out.println(getName() + message + opponent.getName());
            opponent.matchResult(null,enemy,our);
        }

    }

    public int ranking(){
        return point;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(ranking()>team.ranking()){
            return -1;
        }
        else if(ranking() < team.ranking()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
