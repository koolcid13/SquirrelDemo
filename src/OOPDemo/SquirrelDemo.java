package OOPDemo;
import OOPDemo.Squirrel;

public class SquirrelDemo {
    
    public static void main(String[] args) {
        
        Squirrel alvin;
        Squirrel simon;
        Squirrel theo;

        alvin = new Squirrel("Red", "Medium", 8, 100);
        simon = new Squirrel("Blue", "Tall", 2, 240);
        theo = new Squirrel("Green", "Grande", 3, 90);


        alvin.climb();
        simon.findNut(3);
        theo.eatNut();
        theo.findNut(23);
        alvin.run();
        System.out.println ("theo's nut count: " + theo.getNutCount());
        simon.run();
        simon.kill();

        System.out.println ("simon's iq: " + simon.iqDouble);

    }

}
