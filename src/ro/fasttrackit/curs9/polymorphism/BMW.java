package ro.fasttrackit.curs9.polymorphism;


public class BMW extends Car {

    @Override
    public void drive(int speed, int gear) {
        setGear(gear + 1);
        setSpeed(speed - 10);
        System.out.println("Driving cu mana peste geam " + this.speed + " in gear " + this.gear );
    }
}
