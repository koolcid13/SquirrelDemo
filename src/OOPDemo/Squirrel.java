package OOPDemo;

public class Squirrel {

    // instance variables

    String colourString;
    String sizeString;
    int nutCountInt;
    boolean aliveBoolean;
    double iqDouble;

    // constructor
    /**
     * Create an instance of a Squirrel
     * @param newColourString
     * @param newSizeString
     * @param newNutCountInt
     * @param newIqDouble
     */
    public Squirrel(String newColourString, String newSizeString, int newNutCountInt, double newIqDouble){
        this.aliveBoolean = true;
        this.colourString = newColourString;
        this.sizeString = newSizeString;
        this.nutCountInt = newNutCountInt;
        this.iqDouble = newIqDouble;
    }

    // instance methods

    public void run() {
        System.out.println ("run!!");
    }

    public void findNut(int numberNuts) {
        this.nutCountInt += numberNuts;
    }

    public int getNutCount() {
        return this.nutCountInt;
    }

    public void eatNut() {
        this.nutCountInt--;
    }

    public void climb() {
        System.out.println ("climb that tree!!");
    }

    public void kill(){
        this.aliveBoolean = false;
    }
}