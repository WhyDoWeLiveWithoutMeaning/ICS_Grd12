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
        return "Pokemon [" + "name='" + name + '\'' + ", type=" + type + ", hp=" + hp + ", attack=" + attack + ", defense=" + defense + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon p = (Pokemon) o;
        return (this.name.equals(p.name) && this.type == p.type && this.hp == p.hp && this.attack == p.attack && this.defense == p.defense);
    }
}