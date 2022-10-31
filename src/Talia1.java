public class Talia1 extends World{

    public void go(){
        //square(1);
    tree();
    house();
    mountains();
    int r= plane.random(1,2);
    if (r==1){
        square(200);
        
    }

    }

    public void pickShape(int x){
        if(x==1){
           square(1);

        }

    }

    public void mountains(){
        plane.isTrail=true;
        plane.setColor(211,211,211);
        plane.teleport(66,332);
        plane.turn(210);
        plane.move(200);
        plane.turn(-60);
        plane.move(200);
    }


    public void tree(){
        plane.isTrail=true;
        plane.teleport(504,344);
        plane.setColor(58, 29, 0);
        plane.trailWidth=30;
        plane.move(300);
        plane.teleport(504,344);
        plane.setColor(74, 160, 44);
        plane.trailWidth=50;
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(50);
        plane.turn(90);
        plane.move(50);

    }



    public void T(int length){

        plane.isTrail=true;
        plane.teleport(500,275);
        plane.move(length*50);
        plane.teleport(420,275);
        plane.turn(90);
        plane.move(length*50);
    }


    public void tri(){

        plane.isTrail=true;
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);
        plane.move(100);
        plane.turn(120);

    }

    public void square(int length){

        plane.isTrail=true;
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);

    }

    public void house(){

        plane.isTrail=true;
        plane.teleport(214,474);
        plane.trailWidth=20;
        plane.setColor(plane.random(0, 255),plane.random(0, 255), plane.random(0, 255));
        plane.turn(-30);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
    }

    public void Bigsquare(){

        plane.isTrail=true;
        plane.move(300);
        plane.turn(90);
        plane.move(300);
        plane.turn(90);
        plane.move(300);
        plane.turn(90);
        plane.move(300);
        plane.turn(90);

    }

public void squares(){

        plane.teleport(141,143);
        plane.trailWidth = 10;
        plane.setColor(127,255,0);
        plane.move(50);
        plane.turn(90);
        plane.setColor(230,230,250);
        plane.move(50);
        plane.turn(90);
        plane.setColor(0, 0, 255);
        plane.move(50);
        plane.turn(90);
        plane.setColor(144, 238, 144);
        plane.move(50);
        plane.turn(90);

    plane.teleport(141,143);
    plane.trailWidth = 50;
    plane.setColor(127,255,0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(230,230,250);
    plane.move(50);
    plane.turn(90);
    plane.setColor(0, 0, 255);
    plane.move(50);
    plane.turn(90);
    plane.setColor(144, 238, 144);
    plane.move(50);
    plane.turn(90);


    plane.teleport(141,143);
    plane.trailWidth = 80;
    plane.setColor(127,255,0);
    plane.move(50);
    plane.turn(90);
    plane.setColor(230,230,250);
    plane.move(50);
    plane.turn(90);
    plane.setColor(0, 0, 255);
    plane.move(50);
    plane.turn(90);
    plane.setColor(144, 238, 144);
    plane.move(50);
    plane.turn(90);
}


    }

