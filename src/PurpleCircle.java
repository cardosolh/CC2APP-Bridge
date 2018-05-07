public class PurpleCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color: purple, radius: "+ radius+", x: "+x+"y: "+y+" ]");
    }
}
