package Unit1.FractionClass;

public class Fraction {

    // GCD
    private static int gcd(int n, int m){
        if(m == 0) return n;
        return gcd(m, n % m);
    }

    // Variables
    private int num;
    private int den;

    // Constructors
    public Fraction(){
        this.num = 1;
        this.den = 1;
    }

    public Fraction(int num, int den){
        this.num = num;
        if (den != 0){
            this.den = den;
        } else {
            this.den = 1;
        }
    }

    public Fraction(Fraction f){
        this.num = f.num;
        this.den = f.den;
    }

    //Getters
    public int getNum(){
        return this.num;
    }

    public int getDen(){
        return this.den;
    }

    // Setters
    public void setNum(int num){
        this.num = num;
    }

    public void setDen(int den){
        if (den != 0){
            this.den = den;
        }
    }

    // Instance Methods
    public double doubleValue(){
        return (double)this.num / (double)this.den;
    }

    public void reduce(){
        int gcd = gcd(this.num, this.den);
        this.num /= gcd;
        this.den /= gcd;
    }

    public Fraction multiply(Fraction f){
        Fraction r = new Fraction(this.num * f.num, this.den * f.den);
        r.reduce();
        return r;
    }

    public Fraction divide(Fraction f){
        Fraction r = new Fraction(this.num * f.den, this.den * f.num);
        r.reduce();
        return r;
    }

    public Fraction add(Fraction f){
        Fraction r = new Fraction(this.num * f.den + this.den * f.num, this.den * f.den);
        r.reduce();
        return r;
    }

    public Fraction subtract(Fraction f){
        Fraction r = new Fraction(this.num * f.den - this.den * f.num, this.den * f.den);
        r.reduce();
        return r;
    }

    // Overriden Methods
    @Override
    public String toString(){
        return this.num + "/" + this.den;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Fraction){
            Fraction f1 = new Fraction((Fraction)o);
            Fraction f2 = new Fraction(this);
            f1.reduce();
            f2.reduce();
            return f1.num == f2.num && f1.den == f2.den;
        }
        return false;
    }

    @Override
    public int hashCode(){
        this.reduce();
        return (this.num+30) * this.den;
    }
}
