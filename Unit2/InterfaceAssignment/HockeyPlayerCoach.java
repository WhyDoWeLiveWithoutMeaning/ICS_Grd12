package Unit2.InterfaceAssignment;

public class HockeyPlayerCoach extends Person implements Player, Coach {
    
    private int goals;
    private int assists;
    private int gamesCoached;
    
    public HockeyPlayerCoach() {
        super();
        this.goals = 0;
        this.assists = 0;
        this.gamesCoached = 0;
    }
    
    public HockeyPlayerCoach(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        super(name, yearOfBirth, monthOfBirth, dayOfBirth);
        this.goals = 0;
        this.assists = 0;
        this.gamesCoached = 0;
    }

    public HockeyPlayerCoach(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth, int goals, int assists, int gamesCoached) {
        super(name, yearOfBirth, monthOfBirth, dayOfBirth);
        this.goals = goals;
        this.assists = assists;
        this.gamesCoached = gamesCoached;
    }

    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return this.assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGamesCoached() {
        return this.gamesCoached;
    }

    public void setGamesCoached(int gamesCoached) {
        this.gamesCoached = gamesCoached;
    }

    @Override
    public String toString(){
        return "HockeyPlayerCoach[" + super.toString() + ", goals=" + this.goals + ", assists=" + this.assists + ", gamesCoached=" + this.gamesCoached + "]";
    }

    public String play() {
        return "EYYOOOOO LESSS GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO";
    }

    public String respondToCoach() {
        return "I'm a HockeyPlayerCoach, I'm a coach, I'm a player, I'm a hockey player coach!";
    }

    public String describePlay(){
        return "That was the worst PLAY EVER!";
    }

    public String disciplinePlayer(){
        return "You were a very naughty player, Now come sit on my lap and take this beating!";
    }

}
