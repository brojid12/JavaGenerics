package academy.learnprogramming;

public class Main {

    //This code objective is for showing how java generic and abstract works using football team match system
    //There will be abstract class "Player" that consist of name. There will be another class, which is spain and english that will be implementing that abstract and to use the generic
    //There will be team that consist of several players, the team will be using generics so it will be extinguished between team from english country and spain country
    //Each country will be have their own league, which will be consisted of several teams within the league
    //They will be also a score table for each game they have played to show the ranking of a team in its league.

    public static void main(String[] args) {
	// write your code here
        //English Player
        League<English> premierLeague = new League<>("Premier League");
        Team<English> mu = new Team<English>("Manchester United");
        Team<English> chelsea = new Team<>("Chelsea");
        Team<English> arsenal = new Team<>("Arsenal");

        premierLeague.addTeam(mu);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(arsenal);

        League <Spain> laLiga = new League<>("La Liga Satander");
        Team<Spain> realMadrid = new Team<Spain>("Real Madrid");
        Team<Spain> barcelona = new Team<Spain>("Barcelona");
        Team<Spain> atletico = new Team<Spain>("Atletico Madrid");
        Team<Spain> bilbao = new Team <Spain>("Atletico Bilbao");

        laLiga.addTeam(realMadrid);
        laLiga.addTeam(barcelona);
        laLiga.addTeam(atletico);
        laLiga.addTeam(bilbao);

        //------------------------------ GAME START ---------------------------------------//
        realMadrid.matchResult(barcelona,10,2);
        realMadrid.matchResult(atletico,5,1);
        barcelona.matchResult(atletico,2,3);
        bilbao.matchResult(realMadrid,2,5);
        bilbao.matchResult(atletico,3,0);
        bilbao.matchResult(barcelona,5,1);

        laLiga.showLeague();


        //*extra
        //------------------------------ ADDING PLAYER TO THE TEAM ---------------------------------------//
        English pogba = new English("Paul Pogba");
        English rashford = new English ("Rashford");
        English martial = new English("martial");
        English werner = new English("Timo Werner");
        English pulisic = new English("Christian Pulisic");
        English ozil = new English("Mesut Ozil");
        English aubameyang = new English("P Aubameyang");


        //Spain Player
        Spain hazard = new Spain("Hazard");
        Spain benzema = new Spain("Benzema");
        Spain kroos = new Spain("Kroos");
        Spain messi = new Spain("Messi");
        Spain griezmann = new Spain("Griezmann");
        Spain felix = new Spain("Joao Felix");
        Spain costa = new Spain("Costa");

        //English Team (MU, Chelsea, Arsenal)

        mu.addPlayer(pogba);
        mu.addPlayer(rashford);
        mu.addPlayer(martial);


        chelsea.addPlayer(werner);
        chelsea.addPlayer(pulisic);


        arsenal.addPlayer(ozil);
        arsenal.addPlayer(aubameyang);




        //Spain Team (REAL MADRID, Barcelona, Atletico)

        realMadrid.addPlayer(hazard);
        realMadrid.addPlayer(benzema);
        realMadrid.addPlayer(kroos);


        barcelona.addPlayer(messi);
        barcelona.addPlayer(griezmann);


        atletico.addPlayer(felix);
        atletico.addPlayer(costa);















    }
}
