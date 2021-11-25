package Unit1.Pokemon;

public class Pokemon {

    // public static enum Type {
    //     NORMAL,
    //     FIRE, 
    //     WATER, 
    //     GRASS, 
    //     ELECTRIC, 
    //     ICE, 
    //     FIGHTING, 
    //     POISON, 
    //     GROUND, 
    //     FLYING, 
    //     PSYCHIC, 
    //     BUG, 
    //     ROCK, 
    //     GHOST, 
    //     DRAGON, 
    //     DARK, 
    //     STEEL, 
    //     FAIRY
    // }

    //Types
    public static final int NORMAL = 0;
    public static final int FIRE = 1;
    public static final int WATER = 2;
    public static final int ELECTRIC = 3;
    public static final int GRASS = 4;
    public static final int ICE = 5;
    public static final int FIGHTING = 6;
    public static final int POISON = 7;
    public static final int GROUND = 8;
    public static final int FLYING = 9;
    public static final int PSYCHIC = 10;
    public static final int BUG = 11;
    public static final int ROCK = 12;
    public static final int GHOST = 13;
    public static final int DRAGON = 14;
    public static final int DARK = 15;
    public static final int STEEL = 16;
    public static final int FAIRY = 17;

    // Console Color Values
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Return the type name as a string
    private static String typeToString(int type) {
        switch (type) {
            case NORMAL:
                return "Normal";
            case FIRE:
                return ANSI_RED + "Fire" + ANSI_RESET;
            case WATER:
                return ANSI_BLUE + "Water" + ANSI_RESET;
            case ELECTRIC:
                return ANSI_YELLOW + "Electric" + ANSI_RESET;
            case GRASS:
                return ANSI_GREEN + "Grass" + ANSI_RESET;
            case ICE:
                return ANSI_WHITE + "Ice" + ANSI_RESET;
            case FIGHTING:
                return "Fighting";
            case POISON:
                return ANSI_PURPLE + "Poison" + ANSI_RESET;
            case GROUND:
                return "Ground";
            case FLYING:
                return "Flying";
            case PSYCHIC:
                return ANSI_PURPLE + "Psychic" + ANSI_RESET;
            case BUG:
                return ANSI_GREEN + "Bug" + ANSI_RESET;
            case ROCK:
                return "Rock";
            case GHOST:
                return ANSI_WHITE + "Ghost" + ANSI_RESET;
            case DRAGON:
                return ANSI_RED + "Dragon" + ANSI_RESET;
            case DARK:
                return "Dark";
            case STEEL:
                return "Steel";
            case FAIRY:
                return "Fairy";
            default:
                return "Unknown";
        }
    }


    // Variables
    private String name;
    private int type;
    private int hp;
    private int attack;
    private int defense;

    // Constructors
    public Pokemon() {
        this.name = "";
        this.type = Pokemon.NORMAL;
        this.hp = 100;
        this.attack = 1;
        this.defense = 1;
    }

    public Pokemon(String name, int type, int hp, int attack, int defense) {
        this.name = name;
        if (type < 0 || type > 17) {
            this.type = Pokemon.NORMAL;
        } else {
            this.type = type;
        }
        if (hp < 0) {
            this.hp = 100;
        } else {
            this.hp = hp;
        }
        if(attack <= 0){
            this.attack = 1;
        } else {
            this.attack = attack;
        }
        if(defense <= 0){
            this.defense = 1;
        } else {
            this.defense = defense;
        }
    }

    public Pokemon(Pokemon p ) {
        this.name = p.name;
        this.type = p.type;
        this.hp = p.hp;
        this.attack = p.attack;
        this.defense = p.defense;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAttack() {
        return this.attack;
    }

    public int getDefense() {
        return this.defense;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        if (type < 0 || type > 17) {
            this.type = Pokemon.NORMAL;
        } else {
            this.type = type;
        }
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 100;
        } else {
            this.hp = hp;
        }
    }

    public void setAttack(int attack) {
        if(attack <= 0){
            this.attack = 1;
        } else {
            this.attack = attack;
        }
    }

    public void setDefense(int defense) {
        if(defense <= 0){
            this.defense = 1;
        } else {
            this.defense = defense;
        }
    }

    // Methods
    @Override
    public String toString() {
        String s = String.format("%s [%s]\n", this.name, Pokemon.typeToString(this.type));
        int len = s.length();
        for (int i = 0; i < len; i++) s += "-";
        s += "\n";
        s += String.format("HP: %d\n", this.hp);
        s += String.format("Attack: %d\n", this.attack);
        s += String.format("Defense: %d\n", this.defense);
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon p = (Pokemon) o;
        return (this.name.equals(p.name) && this.type == p.type && this.hp == p.hp && this.attack == p.attack && this.defense == p.defense);
    }
}