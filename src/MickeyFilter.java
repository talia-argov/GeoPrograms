public class MickeyFilter extends World {

    public int red; //variable of type int
    public int blue;
    public int green;

    public void go(){
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround(); // method that shows a picture (file name found on line 12 of RunMyProgram

        filter();
    }

    public void filter(){
        for(int row = 66; row <416; row = row + 1){ //rows
            for(int col = 520; col<675; col = col +1) { //columns
                plane.teleport(row, col);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //if color is yellow, change to pink
                if(blue < 160  && red > 200 && green > 190){
                    plane.setPixelColor(255, 192, 203);


                }
            }
        } //end of shoe filter
        //filter some other part of mickey
        for (int row = 157; row < 221; row = row +1){ //rows
            for (int col = 367; col < 425; col = col +1){
                plane.teleport(row, col);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (blue > 200  && red > 200 && green > 200){
                    plane.setPixelColor(255, 192, 203);
                }
            }
        }


    }

}
