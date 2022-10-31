public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail = true;
        plane.pausetime = 1;
        plane.trailWidth=10;

            squareGrid();
        }

       public void squareGrid(){
           for (int row = 0; row < 8; row = row + 1)
               squareRow(row);

        }

    public void squareRow(int row) {
        for (int col = 0; col < 10; col = col + 1) {
            plane.setColor(row*50, 50, col*20);
            plane.teleport(col * 50, row * 50);
            System.out.println(col);
            plane.square(50);
        }
    }
}


        //public void teleportExperimentation(){
            //System.out.println(x);
           // plane.square(100);
          //  plane.teleport(40, 250);
         //   for(int x=40;x<90;x=x+1)
           //     plane.teleport();
