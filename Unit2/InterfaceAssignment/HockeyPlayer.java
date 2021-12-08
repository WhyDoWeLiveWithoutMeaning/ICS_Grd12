package Unit2.InterfaceAssignment;

public class HockeyPlayer extends Person implements Player {
    
    private int goals;
    private int assists;

    public HockeyPlayer() {
        super();
        this.goals = 0;
        this.assists = 0;
    }

    public HockeyPlayer(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        super(name, yearOfBirth, monthOfBirth, dayOfBirth);
        this.goals = 0;
        this.assists = 0;
    }

    public HockeyPlayer(String name, int yearOfBirth, int monthOfBirth, int dayOfBirth, int goals, int assists) {
        super(name, yearOfBirth, monthOfBirth, dayOfBirth);
        this.goals = goals;
        this.assists = assists;
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

    @Override
    public String toString() {
        return " HockeyPlayer[" + super.toString() + ", goals=" + goals + ", assists=" + assists + ']';
    }

    public String play() {
        return "LESSS GOOOOOOOOO";
    }

    public String respondToCoach() {
        return "BRO CHILL, I AM TRYING MY BEST HERE";
    }
}
