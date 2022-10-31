

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(135);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(128, 0, 0);
        plane.move(150);
        plane.turn(120);
        plane.setColor(34, 139, 34);
        plane.move(150);
        plane.turn(120);
        plane.setColor(245, 215, 100);
        plane.move(150);

    }


}
