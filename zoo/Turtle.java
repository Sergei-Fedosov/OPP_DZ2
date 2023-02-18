package zoo;

public class Turtle extends Predator implements Swimable, Runable, Flyable {
    private int flightSpeed = 3;
    private int flightHing = 2;
    private int runSpeed = 15;
    private int SwinSpeed = 10;

    public Turtle(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Khhhh";
    }

    @Override
    public int getSpeedFlyable() {
        return this.flightSpeed;
    }

    @Override
    public int getHigh() {
        return this.flightHing;
    }

    @Override
    public int getSpeedRun() {
        return this.runSpeed;
    }

    @Override
    public int getSpeedSwin() {return this.SwinSpeed;}
}
