public class FinalGeoWorldPic extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.showBackGround();
        plane.pausetime = 2;
        fish(25);
        manyfish();
        fishy();
        clouds();
        house();
        sun();
        plane.teleport(211, 59);

    }

    public void sun() {
        plane.teleport(-80, -45);
        plane.trailWidth = 50;
        plane.setColor(250, 253, 15);
        plane.fillCircle(2);
        plane.teleport(118, 14);
        plane.trailWidth = 10;
        plane.turn(20);
        plane.move(15);
        plane.teleport(80, 65);
        plane.turn(20);
        plane.move(15);
        plane.teleport(25, 81);
        plane.turn(20);
        plane.move(15);
    }

    public void fish(int distance) {
        plane.trailWidth = 5;
        plane.setColor(255, 165, 0);
        plane.turn(-25);
        plane.square(20);
        plane.move(7.5);
        plane.turn(-90);
        plane.triangle(10);
    }

    public void manyfish() {
        for (int x = 0; x < 300; x = x + 50) {
            plane.teleport(100 + x, 175);
            fish(50);
            System.out.println("x= " + x);

        }
    }


    public void house() {
        plane.teleport(289, 75);
        plane.startingAngle(90);
        plane.setColor(181, 101, 29);
        plane.house(50);
    }

    public void clouds() {
        for (int row = 0; row < 130; row = row + 1) {
            for (int col = 0; col < 423; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.setPixelColor((int) (row * 1.9), red, col / 4);
                System.out.println(col);
            }
        }
    }

    public void fishy(){
        for (int row = 163; row < 214; row = row + 1) {
            for (int col = 182; col < 233; col++) {
                if (blue > 109 && red < 13 && green > 54) {
                    plane.setPixelColor(255, 192, 203);
                }
            }
        }
    }
}