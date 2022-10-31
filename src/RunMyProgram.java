

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new FinalGeoWorldPic());
        run.planeIcon = "plane.png";
        run.pictureFileName="ocean.jpeg";
        run.HEIGHT=250;
        run.WIDTH=450;
        run.Refresh();

        //new Thread(run).start();
    }
}
